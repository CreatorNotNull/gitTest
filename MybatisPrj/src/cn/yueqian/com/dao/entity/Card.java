package cn.yueqian.com.dao.entity;

public class Card {
	private Integer id;
	private String num;
	private Person person;
	
	public Card(Integer id, String num, Person person) {
		super();
		this.id = id;
		this.num = num;
		this.person = person;
	}
	public Card() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", num=" + num + ", person=" + person + "]";
	}
	
}
