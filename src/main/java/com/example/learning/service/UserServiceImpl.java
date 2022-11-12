package com.example.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.dao.UserDao;
import com.example.learning.entities.UserDetails;




@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserDao userDao;
	public List<UserDetails> getUserDetails(){
		return userDao.getUserDetails();
	}

	@Override
	public void createUser(UserDetails userDetails) { userDao.createUser(userDetails);}

}
