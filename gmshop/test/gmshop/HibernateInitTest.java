package gmshop;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import cn.jbit.domain.User;
import cn.jbit.utils.HibernateUtil;

public class HibernateInitTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		String hql = "SELECT u FROM User u";
		Query query = session.createQuery(hql);
//		List<User> resultList =  query.list();
//		for(int i = 0 ; i < resultList.size(); i ++){
//			System.out.println(resultList.get(i).getMyName());
//		}
//		System.out.println("--------------------------------");
//		List<User> resultList2 =  query.list();
//		for(int i = 0 ; i < resultList2.size(); i ++){
//			System.out.println(resultList2.get(i).getMyName());
//		}
		
		Iterator<User> iter1 = query.iterate();
		while(iter1.hasNext()){
			System.out.println(iter1.next().getMyName());
		}
		System.out.println("---------------");
		Iterator<User> iter2 = query.iterate();
		while(iter2.hasNext()){
			System.out.println(iter2.next().getMyName());
		}
		
////////////////////////////////////////////////
//		Criteria criteria = session.createCriteria(User.class);
//		List<User> list = criteria.list();
//		for(int i = 0 ; i < list.size() ; i ++){
//			System.out.println(list.get(i).getMyName());
//			Set<Order> orders = (list.get(i).getOrders());
//			//for(Order o : orders){
//				//System.out.println(o.getId());
//			//}
//		}
		////////////////////////////////////////////////
//		Criteria criteria =  session.createCriteria(Order.class);
//		List<Order> orderList = criteria.list();
//		for(int i = 0 ; i < orderList.size() ; i ++){
//			User user = orderList.get(i).getUser();
//			if(null != user){
//				System.out.println(user.getImage());
//			}
//		}
//		Calendar c = Calendar.getInstance();
//		c.set(2013, 10, 1);
//		
//		Calendar c2 = Calendar.getInstance();
//		c2.set(2013, 11, 31);
//		
//		Criteria criteria = session.createCriteria(User.class);
//		criteria.add(Restrictions.between("bornDay", new Date(c.getTimeInMillis()),new Date(c2.getTimeInMillis())));
//		System.out.println(criteria.list().size());
//		
//		Criteria c = session.createCriteria(User.class);
//		c.add(Restrictions.eq("id", 1L));
//		List list = c.createCriteria("orders").list();
//		System.out.println(list.size());
//		IProductDao productDao = new ProductDaoImpl();
//		Product p = new Product(null,"菜10自传",122F,5.0F,new Date(),22,50,null,null,"江门",300);
//		
//		productDao.save(p);
		session.getTransaction().commit();
		session.close();

		// // IUserService userService = new UserServiceImpl();
		//
		// // userService.getUserById(1L);
		// // IUserDao userDao = new UserDaoImpl();
		// Session session = HibernateUtil.getSession();
		// session.beginTransaction();
		// Query query =
		// session.createQuery("select u from User u left join  u.orders");
		// //Query query =
		// session.createQuery("select o from Order o  right join fetch o.user u");
		// //Query query =
		// session.createQuery("select u from User u right join  u.orders o");
		// List<User> list = query.list();
		// for(int i = 0 ; i < list.size() ; i ++){
		// User user = list.get(i);
		// System.out.println(user.getLoginName());
		// for(Order o : user.getOrders()){
		// System.out.println(o.getPhone());
		// }
		// System.out.println("**********");
		// }
		// session.getTransaction().commit();
		//
		// // userService.getAllUser();
	}
}
