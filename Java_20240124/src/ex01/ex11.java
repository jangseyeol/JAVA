package ex01;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제. 변수 money의 금액을
		// 각각 몇 개의 동전이 필요한지 계산 (가능한 한 적은 수의 동전으로 거슬러주어야함)
			//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
				int[] coinUnit = {500, 100, 50, 10} ;
				int money = 2680;
				System.out.println("money = " + money);
				for(int i=0; i<coinUnit.length; i++) {
					int count = 0;
					count = money/coinUnit[i];
					money %= coinUnit[i];
					System.out.println(coinUnit[i] + "원 : " + count);
				}
			
			
			
			}

		}

