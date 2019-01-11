package cn.yueqian.com.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private Integer id;
	private String name;
	private String location;
	private Set<Emp> emps = new HashSet<Emp>();
	public Dept() {
		super();
	}
	public Dept(Integer id, String name, String location, Set<Emp> emps) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.emps = emps;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", location=" + location
				+ ", emps=" + emps + "]";
	}
}
