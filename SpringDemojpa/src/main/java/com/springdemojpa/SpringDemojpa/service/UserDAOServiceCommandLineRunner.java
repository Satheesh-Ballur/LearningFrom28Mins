package com.springdemojpa.SpringDemojpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springdemojpa.SpringDemojpa.entity.User;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner
{

	@Autowired
	UserDAOService userdao;
	
	
	@Override
	public void run(String... args) throws Exception
	{
	
		User user = new User("satheesh","Developer");
		userdao.insert(user);
		
	}

	
	
	
}
