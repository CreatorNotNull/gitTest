package cn.yueqian.com.test;

import java.util.List;
import java.util.Set;

import cn.yueqian.com.dao.entity.Category;
import cn.yueqian.com.dao.impl.CategoryDaoImpl;

public class TestYourself {
	public static void main(String[] args) {
		List<Category> category = new CategoryDaoImpl().getChildById(2);
		for (Category category2 : category) {
			Set<Category> childrens = category2.getChildrens();
			for (Category category3 : childrens) {
				System.out.println(category3.toString());
			}
			
		}
		
	}
}
