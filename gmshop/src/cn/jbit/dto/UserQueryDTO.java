package cn.jbit.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户DTO
 * 
 * @author william
 * 
 */
public class UserQueryDTO implements Serializable {

	/**
	 * 用户编号
	 */
	private Long id;
	/**
	 * 真实姓名
	 */
	private String myName;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String pass;
	/**
	 * email
	 */
	private String email;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 头像地址
	 */
	private String image;
	/**
	 * 出生日期
	 */
	private Date bornDay;

	/**
	 * 所下订单
	 */
	private Set<OrderQueryDTO> ordersQueryDTOs = new HashSet<OrderQueryDTO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getBornDay() {
		return bornDay;
	}

	public void setBornDay(Date bornDay) {
		this.bornDay = bornDay;
	}

	public UserQueryDTO() {
		super();
	}

	public Set<OrderQueryDTO> getOrdersQueryDTOs() {
		return ordersQueryDTOs;
	}

	public void setOrdersQueryDTOs(Set<OrderQueryDTO> ordersQueryDTOs) {
		this.ordersQueryDTOs = ordersQueryDTOs;
	}

	public UserQueryDTO(Long id, String myName, String loginName, String pass,
			String email, String sex, String image, Date bornDay,
			Set<OrderQueryDTO> ordersQueryDTOs) {
		super();
		this.id = id;
		this.myName = myName;
		this.loginName = loginName;
		this.pass = pass;
		this.email = email;
		this.sex = sex;
		this.image = image;
		this.bornDay = bornDay;
		this.ordersQueryDTOs = ordersQueryDTOs;
	}

}
