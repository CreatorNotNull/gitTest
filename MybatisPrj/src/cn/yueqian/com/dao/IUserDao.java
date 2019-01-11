package cn.yueqian.com.dao;

import java.util.HashMap;
import java.util.List;

import cn.yueqian.com.dao.entity.User;
import cn.yueqian.com.util.Page;

public interface IUserDao {
	public User getUserById(int id) ;
	public List<User> listAll();
	public User getUserByNameAndPass(User user);
	public User getUserByNameAndPass1(HashMap hashMap);
	public int save(User user);
	public int del(User user);
	public int update(User user);
	public int getTotalCount() ;
	public List<User> getOnePageInfo(HashMap<String, Integer> hashMap) throws Exception;
	public Page<User> getOnePage(int currentPage,int pageSize);
}
