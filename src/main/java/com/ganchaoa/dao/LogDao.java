package com.ganchaoa.dao;

import java.util.List;

import com.ganchaoa.entity.Log;

public interface LogDao {

	public List<Log> getLogs(int page, int limit);
	
}
