package cn.yueqian.com.dao.impl;


import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.yueqian.com.dao.IUserDao;
import cn.yueqian.com.dao.entity.User;
import cn.yueqian.com.util.MybatisUtil;
import cn.yueqian.com.util.Page;

public class IUserDaoImpl implements IUserDao{
	@Override
	public User getUserById(int id) {
		User user = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//user = sqlSession.selectOne("cn.yueqian.com.dao.IUserDao.getUserById",id);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);
			user = mapper.getUserById(id);
			System.out.println(user.getUserName());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		SqlSession sqlSession2 = sf.openSession();
		IUserDao userDao = sqlSession2.getMapper(IUserDao.class);
		User user2 = userDao.getUserById(id);
		System.out.println(user2.getUserName());
		return user;
	}

	@Override
	public List<User> listAll() {
		List<User> user = null;
		/*Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;*/
		try {
			/*reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();*/
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			//user = sqlSession.selectList("cn.yueqian.com.dao.IUserDao.listAll");
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);
			user = mapper.listAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtil.closeSession();
		}
		return user;
	}

	@Override
	public User getUserByNameAndPass(User user) {
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			resultUser = sqlSession.selectOne("cn.yueqian.com.dao.IUserDao.getUserByNameAndPass",user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultUser;
	}

	@Override
	public User getUserByNameAndPass1(HashMap hashMap) {
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			resultUser = sqlSession.selectOne("cn.yueqian.com.dao.IUserDao.getUserByNameAndPass",hashMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultUser;
	}

	@Override
	public int save(User user) {
		int row = -1;
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//row = sqlSession.insert("cn.yueqian.com.dao.IUserDao.save",user);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);//调用额是接口
			row = mapper.save(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int del(User user) {
		int row = -1;
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//row = sqlSession.insert("cn.yueqian.com.dao.IUserDao.save",user);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);//调用的是接口
			row = mapper.del(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int update(User user) {
		int row = -1;
		User resultUser = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//row = sqlSession.insert("cn.yueqian.com.dao.IUserDao.save",user);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);//调用的是接口
			row = mapper.update(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int getTotalCount() {
		int row = -1;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//row = sqlSession.insert("cn.yueqian.com.dao.IUserDao.save",user);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);//调用的是接口
			row = mapper.getTotalCount();
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public List<User> getOnePageInfo(HashMap<String, Integer> hashMap)
			throws Exception {
		List<User> user = null;
		Reader reader = null;
		SqlSessionFactory sf = null;
		SqlSession sqlSession = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sf.openSession();
			//user = sqlSession.selectList("cn.yueqian.com.dao.IUserDao.getOnePageInfo",hashMap);
			IUserDao mapper = sqlSession.getMapper(IUserDao.class);
			user = mapper.getOnePageInfo(hashMap);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		return user;
	}

	@Override
	public Page<User> getOnePage(int currentPage, int pageSize) {
		int totalCount = this.getTotalCount();
		List<User> lists = null;
		try {
			HashMap<String, Integer> hashMap = new HashMap<>();
			hashMap.put("currentPage", (currentPage-1)*pageSize);
			hashMap.put("pageSize", pageSize);
			lists = this.getOnePageInfo(hashMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Page<User> page = new Page<User>(currentPage, totalCount, pageSize, lists);
		return page;
	}

}
