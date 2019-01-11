package cn.yueqian.com.dao;

import java.util.List;

import cn.yueqian.com.dao.entity.Category;

public interface CategoryDao {
	public List<Category> getChildById(int id);
}
