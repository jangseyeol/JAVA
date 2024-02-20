package Chap04;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
	
	// 키보드로 입력받은 점수가 90점 이상이면 A학점, 80점 이상 90점 미만이면 B학점,
	// 70점 이상 80점 미만이면 C학점, 60점 이상 70점 미만이면 D학점, 
	// 60점 미만이면 F학점을 출력하기 위해...
		
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력해주세요.");
	int num = sc.nextInt();
	
	if(num>=90) {
		System.out.println(num + "점으로 A학점입니다.");
	}
	else if(num>=80) {
		System.out.println(num + "점으로 B학점입니다.");
	}
	else if(num>=70) {
		System.out.println(num + "점으로 C학점입니다.");
	}
	else if(num>=60) {
		System.out.println(num + "점으로 D학점입니다.");
	}
	else {System.out.println(num +"점으로 F학점입니다.");
	}

		
	}

}
