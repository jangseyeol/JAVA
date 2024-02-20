package ex01;

import java.util.Scanner;

public class 버스요금 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		if(age>=65) {fee = CHARGE * 0;}
		else if(age>=20) {fee = CHARGE * 1.0;}
		else if(age>=14) {fee = CHARGE * 0.75;}
		else if(age>=4) {fee = CHARGE * 0.5;}
		else {fee=CHARGE * 0;}
		
		System.out.println("당신요금은 : " + (int)fee + "원");
		
		
	}

}
