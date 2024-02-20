package ch06.sec08.exam01;

public class CalculatroExample {
	public static void main(String[] args) {
		//Calculator 객체생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		
		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);
		
	}
}
