class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0)
				continue; // 위의 조건이 만족하면 밑에 는 진행하지 않는다.
			System.out.println(i);
		}
	}
}