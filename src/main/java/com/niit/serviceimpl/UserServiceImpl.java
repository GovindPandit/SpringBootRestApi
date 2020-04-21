package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.model.User;
import com.niit.repository.UserRepository;
import com.niit.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean saveUser(User user) 
	{
		userRepository.save(user);
		return true;
	}
	
	@Override
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}

}
