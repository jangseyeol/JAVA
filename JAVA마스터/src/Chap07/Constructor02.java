package Chap07;

public class Constructor02 {
	public static void main(String[] args) {
		System.out.println("학생 주소록");
		Student stObj = new Student();
		
		stObj.insertRecord(20221004, "홍길순");
		stObj.printInfo();
		
		Student stObj2 = new Student(20221005, "홍길동");
		stObj2.printInfo();
}
}
