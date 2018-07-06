package com.ganchaoa.service;

import java.util.List;

import com.ganchaoa.entity.Log;

public interface LogService {
	
	public List<Log> getLogs(int page, int limit);

}
