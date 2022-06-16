package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	List<User> users=new ArrayList<User>();
	
	
	public UserServiceImpl() {
	
		users.add(new User(1,"vinod","v.muvvala@zensar.com"));
		users.add(new User(2,"kumar","k.kumar@gmail.com"));
		users.add(new User(3,"ram","r.rama@gmail.com"));
	}

	@Override
	public User getUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public void insertUser(User user) {
		users.add(user);
		
	}

	@Override
	public void updateUser(int userId, User user) {
		User users=getUser(userId);
		users.setUserId(user.getUserId());
		users.setUserName(user.getUserName());
		users.setEmail(user.getEmail());
	}

	@Override
	public void deleteUser(int userId) {
		for(int i=0;i<users.size();i++) {
			User user = users.get(i);
			if(user.getUserId()==userId) {
				users.remove(user);
			}
		}		
	}

}
