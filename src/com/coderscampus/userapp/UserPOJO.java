package com.coderscampus.userapp;

import java.util.HashMap;
import java.util.Map;

public class UserPOJO {
	private String userName;
	private String passWord;
	private String name;
	private Map<String, String> attributes;
	
    public UserPOJO() {
        this.attributes = new HashMap<>();
    }

    // Method to "SET" or add key-value pairs
    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    // Method to get the attributes map
    public Map<String, String> getAttributes() {
        return attributes;
    }
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
