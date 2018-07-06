package com.ganchaoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ganchaoa.dao.CommentDao;
import com.ganchaoa.entity.Comment;
import com.ganchaoa.service.CommentService;

public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao commentDao;
	
	@Override
	public List<Comment> recentComments(int limit) {
		
		return commentDao.recentComments(limit);
	}

}
