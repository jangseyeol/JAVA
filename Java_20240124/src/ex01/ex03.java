package ex01;

public class ex03 {

	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch < 'Z')? ((char)(ch+32)): ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
