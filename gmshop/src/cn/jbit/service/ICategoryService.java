package cn.jbit.service;

import java.util.List;

import cn.jbit.dto.CategoryDTO;
import cn.jbit.utils.Page;

/**
 * Categoryҵ���ӿ�
 * 
 * @author william
 * 
 */
public interface ICategoryService {

	/**
	 * �����Ʒ���
	 */
	public void addCategory(CategoryDTO categoryDTO);

	/**
	 * ��ҳ�����Ʒ����б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<CategoryDTO> getAllCategory(Integer page, Integer pageSize);
	
	/**
	 * ��ʾ������Ʒ����
	 */
	public List<CategoryDTO> showAllCategory();

}
