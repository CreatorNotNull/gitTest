package cn.jbit.dao;

import cn.jbit.domain.Product;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.Page;

/**
 * 商品DAO接口
 * 
 * @author william
 * 
 */
public interface IProductDao {

	/**
	 * 保存商品
	 */
	public void save(Product product);

	/**
	 * 根据查询条件查询商品
	 * 
	 * @return
	 */
	public Page<Product> getByPagging(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * 根据ID查询
	 */
	public Product getById(Long id);

	/**
	 * 更新产品
	 */
	public void update(Product product);
}
