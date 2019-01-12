package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ����DTO
 * 
 * @author william
 * 
 */
public class OrderDTO implements Serializable {

	/**
	 * �������
	 */
	private Long id;

	/**
	 * �����û�
	 */
	private UserDTO userDTO;

	/**
	 * �ռ��˵�ַ
	 */
	private String address;

	/**
	 * �ռ��˵绰
	 */
	private String phone;

	/**
	 * ������ϸ
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
