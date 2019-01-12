package cn.jbit.service;

import org.hibernate.Session;

import cn.jbit.dao.IUserDao;
import cn.jbit.dao.UserDaoImpl;
import cn.jbit.domain.User;
import cn.jbit.dto.UserDTO;
import cn.jbit.dto.UserQueryDTO;
import cn.jbit.utils.DozerMapperUtil;
import cn.jbit.utils.HibernateUtil;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();

	@Override
	public UserDTO login(UserQueryDTO userQueryDTO) {
		User user = this.userDao.getUnique(userQueryDTO);
		UserDTO userDTO = new UserDTO();
		if (null != user) {
			DozerMapperUtil.getMapper().map(user, userDTO);
		}
		return userDTO;
	}

	@Override
	public void register(UserDTO userDTO) {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			User user = new User();
			DozerMapperUtil.getMapper().map(userDTO, user);
			this.userDao.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		}
	}
}
