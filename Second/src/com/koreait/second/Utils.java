package com.koreait.second;

public class Utils { //자바 파일명이랑 같은이름것만 public붙일수 있음

	public static int parseStringToInt(String str, int num) {
		int result = num;
		try {
			result = Integer.parseInt(str);
			
		}catch(Exception e) {}
		return result;
		
	}
	
	public static int parseStringToInt(String str) {
		return parseStringToInt(str,0);
	}
	
	public static void sortASC(int[] arr) {
	
		for(int i =0; i<arr.length; i++) {
			for(int z = 0; z<i; z++) {
				if(arr[z]>arr[i]) {
					int temp = arr[i];
					arr[i]=arr[z];
					arr[z]= temp;
				}
			}
		}
	}
	
	public static void sortDESC(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int z = 0; z<i; z++) {
				if(arr[z]<arr[i]) {
					int temp = arr[i];
					arr[i]=arr[z];
					arr[z]= temp;
				}
			}
		}
	}
	public static void printArr(int[] arr) {
		if(arr == null) {
			System.out.println("arr is null");
			return;
		}
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print((i==0)? arr[i] : ", "+arr[i]);
			
		}
		System.out.println();
	}
	
	public static int[] createRandomArr(int min, int max, int len) {
		int[] rArr = new int[len]; 
		
		if(max-min+1<len) {
			
			return null;
		}
		
		
			
		for(int i=0; i<len; i++) {
			rArr[i]= (int)(Math.random()*(max-min+1)+min); 
			
			for(int z=0; z<i; z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
		return rArr;
		
	}
	
	
// 깃허브연동테스트
}
