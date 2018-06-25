package com.ganchaoa.service;

import com.ganchaoa.entity.User;

public interface UserService {

	public abstract User findByName(String name);

	public abstract User login(String username, String password);
	
}
