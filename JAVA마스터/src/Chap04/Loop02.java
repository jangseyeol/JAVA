package Chap04;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
	
//키보드로 입력받은 숫자가 짝수인지, 홀수인지 판별하고 계속 진행할 것인지...
		Scanner sc = new Scanner(System.in);		
		int choice = 1;
		while(choice ==1) {
			int a;
			System.out.println("숫자를 입력하세요.");
			a = sc.nextInt();
			
			if(a % 2 ==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
			
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
			
			choice = sc.nextInt();
			
		}
		
		System.out.println("모든 숫자를 확인했습니다.");
		
		
		
		
	}

}
