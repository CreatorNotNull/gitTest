package cn.yueqian.com.dao.entity;

import java.util.Date;

public class User {
	private Integer id;
	private Integer score;
	private String userName;
	private String pass;
	private String sex;
	private String address;
	private Date birthday;
	private Double money;
	public User() {
		super();
	}
	public User(Integer id, Integer score, String userName, String pass,
			String sex, String address, Date birthday, Double money) {
		super();
		this.id = id;
		this.score = score;
		this.userName = userName;
		this.pass = pass;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.money = money;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", score=" + score + ", userName=" + userName
				+ ", pass=" + pass + ", sex=" + sex + ", address=" + address
				+ ", birthday=" + birthday + ", money=" + money + "]";
	}
	
}
