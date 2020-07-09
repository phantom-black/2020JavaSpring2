package com.koreait.second.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(Menu m) {
		m.showMenus();
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		while(mi == null) {
			try {
				System.out.print("메뉴 번호를 입력해 주세요 : ");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				mi = m.choose(intMenuNo - 1);
			} catch(NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요.");
			} catch(Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
		scan.close();
		return mi;
		/*
		while(true) {
			try {
				System.out.print("메뉴 번호를 입력해 주세요 : ");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				MenuItem mi = m.choose(intMenuNo - 1);
				scan.close();
				return mi;
			} catch(Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
		}
		*/
	}
}
