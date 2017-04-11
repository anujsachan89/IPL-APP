package com.bridgelabz.ipl.services;

import com.bridgelabz.ipl.model.User;

public interface UserService {
	public void addUser(User user);

	public User authUser(String email, String password);
}
