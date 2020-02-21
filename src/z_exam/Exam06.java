package z_exam;

public class Exam06 {

	public static void main(String[] args) {
		
		
		
	/*	[6-1] 다음과 같은 멤버변수를 갖는 클래스를 정의하시오 

	class StudentCard {
		
		//멤버변수 : 클래스 내에 선언된 변수
		int num;
		boolean isKwang;
	
	}
	
	
	
		[6-2]문제6-1에서 정의한 StudaCard클래스에 두 개의 생성자와 info()를 추가해서 
		실행 결과와 같은 결과를 얻도록 하시오
		
		class Exercise6_2 { 
		public static void main(String args[]) { 
		
		SutdaCard card1 = new SutdaCard(3, false); 
		SutdaCard card2 = new SutdaCard(); 
			System.out.println(card1.info()); 
			System.out.println(card2.info()); 
			
			} 
		} class SutdaCard { 
		
		int num;
		boolean isKwang;
		
		 //SutdaCard 객체 생성
		 SutdaCard() {
		 	this(1, true);
		 	
		 }
		 //num과 iskwang의 값을 저장한다
		 SutdaCard(int num, boolean isKwang) {
		 	this.num = num;
		 	this.isKwang = isKwang;
		 }
		 
		 //iskwang의 값이 true면 k를 출력하고 아니면 ""를 출력한다
		 String info() {
		 	return num + (isKwang ? "k" : "");
		 	
		 }
	
		}
		
		[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오  .

		class Student(){
		
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		}
		
		[6-4] 문제 6-3에서 정의한  Student클래스에 다음과 같이 정의된 
		두 개의 메서드  getTotal()과  getAverage()를 추가하시오  .

		public static void main(String args[]) { 
		Student s = new Student(); 
		홍길동 s.name = " "; 
		s.ban = 1; 
		s.no = 1; 
		s.kor = 100; 
		s.eng = 60; 
		s.math = 76;
 	
	 	System.out.println("이름 :"+s.name); 
	  	System.out.println("총점 :"+s.getTotal()); 
	  	System.out.println("평균  :"+s.getAverage());
			
			
		}
	}
	 class Student{
	 
	 	//gepTotal 생성을 위해 반환 변수는 int로 지정하고 값을 리턴한다
	 	int getTotal() {
	 		return kor + eng + math;
	 	}
	 	//getAverage 생성을 위해 반환 변수는 float으로 지정한다.(평균값이라 소수점이 나오기 때문에)
	 	float getAverage() {
	 		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;

	 		}
	 	
	 	}
		
		[6-5]다음과 같은 실행결과를 얻도록 Student클래스에 생성자와  info()를 추가하시오 .
			
	
		 Student s = new Student("홍길동 ",1,1,100,60,76); 
			System.out.println(s.info());
			
			//클래스안에 피라미터값을 넣어주고 값을 넣어준다
			student(String name, int ban, int no, int eng, int math){
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.eng = eng;
				this.math = math;
				
				}
				
				int getTotal() {
	 				return kor + eng + math;
	 				}
	 			float getAverage() {
	 				return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;

	 			}

				//넣어준 값을 리턴한다
				String info(){
					return(name + ban + ....+getAverage());
					}
				}
			}
			
	
		
		[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오  .
		
		 //두 점 (x,y)와 (x1,y1)간의 거리를 구한다   . 
		 //두점 구하는 법 : x끼리 빼서 곱하고 y끼리 빼서 곱한다음 루트를 씌운다.
		   static double getDistance(int x, int y, int x1, int y1) {
		  
		   //Math.sqrt -> 루트 기능
		    return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		    
		    
		} 
			public static void main(String args[]) { 
				System.out.println(getDistance(1,1,2,2)); 
		}
	}
		
		[6-7]문제 6-6에서 작성한 클래스 메서드 getDistance()를 MyPoint 클래스의
		인스턴스 메소드로 정의하시오.
		
		class MyPoint { 
		int x; //인스턴스 변수
		int y; //인스턴스 변수
		
		MyPoint(int x, int y) { 
		this.x = x; 
		this.y = y; 
		
		}
		
		double getDistance(int x1, int y1){
		 return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		
		}
		
		
		[6-8] 종류별로 변수 구분해서 적기
		
		- 클래스 변수 : width, height
		- 인스턴스 변수 : kind, num
		- 지역변수 : k, n, card
		
		
		[6-9]
		
		static을 붙여야하는 변수는?
		-> static int weapon = 6;
		-> static int armor = 6;
		
		이유 : 메소드 Marine에 항상 개별적인 값을 가져야 하기 때문에 static을 선언한다.
		
		[6-10] 생성자 옳지 않은것은?
		
		a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다. 
		b. 생성자는 객체를 생성하기 위한 것이다.
		c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다. 
		d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다. 
		e. 생성자는 오버로딩 할 수 없다. 
		
		-> b : 객체를 초기화할 목적으로 사용됨. 객체 생성은 new 연산자
		-> e : 오버로딩이 가능해서 하나의 클래스에 여러 생성자를 정의할 수 있다
		
		[6-11] this 옳지 않은것은?
		
		a. 객체 자신을 가리키는 참조변수이다. 
		b. 클래스 내에서라면 어디서든 사용할 수 있다. 
		c. 지역변수와 인스턴스변수를 구별할 때 사용한다. 
		d. 클래스 메서드 내에서는 사용할 수 없다. 
		
		-> b : 인스턴스메소드 에서만 사용 가능하다
		
		[6-12] 오버로딩 성립 조건 옳지 않은것은?
		
		a. 메서드의 이름이 같아야 한다. 
		b. 매개변수의 개수나 타입이 달라야 한다. 
		c. 리턴타입이 달라야 한다. 
		d. 매개변수의 이름이 달라야 한다. 
		
		-> c : 리턴타입은 같아야 한다
		-> d : 매개변수 이름이 같아야 한다.
		
		[6-13] 올바르게 오버로딩 한것은?
		
		long add(int a, int b) { return a+b;}

		a. long add(int x, int y) { return x+y;} 
		b. long add(long a, long b) { return a+b;} 
		c. int add(byte a, byte b) { return a+b;} 
		d. int add(long a, int b) { return (int)(a+b);}

		-> b, c, d
		
		[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은 ?
		
		a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. 
		b.지역변수는 반드시 초기화해야 한다. 
		c.초기화 블럭보다 생성자가 먼저 수행된다. → 초기화 블럭이 먼저 수행된다. 
		d.명시적 초기화를 제일 우선적으로 고려해야 한다. 
		e.클래스변수보다 인스턴스변수가 먼저 초기화된다.→ 클래스변수가 먼저 초기화됨 
		
		-> c, e
		
		[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은? 
		
		a. 기본값-명시적초기화-초기화블럭-생성자 
		b. 기본값-명시적초기화-생성자-초기화블럭 
		c. 기본값-초기화블럭-명시적초기화-생성자 
		d. 기본값-초기화블럭-생성자-명시적초기화 
		
		-> a
		//변수의 초기화 순서
		//1.클래스변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화된다.
		 	-> 기본값 - 명시적 초기화 - 클래스 초기화 블럭
		//2.인스턴스 변수의 초기화 시점 : 인스턴스가 생성될 때마다 각 인스턴스 별로 초기화된다
			-> 기본값 - 명시적 초기화 - 인스턴스 초기화 블럭 - 생성자
		
		[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은?
		a. 자동 초기화되므로 별도의 초기화가 필요없다. 
		b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다. 
		c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
		d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다. 
		e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. 
		
		-> a : 멤버변수의 설명
		-> e : 힙 영역에는 인스턴스가 생성되는 영역이다.
		//지역변수는 호출스택에 생성된다
		
		
		
		[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은 ?
		
		a. 제일 먼저 호출스택에 저장된 것은 main메서드이다. 
		b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다. 
		c. method2메서드를 호출한 것은 main메서드이다. 
		d. println메서드가 종료되면 method1메서드가 수행을 재개한다. 
		e. main-method2-method1-println의 순서로 호출되었다. 
		f. 현재 실행중인 메서드는 println 뿐이다. 
		//스택 : FILO 구조
		
		-> b : 제일 위에 있는 메소드는 현재 수행중인 메소드며 나머지는 대기상태
		
		
		[6-18] 컴파일에러 발생 라인과 이유 ?
		
		int iv = 10; 
		static int cv = 20; 
		
		int iv2 = cv; 
		static int cv2 = iv;      // 라인 A - 컴파일 에러 
		
		static void staticMethod1() { 
		System.out.println(cv); 
		System.out.println(iv); // 라인 B - 컴파일 에러 
		} 
		
		void instanceMethod1() { 
		System.out.println(cv); 
		System.out.println(iv);  // 라인 C   
		} 
		
		static void staticMethod2() { 
		staticMethod1(); 
		instanceMethod1(); // 라인 D - 컴파일 에러 
		} 
		
		void instanceMethod2() { 
		staticMethod1();     // 라인 E 
		instanceMethod1(); 
		
		//static은 메모리에 먼저 호출이 된다. 그래서 뒤 늦게 호출되는 인스턴스 변수와 메소드를 사용할 수 없다.
		
		-> A : static 변수의 초기화에 인스턴스 변수를 사용할 수 없다. 
				(사용해야 한다면 객체를 먼저 생성해야됨)
		-> B : static 메소드에서는 인스턴스 변수를 사용할 수 없다.
		-> D : static 메소드에서는 인스턴스 메소드를 사용할 수 없다.
				
		[6-19]실행결과 예측
		
		public static void change(String str) { 
		str += "456"; 
		
		} 
		
		public static void main(String[] args) { 
		
		String str = "ABC123"; 
		System.out.println(str); 
		change(str); 
		System.out.println("After change:"+str); 
		}
	
		//change메소드와 str의 참조변수 이름은 같지만 다른 변수이다. 
		실행결과 : ABC123
		
		
		
		
		
		[6-20]다음과 같이 정의된 메서드를 작성하고 테스트하시오.

		메서드명 : shuffle 
		기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다  . 
			    처리한 배열을 반환한다. 
		반환타입 : int[] 매개변수 정수값이 담긴 배열 
		
		
		static int[] shuffle(int[] original) {
			//매개변수로 들어오는 값이 맞는지 확인
			if(original.length == 0 || original == null){
				return original;
			}
		
			int[] result = new int[original.length];
			
			//배열 섞기
			for(int i = 0; i < original.length; i++){
				int num = (int)(Math.random()* origonal.length);
				
				int temp = original[num];
				original[i] = original[num];
				original[num] = temp;
			
			}
			//result 배열에 값을 넣어줌
			for(int i = 0; i < original.length' i++){
					return[i] = original[i];
			}
					return result;
		}
		
		
		
		public static void main(String[] args) { 
			int[] original = {1,2,3,4,5,6,7,8,9}; 
				System.out.println(java.util.Arrays.toString(original)); 
			int[] result = shuffle(original); 
				System.out.println(java.util.Arrays.toString(result)); }
			}


		[6-21] tv클래스 생성
		
		boolean isPowerOn; 
		int channel; 
		int volume; 
		
		final int MAX_VOLUME = 100; 
		final int MIN_VOLUME = 0; 
		final int MAX_CHANNEL = 100; 
		final int MIN_CHANNEL = 1; 
		
		void turnOnOff() { 
			//isPowerOn의 값이 true면 false로, false면 true로 바꾼다. 
			isPowerOn != isPowerOn
		}

		void volumUp() {
			//volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다. 
			if(volum < MAX_VOLUME){
				volum++;
		}

		void volumDown() {
			//volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다
			if(volum > MIN_VOLUME){
				volum--;
		}
		
		void channelUp() {
			//channel의 값을 1증가시킨다.         
			// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다. 
			if(channel==MAX_CHANNEL) { 
			channel = MIN_CHANNEL; 
			}else { 
				channel++; 
		}

		void channelDown() {
			//channel의 값을 1감소시킨다.         
			//만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
			if(channel==MIN_CHANNEL) { 
			channel = MAX_CHANNEL; 
			}else { 
				channel--; 
				}



		[6-22]메소드 작성하고 테스트
		
		public static boolean isNumber(String str) {
		
			//매개변수로 어떤 값이 넘어올지 모르기때문에 먼저 유효성 체크를 한다.
			 //문자열이 null이거나 빈 문자열이면 false를 반환한다
			if(str.equals("") || str==null){
				return false;
		}
		//문자열에서 한 문자씩 차례대로 읽어와 char타입의 변수 ch에 저장한다.
		for(int i = 0l i < str.length(); i++){
			char ch = str.charAt(i);
				//읽어온 문자가 숫자가 아니면 false를 반환한다
				if(!(ch >= '0' && ch <= '9')){
					return false;
				}
			}
					return true;
		}
		
		
		
		
		[6-23]메소드 작성하고 테스트
		
		
		public static int max(int[] arr){
			//배열이 null이거나 크기가 0인경우 -999999를 반환
			if(arr== null || arr.length = 0){
				return -999999;
			}
			
			//배열의 첫 번째 값으로 최대값을 초기화한다.
			int max = arr[0];
			//첫 번째 값을 초기화 했기 때문에 두번째값부터 비교한다
			for(int i = 1; i < arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
				//가장 큰 값 리턴
				return max;
			}
		}
		
		public static void main(String[] args) {
		 
		 int[] data = {3,2,9,4,7}; 
		 System.out.println(java.util.Arrays.toString(data)); 
		 System.out.println("최대값 :"+max(data)); 
		 System.out.println("최대값 :"+max(null)); 
		 System.out.println("최대값 :"+max(new int[]{}));
		 
		  }
}

		
		[6-24]메소드 작성하고 테스트
		
		
		public static int abc(int value){
			//value가 양수면 그대로 출력, 음수면 -붙여서 출력
			return value >= 0 ? value : -value;
		
		
		}
		
		public static void main(String[] args) { 
		int value = 5; 
			System.out.println(value+"의 절대값  :"+abs(value)); 
		value = -10;  
			System.out.println(value+"의 절대값 :"+abs(value));
		 */	
	}

}
