package ex01;

import java.util.Scanner;

public class 최소값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,min;
		
		System.out.println("정수입력 1 >> ");
		a = sc.nextInt();
		System.out.println("정수입력 2 >> ");
		b = sc.nextInt();
		System.out.println("정수입력 3 >> ");
		c = sc.nextInt();
		
		min = a;
		if(min>b) {if(b>c) {min=c;}
		else {min=b;}
		}
		else {if(min>c) {min=c;}
		
		}
		
		System.out.println("최소값 : " + min);
	}
}
