package cn.jbit.service;

import cn.jbit.dto.OrderDetailDTO;
import cn.jbit.dto.OrderDetailQueryDTO;
import cn.jbit.utils.Page;

/**
 * ������ϸҵ���ӿ�
 * 
 * @author william
 * 
 */
public interface IOrderDetailService {

	/**
	 * ���ݶ�������ҳ��ʾ������ϸ�б�
	 * 
	 * @return
	 */
	public Page<OrderDetailDTO> showOrderDetailByOrder(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize);

	/**
	 * ����ID��ʾ������ϸ
	 * 
	 * @param id
	 * @return
	 */
	public OrderDetailDTO showOrderDetailByDetail(Long id);
}
