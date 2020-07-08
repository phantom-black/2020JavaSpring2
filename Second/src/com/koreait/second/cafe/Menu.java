package com.koreait.second.cafe;

import java.util.List;
import java.util.ArrayList;

public class Menu {
	private List<MenuItem> arr = new ArrayList();
	
	public Menu() {
		init();
	}
	
	private void init() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카페라떼", 2000));
		arr.add(new MenuItem("카푸치노", 2500));
		arr.add(new MenuItem("에스프레소", 1000));
	}
	
	public void menuSetter(MenuItem mi) {
		arr.add(mi);
	}
	
	public MenuItem menuGetter(int idx) {
		return arr.get(idx);
	}
	
	/*
	public void printMenu() {
		for(MenuItem menu : arr) {
			System.out.println(menu);
		}
	}
	*/
	
	public String showMenus() {
		System.out.println(" Menu ");
		for(int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s %,d원\n", i+1, m.getName(), m.getPrice());
		}
		return "";
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
}
