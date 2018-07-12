package com.ganchaoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.AttachDao;
import com.ganchaoa.service.AttachService;

@Service
@Transactional(readOnly = true)
public class AttachServiceImpl implements AttachService {

	@Autowired
	AttachDao attachDao;
	
	@Override
	public Long count() {
		return attachDao.count();
	}

}
