package b_operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		/*
		 * << 산술 연산자 >>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / :나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 능하다.
		 */
		
		int a = 10 + 20 + -10 * 5 / 10 % 2;
		//*, /, % 연산자가 +, - 보다 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산 수행
		System.out.println(a);
		
		double d = 10+ 20.3;
		System.out.println(d);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산 수행
		//따라서 연산의 결과도 표현볌위가 큰 쪽의 타입이 됨
		
		byte b = 10;
		short c = 20;
		
		a = c - b;
		//4byte보다 작은 정수 타입은 4byte(int)로 형변환 후 연산 수행
		
		long e1 = 1000000 * 1000000;
		System.out.println(e1); //오버플로우 발생
		long e2 = 1000000 * 1000000L; //피연산자 중 하나는 long 이여야 결과 생성
		System.out.println(e2);
		
		double f1 = 10/ 4;
		System.out.println(f1);
		double f2 = 10 / 4.0;
		System.out.println(f2);
		int f3 = 10% 4; //10을 4로 나눈 나머지
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
		//int g1 = 10 / 0; //런타임 에러 발생
		float g2 = 10.0f / 0; //Infinity : 무한대
		System.out.println(g2);
		float g3 = 0/ 0f; //NaN : Not a Number
		System.out.println(g3);
		
		int h1 = 'A' + 1; //65 + 1 = 66 (String -> int 형변환)
		System.out.println(h1);
		
		int h2 = 'D' - 'A'; 
		System.out.println(h2);
		
		int h3= '5' - '0';
		System.out.println(h3);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		
		i = i + 1;
		i += 1;
		i += 2; //복합 연산자
		
		i = i - 1;
		i -= 1;
		
		i = i * 1;
		i *= 1;
		
		i = i / 1;
		i /= 1;
		
		i = i % 1;
		i %= 1;
		
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형  : 변수가 참조 된 후 수행
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		//반올림을 하기위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환 한다.
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		System.out.println(Math.round(round)); //소수점 첫째자리에서 반올림
		System.out.println((int)(round * 10 + 0.5) / 10.0); //소수점 둘째자리에서 반올림
		
		System.out.println("=======");
		//1. 123456 + 654321 
		//2. 1번의 결과값 * 123456	
		//3. 1번의 결과값 / 123456		
		//4. 3번의 결과값 - 654321		
		//5. 4번의 결과값 % 123456
		long result = 123456 + 654321;
		result *=123456;
		result /=123456;
		result -=654321;
		result %=123456;
			System.out.println(result);			
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//평균은 소수점 둘째자리에서 반올림
			
		int A = 15;
		int B = 28;
		int C = 33;
	
		int sum = A+B+C;
		double avg =(int)((sum/3.0) * 10 + 0.5)/10.0;
	
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		
	}

}
