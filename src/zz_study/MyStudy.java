package zz_study;

import java.util.Scanner;

public class MyStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = (int)(Math.random() * 100) + 1;	//1~100 사이이 랜덤 수 발생
		int input = 0;
		Scanner s = new Scanner(System.in);
		
			do{
				System.out.println("1~100 사이의 수를 입력 해주세요. >>");
				input = Integer.parseInt(s.nextLine());
			
			if(answer < input){
				System.out.println(input + "보다 작습니다.");
			
			}else if (input < answer){
				System.out.println(input + " 보다 큽니다.");
			
			}else{
				System.out.println("정답입니다!");
			
				}
			}while(input != answer);
				
			}
		
	}


