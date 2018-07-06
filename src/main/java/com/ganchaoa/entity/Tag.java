package com.ganchaoa.entity;

import java.io.Serializable;

/**
 * 标签表
 *
 */
public class Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1094391539858865219L;

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 父标签
	 */
	private int parent;
	
	/**
	 * 描述
	 */
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
