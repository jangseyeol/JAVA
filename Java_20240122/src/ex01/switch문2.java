package ex01;

public class switch문2 {

	public static void main(String[] args) {
		char grade = 30;
		switch(grade / 10) {
		case 10 :
		case 9 : 
			System.out.println("A");
		break;
		case 8:
			System.out.println("B");
		break;
		case 7:
			System.out.println("C");
		break;
		case 6:
			System.out.println("D");
		break;
		default:
			System.out.println("F");
		}
	}

}
