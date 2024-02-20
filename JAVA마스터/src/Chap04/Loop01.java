package Chap04;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
	
// 키보드로 입력받은 5개의 숫자의 합을 구하기 위해 for 문을 사용
		int sum = 0;
		System.out.println("숫자를 5개 입력해 주세요 : ");
		
		for(int n=1; n<=5; n++) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sum += num; 		
		}
		
		System.out.println("합계 : " + sum);
	}

}
