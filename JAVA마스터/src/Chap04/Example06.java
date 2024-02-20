package Chap04;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// switch 문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력해주세요 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "A":
			System.out.print("매우 우수");
		break;
		case "B":
			System.out.print("우수");
		break;
		case "C":
			System.out.print("좋음");
		break;
		case "D":
			System.out.print("좀 더 열심히");
		break;
		case "F":
			System.out.print("미흡");
		break;
		default:
			System.out.print("잘못된 등급");
		}
	
	}
}
