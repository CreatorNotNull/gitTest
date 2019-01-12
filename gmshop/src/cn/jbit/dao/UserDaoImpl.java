package cn.jbit.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.jbit.domain.User;
import cn.jbit.dto.UserQueryDTO;
import cn.jbit.utils.HibernateUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User user) {
		Session session = HibernateUtil.getSession();
		session.save(user);

	}

	@Override
	public User getUnique(UserQueryDTO userQueryDTO) {
		Session session = HibernateUtil.getSession();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT u FROM User u ");
		sb.append("WHERE (u.loginName = :loginName) ");
		sb.append("AND (u.pass = :pass)");
		Query query = session.createQuery(sb.toString());
		query.setString("loginName", userQueryDTO.getLoginName());
		query.setString("pass", userQueryDTO.getPass());
		return (User) query.uniqueResult();
	}

}
