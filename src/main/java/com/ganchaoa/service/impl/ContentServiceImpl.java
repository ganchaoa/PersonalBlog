package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.ContentDao;
import com.ganchaoa.entity.Content;
import com.ganchaoa.service.ContentService;

@Service
@Transactional(readOnly = true)
public class ContentServiceImpl implements ContentService{

	@Autowired
	ContentDao contentDao;
	
	@Override
	public List<Content> recentContent(int limit) {
		return contentDao.recentContents(limit);
	}

	@Override
	public Long count() {
		return contentDao.count();
	}

	@Override
	public List<Content> countByTypeAndStatus(String type, String status) {
		return contentDao.countByTypeAndStatus(type, status);
	}

}
