package ex01;

/*
 * 메소드 : max
 * 매개변수 : int, int
 * 반환타입 : void
 * 기능 : 두 정수 중 최대값 반환
 */


public class 반환없고매개변수있음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("최대값 출력");
		
		max(5,10);
		
		System.out.println("프로그램 종료");
		
		
		
	}
	
	static void max(int n1, int n2) {
		
		
		int max = n1 > n2? n1 : n2;
		
		System.out.println("최대값 : " + max);
	}
	
	

}
