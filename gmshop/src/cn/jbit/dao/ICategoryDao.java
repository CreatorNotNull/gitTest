package cn.jbit.dao;

import java.util.List;

import cn.jbit.domain.Category;
import cn.jbit.utils.Page;

/**
 * ��Ʒ����Dao
 * 
 * @author william
 * 
 */
public interface ICategoryDao {

	/**
	 * ��ҳ��ѯ���е���Ʒ����
	 * 
	 * @return
	 */
	public Page<Category> getByPagging(Integer page, Integer pageSize);

	/**
	 * �����Ʒ����
	 */
	public void save(Category category);

	/**
	 * ��ѯ������Ʒ����
	 */
	public List<Category> getAll();
}
