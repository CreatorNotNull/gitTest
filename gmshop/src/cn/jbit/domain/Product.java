package cn.jbit.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 商品实体
 * 
 * @author william
 * 
 */
public class Product implements Serializable {

	/**
	 * 商口编号
	 */
	private Long id;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品单价
	 */
	private Float price;
	/**
	 * 运费
	 */
	private Float freight;
	/**
	 * 失效时间
	 */
	private Date expireTime;
	/**
	 * 销售量
	 */
	private Integer sellNum=0;
	/**
	 * 库存量
	 */
	private Integer stockNum;

	/**
	 * 商品图片集合
	 */
	private Set<Image> images = new HashSet<Image>();

	/**
	 * 商品分类
	 */
	private Category category;

	/**
	 * 所在地
	 */
	private String sellAddress;

	/**
	 * 浏览量
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public Set<Image> getImages() {
		return images;
	}

	public Product(Long id, String name, Float price, Float freight,
			Date expireTime, Integer sellNum, Integer stockNum,
			Set<Image> images, Category category, String sellAddress,
			Integer viewNum) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.freight = freight;
		this.expireTime = expireTime;
		this.sellNum = sellNum;
		this.stockNum = stockNum;
		this.images = images;
		this.category = category;
		this.sellAddress = sellAddress;
		this.viewNum = viewNum;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public Product() {
		super();
	}

}
