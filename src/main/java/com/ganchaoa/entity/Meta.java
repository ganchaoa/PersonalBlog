package com.ganchaoa.entity;

import java.io.Serializable;

public class Meta implements Serializable {

	private static final long serialVersionUID = 6917398068117973248L;

	private Integer mid;
	
	private String name;
	
	private String slug;
	
	private String type;
	
	private String description;
	
	private Integer sort;
	
	private Integer parent;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Meta {'mid':'" + mid + "', name':'" + name + "', slug':'" + slug + "', type':'" + type
				+ "', description':'" + description + "', sort':'" + sort + "', parent':'" + parent + "}";
	}
	
}
