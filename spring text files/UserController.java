package com.zensar.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootdemo.entity.User;
import com.zensar.springbootdemo.service.UserService;

@RestController
@RequestMapping("/user-api")
public class UserController {
	
	
	@Autowired
	private UserService userService;

	

	public UserController() {
	
	}

	//@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}

	//@RequestMapping(value = "/user", method = RequestMethod.GET)
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	//@RequestMapping(value = "/user", method = RequestMethod.POST)
	@PostMapping("/users")
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);

	}

	//@RequestMapping(value = "user/{userId}", method = RequestMethod.PUT)
	@PutMapping("users/{userId}")
	public void updateEmployee(@PathVariable("userId") int userId, @RequestBody User user) {
		userService.updateUser(userId, user);

	}

	//@RequestMapping(value = "user/{userId}", method = RequestMethod.DELETE)
	@DeleteMapping("users/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		userService.deleteUser(userId);
	}
}
