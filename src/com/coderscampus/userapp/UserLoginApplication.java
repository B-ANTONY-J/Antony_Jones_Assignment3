package com.coderscampus.userapp;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the UserService class here
		UserService userService = new UserService();
		
		UserPOJO user = new UserPOJO();
		
		UserPOJO[] users = new UserPOJO[10];
		
		
		Scanner scanner = new Scanner(System.in);
		
		
//		System.out.println("inputted password: ");
//		for(int i = 0; i <= 5; i++) {
//			System.out.println("This is the next user: " + users[i]);
//			users[i] = userService.createUser(username, password, name);
//		}
//		UserPOJO user = userService.createUser(username, password, name);
		
//		for (UserPOJO user: users) {
//			System.out.println("This is the next user: " + user);
//			users = userService.createUser(username, password, name);
//			
//		}
//		UserPOJO user = userService.createUser(username, password, name);
		//UserPOJO findName = new UserPOJO();
		
		
		
//		Moved dow into the WHILE LOOP
//		 System.out.print("Enter a line of text: ");
//	        String username = scanner.nextLine();
//	        
//	        // Split the input into parts (assuming parts are separated by spaces)
//	        String[] parts = username.split(",");
//	        
//	        // Print each part
//	        for (String part : parts) {
//	            System.out.println(part);
//	        }
//	        
//	        scanner.close();
	    
		
		
		
		
		
		
	    // Prompt the user to enter the number of strings
//        System.out.print("Enter the number of strings: ");
//        
//        int n = scanner.nextInt(3);
//        scanner.nextLine(); //THIS LINE IS EXTREMELY IMPORTANT - 
        					//This entry Will Consume the line
                           //and keep it from taken up space in your first 
        			      //Iteration of your loop 
        
		     // *****or Hard Code with the Code Below *********
        
        // Retrieve an integer value from system properties
        String valueStr = System.getProperty("myIntValue", "3"); // Default to 3 if not set
        int n = Integer.parseInt(valueStr);
        System.out.println("The number of strings will be: " + n);
        
        
//		String[] parts = new Parts[n];
//		
		int input = 0;
		while (input <= n) {
			String[] entry = new String[n];
			
			 // Will move the below to User Service move 2
//			System.out.print("Enter a line of text A: ");
//			String username = scanner.nextLine();
//			System.out.print("Enter a line of text B: ");
//			username = scanner.nextLine();
//			parts = username.split(",");
//			System.out.print("Enter a line of text C: ");
//			username = scanner.nextLine();
//			parts = username.split(",");
		        // Will move the above to User Service move 2

//			System.out.println("User Login App");
//			System.out.print("Enter a line of text A: ");
//			username = scanner.nextLine();
			
//        	System.out.print("Enter a line of text B: ");
//        	username = scanner.nextLine();
//        	parts = username.split(",");
//        	
//        	System.out.print("Enter a line of text C: ");
//        	username = scanner.nextLine();
//        	parts = username.split(",");
			String username = null;
			String password = null;
			String name = null;
			for (int i = 0; i <= entry.length - 3; i++) {
				System.out.println("iString Entry " + " " + (i + 0) + ": ");
//			   System.out.println(entry[i + 0] = username = scanner.nextLine());
//			   System.out.println(entry[i + 1] = password = scanner.nextLine());
//			   System.out.println(entry[i + 2] = name = scanner.nextLine());
			   entry[i + 0] = username = scanner.nextLine();
			   entry[i + 1] = password = scanner.nextLine();
			   entry[i + 2] = name = scanner.nextLine();
	        	//parts[i] = username;
	        	
			}
			scanner.close();
			
			for (String single : entry) {
				System.out.println("Print Every Iteration: ");
				System.out.println(single);
				
			}
			input++;
			
		       user = userService.createUser(username, password, name);
			//Print the array
			
			//TESTING LOOP SO IT WILL BE REMOVED 2 BELOW******
//		        for (String part : parts) {
//		        	//UserPOJO[] parts = new UserPOJO[n];
////		        	System.out.println("User Login App");
////		        	System.out.print("Enter a line of text: ");
////		        	String username = scanner.nextLine();
////		        	parts = username.split(",");
//		        	System.out.println();   
////		System.out.print("inputted password: ");
//		        	System.out.print("Enter a line of text B: ");
//		        	String password = scanner.nextLine();
//		        	parts = password.split(",");
//		        	
//		        	// Split the input into parts (assuming parts are separated by spaces)
//		        	System.out.print("Enter a line of text C: ");
//		        	String name = scanner.nextLine();
//		        	parts = name.split(",");
//		            System.out.println(part);
//		        }
		       //TESTING LOOP SO IT WILL BE REMOVED 2 ABOVE******
			
			
			
		         // Split the input into parts (assuming parts are separated by spaces)
//			parts = password.split(",");
		        
		        //REMOVING FOR TEST PURPOSE AS BELOW 3
		        // Print each part
//		        for (String part : parts) {
//		            System.out.println(part);
//		           // user = userService.createUser(username, password, name);
//		        }
//		        
//			
//			
//			
//			
//			
//			
//			
////		System.out.print("inputted name: ");
//			
////			for (int i = 0; i <= n; i++) {
////			    System.out.print("Enter string " + (i + 1) + ": ");
////			    strings[i] = scanner.nextLine();
//////				users[i] = userService.createUser(username, password, name);
////				System.out.println(users[i]);
//			 // Print each part
//	        for (String part : parts) {
//	            System.out.println(part);
//	        }
//	        //removed this code for test PURSPOSE AS ABOVE 3
	        
//	        System.out.println("You've entered the user name of:" + user.getUserName());
	        
			}
		}
		
		
		
		
		
		//String userNamFind = userService.
		
	
	}


