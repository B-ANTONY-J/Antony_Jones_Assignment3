package com.coderscampus.userapp;

import java.util.Map;

public class UserPOJO {
	private String username;
	private String password;
	private String name;
	private int failedLogins;

	
	
	public UserPOJO(String username, String password, String name) {
        this.username = username;
        this.password = password.toLowerCase();
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    

	public UserPOJO(int number) {
		this.failedLogins = number;
	}
	
	public int getFailedLogins() {
		System.out.println("Too many failed login attempts, you are now locked out.");
		return failedLogins;
	}

	public void setFailedLogins(int failedLogins) {
		this.failedLogins = failedLogins;
	}
	
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", failedLogins='" + failedLogins + '\'' +
				'}';
	}
}

