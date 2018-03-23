package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> findAllUsers();
}
