package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * + 	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {}	앞 문자의 개수 ({2 : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?!)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * 
		 */
		
		String str = "abcd123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
	
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식 만들기
		String id1 = "lsa4449";
		String id2 = "^[a-z0-9]*$";

		Pattern i = Pattern.compile(id2);
		Matcher ma = i.matcher(id1);
		System.out.println("id : " + ma.matches());
		
		String num1 = "010-1234-5678";
		String num2 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		Pattern n = Pattern.compile(num2);
		Matcher ma2 = n.matcher(num1);
		System.out.println("num : " + ma2.matches());
		
		String email1 = "lsa4449@naver.com";
		String email2 = "^[a-z0-9]{1,10}@[a-z]{1,10}\\.[a-z]{1,5}";
		
		Pattern e = Pattern.compile(email2);
		Matcher ma3 = e.matcher(email1);
		System.out.println("email : " + ma3.matches());
		
	}
}



