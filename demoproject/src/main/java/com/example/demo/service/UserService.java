package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;


@Service
public interface UserService {

	public void saveMyUser(User user);
	public Iterable<User> showAllUsers();
	public Iterable<User> deleteUserByUsername(String username);
	public User findByUsername(String username);
}
