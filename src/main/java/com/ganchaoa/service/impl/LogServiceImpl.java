package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ganchaoa.dao.LogDao;
import com.ganchaoa.entity.Log;
import com.ganchaoa.service.LogService;

public class LogServiceImpl implements LogService {

	@Autowired
	LogDao logDao;
	
	@Override
	public List<Log> getLogs(int page, int limit) {
		
		return logDao.getLogs(page, limit);
		
	}

}
