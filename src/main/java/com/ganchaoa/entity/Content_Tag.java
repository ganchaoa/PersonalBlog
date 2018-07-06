package com.ganchaoa.entity;

import java.io.Serializable;

/**
 * 文章与内容关联表
 *
 */
public class Content_Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6681638015989265254L;

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 文章
	 */
	private Content content;
	
	/**
	 * 标签
	 */
	private Tag tag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	
}
