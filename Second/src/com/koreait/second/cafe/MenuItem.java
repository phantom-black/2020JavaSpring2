package com.koreait.second.cafe;

public class MenuItem extends Object { // 클래스 = 멤버필드(속성) + 멤버메소드
	private String name; // 멤버필드는 값 저장용, 멤버필드는 항시 private(은닉화) : 생성자나 setter 통해서만 값 넣기 가능
	private int price;
	
	public MenuItem(String name, int price) { // 생성자(와 메소드 차이) 1. return타입 없음 2. class와 이름 같음
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %,d원", name, price);
	}
}
