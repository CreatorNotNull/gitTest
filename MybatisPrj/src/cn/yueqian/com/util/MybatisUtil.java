package cn.yueqian.com.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	static SqlSessionFactory sf = null;
	static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	static{
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		session = threadLocal.get();
		if (session == null) {
			session = sf.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	public static void closeSession() {
		SqlSession sqlSession = threadLocal.get();
		if (sqlSession!=null) {
			sqlSession.close();
			threadLocal.set(null);
		}
	}
}
