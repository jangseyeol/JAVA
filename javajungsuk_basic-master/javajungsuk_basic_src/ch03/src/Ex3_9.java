class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1�鸸 
		int b = 2_000_000;    // 2,000,000   2�鸸 
		//범위를 벗어났다.
		long c = a * b;       // a * b = 2,000,000,000,000 ?

		//다음과 같이 한쪽을 형변환 해야한다.
		long c2 = (long)a * b;
		System.out.println(c);
		System.out.println(c2);
	}
}