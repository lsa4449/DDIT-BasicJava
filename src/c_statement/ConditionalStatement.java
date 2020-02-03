package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  << if문 >>
		 *  - if	  : 조건식의 결과가  true이면 블럭안의 문장을 수행한다.
		 *  - else if : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 *  - else 	  : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 *  
		 */
		
		int a = 10;
			if(a < 100) {
				System.out.println("조건식의 연산결과가 true이면 수행된다.");				
			}
			if(a < 10) {
				System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
			}

			int regNo = 1;	// 주민번호 뒷자리
			String gender = null; //성별
			
			if(regNo == 1) {
				gender = "남자";
			
			} else if (regNo == 2) { 	//if블럭 뒤에 else if로 조건 추가
				gender = "여자";
			
			} else if (regNo == 3) {
				gender = "남자";
			
			} else if (regNo == 4) {
				gender = "여자";
			
			} else {	//true인 조건식이 하나도 없을 때 수행된다.
				gender = "확인불가";

			}
	
			
				System.out.println("당신의 성별은 " + gender + " 입니다.");
		
				regNo = 1;
				gender = null;
				//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
				if(regNo == 1 || regNo == 3) //수행할 내용이 한 문장일 경우 블럭 생략 가능
					gender = "남자";
					
				else if (regNo == 2 || regNo == 4) 
					gender = "여자";
					
				else 
					gender = "확인불가";
					
					System.out.println("당신의 성별은 " + gender + " 입니다.");
			
				// 성적에 등급을 부여하는 프로그램 출력
				int score = 88;
				String grade = null;
				
				if(score >= 90) {
					grade = "A";
					
				}else if (score >= 80) {
					grade = "B";
				
				}else if (score >= 70) {
					grade = "C";	
				
				}else if (score >= 60) {
					grade = "D";
				
				}else {
					grade = "F";
				}

					System.out.println("당신의 성적은 " + grade + " 입니다.");
				
				score = 100;
				grade = null;
				
				if(score >= 90){
					grade = "A";
					if(score >= 97){
						grade += "+";					
					}else if(score <= 93){
						grade += "-"; 
					}
				}else if(score >= 80){
					grade = "B";		
					if(score >= 87){
						grade += "+";					
					}else if(score <= 83){
						grade += "-"; 
					}	
				}else if(score >= 70){
					grade = "C";		
					if(score >= 77){
						grade += "+";					
					}else if(score <= 73){
						grade += "-"; 	
					}	
				}else if(score >= 60){
					grade = "D";		
					if(score >= 67){
						grade += "+";				
					}else if(score <= 63){
						grade += "-"; 	
					}	
				}else{
					grade = "F";
				}
					System.out.println("당신의 성적은 " + grade + " 입니다.");
						 
			
					/*
					 *  << swich 문 >>
					 *  - 조건식과 일치하는 case문 이후의 문장을 수행한다.
					 *  - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
					 *  
					 */
					
				regNo = 2;
				gender = null;
				
				switch (regNo) {
				case 1 : case 3 :
					gender = "남자";
					break;	//break를 만나면 swich문을 빠져 나간다.
				case 2 : case 4:
					gender = "여자";
					break;
				default : //if문의 else와 같은 역할
					gender = "확인불가";
					
				}
					System.out.println("당신의 성별은 " + gender + " 입니다.");
					
				score = 95;
				grade = null;
				
				switch(score / 10) {
				case 10: case 9 : 
					grade = "A";
					break;
				case 8 : 
					grade = "B";
					break;
				case 7 : 
					grade = "C";
					break;
				case 6 : 
					grade = "D";
					break;
				default :
					grade = "F";	
				}
					
				System.out.println("당신의 성적은 " + grade + " 입니다.");
			
	
				//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력				
					Scanner s = new Scanner(System.in); 
						System.out.print("숫자를 입력해주세요 >> ");									
					int num = Integer.parseInt(s.nextLine()); 
					
						if(num == 0) 
							System.out.println("0 입니다 ");	
							
						else  
							System.out.println("0이 아닙니다 ");
	
						
				//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력				
					Scanner sc = new Scanner(System.in); 
						System.out.print("숫자를 입력해주세요 >> ");									
					int num1 = Integer.parseInt(sc.nextLine()); 
					
						if(num1 % 2 == 0) 
							System.out.println("짝수 입니다");	
							
						else
							System.out.println("홀수 입니다 ");
				
				
				//두개의 숫자를 입력받아 더 큰 숫자를 출력
					Scanner scn = new Scanner(System.in);
						System.out.println("두 개의 숫자를 입력해주세요 >> ");
					int n1 = Integer.parseInt(scn.nextLine());
					int n2 = Integer.parseInt(scn.nextLine());
					
					if(n1 > n2) 
						System.out.println("더 큰 숫자는 " + n1 + " 입니다.");	
						
					else
						System.out.println("더 큰 숫자는 " + n2 + " 입니다.");
			
	
				//세개의 숫자를 입력받아 가장 큰 숫자 출력

					Scanner ss = new Scanner(System.in);
						System.out.println("세 개의 숫자를 입력해주세요 >> ");
					int nu1 = Integer.parseInt(ss.nextLine());
					int nu2 = Integer.parseInt(ss.nextLine());
					int nu3 = Integer.parseInt(ss.nextLine());
					
					
					if(nu1 > nu2 && nu1 > nu3 ) {
						System.out.println("가장 큰 숫자는 " + nu1  + " 입니다.");	
						
					}else if (nu2 > nu1 && nu2 > nu3 ) {
						System.out.println("가장 큰 숫자는 " + nu2  + " 입니다.");	
					
					}else {
						System.out.println("가장 큰 숫자는 " + nu3  + " 입니다.");	
					}
	}
		}
