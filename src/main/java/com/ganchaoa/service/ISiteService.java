package com.ganchaoa.service;

import java.util.List;

import com.ganchaoa.entity.Comment;
import com.ganchaoa.entity.Content;

public interface ISiteService {
	
	List<Comment> recentsComment(int limit);
	
	List<Content> recentContent(int limit);
	
	

}
