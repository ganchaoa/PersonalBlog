package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ganchaoa.dao.ContentDao;
import com.ganchaoa.entity.Content;
import com.ganchaoa.service.ContentService;

public class ContentServiceImpl implements ContentService{

	@Autowired
	ContentDao contentDao;
	
	@Override
	public List<Content> recentContent(int limit) {
		return contentDao.recentContents(limit);
	}

}
