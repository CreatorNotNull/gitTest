package cn.jbit.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate������
 * 
 * @author william
 * 
 */
public class HibernateUtil {

	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	private static SessionFactory sessionFactory;
	static {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		sessionFactory = conf.buildSessionFactory();
	}

	/**
	 * ����session
	 * 
	 * @return
	 */
	public static Session getSession() {
		Session session = threadLocal.get();
		if (null == session) {
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	
	
	public static void closeSession(){
		Session session = threadLocal.get();
		if(null != session){
			session.close();
			threadLocal.remove();
		}
	}
}
