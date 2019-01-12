package cn.jbit.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.hibernate.Session;

import cn.jbit.dto.CategoryDTO;
import cn.jbit.service.CategoryServiceImpl;
import cn.jbit.service.ICategoryService;
import cn.jbit.utils.HibernateUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品分类Action
 * 
 * @author william
 * 
 */
public class CategoryAction extends ActionSupport implements RequestAware {

	private CategoryDTO categoryDTO = new CategoryDTO();

	private Map<String, Object> request = null;

	private ICategoryService categoryService = new CategoryServiceImpl();

	/**
	 * 添加商品分类
	 * 
	 * @return
	 */
	public String addCategory() {
		Session session = HibernateUtil.getSession();
		try {
			this.categoryService.addCategory(categoryDTO);
			return Action.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return Action.ERROR;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	/**
	 * 获得所有的商品分类
	 * 
	 * @param categoryDTO
	 */
	public String showAllCategory() {
		Session session = HibernateUtil.getSession();
		try {
			List<CategoryDTO> resultList = this.categoryService
					.showAllCategory();
			this.request.put("categoryList", resultList);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			HibernateUtil.closeSession();
		}

	}

	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
