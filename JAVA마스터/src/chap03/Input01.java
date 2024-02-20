package Chap03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수의 값을 입력하기");
		int a = sc.nextInt();
		
		System.out.println("실수의 값을 입력하기");
		double b = sc.nextDouble();
		
		System.out.println("정수값 : " + a);
		System.out.println("실수값 : " + b);
	}

}
