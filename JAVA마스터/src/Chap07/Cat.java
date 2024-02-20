package Chap07;

public class Cat { //클래스

	String breed; //변수
	String color; //변수
	
	Cat(){
		System.out.println("Cat() 생성자 호출합니다.");
	}
	
	Cat(String pBreed){
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed;
	}
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	
	void meow() {
		System.out.println("야옹 하고 울다");
	}
}
