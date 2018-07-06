package com.ganchaoa.entity;

import java.io.Serializable;

/**
 * 日志表
 *
 */
public class Log implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4681829244523676600L;

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 动作
	 */
	private String action;
	
	/**
	 * 数据
	 */
	private String data;
	
	/**
	 * 创建时间
	 */
	private String created;
	
	/**
	 * 使用者
	 */
	private String user;
	
	/**
	 * ip地址
	 */
	private String ip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	

}
