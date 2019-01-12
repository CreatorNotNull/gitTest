package cn.jbit.dto;

import java.io.Serializable;

/**
 * ��ƷͼƬDTO
 * 
 * @author william
 * 
 */
public class ImageDTO implements Serializable, Comparable<ImageDTO> {

	/**
	 * ͼƬ���
	 */
	private Long id;

	/**
	 * ͼƬ��ַ
	 */
	private String url;

	/**
	 * ������Ʒ
	 */
	private ProductQueryDTO productDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ImageDTO(Long id, String url, ProductQueryDTO productDTO) {
		super();
		this.id = id;
		this.url = url;
		this.productDTO = productDTO;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ProductQueryDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductQueryDTO productDTO) {
		this.productDTO = productDTO;
	}

	public ImageDTO() {
		super();
	}

	@Override
	public int compareTo(ImageDTO o) {
		return (int) (this.getId() - o.getId());
	}

}
