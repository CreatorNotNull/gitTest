package cn.jbit.action;

import java.io.File;
import java.sql.Date;
import java.util.Calendar;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import cn.jbit.dto.UserDTO;
import cn.jbit.dto.UserQueryDTO;
import cn.jbit.service.IUserService;
import cn.jbit.service.UserServiceImpl;
import cn.jbit.utils.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware {

	private UserQueryDTO userQueryDTO = new UserQueryDTO();

	private IUserService userService = new UserServiceImpl();

	private Map<String, Object> sessionMap;// Http session

	private UserDTO userDTO = new UserDTO();
	private File image;// 文件
	private String imageFileName;// 上传文件名

	/**
	 * 用户登陆
	 * 
	 * @return
	 */
	public String login() {
		Session session = HibernateUtil.getSession();
		try {
			// 调用业务层
			UserDTO userDTO = this.userService.login(userQueryDTO);
			if (null != userDTO && null != userDTO.getId()) {
				// 往session中添加登陆成功的用户信息
				this.sessionMap.put("userDTO", userDTO);
				return SUCCESS;
			} else {
				return ERROR;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	/**
	 * 用户注册
	 */
	public String register() {
		Session session = HibernateUtil.getSession();
		try {
			// 文件保存
			String path = ServletActionContext.getServletContext().getRealPath(
					"/upload")
					+ "/" + imageFileName;
			File destFile = new File(path);
			FileUtils.copyFile(image, destFile);
			userDTO.setImage(imageFileName);
			
			this.userService.register(userDTO);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			HibernateUtil.closeSession();
		}

	}

	public UserQueryDTO getUserQueryDTO() {
		return userQueryDTO;
	}

	public void setUserQueryDTO(UserQueryDTO userQueryDTO) {
		this.userQueryDTO = userQueryDTO;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// 给Http Session进行了赋值
		this.sessionMap = sessionMap;

	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

}
