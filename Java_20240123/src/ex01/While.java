package ex01;

public class While {

	public static void main(String[] args) {
		int sum=0;
		int i =1;
		
		boolean flag = true;
		
		while(flag) {
			sum = sum +i;
			i++;
			
			if(sum>1000000)
				flag = false;
			
			System.out.println("While 누적합 : " + sum);
		}
	}

}
