package com.user.management.service;

import java.util.List;

import com.user.management.entity.User;

public interface UserService 
{
	void addOrUpdateUser(User user);
	
	User findById(long id);
	
	User findByFirstName(String firstName);
	
	List<User> findAllUsers();
	
	void deleteUser(User user);
	
	void deleteUserById(long id);
}
