package ex02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {

		int num;
		
		System.out.print("숫자를 입력해주세요 : " );
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int result = method(num);
		if(result ==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
	static int method(int num) {
		return num%2 ; 
		
	}
}
