package cn.yueqian.com.dao.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private String sex;
	private Date birthday;
	private Integer score;
	private String grade;
	private Set<Teacher> teachers = new HashSet<Teacher>();//固定搭配，set集合不能放重复数据，ArrayList能放重复数据
	public Student() {
		super();
	}
	public Student(Integer id, String name, String sex, Date birthday,
			Integer score, String grade, Set<Teacher> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.score = score;
		this.grade = grade;
		this.teachers = teachers;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", birthday=" + birthday + ", score=" + score + ", grade="
				+ grade + ", teachers=" + teachers + "]";
	}
	
}
