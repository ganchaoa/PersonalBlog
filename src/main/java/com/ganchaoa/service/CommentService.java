package com.ganchaoa.service;

import java.util.List;

import com.ganchaoa.entity.Comment;

public interface CommentService {

	public List<Comment> recentComments(int limit);
}
