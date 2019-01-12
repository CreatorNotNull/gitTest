package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 订单查询DTO
 * 
 * @author william
 * 
 */
public class OrderQueryDTO implements Serializable {

	/**
	 * 订单编号
	 */
	private Long id;

	/**
	 * 所属用户
	 */
	private UserQueryDTO userQueryDTO;

	/**
	 * 收件人地址
	 */
	private String address;

	/**
	 * 收件人电话
	 */
	private String phone;

	/**
	 * 订单明细
	 */
	private Set<OrderDetailQueryDTO> orderDetailsQueryDTOs = new HashSet<OrderDetailQueryDTO>();

	public UserQueryDTO getUserQueryDTO() {
		return userQueryDTO;
	}

	public void setUserQueryDTO(UserQueryDTO userQueryDTO) {
		this.userQueryDTO = userQueryDTO;
	}

	public Set<OrderDetailQueryDTO> getOrderDetailsQueryDTOs() {
		return orderDetailsQueryDTOs;
	}

	public void setOrderDetailsQueryDTOs(
			Set<OrderDetailQueryDTO> orderDetailsQueryDTOs) {
		this.orderDetailsQueryDTOs = orderDetailsQueryDTOs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public OrderQueryDTO() {
		super();
	}

	public OrderQueryDTO(Long id, UserQueryDTO userQueryDTO, String address,
			String phone, Set<OrderDetailQueryDTO> orderDetailsQueryDTOs) {
		super();
		this.id = id;
		this.userQueryDTO = userQueryDTO;
		this.address = address;
		this.phone = phone;
		this.orderDetailsQueryDTOs = orderDetailsQueryDTOs;
	}

}
