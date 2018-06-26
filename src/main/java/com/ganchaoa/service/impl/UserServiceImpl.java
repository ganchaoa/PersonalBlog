package com.ganchaoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.UserDao;
import com.ganchaoa.entity.User;
import com.ganchaoa.service.UserService;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public User findByName(String username) {
		return userdao.findByName(username);
	}

	@Override
	public User login(String username, String password) {
		return userdao.login(username,password);
	}

}
