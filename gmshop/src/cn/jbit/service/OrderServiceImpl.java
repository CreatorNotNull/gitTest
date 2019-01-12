package cn.jbit.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cn.jbit.dao.IOrderDao;
import cn.jbit.dao.OrderDaoImpl;
import cn.jbit.domain.Order;
import cn.jbit.dto.OrderDTO;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.DozerMapperUtil;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class OrderServiceImpl implements IOrderService {

	private IOrderDao orderDao = new OrderDaoImpl();

	@Override
	public void confirmOrder(OrderDTO orderDTO) {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			Order order = new Order();
			DozerMapperUtil.getMapper().map(orderDTO, order);
			this.orderDao.save(order);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Page<OrderDTO> showOrderByUser(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize) {
		Page<Order> pageResult = this.orderDao.getByPagging(orderQueryDTO,
				pageNum, pageSize);
		List<Order> resultList = pageResult.getResultList();
		List<OrderDTO> dtoList = new ArrayList<OrderDTO>();
		for (int i = 0; i < resultList.size(); i++) {
			OrderDTO dto = new OrderDTO();
			DozerMapperUtil.getMapper().map(resultList.get(i), dto);
			dtoList.add(dto);
		}
		return new Page<OrderDTO>(pageResult.getPageNum(),
				pageResult.getPageSize(), pageResult.getTotalRecords(), dtoList);
	}

}
