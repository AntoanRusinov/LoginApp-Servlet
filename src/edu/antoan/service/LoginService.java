package edu.antoan.service;

import java.util.HashMap;

import edu.antoan.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<String, String>();

	public LoginService() {
		users.put("stefan", "say");
		users.put("kiril", "bay");
		users.put("ivan", "myau");
		users.put("kiro", "desk");
		users.put("tomi", "send");

	}

	public boolean authenticate(String userId, String password) {

		if (password == null || password.trim() == "") {
			return false;

		} else {
			return true;
		}

	}

	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
