package cn.yueqian.com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.CategoryDao;
import cn.yueqian.com.dao.entity.Category;
import cn.yueqian.com.util.MybatisUtil;

public class CategoryDaoImpl implements CategoryDao{

	@Override
	public List<Category> getChildById(int id) {
		List<Category> category = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		CategoryDao mapper = sqlSession.getMapper(CategoryDao.class);
		category = mapper.getChildById(id);
		MybatisUtil.closeSession();
		return category;
	}

}
