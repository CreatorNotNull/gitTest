package cn.jbit.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import cn.jbit.dto.CategoryDTO;
import cn.jbit.dto.ProductDTO;
import cn.jbit.service.CategoryServiceImpl;
import cn.jbit.service.ICategoryService;
import cn.jbit.service.IProductService;
import cn.jbit.service.ProductServiceImpl;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ϵͳ��ʼ��Action
 * 
 * @author william
 * 
 */
public class InitAction extends ActionSupport implements SessionAware {

	private ICategoryService categoryService = new CategoryServiceImpl();
	private IProductService productService = new ProductServiceImpl();

	private Map<String, Object> sessionMap;

	/**
	 * ��ʾ���е���Ʒ���� *
	 * 
	 * @return
	 */
	public void showAllCategory() {

		try {
			List<CategoryDTO> resultList = this.categoryService
					.showAllCategory();
			sessionMap.put("initCategoryList", resultList);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * ��ʾ8���������ߵ���Ʒ
	 */
	public void showProductByViewNum(){
		try {
			Page<ProductDTO> pageResult = this.productService.showRecentProduct(null, "viewNum", "desc", 1, 9);
			sessionMap.put("initProductList", pageResult.getResultList());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * ��ʾ��������
	 */
	public void showNavigatorCategory(){
		try {
			List<CategoryDTO> resultList = this.categoryService.showAllCategory();
			sessionMap.put("initNavigatorList", resultList);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	@Override
	public String execute() throws Exception {
		Session session = HibernateUtil.getSession();
		try {
			showAllCategory();
			showProductByViewNum();
			showNavigatorCategory();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			HibernateUtil.closeSession();
		}

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;

	}
}
