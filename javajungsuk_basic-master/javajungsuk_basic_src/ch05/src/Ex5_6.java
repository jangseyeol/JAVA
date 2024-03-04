import java.util.Arrays;

class Ex5_6 {
	public static void main(String[] args) {
		String str = "ABCDE"; //str.length() 는 5
			//        01234
		char ch = str.charAt(2);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1, str.length()); //1~4 
		String str4 = str.substring(1); //1~4
		System.out.println(str4);   
		
	} 
}