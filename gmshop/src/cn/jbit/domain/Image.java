package cn.jbit.domain;

import java.io.Serializable;

/**
 * …Ã∆∑Õº∆¨
 * 
 * @author william
 * 
 */
public class Image implements Serializable {

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
	private Product product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Image(Long id, String url, Product product) {
		super();
		this.id = id;
		this.url = url;
		this.product = product;
	}

	public Image() {
		super();
	}

}
