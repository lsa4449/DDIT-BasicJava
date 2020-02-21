package f_oop2;

public class Store {

	public static void main(String[] args) {
		customer c = new customer();
		
		Product p = new Desktop(); //부모 자식간에는 형 변환이 되어  객체 생성이 가능하다 => Product p = (Product)new Desktop();
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		p = new Phone();
		p.info();
		c.buy(p);
		
		c.showItem();
		
	}

}

class Product {

	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void info() {

		System.out.println("===========================");
		System.out.println("상품명 : " + name);
		System.out.println("금   액 : " + price + "원");
		System.out.println("===========================");

	}
}

class Desktop extends Product {

	Desktop() {
		super("삼성 컴퓨터", 5000000); // 부모 클래스의 생성자 호출

	}

}

class TV extends Product {
	TV() {
		super("LG TV", 100000000);
	}

}

class Phone extends Product {
	Phone() {
		super("아이폰", 1200000);
	}
}

class customer {

	int money = 999999999;
	Product[] item = new Product[10]; // 장바구니, 부모클래스 타입으로 두면 형 변환을 하여 모든타입 가능

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("돈이 부족하다.");
			return;
		}

		money -= p.price;

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				item[i] = p;
				break;

			}
		}
		System.out.println(p.name + "을 구매했다.");
	}

	void showItem() {
		System.out.println("===========장바구니===========");

		for (int i = 0; i < item.length; i++) {
			if (item[i] != null) {
				System.out.println(i + 1 + ". " + item[i].name);
			}

		}
		System.out.println("=============================");
	}
}
