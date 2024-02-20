package ex02;

import java.util.Scanner;

public class 홀수합짝수합구하기 {

	public static void main(String[] args) {

//	내가한것
//		int sum = 0;
//	
//		for(int n1 = 1; n1 <= 100 ; n1++) 
//				{ sum += n1;
//			
//				}
//		System.out.println("합계 : " + sum);
		
//		답
		int even = 0; //짝수 합
		int odd = 0; // 홀수 합
		
		for(int i=1; i <= 100; i++) {
			
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
			
		}
		
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
	}

}
