package zzz.pro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoginBook {

	Scanner s = new Scanner(System.in);
	
	//로그인 ID = 회원가입 ID
	//id1 = 회원가입, id2 = 로그인
	//로그인 PWD = 회원가입PWD
	String id1 = "", id2 = "";
	String pwd1 = "", pwd2 = "";
	
	int num = 0;
	Date today = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("a yyyy년 MM월 dd일 hh시 mm분 ss초");
	
	boolean play = true;
	
	LoginBook(){
		while (play) {
			System.out.println("=============================================");
			System.out.println("| 1. 로그인 | 2. 회원가입  | 3. 비밀번호 찾기  | 4. 종료   |");
			System.out.println("=============================================");
			num = s.nextInt();
			
			//로그인
			if (num == 1) {
				if (id1 == "" && pwd1 == "") {
					System.out.println("등록된 아이디가 없습니다!");
					System.out.println("회원가입을 해주세요!");
					continue; 
				}
				
				System.out.print("ID : ");
				id2 = s.next();
				System.out.print("PWD : ");
				pwd2 = s.next();
				
				if (id1.equals(id2) && pwd1.equals(pwd2)) {
					
					System.out.println("　 　   Λ___Λ\r\n" + 
							"　　 ( ´∀` )\r\n" + 
							"　|￣￣￣￣￣￣|\r\n" + 
							"　０로그인 성공0\r\n" + 
							"／|＿＿＿＿＿＿|＼\r\n" + 
							"");
					
					
					System.out.println("안녕하세요!\n관리자 <" + id1 + ">님이 " + sdf1.format(today) +"에 로그인 했습니다!");
					new RegBook();
				
				} else {
					System.out.println("다시 입력해주세요.");
				}
		
				
			//회원가입
			} else if (num == 2) {
				System.out.print("ID : ");
				id1 = s.next();
				System.out.print("PWD : ");
				pwd1 = s.next();
				System.out.println("회원가입 완료 하였습니다.");
			
				
				//비밀번호 찾기
				} else if (num == 3) {
				System.out.print("ID를 입력해주세요 >> ");
				id2 = s.next();
					
				 if(id1.equals(id2)){
					System.out.println(id1 + "님의 비밀번호는 " + pwd1 + "입니다!");
				 }
				 if (id1 == "" && pwd1 == "") {
					System.out.println("등록된 아이디가 없습니다!");
					System.out.println("회원가입을 해주세요!");
					continue; 
					
					}
				 
					
				//종료
				} else if (num == 4) {
					play = false;
					System.out.println("=======▶프로그램을 종료합니다◀=======");
			
			//종료
			} else {
				System.out.println("다시 입력해주세요.");
				}
			
			}
		}
	
	}