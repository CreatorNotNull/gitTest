package cn.yueqian.com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.EmpDao;
import cn.yueqian.com.dao.entity.Emp;
import cn.yueqian.com.util.MybatisUtil;

public class EmpDaoImpl implements EmpDao{

	@Override
	public Emp getById(int id) {
		Emp emp = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
//		emp = sqlSession.selectOne("cn.yueqian.com.dao.impl.EmpDao.getById",id);
		EmpDao mapper = sqlSession.getMapper(EmpDao.class);
		emp = mapper.getById(id);
		return emp;
	}

}
