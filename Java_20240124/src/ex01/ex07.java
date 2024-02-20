package ex01;

import java.util.Scanner;

public class ex07 {
// 숫자맞추기 게임을 작성한 것, 1-100 사시의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면
	// 게임이 종료되고 맞춘 값이 무엇인지, 몇 번째 만에 맞췄는지를 표시
	
	public static void main(String[] args) {
		
		//1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
	
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		//화면으로부터 사용자입력을 받기 위해서 Scanner클래스 사용
		
		Scanner s = new Scanner(System.in);
		
		do {count++;
			System.out.print("1과 100사이의 값을 입력하세요. : ");
			input = s.nextInt();
			if(input>answer)
				System.out.println("더 작은 수 입력");
			else if(input<answer)
				System.out.println("더 큰 수 입력");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
			
		} while(true);
		
//		} while(input != answer);
//		System.out.println(count + "회 " + input + "맞추었습니다.");
	}

}
