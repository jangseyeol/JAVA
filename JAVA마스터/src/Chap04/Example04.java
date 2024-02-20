package Chap04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//키보드로 입력받은 세 숫자 가운데 첫 번째 숫자가 다른 숫자들보다 큰지 판별하기

		Scanner sc = new Scanner(System.in);

		int x, y, z, max;

		System.out.println("3개의 숫자를 입력해주세요.");

		System.out.print("첫번째 숫자 : ");
		x = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		y = sc.nextInt();

		System.out.print("세번째 숫자 : ");
		z = sc.nextInt();

		max = x;

		if(y>max) {if(y>z) {
			max = y;
		}else {max = z;}}
		else {if(max<z) {max=z;}}
	
		
System.out.println("최대값은 " + max);
	}
}
