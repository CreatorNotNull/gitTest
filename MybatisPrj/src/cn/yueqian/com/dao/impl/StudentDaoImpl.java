package cn.yueqian.com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.StudentDao;
import cn.yueqian.com.dao.entity.Student;
import cn.yueqian.com.util.MybatisUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student getById(int id) {
		Student student = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		student = mapper.getById(id);
		MybatisUtil.closeSession();
		return student;
	}

}
