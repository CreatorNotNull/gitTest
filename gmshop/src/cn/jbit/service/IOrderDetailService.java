package cn.jbit.service;

import cn.jbit.dto.OrderDetailDTO;
import cn.jbit.dto.OrderDetailQueryDTO;
import cn.jbit.utils.Page;

/**
 * 订单明细业务层接口
 * 
 * @author william
 * 
 */
public interface IOrderDetailService {

	/**
	 * 根据订单，分页显示订单明细列表
	 * 
	 * @return
	 */
	public Page<OrderDetailDTO> showOrderDetailByOrder(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize);

	/**
	 * 根据ID显示订单明细
	 * 
	 * @param id
	 * @return
	 */
	public OrderDetailDTO showOrderDetailByDetail(Long id);
}
