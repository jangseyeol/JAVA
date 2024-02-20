package Chap04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
	
	// 키보드로 입력받은 숫자가 짝수인지 홀수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else {
			System.out.println(num + "은 홀수입니다.");
		}
	
		
	}

}
