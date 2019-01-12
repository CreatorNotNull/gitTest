package cn.jbit.dao;

import java.util.List;

import cn.jbit.domain.Category;
import cn.jbit.utils.Page;

/**
 * 商品分类Dao
 * 
 * @author william
 * 
 */
public interface ICategoryDao {

	/**
	 * 分页查询所有的商品分类
	 * 
	 * @return
	 */
	public Page<Category> getByPagging(Integer page, Integer pageSize);

	/**
	 * 添加商品分类
	 */
	public void save(Category category);

	/**
	 * 查询所有商品分类
	 */
	public List<Category> getAll();
}
