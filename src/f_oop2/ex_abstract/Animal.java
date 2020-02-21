package f_oop2.ex_abstract;

public abstract class Animal {

	void run() {
		System.out.println("달려간다~~~~");
	}

	abstract void bark();

}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("멍멍");
	}
}

// animal 클래스를 상속받는 동물 클래스 두개 더 만들어주세요.

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("야옹");
	}
}

class Pig extends Animal {

	@Override
	void bark() {
		System.out.println("꿀꿀");
	}
}