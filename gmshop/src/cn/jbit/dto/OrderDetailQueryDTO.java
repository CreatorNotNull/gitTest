package cn.jbit.dto;

import java.io.Serializable;

/**
 * 订单明细查询DTO
 * 
 * @author william
 * 
 */
public class OrderDetailQueryDTO implements Serializable {

	/**
	 * 订单明细编号
	 */
	private Long id;

	/**
	 * 购买商品
	 */
	private ProductDTO productQueryDTO;

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
	private OrderQueryDTO orderQueryDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public ProductDTO getProductQueryDTO() {
		return productQueryDTO;
	}

	public void setProductQueryDTO(ProductDTO productQueryDTO) {
		this.productQueryDTO = productQueryDTO;
	}

	public OrderQueryDTO getOrderQueryDTO() {
		return orderQueryDTO;
	}

	public void setOrderQueryDTO(OrderQueryDTO orderQueryDTO) {
		this.orderQueryDTO = orderQueryDTO;
	}

	public OrderDetailQueryDTO(Long id, ProductDTO productQueryDTO,
			Integer buyNum, Float price, OrderQueryDTO orderQueryDTO) {
		super();
		this.id = id;
		this.productQueryDTO = productQueryDTO;
		this.buyNum = buyNum;
		this.price = price;
		this.orderQueryDTO = orderQueryDTO;
	}

	public OrderDetailQueryDTO() {
		super();
	}

}
