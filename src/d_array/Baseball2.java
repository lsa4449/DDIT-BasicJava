package d_array;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baseball2 {

	public static void main(String[] args) {

		/*//랜덤 값
		int num1[] = new int[3]; 
		//사용자 지정 값
		int num2[] = new int[3];
		
		int strike =0;
		int ball = 0;
		int out = 0;
		int cnt = 0;

		Scanner s = new Scanner(System.in);

		Random r = new Random(); 
		  while(num1[0] == 0) { 
			  num1[0] = r.nextInt(10); }
		 
		  while(num1[0] == num1[1] || num1[1] == 0) { 
			  num1[1] = r.nextInt(10); }
		  
		  while(num1[0] == num1[2] || num1[1] == num1[2] || num1[2] == 0) { 
			  num1[2] = r.nextInt(10); }

		  System.out.println("3자리 수를 입력하세요.");
		  //랜덤값
		  while(strike < 3){
			  
			  int num = s.nextInt();
			  num2[0] = num / 100;
			  num2[1] = (num % 100) / 10;
			  num2[2] = num % 100;
			  
			  if(num2[0] == num2[1] || num2[1] == num2[2] || num2[0] == num2[2]){
				  System.out.println("중복된 수는 사용할 수 없습니다.");
				 
			  }
			  
		for(int i = 0; i < num2.length; i++){
			System.out.print(i+1 + "번째 수 : ");
			num2[i] = s.nextInt();
		}
			
		
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(num1[i] == num2[j]){
						if(i == j){
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
				
				if (strike == 0 && ball == 0 ){
					System.out.print("아웃");
				
				}if(strike == 3){
					System.out.print("3스트라이크!");
					break;
					
				}else {
					System.out.println(strike + " S," + ball + " B");
							
				
			}
		
		  }	
		  */
		
		
		//----선생님 답안------
		
		int[] answer = new int[3];
		int[] input = new int[answer.length];
		
		//중복값 체크
		boolean isDuplicated;
		do {
			isDuplicated = false;
			
			for(int i = 0; i <answer.length; i++){
				answer[i] = (int)(Math.random()*9) + 1;
				
			}
			//하나라도 중복되는 값이 있으면 true를 통해 다시 한 번 돌아간다
			for(int i = 0; i <answer.length; i++){
				for(int j = 0; j <answer.length; j++){
					if(i != j && answer[i] == answer[j]){
						isDuplicated = true;
					}
				}
		
			}
		
		}while(isDuplicated);
		
		Scanner s = new Scanner(System.in);

		int count = 0;
		while(true) {
			System.out.println(answer.length + "자리 숫자를 입력해주세요 >>");
			int temp = Integer.parseInt(s.nextLine());
			
			//입력 받은 숫자를 계산
			int index = input.length -1;
			while(0 < temp){
				input[index--] = temp % 10;
				temp /= 10;
			}
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			for(int i = 0; i <answer.length; i++){
				for(int j = 0; j <input.length; j++){
					if(answer[i] == input[j]){
						if(i == j){
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			out = answer.length - strike - ball;
			
			System.out.println(++count + "차 시도"
				+ Arrays.toString(input).replace(", " ,"") +
				" : "  + strike + "S " + ball + "B " + out + "O");		
			
			if(strike == answer.length){
				System.out.println("정답입니다!");
			}
		}	
	}
}
