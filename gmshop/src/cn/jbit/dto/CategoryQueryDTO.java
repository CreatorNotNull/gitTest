package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ��Ʒ����ѯDTO
 * 
 * @author william
 * 
 */
public class CategoryQueryDTO implements Serializable {

	/**
	 * �����
	 */
	private Long id;

	/**
	 * �������
	 */
	private String name;

	/**
	 * ��Ʒ����
	 */
	private Set<ProductDTO> productsQueryDTO = new HashSet<ProductDTO>();

	/**
	 * �����
	 */
	private Set<CategoryQueryDTO> categoriesQueryDTO = new HashSet<CategoryQueryDTO>();

	/**
	 * ����
	 * 
	 * @return
	 */
	private CategoryQueryDTO parent;

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

	public CategoryQueryDTO() {
		super();
	}

	public CategoryQueryDTO(Long id, String name,
			Set<ProductDTO> productsQueryDTO,
			Set<CategoryQueryDTO> categoriesQueryDTO) {
		super();
		this.id = id;
		this.name = name;
		this.productsQueryDTO = productsQueryDTO;
		this.categoriesQueryDTO = categoriesQueryDTO;
	}

	public Set<ProductDTO> getProductsQueryDTO() {
		return productsQueryDTO;
	}

	public void setProductsQueryDTO(Set<ProductDTO> productsQueryDTO) {
		this.productsQueryDTO = productsQueryDTO;
	}

	public Set<CategoryQueryDTO> getCategoriesQueryDTO() {
		return categoriesQueryDTO;
	}

	public void setCategoriesQueryDTO(Set<CategoryQueryDTO> categoriesQueryDTO) {
		this.categoriesQueryDTO = categoriesQueryDTO;
	}

	public CategoryQueryDTO getParent() {
		return parent;
	}

	public void setParent(CategoryQueryDTO parent) {
		this.parent = parent;
	}

}
