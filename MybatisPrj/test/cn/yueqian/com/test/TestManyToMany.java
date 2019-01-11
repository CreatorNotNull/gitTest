package cn.yueqian.com.test;

import java.util.Set;

import cn.yueqian.com.dao.entity.Student;
import cn.yueqian.com.dao.entity.Teacher;
import cn.yueqian.com.dao.impl.TeacherDaoImpl;

public class TestManyToMany {
	public static void main(String[] args) {
		/*Student student = new StudentDaoImpl().getById(1);
		Set<Teacher> teachers = student.getTeachers();
		for (Teacher teacher : teachers) {
			System.out.println(teacher.toString());
		}*/
		
		Teacher teacher = new TeacherDaoImpl().getById(1);
		Set<Student> students = teacher.getStudents();
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
