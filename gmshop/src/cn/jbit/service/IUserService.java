package cn.jbit.service;

import cn.jbit.dto.UserDTO;
import cn.jbit.dto.UserQueryDTO;

/**
 * 用户业务层接口
 * 
 * @author william
 * 
 */
public interface IUserService {

	/**
	 * 用户登录
	 * 
	 * @param userDTO
	 * @return
	 */
	public UserDTO login(UserQueryDTO userQueryDTO);

	/**
	 * 用户注册
	 * 
	 * @param userDTO
	 */
	public void register(UserDTO userDTO);

}
