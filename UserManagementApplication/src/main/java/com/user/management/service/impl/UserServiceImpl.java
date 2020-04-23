package com.user.management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.management.entity.User;
import com.user.management.repository.UserRepository;
import com.user.management.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addOrUpdateUser(User user) 
	{
		//Business logic, rules
		
		userRepository.save(user);
	}

	@Override
	public User findById(long id)
	{
		Optional<User> optional = userRepository.findById(id);
		
		return optional.get();
	}

	@Override
	public User findByFirstName(String firstName) 
	{
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public void deleteUser(User user) 
	{
		userRepository.delete(user);
	}

	@Override
	public void deleteUserById(long id)
	{
		userRepository.deleteById(id);
	}

	@Override
	public List<User> findAllUsers() 
	{
		return userRepository.findAll();
	}

}
