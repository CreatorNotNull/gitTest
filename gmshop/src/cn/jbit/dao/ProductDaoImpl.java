package cn.jbit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.jbit.domain.Product;
import cn.jbit.dto.CategoryQueryDTO;
import cn.jbit.dto.ProductQueryDTO;
import cn.jbit.utils.HibernateUtil;
import cn.jbit.utils.Page;

public class ProductDaoImpl implements IProductDao {

	@Override
	public void save(Product product) {
		Session session = HibernateUtil.getSession();
		session.save(product);
	}

	@Override
	public Page<Product> getByPagging(ProductQueryDTO productQueryDTO,
			String orderBy, String orderType, Integer pageNum, Integer pageSize) {
		Session session = HibernateUtil.getSession();
		StringBuilder sb = new StringBuilder();
		if(null == productQueryDTO){
			sb.append("SELECT p FROM Product p ");
		}else{
			sb.append("SELECT p FROM Product p WHERE ((:pid IS NULL) OR ( p.category.parent.id = :pid  ))");
			sb.append(" AND ((:cid IS NULL ) OR (p.category.id = :cid))");
		}
		if (null != orderBy && "" != orderBy) {
			sb.append(" ORDER BY " + orderBy);
		}
		if (null != orderType && "" != orderType) {
			sb.append(" " + orderType);
		}
		Query query = session.createQuery(sb.toString());
		if(null != productQueryDTO && null != productQueryDTO.getCategoryQueryDTO()){
			CategoryQueryDTO cqd = productQueryDTO.getCategoryQueryDTO();
			query.setParameter("pid", cqd.getParent() == null? null : cqd.getParent().getId());
			query.setParameter("cid", cqd.getId() == null? null : cqd.getId());
		}
		
		Integer firstResult = (pageNum - 1) * pageSize;
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List<Product> resultList = query.list();
		return new Page<Product>(pageNum, pageSize, Long.valueOf(resultList
				.size()), resultList);
	}

	@Override
	public Product getById(Long id) {
		Session session = HibernateUtil.getSession();
		return (Product) session.get(Product.class, id);
	}

	@Override
	public void update(Product product) {
		Session session = HibernateUtil.getSession();
		session.update(product);
	}

}
