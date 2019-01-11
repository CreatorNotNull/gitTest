package cn.yueqian.com.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	private int id;
	private String name;
	private Set<Student> students = new HashSet<Student>();
	public Teacher() {
		super();
	}
	public Teacher(int id, String name, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students="
				+ students + "]";
	}
}
