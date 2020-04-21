package com.niit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.model.User;
import com.niit.repository.UserRepository;
import com.niit.service.UserService;

@Controller
public class IndexController
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/user"})
	@ResponseBody
	public List<User> m1()
	{
		return userService.getUsers();
	}
	
	@RequestMapping(value = {"/users"})
	@ResponseBody
	public List<User> m2()
	{
		User u1=new User();
		u1.setUserid(123);
		u1.setEmail("sagar@gmail.com");
		u1.setUsername("sagar123");
		u1.setPassword("sagar@123");
		
		User u2=new User();
		u2.setUserid(124);
		u2.setEmail("manoj@gmail.com");
		u2.setUsername("manoj123");
		u2.setPassword("manOJ@123");
		
		List<User> users=new ArrayList();
		users.add(u1);
		users.add(u2);
		return users;
	}
}
