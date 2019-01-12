package cn.jbit.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 商品类别
 * 
 * @author william
 * 
 */
public class Category implements Serializable {

	/**
	 * 类别编号
	 */
	private Long id;

	/**
	 * 类别名称
	 */
	private String name;

	/**
	 * 商品集合
	 */
	private Set<Product> products = new HashSet<Product>();

	/**
	 * 子类别
	 */
	private Set<Category> categories = new HashSet<Category>();

	/**
	 * 父亲
	 * 
	 * @return
	 */
	private Category parent = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Category(Long id, String name, Set<Product> products,
			Set<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
		this.categories = categories;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Category() {
		super();
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

}
