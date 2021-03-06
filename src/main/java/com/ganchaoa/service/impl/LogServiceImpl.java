package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.LogDao;
import com.ganchaoa.entity.Log;
import com.ganchaoa.service.LogService;

@Service
@Transactional(readOnly = true)
public class LogServiceImpl implements LogService {

	@Autowired
	LogDao logDao;
	
	@Override
	public List<Log> getLogs(int page, int limit) {
		
		return logDao.getLogs(page, limit);
		
	}

}
