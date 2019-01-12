package cn.jbit.service;

import cn.jbit.dto.OrderDTO;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.Page;

/**
 * 订单业务层接口
 * 
 * @author william
 * 
 */
public interface IOrderService {

	/**
	 * 下订单
	 * 
	 * @param orderDTO
	 */
	public void confirmOrder(OrderDTO orderDTO);

	/**
	 * 分页显示所属某用户的订单列表
	 * 
	 * @param orderQueryDTO
	 * @return
	 */
	public Page<OrderDTO> showOrderByUser(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize);
}
