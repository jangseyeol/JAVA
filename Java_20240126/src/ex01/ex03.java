package ex01;

public class ex03 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;
		for(a = 1; a<=100; a++) {
			if(a%3==0) {
				sum += a;
			}
		}
		
		System.out.println("3의 배수의 총합은 :" + sum);

	}

}
