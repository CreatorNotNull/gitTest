package cn.yueqian.com.test;

import cn.yueqian.com.dao.entity.Card;
import cn.yueqian.com.dao.entity.Person;
import cn.yueqian.com.dao.impl.CardDaoImpl;
import cn.yueqian.com.dao.impl.PersonDaoImpl;

public class TestOneToOne {

	public static void main(String[] args) {
		// 人对card
		/*Person person = new PersonDaoImpl().getById(1);
		Card card = person.getCard();
		System.out.println(card);*/
		
		//card对person
		Card card = new CardDaoImpl().getById(1);
		Person person = card.getPerson();
		System.out.println(person.toString());
	}

}
