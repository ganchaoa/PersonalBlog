package com.ganchaoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ganchaoa.dao.UserDao;
import com.ganchaoa.entity.User;
import com.ganchaoa.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public User findByName(String name) {
		return userdao.findByName(name);
	}

	@Override
	public User login(String username, String password) {
		return userdao.login(username,password);
	}

}
