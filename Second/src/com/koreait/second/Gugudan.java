package com.koreait.second;// 구구단 찍기, 값더하기, 오름차순 내림차순

public class Gugudan {

	public static void main(String[] args) {
	/*	//gugudan(2, 5);
		int sum = sum(1,2); //3
		sum = sum(1,2,3); //6
		sum = sum(1,2,3,4,5,6,7,8,9,10,11,12);
		int result = Utils.parseStringToInt("10", 0);//10정수값 리턴
		result = Utils.parseStringToInt("aa10", 1);//파싱할 수 없을 떄 두번째 인자값 리턴
		result = Utils.parseStringToInt("aa10");//0리턴
		result = Utils.parseStringToInt("9");//9리턴
		System.out.println(result);
		
		int [] arr = {4, 5, 11, 223, 3, 10};
		Utils.sortASC(arr);//오름차순정렬
		Utils.printArr(arr);//[3,4,5,10,11,223]
		Utils.sortDESC(arr);//내림순정렬
		Utils.printArr(arr);//[223,11,10,5,4,3] */
		
		int[] rArr = Utils.createRandomArr(1, 12, 7);//1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴
		Utils.printArr(rArr);
		
		//랜덤한 숫자가 나올수 있는 범위보다 큰칸을 요구하는 경우 null을 리턴
		rArr =  Utils.createRandomArr(5, 15, 13);
		Utils.printArr(rArr);//null이 넘어오면 "arr is null을 출력"
		rArr =  Utils.createRandomArr(5, 15, 11);
		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5); //결과값 문자열로 넘기기
		System.out.println(star);
		
	}
		
	/*public static void gugudan(int a, int b) { // 1번  구구단 찍기
		
		for(int i = a; i<=b; i++) {
			for(int z =1; z<10; z++) {
				int result = i * z;
				if(result % 2 == 1) {
					continue;
				}
				System.out.printf("%d * %d = %d\n", i, z, result);	
			}
			System.out.println();
		}
		
		
	}*/
	
	public static int sum(int...num) {      // 2번 숫자 더하기
		int result = 0;
		for(int i=0; i<num.length; i++) {
			result += num[i];
		}
		return result; 
	}
	
	
	public static String makeStarTriangle(int num) {
		if(num<0) {
			System.out.println("다시 입력하세요");
		}
		String star="";
		for(int i=1; i<=num; i++) {
			for(int z=1; z<=i; z++) {
				star += "*";
			}
			star += "\n";
				
		}
		return star;
		
	}
	
}

