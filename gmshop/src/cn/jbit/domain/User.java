package cn.jbit.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * �û�ʵ��
 * 
 * @author william
 * 
 */
public class User implements Serializable {

	/**
	 * �û����
	 */
	private Long id;
	/**
	 * ��ʵ����
	 */
	private String myName;
	/**
	 * ��¼��
	 */
	private String loginName;
	/**
	 * ��¼����
	 */
	private String pass;
	/**
	 * email
	 */
	private String email;
	/**
	 * �Ա�
	 */
	private String sex;
	/**
	 * ͷ���ַ
	 */
	private String image;
	/**
	 * ��������
	 */
	private Date bornDay;

	/**
	 * ���¶���
	 */
	private Set<Order> orders = new HashSet<Order>();

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

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

	public User(Long id, String myName, String loginName, String pass,
			String email, String sex, String image, Date bornDay,
			Set<Order> orders) {
		super();
		this.id = id;
		this.myName = myName;
		this.loginName = loginName;
		this.pass = pass;
		this.email = email;
		this.sex = sex;
		this.image = image;
		this.bornDay = bornDay;
		this.orders = orders;
	}

	public User() {
		super();
	}

}
