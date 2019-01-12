package cn.test.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			String uri = req.getRequestURI();
			if (uri.equals("/FilterTest/")) {//除非部署在root目录下，否则此处填写项目名称
				uri = "/index.jhtml";
			}
			uri = uri.substring(uri.lastIndexOf("/")+1,uri.lastIndexOf("."));//index
			uri = uri.substring(0,1).toUpperCase()+uri.substring(1);//Index
			String servlet = uri+"Servlet";//截取出来的uri即servlet-name要和servlet文件名的前半部分一致，否则访问不到页面
			String className = Dispatcher.class.getName();//className:cn.test.servlet.Dispatcher
			String packageName = className.substring(0, className.lastIndexOf("."));//packageName:cn.test.servlet
			Class<?> clazz = Class.forName(packageName+"."+servlet);//clazz:class cn.test.servlet.IndexServlet
			String reqMethod = req.getMethod();//reqMethod:GET 获取表单提交方式 GET/POST
			String invokeMethod = "do"+reqMethod.substring(0,1)+reqMethod.substring(1).toLowerCase();//invokeMethod:doGet 拼接
			Method method = clazz.getDeclaredMethod(invokeMethod, new Class[]{HttpServletRequest.class,HttpServletResponse.class});
			//反射获取deGet方法
			method.setAccessible(true);//强制调用非public方法
			method.invoke(clazz.newInstance(), new Object[]{req,resp});//反射调用方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
