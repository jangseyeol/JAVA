package Chap04;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
	
//10보다 큰 값을 입력받고, 큰 수부터 10까지의 합을 구하기

		Scanner sc = new Scanner(System.in);
		System.out.println("10보다 큰 값을 입력하세요");
		int x = sc.nextInt();
		
		int sum = 0;
		
		do {
			sum += x;
			x--;
		}
		while(x>=10);
		
		System.out.println("합계 : " + sum);
		
	}
}
