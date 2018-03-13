package com.bridgeit.service;

import com.bridgeit.model.User;

public interface IUserService {
	
	public void saveUserObject(User user);
	
	public User getUser(int id);

}
