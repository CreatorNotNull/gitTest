package cn.yueqian.com.dao.entity;

public class TeaAndStu {
	private Student student;
	private Teacher teacher;
	public TeaAndStu() {
		super();
	}
	public TeaAndStu(Student student, Teacher teacher) {
		super();
		this.student = student;
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "TeaAndStu [student=" + student + ", teacher=" + teacher + "]";
	}
	
}
