package com.ganchaoa.service;

import java.util.List;

import com.ganchaoa.entity.Content;

public interface ContentService {

	public List<Content> recentContent(int limit);
}
