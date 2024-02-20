package ex06;

public class Example {

		public static void action(A a) {
			a.method1();
			
			if(a instanceof C) {
				System.out.println("---------");
				C c = new C();
				c.method2();
			}
			
		}
		public static void main(String[] args) {
			action(new D());
		}

