package com.ganchaoa.dao;

import java.util.List;

import com.ganchaoa.entity.Content;

public interface ContentDao {
	
	public List<Content> recentContents(int limit);
	
	public Long count();
	
	public List<Content> countByTypeAndStatus(String type, String status);

}
