package zz_study;

import java.util.Scanner;

public class MyStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anwser = (int)(Math.random() * 100) + 1;
		int guess = 0;
		
		Scanner s = new Scanner(System.in);
			System.out.println("숫자 입력 : ");
			int number = Integer.parseInt(s.nextLine());
					
			
			while(true){
			
			if (guess > anwser ){
				System.out.println("더 높은 점수 입니다. ");						
			}else if(anwser < guess){
				System.out.println("더 낮은 점수 입니다. ");
			
			}else{
		
				System.out.println("정답입니다.");
				break;
			}
				
			}
		
	}

}
