package cn.jbit.service;

import java.util.ArrayList;
import java.util.List;

import cn.jbit.dao.IOrderDetailDao;
import cn.jbit.dao.OrderDetailDaoImpl;
import cn.jbit.domain.OrderDetail;
import cn.jbit.dto.OrderDetailDTO;
import cn.jbit.dto.OrderDetailQueryDTO;
import cn.jbit.utils.DozerMapperUtil;
import cn.jbit.utils.Page;

public class OrderDetailServiceImpl implements IOrderDetailService {

	private IOrderDetailDao orderDetailDao = new OrderDetailDaoImpl();

	@Override
	public Page<OrderDetailDTO> showOrderDetailByOrder(
			OrderDetailQueryDTO orderDetailQueryDTO, Integer pageNum,
			Integer pageSize) {
		Page<OrderDetail> pageResult = this.orderDetailDao.getByPagging(
				orderDetailQueryDTO, pageNum, pageSize);
		List<OrderDetail> resultList = pageResult.getResultList();
		List<OrderDetailDTO> dtoList = new ArrayList<OrderDetailDTO>();
		for (int i = 0; i < resultList.size(); i++) {
			OrderDetailDTO dto = new OrderDetailDTO();
			DozerMapperUtil.getMapper().map(resultList.get(i), dto);
			dtoList.add(dto);
		}
		return new Page<OrderDetailDTO>(pageResult.getPageNum(),
				pageResult.getPageSize(), pageResult.getTotalRecords(), dtoList);
	}

	@Override
	public OrderDetailDTO showOrderDetailByDetail(Long id) {
		OrderDetail orderDetail = this.orderDetailDao.getById(id);
		OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
		DozerMapperUtil.getMapper().map(orderDetail, orderDetailDTO);
		return orderDetailDTO;
	}
}
