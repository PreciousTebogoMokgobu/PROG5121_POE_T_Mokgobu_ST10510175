/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_poe_part1;

import java.util.Scanner;

// This class runs the program (starting point)
public class Main {

    public static void main(String[] args) {

    // Scanner to get input from user
    Scanner input = new Scanner(System.in);

    // object of UserLogin class
    UserLogin login = new UserLogin();

    // registration
    System.out.println("Register");

    // input to user to enter username
    System.out.println("Enter username:");
    String username = input.nextLine();

    // input to user to enter password
    System.out.println("Enter password:");
    String password = input.nextLine();


    String message = login.registerUser(username, password);

    // output
    System.out.println(message);

    // login
    System.out.println("\n Login");

    // input to user to enter username again
    System.out.println("Enter username:");
    String loginUser = input.nextLine();

    // input to user to enter password again
    System.out.println("Enter password:");
    String loginPass = input.nextLine();

    // 
    boolean success = login.loginUser(loginUser, loginPass);

    // output
    System.out.println(login.returnLoginStatus(success));

    // Close scanner
    input.close();
    }
}