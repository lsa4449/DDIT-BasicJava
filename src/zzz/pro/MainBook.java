package zzz.pro;

public class MainBook {

	public static void main(String[] args) {

		int num = 0;

		System.out.println("      　　☆ *　. 　☆ \r\n" + "　　☆　. ∧＿∧　∩　* ☆ \r\n"
				+ "     안 ━━━( ･∀･)/ . ━━━ 녕!!\r\n" + "　　　. ⊂　　 ノ* ☆ \r\n"
				+ "　　☆ * (つ ノ .☆ \r\n" + "　　　　 (ノ");
		System.out.println("도서 등록 프로그램 입니다.");
		System.out.println("관리자 로그인을 하고 프로그램을 이용해주세요!");

		new LoginBook();

		if (num == 1 && num == 2 && num ==3) {
			new RegBook();
		}
		
	}
}
