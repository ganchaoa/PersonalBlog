package com.ganchaoa.entity;

/**
 * 文章与内容关联表
 *
 */
public class Content_Tag {

	private int id;
	
	private Content content;
	
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
