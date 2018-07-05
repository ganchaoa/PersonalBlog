package com.ganchaoa.entity;

import java.util.Date;

/**
 * 文章表
 *
 */
public class Content {
	
	private int id;
	
	private String title;
	
	private String tags;
	
	private String content;
	
	private String author;
	
	private Date create_time;
	
	private String status;
	
	private boolean can_comment;
	
	private int hit_number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isCan_comment() {
		return can_comment;
	}

	public void setCan_comment(boolean can_comment) {
		this.can_comment = can_comment;
	}

	public int getHit_number() {
		return hit_number;
	}

	public void setHit_number(int hit_number) {
		this.hit_number = hit_number;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	

}
