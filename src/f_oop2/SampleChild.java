package f_oop2;

public class SampleChild extends SampleParent {
	
	void childMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		int result = method(7, 13); //상속받은 메소드
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		SampleChild sc =  new SampleChild();
		
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
	}
	//메소드 호출할 때 자식 클래스의 있는 메소드만 호출
	//오버라이딩 : 상속받은 메소드 내용을 재정의 하는 것
	@Override //어노테이션
	int method(int a, int b){
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	
	}
	
	SampleChild() {
		super();
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		//부모 클래스 파라미터가 없는 생성자만 호출
		
	}
	
	 
	
}
