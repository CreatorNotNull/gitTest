package cn.jbit.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cn.jbit.dao.CategoryDaoImpl;
import cn.jbit.dao.ICategoryDao;
import cn.jbit.domain.Category;
import cn.jbit.dto.CategoryDTO;
import cn.jbit.utils.DozerMapperUtil;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class CategoryServiceImpl implements ICategoryService {

	private ICategoryDao categoryDao = new CategoryDaoImpl();

	@Override
	public Page<CategoryDTO> getAllCategory(Integer page, Integer pageSize) {
		List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();
		Page<Category> pageBean = this.categoryDao.getByPagging(page, pageSize);
		List<Category> resultList = pageBean.getResultList();
		for (int i = 0; i < resultList.size(); i++) {
			Category category = resultList.get(i);
			CategoryDTO dto = new CategoryDTO();
			DozerMapperUtil.getMapper().map(category, dto);
			dtoList.add(dto);
		}
		return new Page<CategoryDTO>(pageBean.getPageNum(),
				pageBean.getPageSize(), pageBean.getTotalRecords(), dtoList);
	}

	@Override
	public void addCategory(CategoryDTO categoryDTO) {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			Category category = new Category();
			DozerMapperUtil.getMapper().map(categoryDTO, category);
			this.categoryDao.save(category);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public List<CategoryDTO> showAllCategory() {
		try {
			List<Category> resultList = this.categoryDao.getAll();
			List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();
			for (int i = 0; i < resultList.size(); i++) {
				CategoryDTO dto = new CategoryDTO();
				DozerMapperUtil.getMapper().map(resultList.get(i), dto);
				dtoList.add(dto);
			}
			return dtoList;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

}
