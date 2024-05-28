package com.coderscampus.userapp;


import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantiate the UserService class here
		UserService userService = new UserService();

		UserPOJO user = new UserPOJO();

		UserPOJO[] users = new UserPOJO[10];

		Scanner scanner = new Scanner(System.in);


		// Retrieve an integer value from system properties
		String valueStr = System.getProperty("myIntValue", "3"); // Default to 3 if not set
		int n = Integer.parseInt(valueStr);
		System.out.println("The number of strings will be: " + n);
		
		
//TEST CODE WHILE LOOP NEEDED BELOW #1
//		String[] parts = new Parts[n];
		
		int input = 0;
		while (input <= n) {
			String[] entry = new String[n];

			String username = null;
			String password = null;
			String name = null;
			//for loop for User entry to be used later to compare against data.txt
			for (int i = 0; i < entry.length - 2; i++) {
				System.out.println("String Iteration Entry " + " " + (i + 0) + ": ");
				System.out.println("Enter your email: ");
				entry[i + 0] = username = scanner.nextLine();
				System.out.println("Enter your password: ");
				entry[i + 1] = password = scanner.nextLine();
				System.out.println("Enter your name: ");
				entry[i + 2] = name = scanner.nextLine();
				
//				

			}
			scanner.close();

			for (String single : entry) {
				System.out.println("Print Every Iteration: ");
				System.out.println(single);

			}
			input++;

			user = userService.createUser(username, password, name);

		}
		//TEST CODE WHILE LOOP NEEDED ABOVE #1
	}

}
