package com.bridgeit.service.serviceImpl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;


import com.bridgeit.model.User;
import com.bridgeit.service.UserService;

@Service("userService")

public class UserServiceImpl implements UserService {

	private List<User> users;
	private static final AtomicLong counter = new AtomicLong();

	public void saveUser(User user) {
		user.setId(1);
		users.add(user);
	}

	public List<User> findAllUsers() {

		return users;
	}

}
