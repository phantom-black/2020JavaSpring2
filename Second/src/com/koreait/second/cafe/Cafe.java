package com.koreait.second.cafe;

public class Cafe {
	public static void main(String[] args) {
		/*
		MenuItem mi = new MenuItem("아메리카노", 1500);
		MenuItem mi2 = new MenuItem("카푸치노", 2000);
		System.out.println(mi.toString());
		System.out.println(mi2);
		*/
		/*
		Menu menu = new Menu();
		
//		menu.printMenu();
		
		menu.showMenus(); // 아래처럼 출력
		// Menu
		// 1. 아메리카노 1,500원
		// 2. 카푸치노 2,00원
		// ......
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
		// 아메리카노 1,500원 객체가 넘어와야 함
		 */
		/*
		Customer cus = new Customer();
		Menu menu = new Menu();
		
		MenuItem mi = cus.order(menu);
		System.out.println(mi);
		
		Coffee coffee = new Coffee(mi);
		*/
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
	}
}
