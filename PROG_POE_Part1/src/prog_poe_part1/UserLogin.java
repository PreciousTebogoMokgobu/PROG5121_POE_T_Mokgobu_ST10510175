/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_poe_part1;

// This class handles everything related to user login
public class UserLogin {

    // These variables store the correct username and password
    private String storedUsername;
    private String storedPassword;

    // This method checks if the username is valid
    public boolean checkUserName(String username) {
        // Username must contain "_" and be 5 characters or less
        return username.contains("_") && username.length() <= 5;
    }

    // This method checks if the password is strong
    public boolean checkPasswordComplexity(String password) {
        // Check if password has a capital letter
        boolean hasCapital = password.matches(".*[A-Z].*");

        // Check if password has a number
        boolean hasNumber = password.matches(".*[0-9].*");

        // Check if password has a special character
        boolean hasSpecial = password.matches(".*[@#$%^&+=].*");

        // Password must be at least 8 characters and meet all conditions
        return password.length() >= 8 && hasCapital && hasNumber && hasSpecial;
    }

    // This method registers the user
    public String registerUser(String username, String password) {

        // Check username first
        if (!checkUserName(username)) {
            return "Username is not correctly formatted.";
        }

        // Check password next
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted.";
        }

        // Save the username and password
        storedUsername = username;
        storedPassword = password;

        // Return success message
        return "User successfully registered.";
    }

    // This method checks if login details are correct
    public boolean loginUser(String username, String password) {

        // Compare entered username and password with stored ones
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // This method returns a message after login attempt
    public String returnLoginStatus(boolean loginSuccess) {

        // If login is correct
        if (loginSuccess) {
            return "Login successful.";
        } 
        // If login is incorrect
        else {
            return "Username or password incorrect.";
        }
    }
}