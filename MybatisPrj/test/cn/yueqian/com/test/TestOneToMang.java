package cn.yueqian.com.test;

import java.util.Set;

import cn.yueqian.com.dao.entity.Dept;
import cn.yueqian.com.dao.entity.Emp;
import cn.yueqian.com.dao.impl.DeptDaoImpl;
import cn.yueqian.com.dao.impl.EmpDaoImpl;

public class TestOneToMang {

	public static void main(String[] args) {
		// 一对多
		/*DeptDaoImpl deptDaoImpl = new DeptDaoImpl();
		Dept dept = deptDaoImpl.getById(1);
		Set<Emp> emps = dept.getEmps();
		for (Emp emp : emps) {
			System.err.println(emp.toString());
		}*/
		
		//多对一
		Emp emp = new EmpDaoImpl().getById(1);
		Dept dept = emp.getDept();
		System.out.println(dept.toString());
	}

}
