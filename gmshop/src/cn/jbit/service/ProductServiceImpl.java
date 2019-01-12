package cn.jbit.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.MappingException;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import cn.jbit.dao.IProductDao;
import cn.jbit.dao.ProductDaoImpl;
import cn.jbit.domain.Product;
import cn.jbit.dto.ProductDTO;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.DozerMapperUtil;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class ProductServiceImpl implements IProductService {

	private IProductDao productDao = new ProductDaoImpl();

	@Override
	public void addProduct(ProductDTO productDTO) {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			Product product = new Product();
			DozerMapperUtil.getMapper().map(productDTO, product);
			this.productDao.save(product);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Page<ProductDTO> showRecentProduct(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize) {
		Page<Product> pageResult = this.productDao.getByPagging(
				productQueryDTO, orderBy, orderType, pageNum, pageSize);
		List<Product> resultList = pageResult.getResultList();
		List<ProductDTO> dtoList = new ArrayList<ProductDTO>();
		for (int i = 0; i < resultList.size(); i++) {
			ProductDTO productDTO = new ProductDTO();
			DozerMapperUtil.getMapper().map(resultList.get(i), productDTO);
			dtoList.add(productDTO);
		}
		return new Page<ProductDTO>(pageResult.getPageNum(),
				pageResult.getPageSize(), pageResult.getTotalRecords(), dtoList);
	}

	@Override
	public Page<ProductDTO> showProductByCategory(
			ProductQueryDTO productQueryDTO, Integer pageNum, Integer pageSize) {
		return this.showRecentProduct(productQueryDTO, null, null, pageNum,
				pageSize);
	}

	@Override
	public ProductDTO showProductById(Long id) {
		Product product = this.productDao.getById(id);
		product.setViewNum(product.getViewNum()+1);
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();
			this.productDao.update(product);
			session.getTransaction().commit();
			ProductDTO productDTO = new ProductDTO();
			DozerMapperUtil.getMapper().map(product, productDTO);
			return productDTO;
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		}
		
	}
}
