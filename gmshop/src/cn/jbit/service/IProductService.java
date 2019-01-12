package cn.jbit.service;

import cn.jbit.dto.ProductDTO;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.Page;

/**
 * 产品业务层接口
 * 
 * @author william
 * 
 */
public interface IProductService {

	/**
	 * 添加商品
	 * 
	 * @param product
	 */
	public void addProduct(ProductDTO productDTO);

	/**
	 * 前台显示商品列表（按上架时间排序）
	 */
	public Page<ProductDTO> showRecentProduct(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize);

	/**
	 * 前台显示分类商品列表
	 */
	public Page<ProductDTO> showProductByCategory(
			ProductQueryDTO productQueryDTO, Integer pageNum, Integer pageSize);

	/**
	 * 前台显示商品明细,并且更新浏览量
	 */
	public ProductDTO showProductById(Long id);

}
