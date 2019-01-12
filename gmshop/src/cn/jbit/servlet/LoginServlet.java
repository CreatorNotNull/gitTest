package cn.jbit.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.jbit.dto.UserDTO;
import cn.jbit.dto.UserQueryDTO;
import cn.jbit.service.IUserService;
import cn.jbit.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private IUserService userService = new UserServiceImpl();
	
	UserQueryDTO userQueryDTO = new UserQueryDTO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map parameters = request.getParameterMap();
		try {
			BeanUtils.populate(userQueryDTO, parameters);
			UserDTO userDTO = this.userService.login(userQueryDTO);
			request.getSession().setAttribute("user", userDTO);
			response.sendRedirect("login_success.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
