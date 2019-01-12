package cn.jbit.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.jbit.domain.OrderDetail;
import cn.jbit.dto.OrderDetailQueryDTO;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class OrderDetailDaoImpl implements IOrderDetailDao {

	@Override
	public Page<OrderDetail> getByPagging(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize) {
		Session session = HibernateUtil.getSession();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT COUNT(id) FROM  OrderDetail od ");
		sb.append("WHERE (:orderId IS NULL OR od.order.id = :orderId)");
		Query query = session.createQuery(sb.toString());
		query.setLong("orderId", orderDetailQueryDTO.getOrderQueryDTO().getId());
		Long totalRecords = (Long) query.uniqueResult();

		StringBuilder sb2 = new StringBuilder();
		sb.append("SELECT COUNT(id) FROM  OrderDetail od ");
		sb.append("WHERE (:orderId IS NULL OR od.order.id = :orderId)");
		Query query2 = session.createQuery(sb2.toString());
		query2.setLong("orderId", orderDetailQueryDTO.getOrderQueryDTO()
				.getId());
		Integer firstResult = (pageNum - 1) * pageSize;
		query2.setFirstResult(firstResult);
		query2.setMaxResults(pageSize);
		List<OrderDetail> resultList = query2.list();
		return new Page<OrderDetail>(pageNum, pageSize, totalRecords,
				resultList);
	}

	@Override
	public OrderDetail getById(Long id) {
		Session session = HibernateUtil.getSession();
		return (OrderDetail) session.get(OrderDetail.class, id);
	}

}
