package ex01;

public class ex06 {
public static void main(String[] args) {

	String subject = "자바 프로그래밍";
	
	int location = subject.indexOf("프로그래밍");
	System.out.println(location); // 3 , 3번째부터 나오는 '프로그래밍'
	String substring = subject.substring(location); // location에서 끝까지 잘라내기 '프로그래밍'
	System.out.println(substring);
	
	location = subject.indexOf("자바");
	if(location != -1) {
		System.out.println("자바와 관련된 책이군요");
	} else {
		System.out.println("자바와 관련 없는 책이군요.");
	}
	
	boolean result = subject.contains("자바");
	if(result) {
		System.out.println("자바와 관련된 책이군요.");
	} else {
		System.out.println("자바와 관련 없는 책이군요");
	}
}

}
