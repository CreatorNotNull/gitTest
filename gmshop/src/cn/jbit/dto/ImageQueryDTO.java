package cn.jbit.dto;

import java.io.Serializable;

/**
 * …Ã∆∑Õº∆¨DTO
 * 
 * @author william
 * 
 */
public class ImageQueryDTO implements Serializable {

	/**
	 * Õº∆¨±‡∫≈
	 */
	private Long id;

	/**
	 * Õº∆¨µÿ÷∑
	 */
	private String url;

	/**
	 * À˘ Ù…Ã∆∑
	 */
	private ProductQueryDTO productQueryDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ImageQueryDTO() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ProductQueryDTO getProductQueryDTO() {
		return productQueryDTO;
	}

	public void setProductQueryDTO(ProductQueryDTO productQueryDTO) {
		this.productQueryDTO = productQueryDTO;
	}

	public ImageQueryDTO(Long id, String url, ProductQueryDTO productQueryDTO) {
		super();
		this.id = id;
		this.url = url;
		this.productQueryDTO = productQueryDTO;
	}

}
