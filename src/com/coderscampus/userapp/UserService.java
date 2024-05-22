package com.coderscampus.userapp;

import java.util.Scanner;



//You should make use of a UserService class that will help 
//with things like validating if the inputted 
//username/password matches what's in our User Array. 
//It should also provide the service of reading the data 
//from the file and creating the User Array.

public class UserService {

	// create method from UserPOJO instance
	public UserPOJO createUser (String username, String password, String name) {
		
		//creates new instance of class to be used within this method
		UserPOJO user = new UserPOJO();
		
//		creates a user Array
		UserPOJO[] userArray = new UserPOJO[10];
		
		Scanner scanner = new Scanner(System.in);
		
//		userArray = {username, password, name};

//		UserPOJO[] user = createUser(username, password, name);
		String properties = "Marcie,pword,personName";
		String[] parts = properties.split(",");
//		for (String string : properties) {
//			
//		}
			
//		for(int i = 0; i <= 5; i++) {
//			System.out.println("This is the next user: " + user[i]);
//		}
//		
//		System.out.print("Enter name: ");
//		username = scanner.nextLine();
		
		user.setUserName(username);

//		System.out.println();
		user.setPassWord(password);
//		System.out.println("You've entered the Password of:" + "" + user.getPassWord());
//		System.out.println();
		user.setName(name);
//		System.out.println("You've entered the Name of:" + "" + user.getName());

		
//	FOR LOOP REMOVED FOR TESTING!!!!!!!!!!	
//		for (String property: properties) {
//	//		for (int i = 0; i < properties.length - 1; 	i++) {
//			System.out.println(property);
//		
//			if (property == username) {
//				
//				System.out.println("checking");
//				System.out.println("It's a Match");
//				
//				if (property == username) {
//					System.out.println(property + " Is the same as " + username);
//					break;
//				}	
//				
//			}
//	
////			else if(property != username) {
////					System.out.println("You've enterd the name: " + username + " Which is ");
////					System.out.println("NO MATCH");
////					System.out.println();
//			
//		//retore this if statement first
////			if(property == password) {
////				System.out.println("You've entered the Password of:" + "" + user.getPassWord());
////				System.out.println("MATCH");
////				System.out.println();
////			
////			
//////			else if(property != password) {
//////					System.out.println("You've enterd the name: " + password + " Which is ");
//////					System.out.println("NO MATCH");
////				break;
////			} 
//			
//		//restore this is stament next
////			if(property == name) {
////				System.out.println("You've entered the Name of:" + "" + user.getName());
////				System.out.println("MATCH");
////				System.out.println();
////				break;
////			} else {
////				System.out.println("uggggggggg, ");
////			}
//		System.out.println("You've entered the user name of:" + "" + user.getUserName());
//	
//		}
		////FOR LOOP REMOVED FOR TESTTING!!!!
	
	
//	putting config for while loop here
    // Prompt the user to enter the number of strings
    System.out.print("Enter the number of strings USer Service: ");
    int n = scanner.nextInt();
	
//	String[] parts = new Parts[n];
	
	int input = 0;
	while (input <= n) {
//		System.out.println("inputted username, password & name: ");
		 System.out.print("Enter a line of text: ");
	        username = scanner.nextLine();
	        
	        // Split the input into parts (assuming parts are separated by spaces)
//	        String[] parts = username.split(",");
	        
	        // Print each part
	        for (String part : parts) {
	            System.out.println(part);
	        }
	        
		
//	System.out.print("inputted password: ");
	  
		password = scanner.nextLine();
		parts = password.split(",");
		
		
	         // Split the input into parts (assuming parts are separated by spaces)
		parts = password.split(",");
	        
	        // Print each part
	        for (String part : parts) {
	            System.out.println(part);
	           // user = userService.createUser(username, password, name);
	        }
	        
		
		
		
		
		
		
		
//	System.out.print("inputted name: ");
		name = scanner.nextLine();
		parts = name.split(",");
		
//		for (int i = 0; i <= n; i++) {
//		    System.out.print("Enter string " + (i + 1) + ": ");
//		    strings[i] = scanner.nextLine();
////			users[i] = userService.createUser(username, password, name);
//			System.out.println(users[i]);
		 // Print each part
        for (String part : parts) {
            System.out.println(part);
        }
        user = createUser(username, password, name);
//        System.out.println("You've entered the user name of:" + user.getUserName());
        input++;
        scanner.close();
        
		}
	
	
	
	
	return user;
	}
	
	
}


