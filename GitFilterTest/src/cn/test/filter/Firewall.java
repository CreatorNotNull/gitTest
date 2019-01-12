package cn.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firewall implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response ,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		//访问第一个页面没有referer，从跳转开始有refered
		String refer = req.getHeader("Referer");
		//设置防火墙，不能从浏览器直接输入我们其他页面
		//只能完成主页一个入口进入后内部跳转
		String uri = req.getRequestURI();
		System.out.println("uri地址是："+uri);//uri地址是：/FilterTest/ 
		//判断是否是主页地址
		if (refer == null) {
			if (uri.equals("/FilterTest/")) {
				chain.doFilter(request, response);
			}else{
				resp.sendRedirect("/");
			}
		}else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}