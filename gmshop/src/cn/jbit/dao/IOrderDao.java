package cn.jbit.dao;

import cn.jbit.domain.Order;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.Page;

/**
 * 订单DAO接口
 * 
 * @author william
 * 
 */
public interface IOrderDao {

	/**
	 * 保存
	 */
	public void save(Order order);

	/**
	 * 分页查询
	 */
	public Page<Order> getByPagging(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize);
}
