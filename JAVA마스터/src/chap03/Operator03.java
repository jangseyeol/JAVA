package Chap03;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 5, b = 10;
	
	System.out.println(a>b); //f
	System.out.println(!(a>b)); // t
	System.out.println((a==b)&&(a==5)); // f
	System.out.println((a!=b)&&(a==5)); // t
	System.out.println(!((a!=b)&&(a==5))); //f
	}

}
