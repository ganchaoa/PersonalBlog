package com.ganchaoa.entity;

import java.io.Serializable;

/**
 * 用户表
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5414513605118314820L;

	/**
	 * 用户名
	 */
	private String name;
	
	/**
	 * 密码
	 */
	private String pwd;
	
	/**
	 * 联系号码
	 */
	private String phone;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 昵称
	 */
	private String nickName;
	
	/**
	 * 个人主页
	 */
	private String homeUrl;
	
	/**
	 * 群组
	 */
	private String groupName;
	
	/**
	 * 账号创建时间
	 */
	private Integer created;
	
	/**
	 * 上次活跃时间
	 */
	private Integer activited;
	
	/**
	 * 上次登录时间
	 */
	private Integer logger;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHomeUrl() {
		return homeUrl;
	}

	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getCreated() {
		return created;
	}

	public void setCreated(Integer created) {
		this.created = created;
	}

	public Integer getActivited() {
		return activited;
	}

	public void setActivited(Integer activited) {
		this.activited = activited;
	}

	public Integer getLogger() {
		return logger;
	}

	public void setLogger(Integer logger) {
		this.logger = logger;
	}
	
	
}
