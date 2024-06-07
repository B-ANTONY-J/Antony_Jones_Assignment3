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
		System.out.println("FIX IT PLEAASE");
		List<UserPOJO> users = userService.readUsersFromFile("data.txt");

//	        UserPOJO userGet = new UserPOJO(String, String password, String name);
		Scanner scanner = new Scanner(System.in);

		String inputUsername = null;
		String inputPassword = null;
		int numOfAttempts = 0;

		while (numOfAttempts < 5){

			if (numOfAttempts == 4) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				break;

			} else {
				System.out.println();
				System.out.println("Enter username:");
				inputUsername = scanner.nextLine().trim();

				System.out.println("Enter password:");
				inputPassword = scanner.nextLine().trim().toLowerCase();


				boolean matchFound = false;

				for (UserPOJO user : users) {
					if (user.getUsername().equalsIgnoreCase(inputUsername)
							&& user.getPassword().equals(inputPassword)) {
						matchFound = true;
						System.out.println("Welcome: " + user.getName() + "!!!!!");
						break;
					}
				}

				if (!matchFound) {
					System.out.println("Invalid login, please try again.");
					numOfAttempts++;
				}
			}
		}

		scanner.close();

	}
}
