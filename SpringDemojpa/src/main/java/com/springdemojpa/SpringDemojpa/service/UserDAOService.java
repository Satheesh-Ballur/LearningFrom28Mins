package com.springdemojpa.SpringDemojpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springdemojpa.SpringDemojpa.entity.User;

@Repository
@Transactional  //Declarative Transaction
public class UserDAOService 
{

	@PersistenceContext
	private EntityManager entitymanager;
	
	public long insert(User user)
	{
	
		entitymanager.persist(user);
		return user.getId();
		
	}
	
	
	
}
