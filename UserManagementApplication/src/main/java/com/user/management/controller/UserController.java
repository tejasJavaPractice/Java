package com.user.management.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.management.entity.User;
import com.user.management.service.UserService;

@RestController
@RequestMapping("users")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping
	//localhost:8080/users
	public List<User> getAllUsers()
	{
		if(CollectionUtils.isEmpty(userService.findAllUsers()))
		{
			return Arrays.asList(new User());
		}
		
		return userService.findAllUsers();
	}
	
	@GetMapping("/userEntities")
	public ResponseEntity<List<User>> getUsers()
	{
		List<User> users = new ArrayList<>();
		
		users.addAll(userService.findAllUsers());
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("NumberOfUsers", ""+users.size());
		
		return ResponseEntity.accepted().headers(headers).body(users);
	}
	
	//localhost:8080/users/100
	@GetMapping("/{id}")
	public User getUserById(@PathVariable long id)
	{
		return userService.findById(id);
	}
	
	@PostMapping
	public void addUser(@RequestBody User user)
	{
		userService.addOrUpdateUser(user);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable long id, @RequestBody User user)
	{
		userService.addOrUpdateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserId(@PathVariable long id)
	{
		userService.deleteUserById(id);
	}
	
}
