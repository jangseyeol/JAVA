package Chap04;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age<18) {
			System.out.println("당신은 투표를 할 수 없습니다.");
		}
		else {
			System.out.println("당신은 투표가 가능합니다.");
		}
		
	}

}
