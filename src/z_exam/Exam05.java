package z_exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		
	
	/*
	[5-1] 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 하시오. 
	
	a. int[] arr[]; //타입이나 변수 앞에 []를 쓸 수 있다.
	b. int[] arr = {1,2,3,};  //숫자를 배열 안에 넣어 배열을 생성할 수 있다.
	c. int[] arr = new int[5]; //길이를 주어 배열을 생성할 수 있다.
	d. int[] arr = new int[5]{1,2,3,4,5}; 
	e. int arr[5]; 
	f. int[] arr[] = new int[3][]; //2차원 배열을 생성하여 길이를 지정하고 생성할 수 있다.
	
	정답 : d , e
	
	d : int[] arr = new int[]{1,2,3,4,5}; -> []에 숫자를 넣으면 안됨
	e : int arr[] = new int[5]; ->배열을 선언할 때는 배열의 크기를 지정할 수 없다.
	
*/
	
	/*[5-2] 다음과 같은 배열이 있을 때  arr[3].length의 값은 얼마인가  ?
	
	//arr배열 생성
	int[][] arr = { 
	{ 5, 5, 5, 5, 5}, 
	{ 10, 10, 10}, 
	{ 20, 20, 20, 20}, 
	{ 30, 30}
	};

	//arr배열의 길이를 for문으로 돌려서 i번째(=3번째)를 나오게 해서 출력한다. 답:2
	for(int i = 0; i <arr.length; i++){
		System.out.println("arr[" + i + "] : " + arr[i].length);
			
		}

	 */ 
		
	/* [5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오 .


		//숫자가 지정된 배열을 생성한다
		int[] arr = {10, 20, 30, 40, 50};
		
		 //합계를 초기화한다
		int sum = 0;
		
		//for문으로 총 합계를 구한다
		for(int i = 0; i < arr.length; i++){
		sum += arr[i];
		
	}
		//출력
		System.out.println("sum = "+sum);
		
	 */
		
		/*
		 [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오   .

		 //arr의 2차원 배열 생성
		 int[][] arr = { 
		{ 5, 5, 5, 5, 5}, 
		{ 10, 10, 10}, 
		{ 20, 20, 20, 20}, 
		{ 30, 30}
		};
		 
		 //총합 초기화
		 int total = 0;
		 //평균 초기화
		 float average = 0;
		 //평균 구할 때 arr의 배열의 모든 값을 저장한 변수를 지정, 초기화
		 int temp =0;
		 
		 //총합과 평균을 구하기 위한 for문 생성
		 for(int i = 0; i < arr[i].length; i++){
			 for(int j = 0; j < arr[j].length; j++){
			 
			 //총합을 arr[i][j]에 저장한다
			 total += arr[i][j];		 
			 }
			 //모든 값을 더해 arr에 저장한다
			 temp += arr[i].length;
					 
			//평균은 총합을 구한 뒤에 계산 되어야하기 때문에 
			//for문 밖에서 계산하고 총합과 열의 모든값을 나누어 출력한다		 
			 average = total / (float)temp;
		 } 
		
		//출력
		 System.out.println("total="+total); 
		 System.out.println("average="+average); 
		 
		 */
		 
		 /*
		 [5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다 
		       (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오 . 

		 //ballArr 배열에 숫자를 지정한다
		 int[] ballArr = {1,2,3,4,5,6,7,8,9}; 
		 //ball43 배열의 길이를 지정한다
		 int[] ball3 = new int[3];
			
			//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다  . 
			  for(int i=0; i< ballArr.length;i++) { 
			  int j = (int)(Math.random() * ballArr.length); 
			  int tmp = 0;
			  
			  //숫자 3자리를 중복되지 않게 각각 저장해준다
			  tmp = ballArr[j];
			  ballArr[j] = ballArr[i];
			  ballArr[i] = tmp;
		 
		 	  //ball3의 값 출력
		 	  for(int i=0;i<ball3.length;i++) { 
		 	  	System.out.print(ball3[i]); 
		 
		 }
		 
		 
		  */
		 
		/*
		 [5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다 
		      	변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라
		      	 단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 

		 
				 //큰 금액의 동전을 우선적으로 거슬러 줘야한다 . 
				 // coinUnit의 배열 생성, 값을 넣어줌
				  int[] coinUnit = {500, 100, 50, 10}; 
				  //money 변수 생성, 값은 2680
				  int money = 2680; 
				 
				  System.out.println("money = "+money); 
				  
				  //coinUnit에 들어있는 값을 각각 money와 계산하여 값을 출력
				  for(int i=0;i<coinUnit.length;i++) {

					//계산 된 money 값의 나머지를 구하여 다시 money에 저장한 다음,
					//for문에 의해 다시 계산한다
					money = money % coinUnit[i];
		 			System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);

				  }		 
		 */
		
		/*
		 
		 [5-7]5-6 문제 에 동전의 개수를 추가한 프로그램이다  .커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다 
		 보유한 동전의 개수로 거스름돈을 지불할 수 없으면  , 거스름 ‘ 돈이 부족합니다.’라고 출력하고 종료한다 
		 지불할 돈이 충분히 있으면 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다
		 
		 if(args.length!=1) { 
			 System.out.println("USAGE: java Exercise5_7 3120"); 
		 System.exit(0); 
		 }
		 
		 int money = Integer.parseInt(args[0]); 
		 	System.out.println("money="+money); 
		 
		 //동전의 단위 배열 출력 
		 int[] coinUnit = {500, 100, 50, 10}; 
		 //단위별 동전의 개수
		 int[] coin = {5, 5, 5, 5}; 
		 
		 //금액을 동전 단위로 나눠서 필요한 동전의 개수 구함
		 for(int i=0;i<coinUnit.length;i++) { 
			 int coinNum = 0;
			 coinNum = money / coinUnit[i];
			 
			 //배열 coin에서 coinNum만큼의 동전을 뺀다
			 if(coint[i] >= coinNum){
			 	coin[i] -= coinNum;
			 }else{
			 	coinNum = coin[i];
			 	coin[i] = 0;
			 }
			 //동전의 개수와 동전 단위가 곱한 값을 뺀다
			 money = coinNum * coinUnit[i];
			 
			 
		 }
		  System.out.println(coinUnit[i]+"원 : "+coinNum);
		  
		  //if문으로 맞는지 확인하고 출력
		} if(money > 0) {
		 System.out.println(" 거스름돈이 부족합니다."); 
		  System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("= 남은 동전의 개수 =");
		for(int i=0;i<coinUnit.length;i++) {  
			System.out.println(coinUnit[i]+"원 :"+coin[i]); 
		
		
		 */		
		/*
		 [5-8] 다음은 배열  answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다
		  
		  //배열 생성
		  int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; 
		  int[] counter = new int[4]; 
		
			//answer 배열에 저장된 크기는 4지만 index는 3이기 때문에 하나 빼줘야한다 
			for(int i=0; i < answer.length;i++) { 
				counter[answer[i]-1]++;  //3 2 2 4

 			} 
 				//counter[i]만큼 개수를 세어서 * 출력
				for(int i=0; i < counter.length;i++) { 
					System.out.print(counter[i]);
					for(int j = 0; j < counter[i]; j++){
						System.out.print("*");
			}
				System.out.println();
				
				}
			/*
			  [5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오 	
			 
			//star 배열 생성
			char[][] star = { 
			{'*','*',' ',' ',' '}, 
			{'*','*',' ',' ',' '}, 
			{'*','*','*','*','*'}, 
			{'*','*','*','*','*'} 
			 };
			 
			 //result 배열 생성, 90도를 돌려 5x4배열이 생성되어야 한다
			 char[][] result = new char[star[0].length][star.length];
			 
			
			 for(int i=0; i < star.length;i++) { 
			 	for(int j=0; j < star[i].length;j++) { 
			 		System.out.print(star[i][j]); } 
			 		System.out.println(); 
			 		} 
			 		
				//90도 회전 시 출력
				//j와 배열의 길이 -1이 동일
				for(int i=0; i < star.length;i++) { 
					for(int j=0; j < star[i].length;j++) { 
					int a = j;
					int b = star.length -1 -i;
					result[a][b] = star[a][b];
			
				}
					}
					
				for(int i=0; i < result.length;i++) { 
					for(int j=0; j < result[i].length;j++) { 
						System.out.print(result[i][j]); } 
						System.out.println(); 
						}
			 
			 */
		
		
		/*
		[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다. 
		에 알맞은 코드를 넣어서 완성하시오 
				
		//각각 소문자와 숫자에 대한 배열 생성
		 
		char[] abcCode = 
		{ '`','~','!','@','#','$','%','^','&','*', 
		'(',')','-','_','+','=','|','[',']','{', 
		'}',';',':',',','.','/'}; 

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'}; 
		
		//String 문자열 생성
 		String src = "abc123"; 
		String result = "";
		
		// 문자열 src 의 문자를 charAt()으로 하나씩 읽어서 변환 후 에 저장 
		  for(int i=0; i < src.length();i++) { 
		  	char ch = src.charAt(i); 
		  	
		  	if('a' <= ch && ch <= 'z') {
		  	//abcCode에는 소문자가 저장되어 있기 때문에 result에 소문자를 저장한다
		  	result += abcCode[ ch - 'a' ];
		  	}else {
		  	//numCode에는 숫자가 저장되어 있기 때문에 result에 숫자를 저장한다
		  	result +=numCode [ ch - '0' ];
		  	}
		  	
		  	
		  	}
			System.out.println("src:"+src); 
			System.out.println("result:"+result); 
			*/

		/*
		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. 
				(1) 에 알맞은 코드를 넣어서 완성하시오.
		  
		 int[][] score = { 
		{100, 100, 100}, 
		{20, 20, 20}, 
		{30, 30, 30}, 
		{40, 40, 40},
		{50, 50, 50}
		};
		
		 //가로와 세로로 1이 더 큰[i]와 [j]값 생성
		 int[][] result = new int[score.length+1][score[0].length+1]; 
		
		 //for문으로 i와 j 생성
		 for(int i=0; i < score.length;i++) 
		 { for(int j=0; j < score[i].length;j++) { 
			 
			 //score 값을 result에 저장
			 result[i][j] = score[i][j];
			 
			 //[i]:열, score[0].length : 행 ( 100 + 100+ 100 =300 )계산
			 result[i][score[0].length] += result[i][j];
			 
			 //100 + 20 + 30 + 40 + 50 계산
			 result[score.length][j] += result[i][j];
			 
			 //마지막 결과 값들만 계산
			 result[score.length][score[0].length] += result[i][j];
		 
		 	}
		 }
		 
		 for(int i=0; i < result.length;i++) { 
			 for(int j=0; j < result[i].length;j++) { 
				 System.out.printf("%4d",result[i][j]); 
				 } 
		 System.out.println(); 
		 }
		 
		 
		 */
		/*
		
		
		[5-12] 예제 5-23을 변경하여 아래와 같은 결과가 나오도록 하시오 
*/
		
		/*
		 
		//String 배열 생성
		String[][] words = {
					{"chair", "의자"},
					{"computer", "컴퓨터"},
					{"Integer", "정수"},
					};
					
		Scanner s = new Scanner(System.in);
		//총 문제 갯수와 맞힌 문제 갯수 생성, 초기화 
		int count = 0;
		int a = 0;
		
		//문제를 출력한다. %s는 문제를 출력해준다.
		for(int i = 0; i < words.length; i++){
			System.out.printf("Q%d.%s의 뜻은? ", i+1, words[i][0]);
			
			//사용자가 입력한 값을 저장
			String temp = s.nextLine();
				//총 문제의 갯수 저장
				a++;
				
				//사용자가 입력한 값과 words의 값이 같으면 정답, &n은 줄바꿈
				if(temp.equals(words[i][1])){
				System.out.printf("정답입니다.%n%n");
					//맞힌 문제 갯수 저장
					count++;
				}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
				}
				
		}
				System.out.printf("전체 " + a + "문제 중 " + count + "문제 맞추셨습니다.");
		
			*/
		
		/*
		[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와  같이 동작하도록 예제의 빈 곳을 채우시오.
		 
		 //word의 String 배열 생성
		  String[] words = { "television", "computer", "mouse", "phone" };
		  
		  Scanner scanner = new Scanner(System.in); 
		  	
		  	//원래의 단어
		  	for(int i=0;i<words.length;i++) {
				char[] question = words[i].toCharArray(); 
				char temp = '';
				
				//글자 랜덤으로 생성
				for(int j = 0; j < question.length; j++){
				int r = (int)(Math.random()* question.length);
				
				//글자위치를 섞어준다
				temp = question[0];
				question[0] = question[random];
				question[random] = temp;
				
				}
		  
		  System.out.printf("Q%d. %s 의 정답을 입력하세요 .>", i+1, new String(question)); 
		 
		  String answer = scanner.nextLine();
 			// trim()으로 의 좌우 공백을 제거한 후  equals로 word[i]와 비교
				   if(words[i].equals(answer.trim()))
				   		System.out.printf("맞았습니다 .%n%n"); 
				   	else 
				 		System.out.printf("틀렸습니다 .%n%n");
		  
		  }
		 */
		 
	}
	
}