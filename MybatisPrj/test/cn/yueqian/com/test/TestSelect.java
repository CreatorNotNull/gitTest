package cn.yueqian.com.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import cn.yueqian.com.dao.IUserDao;
import cn.yueqian.com.dao.entity.User;
import cn.yueqian.com.dao.impl.IUserDaoImpl;
import cn.yueqian.com.util.Page;

public class TestSelect {

	public static void main(String[] args) {
		/*User user = new IUserDaoImpl().getUserById(2);
		System.out.println(user.toString());*/
		
		//List<User> list = new IUserDaoImpl().listAll();
		IUserDao userDao = new IUserDaoImpl();
		List<User> list = userDao.listAll();
		for (User user : list) {
			System.out.println(user.toString());
		}
		/*User user = new User();
		user.setName("creator");
		user.setPass("654123");
		User list = new IUserDaoImpl().getUserByNameAndPass(user);
		System.out.println(list.toString());*/
		
		/*HashMap map = new HashMap();
		map.put("name", "creator");
		map.put("pass", "654123");
		User user = new IUserDaoImpl().getUserByNameAndPass1(map);
		System.out.println(user.toString());*/
		
		/*User user =new User(null, 99, "freedom1", "123456", "男", "earth", new Date(), 8888D);
		int save = new IUserDaoImpl().save(user);
		System.out.println(save);*/
		
		/*User user = new User();
		user.setUserName("freedom");
		user.setPass("9999");
		int i = new IUserDaoImpl().update(user);
		System.out.println(i);*/
		
		/*User user = new User();
		user.setUserName("freedom1");
		int i = new IUserDaoImpl().del(user);
		System.out.println(i);*/
		
		/*Page<User> onePage = new IUserDaoImpl().getOnePage(1, 3);
		int count = onePage.getCount();
		int currentPage = onePage.getCurrentPage();
		int pageSize = onePage.getPageSize();
		int totalPage = onePage.getTotalPage();
		List<User> lists = onePage.getLists();
		System.out.println("总记录数为:"+count);
		System.out.println("总页数:"+totalPage);
		System.out.println("每页显示数目:"+pageSize);
		System.out.println("第"+currentPage+"页");
		System.out.println("详细信息：");
		for (User user : lists) {
			System.out.println(user.toString());
		}*/
	}

}
