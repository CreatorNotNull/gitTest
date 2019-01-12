package cn.jbit.dao;

import cn.jbit.domain.Product;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.Page;

/**
 * ��ƷDAO�ӿ�
 * 
 * @author william
 * 
 */
public interface IProductDao {

	/**
	 * ������Ʒ
	 */
	public void save(Product product);

	/**
	 * ���ݲ�ѯ������ѯ��Ʒ
	 * 
	 * @return
	 */
	public Page<Product> getByPagging(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * ����ID��ѯ
	 */
	public Product getById(Long id);

	/**
	 * ���²�Ʒ
	 */
	public void update(Product product);
}
