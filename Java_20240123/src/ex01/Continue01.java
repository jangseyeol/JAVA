package ex01;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지의 홀수의 합
		int sum = 0 ;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1)
				sum += i;
			
		}
		System.out.println("홀수 합 : "+sum);

int sum3 =0;
for(int i=1; i<=10; i++){
	if(i%2 ==0)
		continue;
	
	sum3 += i;
}
		System.out.println("홀수 합 : " + sum3);
	}
}
