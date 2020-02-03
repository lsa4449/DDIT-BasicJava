package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("나는 금사빠다.(금방 사랑에 빠진다) >>");

		String s = sc.nextLine();
		if (s.equals("Y") || s.equals("y")) {
			System.out.println("연애할 때 끌려다니는 타입이다. >>");
			String s5 = sc.nextLine();
			if (s5.equals("Y") || s5.equals("y")) {
				System.out.println("감정표현에 솔직한 편이다. >>");
			} else {
				System.out.println("데이트 코스는 미리 짜는게 편하다. >>");
			}
		} else {
			System.out.println("감정기복이 크지 않다. >>");

			String s1 = sc.nextLine();
			if (s1.equals("Y") || s1.equals("y")) {
				System.out.println("연락이 없어도 믿고 기다리는 편이다. >>");
				String s6 = sc.nextLine();
				if (s6.equals("Y") || s6.equals("y")) {
					System.out.println("A");
				} else {
					System.out.println("이성친구는 존재할 수 없다. >>");
				}
			} else {
				System.out.println("감정표현에 솔직한 편이다.>>");

				String s2 = sc.nextLine();
				if (s2.equals("Y") || s2.equals("y")) {
					System.out.println("이성친구는 존재할 수 없다. >>");

					String s7 = sc.nextLine();
					if (s7.equals("Y") || s7.equals("y")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					} else {
						System.out.println("B");
					}
				} else {
					System.out.println("활동적인 데이트가 좋다.");

					String s3 = sc.nextLine();
					if (s3.equals("Y") || s3.equals("y")) {
						System.out.println("이성친구는 존재할 수 없다.");

						String s8 = sc.nextLine();
						if (s8.equals("Y") || s8.equals("y")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");

						} else {
							System.out.println("C");
						}

					} else {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");

						String s4 = sc.nextLine();
						if (s4.equals("Y") || s4.equals("y")) {
							System.out.println("D");

						} else {
							System.out.println("C");
						}

					}
				}
			}
		}

	}
}
