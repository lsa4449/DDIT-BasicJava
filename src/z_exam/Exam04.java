/*package z_exam;


public class Exam04 {
	public static void main(String[] args) 

		[4-1] 다음의 문장들을 조건식으로 표현하라. 

		형 변수 가 보다 크고 보다 작을 때 인 조건식 
		1. int x 10 20 true 형 변수 가 공백이나 탭이 아닐 때 인 조건식 
			-> if(x > 10 && x < 20)
		
		2. char ch true 형 변수 가 또는 일 때 인 조건식 
			-> if(ch!= '' && ch!='\t')
		
		3. char ch ‘x' ’X' true 형 변수 가 숫자
			-> if(ch=='x' && ch =='X')
		
		4. char ch (‘0’~‘9’)일 때 인 조건식 true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식 
			-> if(ch >='0' && ch <='9')

		5. char ch ( ) true 형 변수 가 으로 나눠떨어지거나 또는 로 나눠떨어지고 으로 나눠떨어지지 않을 때 true인 조건식
			-> if(ch=>'a' && ch=<'z' || ch >='A= && ch <='Z')

		6. int year 400 4 100 않을 때 인 조건식 true 형 변수 가 일 때 인 조건식
			-> if(year%400==0 || (year%4==0 && year%100!=0))

		7. boolean powerOn false true 문자열 참조변수 이 일 때 인 조건식 
			->if(!powerOn)
		
		8. 문자열 참조변수 str이 "yes"일때 true인 조건식
			->if(str.equals("yes"))

 


		[4-2] 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오

				int sum = 0;
				for(int i = 1; i <=20; i++){

					sum += i

					if(i%2!=0 && i%3!=0){
					System.out.println(sum);

		[4-3] 의 결과를 계산하시오 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 
			
			  int sum = 0;
			  
			  for(int i = 1; i<=10; i++){
	
			  	int a = (1+i)*i/2;
			  	sum += a;
			  }
	
			  System.out.println(sum);

		  }
 
		[4-4] 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지 구하시오

				int sum = 0;
				int num = 0;
		
				while(true) {
					num++;
					if(num%2==0) 
						sum -= num;		
					else 
						sum += num;
					if(sum >=100)
						break;
				}
		
					System.out.println(num);

	/*	
		[4-5] 다음의 문을 문으로 변경하시오 for while .

		연습문제 [ ]/ch4/Exercise4_5.java public class Exercise4_5 

		{ public static void main(String[] args)  { 
			for(int i=0; i<=10; i++) { 

				for(int j=0; j<=i; j++)
					System.out.print("*"); 
				System.out.println(); } 
				} // end of main } 
				// end of class


			int i = 0;
			int j = 0;
				
				while (i<=10) {				
				
				j = 0;
				
				while (j <= i) {
					System.out.print("*");

					j++;
				}
					i++;
					System.out.print();
					

				}


		[4-6] 두 개의 주사위를 던졌을 때 눈의 합이 이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.


				for(int i = 1; i <= 6; i++) {
					for(int j = 1; j <= 6; j++) {
						if(i + j ==6){

 							System.out.println(i + j);
						}
					
					}


				}

		/*[4-7] 을 이용해서 부터 사이의 임의의 정수를 변수 에 저장하는 Math.random() 1 6 value 코드를 완성하라 에 알맞은 코드를 넣으시오 . (1) .

	
		class Exercise4_7 { 
			public static void main(String[] args) { 
				int value = (  (1)  ); System.out.println("value:"+value); } }

				
				(int)(Math.random() * 6) + 1;
				
				//Math.random() : 0.0 ~ 1.0 미만 ->0.99999......
				

		[4-8] 방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의 범위는 2x+4y=10 . , x y 이다 0<=x<=10, 0<=y<=10 .

				[ ] x=1, y=2 
					x=3, y=1
					x=5, y=0
	
				for(int i = 0; i <=10; i++){
					for(int j = 0; j <=10; j++){
							if(2*i + 4*j ==10){
	
								System.out.println("(" + i + "," + j + ")");

				

 
	/*	[4-10]

		int 타입의 변수 num이 있을 때,  각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.

		만일 변수 num의 값이 12345라면 , ‘1+2+3+4+5’의 결과인 15를 출력하라. 

		(1) 에 알맞은 코드를 넣으시오

			public static void main(String[] args) { 

				int num = 12345; 
				int sum = 0;  
				
				알맞은 코드를 넣어 완성하시오 (1) .  

 					System.out.println("sum="+sum);
	
					
					while ( num > 0 ){
	
					sum += num % 10;
	
					num /= 10;

			}

		[4-11] 피보나치(Fibonnaci) 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
		예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.

		public class Exercise4_11 { 

			public static void main(String[] args) { 
	
			 // Fibonnaci 1, 1 수열의 시작의 첫 두 숫자를 로 한다. 
	
			int num1 = 1; 
	
			int num2 = 1; 
	
			int num3 = 0; //세번째 값
	
			System.out.print(num1+","+num2); 
	
			for (int i = 0 ; i < 8 ; i++ ) { 

			알맞은 코드를 넣어 완성하시오 (1) .
 
			num3 = num1 + num2;

			num1 = num2;

			num2 = num3;

				System.out.println("," + num3);
				
			//num1 	num2 	num3	
				   	num1	num2 	num3	
				
				

		} 
			
				[4-15]
				다음은 회문수를 구하는 프로그램이다 회문수 (palindrome)란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다 
				예를 들면 ‘12321’ ‘13531’이나 같은 수를 말한다.
				   에 알맞은 코드를 넣어서 프로그램을 완성하시오 . 
 				
 				 public static void main(String[] args) 
 				
 				int number = 12321; 
 				int tmp = number; 
 				
 				int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
 				 while(tmp !=0) {
 				 
 				 } if(number == result)
 				 System.out.println( number + " 는 회문수 입니다  ."); 
 				 else 
 				 System.out.println( number + " 는 회문수가 아닙니다 ."); } 
 				 // main }
			
				//1 + 2 = 3
				//10 + 2 = 12 
				result *= 10;
				result += tmp%10;
} 				tmp/=10;


		}


		}
 

	}

 
*/
 