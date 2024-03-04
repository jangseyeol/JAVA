class Ex4_8 {
	public static void main(String args[]) {
		int i; // 범위 : 선언된 위치부터 선언된 블럭의 끝까지
		
		//조건식을 생략하면, true로 간주되어 무한 반복
		for (;true;) { 
			System.out.println("i=" +i);
		}
//		System.out.println(i);
	}
}