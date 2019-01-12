package cn.jbit.dto;

import java.io.Serializable;

/**
 * ������ϸ��ѯDTO
 * 
 * @author william
 * 
 */
public class OrderDetailQueryDTO implements Serializable {

	/**
	 * ������ϸ���
	 */
	private Long id;

	/**
	 * ������Ʒ
	 */
	private ProductDTO productQueryDTO;

	/**
	 * ��������
	 */
	private Integer buyNum;

	/**
	 * ��Ʒ����
	 */
	private Float price;

	/**
	 * ��������
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
