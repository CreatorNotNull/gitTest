package cn.jbit.domain;

import java.io.Serializable;

/**
 * 订单明细
 * 
 * @author william
 * 
 */
public class OrderDetail implements Serializable {

	/**
	 * 订单明细编号
	 */
	private Long id;

	/**
	 * 购买商品
	 */
	private Product product;

	/**
	 * 购买数量
	 */
	private Integer buyNum;

	/**
	 * 商品单价
	 */
	private Float price;

	/**
	 * 关联订单
	 */
	private Order order;

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

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderDetail(Long id, Product product, Integer buyNum, Float price,
			Order order) {
		super();
		this.id = id;
		this.product = product;
		this.buyNum = buyNum;
		this.price = price;
		this.order = order;
	}

	public OrderDetail() {
		super();
	}

}
