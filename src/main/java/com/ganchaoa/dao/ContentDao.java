package com.ganchaoa.dao;

import java.util.List;

import com.ganchaoa.entity.Content;

public interface ContentDao {
	
	public List<Content> recentContents(int limit);

}
