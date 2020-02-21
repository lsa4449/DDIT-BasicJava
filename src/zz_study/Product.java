package zz_study;

public class Product {

	String name;
	int price;

	Product(String name, int price) {
		this.name = name;

		this.price = price;

	}

	void info() {
		System.out.println(name);
		System.out.println(price);
	}
}

class Desktop extends Product {

	Desktop() {
		super("lg", 1000);
	}
}

class TV extends Product {

	TV() {
		super("lg", 15555);
	}
}

class customer {

	int money = 99999;
	Product[] item = new Product[10];

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("못사");
			return;
		}

		money -= p.price;

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "구매");

	}

	void showItem() {

		for (int i = 0; i < item.length; i++) {
			if (item[i] != null) {
				System.out.println(i + 1 + item[i].name);
			}

		}
	}

	public static void main(String[] args) {

		customer c = new customer();
		Product p = new Desktop();
		
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		c.showItem();
	}
}
