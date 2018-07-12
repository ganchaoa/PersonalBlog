package com.ganchaoa.entity;

import java.io.Serializable;
import java.util.Date;

public class Attach implements Serializable {

	private static final long serialVersionUID = 5917045039355016853L;
	
	private Integer id;
	
	private String fname;
	
	private String fkey;
	
	private String ftype;
	
	private Integer authorId;
	
	private Date created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFkey() {
		return fkey;
	}

	public void setFkey(String fkey) {
		this.fkey = fkey;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Attach {'id':'" + id + "', fname':'" + fname + "', fkey':'" + fkey + "', ftype':'" + ftype
				+ "', authorId':'" + authorId + "', created':'" + created + "}";
	}
	
	

}
