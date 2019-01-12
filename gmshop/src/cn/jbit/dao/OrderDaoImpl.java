package cn.jbit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.jbit.domain.Order;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class OrderDaoImpl implements IOrderDao {

	@Override
	public void save(Order order) {
		Session session = HibernateUtil.getSession();
		session.save(order);
	}

	@Override
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize) {
		Session session = HibernateUtil.getSession();
		StringBuilder sb2 = new StringBuilder();
		sb2.append("SELECT COUNT(id) FROM Order o ");
		sb2.append("WHERE (:userId IS NULL OR o.user.id = :userId)");
		Query query2 = session.createQuery(sb2.toString());
		query2.setLong("userId", orderQueryDTO.getUserQueryDTO().getId());
		Long totalRecords = (Long) query2.uniqueResult();

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT o FROM Order o ");
		sb.append("WHERE (:userId IS NULL OR o.user.id = :userId)");
		Query query = session.createQuery(sb.toString());
		query.setLong("userId", orderQueryDTO.getUserQueryDTO().getId());
		Integer firstResult = (pageNum - 1) * pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List<Order> resultList = query.list();

		return new Page<Order>(pageNum, pageSize, totalRecords, resultList);
	}

}
