package com.niit.service;

import java.util.List;

import com.niit.model.User;

public interface UserService
{
	public boolean saveUser(User user);
	public List<User> getUsers();
}
