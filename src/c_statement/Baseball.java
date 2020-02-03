package c_statement;


import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//숫자 야구 게임
		
		int strike =0;
		int ball = 0;
		int out = 0;
		
		int num1 = (int)(Math.random() * 9) + 1;
		int num2 = (int)(Math.random() * 9) + 1;
		int num3 = (int)(Math.random() * 9) + 1;	
		
		Scanner s = new Scanner(System.in);

		int n1 = 0;	//입력할 수
		int n2 = 0;
		int n3 = 0;
		
		
		while(num1 == num2 || num1 == num3 || num2 == num3){
			
		num1 = (int)(Math.random() * 9) + 1;	//컴퓨터로 랜덤하게 받을 수
		num2 = (int)(Math.random() * 9) + 1;
		num3 = (int)(Math.random() * 9) + 1;
		}
		
		//System.out.println(num1 + " " + num2+ " " + num3); 
		
		while (strike != 3){
		
		strike = 0;
		ball = 0;
		out = 0;
			
		
		System.out.println("0~9 사이의 숫자 3자리를 입력하세요. >> ");
		int nn = Integer.parseInt(s.nextLine());	//입력받는 수 출력
		
		n1 = nn / 100;			//100의 자리
		n2 = (nn % 100) / 10;	//10의 자리
		n3 = nn % 10;			//1의 자리
		
		//스트라이크
		if(n1 == num1){
			strike++;		
		
		}if(n2 == num2){
			strike++;
			
		}if(n3 == num3){
			strike++;
		
		//볼
		}if(n1 == num2 || n1 == num3){
			ball++;
		
		}if(n2 == num1 || n2 == num3){
			ball++;
			
		}if(n3 == num1 || n2 == num2){
			ball++;
	
		}
		
		//아웃
		if(n1 != num1 && n1 != num2 && n1 != num3){
			out++;
		
		}if(n2 != num1 && n2 != num2 && n2 != num3){
			out++;
			
		}if(n3 != num1 && n3 != num2 && n3 != num3){
			out++;
		}
				
		System.out.println(strike +"S, " + ball + "B, " +  out + "O" );
		
			}
		
			if(strike == 3){
				System.out.println("드디어 끝..");		
			}
		}

}
