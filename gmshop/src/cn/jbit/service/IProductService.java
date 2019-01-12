package cn.jbit.service;

import cn.jbit.dto.ProductDTO;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.Page;

/**
 * ��Ʒҵ���ӿ�
 * 
 * @author william
 * 
 */
public interface IProductService {

	/**
	 * �����Ʒ
	 * 
	 * @param product
	 */
	public void addProduct(ProductDTO productDTO);

	/**
	 * ǰ̨��ʾ��Ʒ�б����ϼ�ʱ������
	 */
	public Page<ProductDTO> showRecentProduct(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * ǰ̨��ʾ������Ʒ�б�
	 */
	public Page<ProductDTO> showProductByCategory(
			ProductQueryDTO productQueryDTO, Integer pageNum, Integer pageSize);

	/**
	 * ǰ̨��ʾ��Ʒ��ϸ,���Ҹ��������
	 */
	public ProductDTO showProductById(Long id);

}
