package com.coderscampus.userapp;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//notes to self
//The UserService class will help 
//with things like validating if the inputted 
//username/password matches what's in the User Array. 
//It should also provide the service of reading the data 
//from the file and creating the User Array.

public class UserService {

	public List<UserPOJO> readUsersFromFile(String filename) {
        List<UserPOJO> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String username = parts[0].trim();
                    String password = parts[1].trim();
                    String name = parts[2].trim();

                    UserPOJO user = new UserPOJO(username, password, name);
                    users.add(user);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
}
