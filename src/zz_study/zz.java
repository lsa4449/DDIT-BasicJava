package zz_study;

import java.util.Scanner;

public class zz {

	public static void main(String[] args) {

		String name[] = new String[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.println(i + 1 + "번째 이름을 입력하세요 >>");
			name[i] = s.nextLine();
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
