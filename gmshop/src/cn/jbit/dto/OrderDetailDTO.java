package cn.jbit.dto;

import java.io.Serializable;

/**
 * 订单明细DTO
 * 
 * @author william
 * 
 */
public class OrderDetailDTO implements Serializable {

	/**
	 * 订单明细编号
	 */
	private Long id;

	/**
	 * 购买商品
	 */
	private ProductQueryDTO productDTO;

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
	private OrderDTO orderDTO;

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

	public OrderDetailDTO(Long id, ProductQueryDTO productDTO, Integer buyNum,
			Float price, OrderDTO orderDTO) {
		super();
		this.id = id;
		this.productDTO = productDTO;
		this.buyNum = buyNum;
		this.price = price;
		this.orderDTO = orderDTO;
	}

	public ProductQueryDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductQueryDTO productDTO) {
		this.productDTO = productDTO;
	}

	public OrderDTO getOrderDTO() {
		return orderDTO;
	}

	public void setOrderDTO(OrderDTO orderDTO) {
		this.orderDTO = orderDTO;
	}

	public OrderDetailDTO() {
		super();
	}

}
