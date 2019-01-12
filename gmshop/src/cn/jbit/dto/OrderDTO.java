package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 订单DTO
 * 
 * @author william
 * 
 */
public class OrderDTO implements Serializable {

	/**
	 * 订单编号
	 */
	private Long id;

	/**
	 * 所属用户
	 */
	private UserDTO userDTO;

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
	private Set<OrderDetailDTO> orderDetailsDTO = new HashSet<OrderDetailDTO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderDTO(Long id, UserDTO userDTO, String address, String phone,
			Set<OrderDetailDTO> orderDetailsDTO) {
		super();
		this.id = id;
		this.userDTO = userDTO;
		this.address = address;
		this.phone = phone;
		this.orderDetailsDTO = orderDetailsDTO;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public Set<OrderDetailDTO> getOrderDetailsDTO() {
		return orderDetailsDTO;
	}

	public void setOrderDetailsDTO(Set<OrderDetailDTO> orderDetailsDTO) {
		this.orderDetailsDTO = orderDetailsDTO;
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

	public OrderDTO() {
		super();
	}

}
