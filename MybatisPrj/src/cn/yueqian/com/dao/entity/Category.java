package cn.yueqian.com.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private Integer id;
	private String name;
	private Category parent;
	private Set<Category> childrens = new HashSet<Category>();
	
	public Category(Integer id, String name,  Category parent,
			Set<Category> childrens) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.childrens = childrens;
	}
	public Category() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Category> getChildrens() {
		return childrens;
	}
	public void setChildrens(Set<Category> childrens) {
		this.childrens = childrens;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parent=" + parent
				+ ", childrens=" + childrens + "]";
	}
	
}
