import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 12345, sum = 0;
	
		//10으로 나누면 나머지는 5 (마지막 자리를 얻는다.)
//		System.out.println(12345%10); 

		//num = 12345,1234,123,12,1
		while(num>0) {
			sum += num %10; // sum = sum+ (num%10)  // sum= 5, num%10 = 5 
			//sum = 5+4, num%10 = 4
			System.out.println("sum=" +sum + ",num%10=" +num%10); //마지막 자리 얻기 위해 %10 하면 됨
			num= num/10; //1234
		}
		
		
		
		System.out.println("각 자리수의 합" + sum);
	}
}