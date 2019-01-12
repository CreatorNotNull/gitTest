package cn.jbit.dao;

import cn.jbit.domain.User;
import cn.jbit.dto.UserQueryDTO;

/**
 * UserDao½Ó¿Ú
 * 
 * @author william
 * 
 */
public interface IUserDao {

	public void save(User user);

	public User getUnique(UserQueryDTO userQueryDTO);

}
