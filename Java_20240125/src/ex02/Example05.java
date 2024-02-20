package ex02;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "korea";
	String str2 = "";
	String str3 = str.substring(2);
	
	System.out.println(str.length()); //문자열 길이
	System.out.println(str.isEmpty()); // 비어있는지 아닌지 false, true
	System.out.println(str2.isEmpty());
	System.out.println(str.substring(2)); // 0,1,2 이렇게 순서인데 2부터 표시
	System.out.println(str3); 
	
	System.out.println(str.substring(1, 4)); // 1<=   <4 까지 표시
	
	String str4 = "math";
	String str5 = str.concat(str4);
	
	System.out.println(str.concat(str4)); // str과 str4를 붙여주기
	System.out.println(str5);
	
	
	}
	
	
}
