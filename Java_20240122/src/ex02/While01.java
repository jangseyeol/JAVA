package ex02;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		
		while(i<10) {  //i<= 10 이 되면, 숫자가 65가 나옴. 그래서 i<10
			++i;   //이렇게 ++i 가 먼저 나오면 i<10을 해줘야 함.
			sum = sum +i;
//			sum = sum +i; //이렇게 sum 이 먼저 나오면 1<=10을 해줘야 함
//			++i;
	}
	System.out.println("while 누적합 : " + sum);	
	}

}
