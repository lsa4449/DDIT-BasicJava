package zzz.pro;

import java.util.Scanner;

public class RegBook {

	Scanner s = new Scanner(System.in);
	BookVO[] b = new BookVO[200];
	boolean play = true;

	// 도서 메인 메뉴 선택 번호
	int mainNo = 0;
	// 도서 관리 번호
	int num = 1;

	public RegBook() {
		run();
	}

	public void run() {
		while (play) {
			System.out.println("=======================================================");
			System.out.println("| 1.도서 목록 | 2. 도서 등록 | 3.도서 수정  | 4.도서 삭제  | 5. 로그아웃   |");
			System.out.println("=======================================================");
			mainNo = getMainNum("번호를 선택하세요 >>");

			if (mainNo == 1) {
				listBook();

			} else if (mainNo == 2) {
				registerBook();

			} else if (mainNo == 3) {
				updateBook();

			} else if (mainNo == 4) {
				deleteBook();

			} else if (mainNo == 5) {
				exit();

			} else {
				System.out.println("잘못 입력 했습니다!");
			}
		}
	}

	// 도서 전체 목록
		public void listBook() {
			System.out.println("1.도서 목록");
			for (BookVO book : b) {
				if (book != null) {
					indexBook(book);
				}
			}
		}
		
	// 도서 등록하기	
	public void registerBook() {
		System.out.println("2.도서 등록");
		String title = getData("등록할 도서의 제목을 입력하세요 >>");
		String author = getData("등록할 도서의 저자를 입력하세요 >>");

		System.out.println("===============================");
		System.out.println("| 자연과학 | 문학  | 예술  | 교육  | 기타  |");
		System.out.println("===============================");
		String list = getData("등록할 도서의 분류를 입력하세요 >>");

//		while (play) {
//			System.out.println("===============================");
//			System.out.println(" 1.자연과학 | 2.문학 | 3.예술 | 4.철학 ");
//			System.out.println("===============================");
//			listNo = getListNum("등록할 도서의 종류를 선택하세요 >>");
//
//			switch (listNo) {
//			case 1:
//				System.out.println("자연과학");
//				break;
//			case 2:
//				System.out.println("문학");
//				break;
//			case 3:
//				System.out.println("예술");
//				break;
//			case 4:
//				System.out.println("철학");
//				break;
//			default:
//				System.out.println("잘못 입력 했습니다!");
//
//			}
//			break;
//		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				num = i + 1;
				b[i] = new BookVO(num, title, author, list);
				System.out.println("등록 완료되었습니다.");

				break;

			}
		}
	}


	// 도서 수정하기
	public void updateBook() {
		System.out.println("3.도서 수정");

		// 도서 목록을 보여줌
		for (BookVO book : b) {
			if (book != null) {
				indexBook(book);
			}
		}

		int bookNum = getMainNum("수정할 도서 번호를 입력하세요 >>");

		BookVO book = findBook(bookNum);

		if (book == null) {
			System.out.println("입력하신 도서번호의 책이 없습니다!");
			return;
		}

		boolean Update = true;

		while (Update) {
			System.out.println("========================================");
			System.out.println(" 1.제목수정 | 2.저자수정 | 3.분류수정 | 4.수정완료");
			System.out.println("========================================");

			mainNo = getMainNum("번호 입력 >> ");

			switch (mainNo) {
			case 1:
				String title = getData("제목을 수정해주세요 >> ");
				book.setTitle(title);
				System.out.println("제목 수정완료!!");
				break;
			
			case 2:
				String author = getData("저자 이름을 수정해주세요 >> ");
				book.setAuthor(author);
				System.out.println("저자 이름 수정완료!!");
				break;
			
			case 3:
				System.out.println("===============================");
				System.out.println("| 자연과학 | 문학  | 예술  | 교육  | 기타  |");
				System.out.println("===============================");
				String list = getData("도서 분류를 수정해주세요 >> ");
				book.setList(list);
				System.out.println("도서 분류 수정완료");
				break;
			
			case 4:
				System.out.println("수정 종료!!");
				Update = false;
				break;
			}
		}
	}

	// 도서 삭제하기
	public void deleteBook() {
		System.out.println("4.도서 삭제");
		int bookNum = getMainNum("삭제할 도서 번호를 입력하세요 >>");

		BookVO book = findBook(bookNum);

		if (book == null) {
			System.out.println("입력한 번호의 책이 없습니다!");
			return;
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] != null && b[i].getNum() == bookNum) {
				b[i] = null;
				System.out.println("삭제 완료!!");
				return;
			}
		}

	}

	//도서 목록 보여주기
	public void indexBook(BookVO b) {
		System.out.println(b.toString());
		
	}

	// 도서관리번호로 책 정보 찾기
	public BookVO findBook(int num) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null && b[i].getNum() == num) {
				return b[i];
			}
		}
		return null;
	}

	// 프로그램 종료
	public void exit() {

		System.out.println("========================================");
		System.out.println("|     로그아웃 하였습니다 다시 로그인 해주세요!!      |");
		System.out.println("========================================");
		System.out.println("");
		play = false;
		
	}

	// 메세지 전달 받아 출력
	String getData(String message) {
		System.out.print(message);
		return s.next();
	}

	// 메인 번호 선택 받기
	int getMainNum(String message) {
		System.out.print(message);
		return s.nextInt();
	}

//	// 도서 분류 번호 선택
//	int getListNum(String message) {
//		System.out.println(message);
//		return s.nextInt();
//	}

}
