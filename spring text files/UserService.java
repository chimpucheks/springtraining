package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.entity.User;

public interface UserService {

	public User getUser(int userId);
	public List<User> getUsers();
	public void insertUser (User userId);
	public void updateUser (int userId,User user);
	public  void deleteUser (int userId);

}
