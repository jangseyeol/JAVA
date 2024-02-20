package exam;

public class Exam01 {

	public static void main(String[] args) {
//
//		int exam = 4000;
//		int a1 = exam / 3600;
//		int a2 = exam / ;	
//				
//				
//				
//		System.out.print(a1);
//		System.out.print("시간");
//		System.out.print(a2);
		
	int exam = 4000;
	
	int hour = exam/3600;
	int minute = (exam % 3600)/60;
	int second = (exam % 3600)%60;
	
	System.out.println(hour + "시간 " + minute+"분 " + second + "초 ");
		
//		출력
//		1시간 6분 50초
		
		
	}

}
