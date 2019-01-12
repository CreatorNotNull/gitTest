package cn.jbit.dao;

import cn.jbit.domain.OrderDetail;
import cn.jbit.dto.OrderDetailQueryDTO;
import cn.jbit.utils.Page;

/**
 * 订单明细DAO接口
 * 
 * @author william
 * 
 */
public interface IOrderDetailDao {

	public Page<OrderDetail> getByPagging(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize);

	public OrderDetail getById(Long id);
}
