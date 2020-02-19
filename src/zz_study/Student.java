package zz_study;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.eng = eng;
		this.math = math;
   
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;

	}

	String info() {
		return (name + no + ban + getAverage());
	}

	public static void main(String args[]) {

		Student s = new Student("홍길동 ", 1, 1, 100, 60);
		System.out.println(s.info());

	}
}
