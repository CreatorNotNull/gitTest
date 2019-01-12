package cn.jbit.dao;

import cn.jbit.domain.Order;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.Page;

/**
 * ����DAO�ӿ�
 * 
 * @author william
 * 
 */
public interface IOrderDao {

	/**
	 * ����
	 */
	public void save(Order order);

	/**
	 * ��ҳ��ѯ
	 */
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize);
}
