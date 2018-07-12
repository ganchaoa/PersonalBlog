package com.ganchaoa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章表
 *
 */
public class Content implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5597707841499994120L;

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 标签
	 */
	private String tags;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 作者
	 */
	private String author;
	
	/**
	 * 创建时间
	 */
	private Date create_time;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 是否能评价
	 */
	private boolean can_comment;
	
	/**
	 * 点击率
	 */
	private int hit_number;
	
	 /**
	 * 类型
	 */
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
