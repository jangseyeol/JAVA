package Chap04;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//변수 num이 50보다 작은지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하십시오.");
		int num = sc.nextInt();
		
		if(num>=50) {
			System.out.println("50보다 크거나 같습니다.");
		}
		else {
			System.out.println("50보다 작습니다.");
		}
	}

}
