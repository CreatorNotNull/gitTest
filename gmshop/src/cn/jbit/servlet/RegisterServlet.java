package cn.jbit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.jbit.dto.UserDTO;
import cn.jbit.service.IUserService;
import cn.jbit.service.UserServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IUserService userService = new UserServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory);
		if(sfu.isMultipartContent(request)){
			try {
				List<FileItem> items = sfu.parseRequest(request);
				for(int i = 0 ; i < items.size() ;  i++){
					FileItem item = items.get(i);
					if(item.isFormField()){
						System.out.println("=-=============" + item.getFieldName());
						if("loginName".equals(item.getName())){
							System.out.println("loginName:" + item.getString("utf-8"));
						}
					}
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		UserDTO userDTO = new UserDTO();
		
		this.userService.register(userDTO);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
