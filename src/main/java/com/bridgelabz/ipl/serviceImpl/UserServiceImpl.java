package com.bridgelabz.ipl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.ipl.dao.Userdao;
import com.bridgelabz.ipl.model.User;
import com.bridgelabz.ipl.services.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private Userdao userDao;

	public void addUser(User user) {
		userDao.addUser(user);

	}

	public User authUser(String email, String password) {
		return userDao.authUser(email, password);
	}

}
