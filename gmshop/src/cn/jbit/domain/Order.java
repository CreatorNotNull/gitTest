package cn.jbit.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 订单
 * 
 * @author william
 * 
 */
public class Order implements Serializable {

	/**
	 * 订单编号
	 */
	private Long id;

	/**
	 * 所属用户
	 */
	private User user;

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
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Order(Long id, User user, String address, String phone,
			Set<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.user = user;
		this.address = address;
		this.phone = phone;
		this.orderDetails = orderDetails;
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

	public Order() {
		super();
	}

}
