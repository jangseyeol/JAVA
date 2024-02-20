package ex02;

import java.util.Scanner;

public class Forex01 {

	public static void main(String[] args) {

	//10 이상인 수를 입력받아서 10~입력받은 수까지의 합을 구하기
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10보다 큰 값을 입력해주세요 : ");
		int input = sc.nextInt();
		
		if(input>=10) {for(int n1 = 10 ; input>=n1 ; n1++) {
			sum += n1;
		}}
		else {System.out.println("다시 입력해주세요.");
			
		}
		System.out.println(input + "까지의 합계는 :" + sum );
		
	}

}
