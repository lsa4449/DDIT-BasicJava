package z_exam;

public class Exam03 {
	
	
/*	
	[3-1]	
	public static void main(String[] args)
	{ int x = 2; int y = 5; 의 문자코드는 char c = 'A'; // 'A' = 65, 'a' = 97

	System.out.println(y >= 5 || x < 0 && x > 2); true
	System.out.println(y += 10 - x++); 13
	System.out.println(x+=2); 5
	System.out.println( !('A' <= c && c <='Z') ); false
	System.out.println('C'-c); 2
	System.out.println('5'-'0'); 5
	System.out.println(c+1); B
	System.out.println(++c); B
	System.out.println(c++); B
	System.out.println(c); C
	
	------------------------------------------
	[3-2]
	int numOfApples = 123;
	int sizeOfBucket = 10; 
    int numOfBucket = (  (1) ); 
    
	필요한 바구니의 수 System.out.println(" :"+numOfBucket);
	
	(1) = numOfApples/sizeOfBucket > 0 ? (numOfApples/sizeOfBucket)+1 : 0   

	numOfApples/sizeOfBucke = 123/10 = 12
	10개씩 이니까 +1개씩 올라간다.
	
	실행결과 13
	
	------------------------------------------
	[3-3]
	int num = 10; 
	System.out.println(  (1)  );
	
	(1) (num > 0 ? "양수" : (num < 0 ? "음수" : "0" ));
		
	실행결과 양수
	
	------------------------------------------
	[3-4]
	int num = 456; 
	System.out.println(  (1)  ); 
	
	(1) (num/100)*100
	
	실행결과 400
	
	------------------------------------------
	[3-5]
	System.out.println(  (1)  );
	
	(1) (num/10)*10+1 
	
	실행결과 331
	
	------------------------------------------
	[3-6]
	int num = 24; System.out.println(  (1)  );

	(1) 10-num%10
	
		가장 가까운 10의 배수
		
		num%10
		24->4
		19->9
		81->1
	
	실행결과 6
	
	------------------------------------------
	[3-7] (어려움)
	int fahrenheit = 100;
	float celcius = (  (1)  );
	System.out.println("Fahrenheit:"+fahrenheit); 
	System.out.println("Celcius:"+celcius);
	
	(1) (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f

	변환공식 'C=5/9 x (F - 32)
	반올림 ( * 100 + 0.5 ) -> (int) -> /100f
	
	-셋째 자리에서 반올림 하려면 해야 하는 과정-
	1. 값에 100을 곱한다.
	37.77778 * 100

	2. 1의 결과에 0.5를 더한다.	
	3777.778 + 0.5 → 3778.278

	3. 2의 결과를 int타입으로 변환한다.
	(int)3778,278 → 3778

	4. 3의 결과를 100f로 나눈다.(100으로 나누면 소수점 아래의 값을 잃는다.)
	3778 / 100f → 37.78
			
	실행결과 
	Fahrenheit:100 
	Celcius:37.78
	
	------------------------------------------
	[3-8]
	byte a = 10;
	byte b = 20;
	byte c = a + b; 
		-> byte c = (byte)a + b;
	
	char ch = 'A'; 
	ch = ch + 2; 
		-> ch = (char)ch + 2
	
	float f = 3 / 2; 
		-> float f = 3 / 2f
	
	long l = 3000 * 3000 * 3000; 
		-> long l = 3000 * 3000 * 3000L
	
	float f2 = 0.1f; 
	double d = 0.1; 
	boolean result = d == f2; 
		->(float)d == f2
	
	System.out.println("c="+c);
	System.out.println("ch="+ch); 
	System.out.println("f="+f); 
	System.out.println("l="+l); 
	System.out.println("result="+result);

	실행결과
	c=30 
	ch=C 
	f=1.5 
	l=27000000000 
	result=true

	------------------------------------------
	[3-9]
	char ch = 'z'; 
	boolean b = (  (1)  ); 
	System.out.println(b);
	
	
	(1)b==ch>='a' && ch<= 'z' || ch>='A' && ch<= 'Z' || ch>='0' && ch<= '9'
	
	실행결과 
	true
	
	------------------------------------------
	[3-10]
	char ch = 'A'; 
	char lowerCase = (  (1)  ) ? (  (2)  ) : ch; 
	System.out.println("ch:"+ch);
	System.out.println("ch to lowerCase:"+lowerCase);

	(1) ch>= 'A' && ch<= 'Z'
	(2) (char)(ch+32)
	
	'A' 코드 65
	'a' 코드 97
		=> 32차이

	대->소 (char)(ch-32) : 문자로 바꿔야함
	 
	실행 결과
	ch:A
	ch to lowerCase:a
	
	*/

	}
	

