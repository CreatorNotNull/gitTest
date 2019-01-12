package cn.jbit.service;

import cn.jbit.dto.OrderDTO;
import cn.jbit.dto.OrderQueryDTO;
import cn.jbit.utils.Page;

/**
 * ����ҵ���ӿ�
 * 
 * @author william
 * 
 */
public interface IOrderService {

	/**
	 * �¶���
	 * 
	 * @param orderDTO
	 */
	public void confirmOrder(OrderDTO orderDTO);

	/**
	 * ��ҳ��ʾ����ĳ�û��Ķ����б�
	 * 
	 * @param orderQueryDTO
	 * @return
	 */
	public Page<OrderDTO> showOrderByUser(OrderQueryDTO orderQueryDTO,
			Integer pageNum, Integer pageSize);
}
