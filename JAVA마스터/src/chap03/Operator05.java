package Chap03;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 10, b = 10 , c = 10, d = 10;
	
	System.out.println("a++ => " +(a++)); // a = 10 이지만 a = 11 이 됨
	System.out.println("a => " +a); //  a = 11
	System.out.println("++b => " +(++b)); // b = 11이 됨
	System.out.println("c-- => " +(c--)); // c = 10  이지만 c= 9가 됨
	System.out.println("--d => " +(--d)); // d = 9
	}

}
