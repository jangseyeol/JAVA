class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// 5번 반복
		// 1부터 10 사이의 난수를 20개 출력하시오.
		for (int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); // 0.0<=x <1.0
			System.out.println((int)(Math.random()*10)+1); // 0.0<=x <10.0
		}
	}
}