package ex02;

import java.util.Scanner;

public class 배수합갯수구하기2 {

	public static void main(String[] args) {

		int sum = 0;
//		int sum2 = 0;
		int count = 0;
		
		for(int i=1; i< 101; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				sum += i;  //15, 30, 45, 60, 75, 90
				count++;   //6개
			}
		}
		
		System.out.println("3과 5의 배수 합은 : " + sum);
		System.out.println("3과 5의 배수 갯수는 : " + count);
		
//			내가 한것
		
//		for(int n=1; n<=100 ; n++) {
//			if((n%3 == 0) && (n%5 ==0)) {
//				sum += n;
//			}
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("갯수 : " + );
	}

}
