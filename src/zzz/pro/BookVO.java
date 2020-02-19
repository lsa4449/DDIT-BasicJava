package zzz.pro;

public class BookVO {

	// 도서관리 번호
	private int num;
	// 도서 제목
	private String title;
	// 도서 저자
	private String author;
	// 도서 종류
	private String list;

	public BookVO() {
	
	}

	public BookVO(int num, String title, String author, String list) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.list = list;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	@Override
	public String toString() {
		
		return "BookLIST ==> [도서번호 = " + num + ", 제목 = " + title + ", 저자 = " + author + ", 분류 = " + list + "]";
		//return "  " + num + "  "  + title + "  " + author + "	" + list ;	
		
		}
	
	}
	
//음..무엇이있을까요? 
