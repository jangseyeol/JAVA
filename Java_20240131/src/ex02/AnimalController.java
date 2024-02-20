package ex02;
/*
 * 동물원 시뮬레이션
main 메소드에서 각기 다른 종류의 동물들을 생성합니다.
생성된 각 동물에 대해 makeSound()를 호출하여 해당 동물의 소리를 출력합니다.
 */
 
public class AnimalController {
	public static void main(String[] args) {
	
//		다행성을 만족하지않음, makeSound가 반복됨
//		Bird b = new Bird();
//		b.makeSound();
//		Dog d = new Dog();
//		d.makeSound();
//		Cat c = new Cat();
//		c.makeSound();
		sound(new Bird());
		sound(new Cat());
		sound(new Dog());
	}
	
	 static void sound(Animal animal) {
		animal.makeSound();
	}
}
