package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	
	private List<Card> arr;
	
	public Gamer() {
		arr = new ArrayList();
	}
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public void openCards() { // 내가 가진 카드를 print
//		int sum = 0;
//		for(int i=0; i<arr.size(); i++) {
//			sum += arr.get(i).getPoint();
//			System.out.println(arr.get(i));
//		}
//		System.out.printf("점수합계: %d\n", sum);
//		

		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수:  %d\n", getTotalPoint());
		
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}
}

