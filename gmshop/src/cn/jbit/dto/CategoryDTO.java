package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 商品类别DTO
 * 
 * @author william
 * 
 */
public class CategoryDTO implements Serializable, Comparable<CategoryDTO> {

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
	private Set<ProductQueryDTO> productsDTO = new HashSet<ProductQueryDTO>();

	/**
	 * 子类别
	 */
	private Set<CategoryDTO> categoriesDTO = new TreeSet<CategoryDTO>();

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

	public CategoryDTO() {
		super();
	}

	public Set<ProductQueryDTO> getProductsDTO() {
		return productsDTO;
	}

	public void setProductsDTO(Set<ProductQueryDTO> productsDTO) {
		this.productsDTO = productsDTO;
	}

	public Set<CategoryDTO> getCategoriesDTO() {
		return categoriesDTO;
	}

	public void setCategoriesDTO(Set<CategoryDTO> categoriesDTO) {
		this.categoriesDTO = categoriesDTO;
	}

	public CategoryDTO(Long id, String name, Set<ProductQueryDTO> productsDTO,
			Set<CategoryDTO> categoriesDTO) {
		super();
		this.id = id;
		this.name = name;
		this.productsDTO = productsDTO;
		this.categoriesDTO = categoriesDTO;
	}

	@Override
	public int compareTo(CategoryDTO o) {
		return (int) (this.getId()-o.getId());
	}

}
