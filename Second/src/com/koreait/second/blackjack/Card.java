package com.koreait.second.blackjack;

//값이 절대 안 바뀌었으면 좋겠다! - 패턴과 디노미네이션 채우는 생성자 만들어놓고 setter 안 만들면 됨
//getter 필수
// private 멤버필드 설정 시 getter 꼭꼭꼭 넣어야 함!! 
public class Card {
	public final static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final String pattern;
	private final String denomination;
	private final int point;
	/*
	public Card() { // 생성자 하나라도 있으면 기본생성자 호출 안되므로 수동으로 생성자 넣어줘야 함
		
	}
	*/
	public Card(String pattern, String denomination, int point) { //생성자 : 1.클래스명과 이름 같음 2.리턴타입 적으면 안됨
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	/*
	public void setPattern(String pattern ) { 
		this.pattern = pattern;
	}
	*/
	
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s, d: %s", pattern, denomination);
	}
}
