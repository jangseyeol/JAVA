package ex02;

import java.util.Scanner;

public class 배수합갯수구하기 {

	public static void main(String[] args) {

// 숫자를 입력받아서 그 숫자까지의 3의 배수이면서 5의 배수인 값의 합을 구하고 , 갯수를 구하기
		
		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int input = sc.nextInt();
		
		for(int n=1 ; n <= input; n++) {
			if(n%3==0 && n%5==0) {
				sum += n;
				count++;
			}
		}
		System.out.println("3과 5의 배수의 합은 : " + sum);
		System.out.println("3과 5의 배수의 갯수는 : " + count);
	}

}
