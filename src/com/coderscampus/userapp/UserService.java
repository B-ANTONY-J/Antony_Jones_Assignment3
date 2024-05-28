package com.coderscampus.userapp;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//You should make use of a UserService class that will help 
//with things like validating if the inputted 
//username/password matches what's in our User Array. 
//It should also provide the service of reading the data 
//from the file and creating the User Array.

public class UserService {

	// create method from UserPOJO instance
	public UserPOJO createUser(String username, String password, String name) {


//		creates a user Array
		UserPOJO[] userArray = new UserPOJO[10];
			
		Scanner scanner = new Scanner(System.in);
		
//		//data file path saved to a variable
//		String dataFile = "data.txt";
				
		UserPOJO user = new UserPOJO();
		
		//array for data.txt to items from file
		List<UserPOJO> dataList = new ArrayList<>();
		

		BufferedReader fileReader = null;
		try {
		fileReader = new BufferedReader(new FileReader("data.txt"));
			// below print code not needed
			
			// creates new instance of class to be used within this method
			

			String dataLine;
			while ((dataLine = fileReader.readLine()) != null) {
				
				String[] dataSplit = dataLine.split(",");
				for (String keyPairs : dataSplit) {
					String[] keyValue = keyPairs.split(":"); // Assuming each pair is key:value
					if (keyValue.length == 2) {
						user.addAttribute(keyValue[0].trim(), keyValue[1].trim());
					}
				}
				dataList.add(user);
		      }
        } catch (IOException e) {
            e.printStackTrace();
        }
				//removed code to test new results below test 1
				
//				System.out.println(dataSplit);
//				System.out.println();
//				System.out.println(dataLine);
//				dataList.add(dataSplit);
				
				//removed code to test new results above test 1
			

//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Oops, There was an exception!!!");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("OOps, there was an I/O Exception!!!");
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				System.out.println("Closing file reader");
//				fileReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
		///While loop for final code to place in
		user.setUserName(username);
		
//		System.out.println();
		user.setPassWord(password);
//		System.out.println("You've entered the Password of:" + "" + user.getPassWord());
//		System.out.println();
		user.setName(name);
//		System.out.println("You've entered the Name of:" + "" + user.getName());
		
		System.out.println("Enter a value to search:");
     
		String inputKV = scanner.nextLine();
		
		boolean matchFound = false;
		
		// Iterate through the list of users and their attributes
		for (UserPOJO data: dataList) {
			
			for (Map.Entry<String, String> entry : data.getAttributes().entrySet()) {
				if (entry.getValue().equals(inputKV)) {
					matchFound = true;
					System.out.println("Match found for key: " + entry.getKey() + ", value: " + entry.getValue());
				}
			}
		}
		
		if (!matchFound) {
			System.out.println("No match found.");
		}
		
		// Close the scanner
		scanner.close();	
		
		
		
		
		
		//while loop maybe needed in refactoring below # 2
//		int invalidLogin = 0;
//		while (invalidLogin <= 5) {
//			// Flag to check if the input matches any attribute value
//			invalidLogin++;
//		}
//		//while loop maybe needed in refactoring above # 2

		
////Whille loop above this line
		
//			user = createUser(username, password, name);
//        System.out.println("You've entered the user name of:" + user.getUserName());
			//input++;
				

		return user;
	}

}
