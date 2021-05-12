package com.springdemojpa.SpringDemojpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springdemojpa.SpringDemojpa.entity.User;



@Component

public class UserDAORepoCommandLineRunner implements CommandLineRunner 
{

	@Autowired
	UserDAORepository userrepo;
	
	@Override
	public void run(String... args) throws Exception {

		User user = new User("Jagadish","FamousDeveloper");
		
		userrepo.save(user);
		
	}

}
