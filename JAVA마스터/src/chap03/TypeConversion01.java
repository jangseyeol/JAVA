package Chap03;

public class TypeConversion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double d = 3.14;
	long l = (long)d; // d는 double 이라 더 커서 들어가려면 (long)을 붙여야 한다.
	int i = (int)l; // l는 long 이라 더 커서 들어가려면 (int)를 붙여야 한다.
	
	System.out.println(d);
	System.out.println(l);
	System.out.println(i);
		
	}

}
