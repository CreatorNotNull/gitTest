package cn.jbit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.jbit.domain.Category;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class CategoryDaoImpl implements ICategoryDao {

	@Override
	public Page<Category> getByPagging(Integer page, Integer pageSize) {
		Session session = HibernateUtil.getSession();
		String countHql = "SELECT COUNT(id) FROM  Category";
		Query query = session.createQuery(countHql);
		Long totalRecords = (Long) query.uniqueResult();

		Integer firstResult = (page - 1) * pageSize;
		String hql = "From Category";
		Query query2 = session.createQuery(hql);
		query2.setFirstResult(firstResult);
		query2.setMaxResults(pageSize);
		List<Category> resultList = query.list();
		return new Page<Category>(page, pageSize, totalRecords, resultList);
	}

	@Override
	public void save(Category category) {
		Session session = HibernateUtil.getSession();
		session.save(category);
	}

	@Override
	public List<Category> getAll() {
		Session session = HibernateUtil.getSession();
		String hql = "SELECT c FROM Category c WHERE c.parent IS NULL";
		Query query = session.createQuery(hql);
		return query.list();
	}

}
