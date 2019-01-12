package cn.jbit.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ������ѯDTO
 * 
 * @author william
 * 
 */
public class OrderQueryDTO implements Serializable {

	/**
	 * �������
	 */
	private Long id;

	/**
	 * �����û�
	 */
	private UserQueryDTO userQueryDTO;

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
