package cn.yueqian.com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.DeptDao;
import cn.yueqian.com.dao.entity.Dept;
import cn.yueqian.com.util.MybatisUtil;

public class DeptDaoImpl implements DeptDao{
	@Override
	public Dept getById(int id) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		Dept dept = sqlSession.selectOne("cn.yueqian.com.dao.impl.DeptDao.getById",id);
		/*DeptDao mapper = sqlSession.getMapper(DeptDao.class);
		Dept dept = mapper.getById(id);*/
		MybatisUtil.closeSession();
		return dept;
	}

}
