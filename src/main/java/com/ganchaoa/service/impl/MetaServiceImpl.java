package com.ganchaoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.MetaDao;
import com.ganchaoa.service.MetaService;

@Service
@Transactional(readOnly = true)
public class MetaServiceImpl implements MetaService {

	@Autowired
	MetaDao metaDao;
	
	@Override
	public Long count() {
		
		return metaDao.count();
	}

	@Override
	public Long countByType(String type) {
		
		return metaDao.countByType(type);
	}

}
