package cn.yueqian.com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.yueqian.com.dao.CardDao;
import cn.yueqian.com.dao.entity.Card;
import cn.yueqian.com.util.MybatisUtil;

public class CardDaoImpl implements CardDao {

	@Override
	public Card getById(int id) {
		Card card = null;
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		CardDao mapper = sqlSession.getMapper(CardDao.class);
		card = mapper.getById(id);
		MybatisUtil.closeSession();
		return card;
	}

}
