package cn.jbit.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ��ƷDTO
 * 
 * @author william
 * 
 */
public class ProductQueryDTO implements Serializable {

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
	private Integer sellNum;
	/**
	 * �����
	 */
	private Integer stockNum;

	/**
	 * ��ƷͼƬ����
	 */
	private Set<ImageQueryDTO> imagesQueryDTOs = new HashSet<ImageQueryDTO>();

	/**
	 * ��Ʒ����
	 */
	private CategoryQueryDTO categoryQueryDTO;

	/**
	 * ���ڵ�
	 */
	private String sellAddress;

	/**
	 * �����
	 */
	private Integer viewNum;

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

	public ProductQueryDTO() {
		super();
	}

	public Set<ImageQueryDTO> getImagesQueryDTOs() {
		return imagesQueryDTOs;
	}

	public void setImagesQueryDTOs(Set<ImageQueryDTO> imagesQueryDTOs) {
		this.imagesQueryDTOs = imagesQueryDTOs;
	}

	public CategoryQueryDTO getCategoryQueryDTO() {
		return categoryQueryDTO;
	}

	public void setCategoryQueryDTO(CategoryQueryDTO categoryQueryDTO) {
		this.categoryQueryDTO = categoryQueryDTO;
	}

	public ProductQueryDTO(Long id, String name, Float price, Float freight,
			Date expireTime, Integer sellNum, Integer stockNum,
			Set<ImageQueryDTO> imagesQueryDTOs,
			CategoryQueryDTO categoryQueryDTO, String sellAddress,
			Integer viewNum) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.freight = freight;
		this.expireTime = expireTime;
		this.sellNum = sellNum;
		this.stockNum = stockNum;
		this.imagesQueryDTOs = imagesQueryDTOs;
		this.categoryQueryDTO = categoryQueryDTO;
		this.sellAddress = sellAddress;
		this.viewNum = viewNum;
	}

}
