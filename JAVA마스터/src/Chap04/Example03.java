package Chap04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 num 의 값이 10,15,20 중 무엇에 해당하는지...
		Scanner sc = new Scanner(System.in);
		System.out.println("num의 값을 입력하세요.");
		
		int num = sc.nextInt();
		
		if(num == 10) {
			System.out.println("10을 입력하셨습니다.");
		}
		else if(num == 15) {
			System.out.println("15를 입력하셨습니다.");
		}
		else if(num == 20) {
			System.out.println("20을 입력하셨습니다.");
		}
		else {System.out.println("10,15,20 이외의 숫자를 입력하셨습니다.");
	}

}
}