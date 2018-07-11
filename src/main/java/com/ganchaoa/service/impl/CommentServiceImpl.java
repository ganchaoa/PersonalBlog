package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganchaoa.dao.CommentDao;
import com.ganchaoa.entity.Comment;
import com.ganchaoa.service.CommentService;

@Service
@Transactional(readOnly = true)
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao commentDao;
	
	@Override
	public List<Comment> recentComments(int limit) {
		
		return commentDao.recentComments(limit);
	}

	@Override
	public Long count() {
		
		return commentDao.count();
	}

}
