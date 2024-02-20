package ex02;

import java.util.Scanner;

public class Forex02 {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);

		for(int n1 = 1; n1 <= 5 ; n1 ++) {
			int num = s.nextInt();
			sum += num;
		}
		System.out.println("합계 : " + sum);
	}

}
