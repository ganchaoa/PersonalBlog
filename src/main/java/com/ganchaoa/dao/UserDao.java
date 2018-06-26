package com.ganchaoa.dao;

import org.apache.ibatis.annotations.Param;

import com.ganchaoa.entity.User;

public interface UserDao {

	public abstract User findByName(String username);

	public abstract User login(@Param("username")String username, @Param("password")String password);
}
