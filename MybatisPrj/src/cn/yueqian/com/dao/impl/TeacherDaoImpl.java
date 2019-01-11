package cn.yueqian.com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.TeacherDao;
import cn.yueqian.com.dao.entity.Teacher;
import cn.yueqian.com.util.MybatisUtil;

public class TeacherDaoImpl implements TeacherDao {

	@Override
	public Teacher getById(int id) {
		Teacher teacher = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);
		teacher = mapper.getById(id);
		MybatisUtil.closeSession();
		return teacher;
	}

}
