package e_oop;

public class OOP {

	public static void main(String[] args) {

			/*
			 * << OOP(object Oriented Programming) : 객체지향 프로그래밍
			 * - 프로그램을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는 것
			 * - 코드의 재사용성이 높고 유지보수가 용이하다.
			 * 
			 * <<객체 생성 (인스턴스화) >>
			 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려 놓은것
			 * - new 클래스명(); -> 객체가 저장된 메모리 주소 변환
			 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다
			 * - 객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다 
			 * 
			 */
		
		
		SampleClass  sc = new SampleClass();
		
		sc.method1();
		sc.method2(5);
		String returnString = sc.method3();
			System.out.println(returnString);
		int returnInt = sc.method4(7, 15);
			System.out.println(returnInt);
			
		sc.flowTest1(); //호출했을 때 출력 되는 문장에 번호를 붙여주세요
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메소드들을 호출해주세요.
		//파라미터가 있는 메소드는 타입에 맞는 값을 넘기고, 
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해주세요,		
		ClassMaker c = new ClassMaker();
		
		c.method1();
		
		int returnInt1 = c.method2();
			System.out.println(returnInt1);
		
		c.method3(4);			
		
			System.out.println(c.method4(2, 4));
		
	
		Calculator ca = new Calculator();
		
		long plus = ca.plus(123456, 654321);
		long multiple = ca.multiple(plus, 123456);
		long division = ca.division(multiple, 123456);
		long minus = ca.minus(division, 654321);
		long remain = ca.remain(minus, 123456);
			
		System.out.println("plus : " + plus);
		System.out.println("minus : " +minus);
		System.out.println("multiple : " +multiple);
		System.out.println("division : " +division);
		System.out.println("remain : " +remain);
		
		}	
			
	}
