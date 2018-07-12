package com.ganchaoa.dao;

import java.util.List;

import com.ganchaoa.entity.Comment;

public interface CommentDao {

	public List<Comment> recentComments(int limit);
	
	public Long count();
}
