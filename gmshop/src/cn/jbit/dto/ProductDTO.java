package cn.jbit.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * ��Ʒ��ѯDTO
 * 
 * @author william
 * 
 */
public class ProductDTO implements Serializable {

	/**
	 * �̿ڱ��
	 */
	private Long id;
	/**
	 * ��Ʒ����
	 */
	private String name;
	/**
	 * ��Ʒ����
	 */
	private Float price;
	/**
	 * �˷�
	 */
	private Float freight;
	/**
	 * ʧЧʱ��
	 */
	private Date expireTime;
	/**
	 * ������
	 */
	private Integer sellNum=0;
	/**
	 * �����
	 */
	private Integer stockNum;

	/**
	 * ��ƷͼƬ����
	 */
	private Set<ImageDTO> imagesDTO = new TreeSet<ImageDTO>();

	/**
	 * ��Ʒ����
	 */
	private CategoryDTO categoryDTO;

	/**
	 * ���ڵ�
	 */
	private String sellAddress;

	/**
	 * �����
	 */
	private Integer viewNum=0;

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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getFreight() {
		return freight;
	}

	public void setFreight(Float freight) {
		this.freight = freight;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getSellNum() {
		return sellNum;
	}

	public void setSellNum(Integer sellNum) {
		this.sellNum = sellNum;
	}

	public Integer getStockNum() {
		return stockNum;
	}

	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	public String getSellAddress() {
		return sellAddress;
	}

	public void setSellAddress(String sellAddress) {
		this.sellAddress = sellAddress;
	}

	public Integer getViewNum() {
		return viewNum;
	}

	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}

	public ProductDTO(Long id, String name, Float price, Float freight,
			Date expireTime, Integer sellNum, Integer stockNum,
			Set<ImageDTO> imagesDTO, CategoryDTO categoryDTO,
			String sellAddress, Integer viewNum) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.freight = freight;
		this.expireTime = expireTime;
		this.sellNum = sellNum;
		this.stockNum = stockNum;
		this.imagesDTO = imagesDTO;
		this.categoryDTO = categoryDTO;
		this.sellAddress = sellAddress;
		this.viewNum = viewNum;
	}

	public Set<ImageDTO> getImagesDTO() {
		return imagesDTO;
	}

	public void setImagesDTO(Set<ImageDTO> imagesDTO) {
		this.imagesDTO = imagesDTO;
	}

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public ProductDTO() {
		super();
	}

}
