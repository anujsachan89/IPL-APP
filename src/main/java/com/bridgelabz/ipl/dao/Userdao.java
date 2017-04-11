package com.bridgelabz.ipl.dao;

import com.bridgelabz.ipl.model.User;

public interface Userdao {
	void addUser(User user);

	User authUser(String email, String password);

}
