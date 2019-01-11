package cn.yueqian.com.dao.entity;

public class Emp {
	private Integer id;
	private String name;
	private String sex;
	private String address;
	private Double salary;
	private String job;
	private Dept dept;
	public Emp() {
		super();
	}
	public Emp(Integer id, String name, String sex, String address,
			Double salary, String job, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.salary = salary;
		this.job = job;
		this.dept = dept;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", address=" + address + ", salary=" + salary + ", job="
				+ job + ", dept=" + dept + "]";
	}
	
}
