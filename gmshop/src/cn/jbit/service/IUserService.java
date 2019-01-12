package cn.jbit.service;

import cn.jbit.dto.UserDTO;
import cn.jbit.dto.UserQueryDTO;

/**
 * �û�ҵ���ӿ�
 * 
 * @author william
 * 
 */
public interface IUserService {

	/**
	 * �û���¼
	 * 
	 * @param userDTO
	 * @return
	 */
	public UserDTO login(UserQueryDTO userQueryDTO);

	/**
	 * �û�ע��
	 * 
	 * @param userDTO
	 */
	public void register(UserDTO userDTO);

}
