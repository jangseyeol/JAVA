package ex01;

public class 로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~45 숫자 중에서 랜덤하게 6개 추출...
		
		int[] arrNum = new int[6];
		boolean flag = false;
		
		for(int j=0; j<5; j++) {
		
		for(int i=0; i<arrNum.length; i++) {
			flag = false;
			int num = (int)(Math.random()*45)+1;
			
			for(int k=0; k<i; k++) {
				if(num == arrNum[k]) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				i--;
				continue;
			}
			
			
			arrNum[i] = num;
		}	
		
		for(int i=0; i<arrNum.length; i++)
			System.out.print( arrNum[i] + " ");
		
		System.out.println("\n-----------------");
	}
	}
	}

