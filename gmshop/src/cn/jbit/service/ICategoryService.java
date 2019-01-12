package cn.jbit.service;

import java.util.List;

import cn.jbit.dto.CategoryDTO;
import cn.jbit.utils.Page;

/**
 * Category业务层接口
 * 
 * @author william
 * 
 */
public interface ICategoryService {

	/**
	 * 添加商品类别
	 */
	public void addCategory(CategoryDTO categoryDTO);

	/**
	 * 分页获得商品类别列表
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<CategoryDTO> getAllCategory(Integer page, Integer pageSize);
	
	/**
	 * 显示所有商品分类
	 */
	public List<CategoryDTO> showAllCategory();

}
