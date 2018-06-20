package com.ganchaoa.dao;

import com.ganchaoa.entity.User;

public interface UserDao {

	public abstract User findByName(String name);
}
