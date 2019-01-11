package cn.yueqian.com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.PersonDao;
import cn.yueqian.com.dao.entity.Card;
import cn.yueqian.com.dao.entity.Person;
import cn.yueqian.com.util.MybatisUtil;

public class PersonDaoImpl implements PersonDao {

	@Override
	public Person getById(int id) {
		Person person = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		PersonDao mapper = sqlSession.getMapper(PersonDao.class);
		person = mapper.getById(id);
		MybatisUtil.closeSession();
		return person;
	}

}
