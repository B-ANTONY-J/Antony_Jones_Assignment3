package com.coderscampus.userapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserLoginApplication {

	
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		List<UserPOJO> users = userService.readUsersFromFile("data.txt");

	    UserPOJO failedLogins = new UserPOJO(1);
	    
		Scanner scanner = new Scanner(System.in);

		String inputUsername = null;
		String inputPassword = null;
		
		int numOfAttempts = 0;
		failedLogins.setFailedLogins(numOfAttempts);
		
		System.out.println("User Validation with CSV File\n");
		
		while (true){

			if (failedLogins.getFailedLogins() == 4) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				break;

			} else {
				System.out.println();
				System.out.println("Enter Your email:");
				inputUsername = scanner.nextLine().trim();

				System.out.println("Enter Your password:");
				inputPassword = scanner.nextLine().trim();


				boolean matchFound = false;

				for (UserPOJO user : users) {
					//ignores the case of the input username
					if (user.getUsername().equalsIgnoreCase(inputUsername)
							&& user.getPassword().equals(inputPassword)) {
						matchFound = true;
						System.out.println("Welcome: " + user.getName() + "!!!!!");
						break;
					}
				}

				if (!matchFound) {
					System.out.println("Invalid login, please try again.");
					System.out.println();
					failedLogins.setFailedLogins(numOfAttempts);
					numOfAttempts++;
				}
			}
		}
		System.out.println("Game Over, Thanks for Playing!!!");

		scanner.close();

	}
}
