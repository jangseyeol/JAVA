package ex01;

/*
 * 메소드 : max
 * 매개변수 : 없음
 * 반환타입 : int
 * 기능 : 두 정수 중 최대값 반환
 */


public class 반환있고매개변수없음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("최대값 출력");
		
		int max = max();
		
		System.out.println("최대값 : " + max);
		
		
		
	}
	
	static int max() {
		
		int num1 = 5;
		int num2 = 20;
		
		if(num1>num2)
			return num1;
		else
			return num2;
	}
	
	

}
