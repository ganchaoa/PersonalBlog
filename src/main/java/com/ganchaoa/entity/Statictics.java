package com.ganchaoa.entity;

import java.io.Serializable;

public class Statictics implements Serializable {
	
	private static final long serialVersionUID = 9074510280941443338L;

	private Long articles;
	
	private Long comments;
	
	private Long links;
	
	private Long attachs;

	public Long getArticles() {
		return articles;
	}

	public void setArticles(Long articles) {
		this.articles = articles;
	}

	public Long getComments() {
		return comments;
	}

	public void setComments(Long comments) {
		this.comments = comments;
	}

	public Long getLinks() {
		return links;
	}

	public void setLinks(Long links) {
		this.links = links;
	}

	public Long getAttachs() {
		return attachs;
	}

	public void setAttachs(Long attachs) {
		this.attachs = attachs;
	}
	
	

}
