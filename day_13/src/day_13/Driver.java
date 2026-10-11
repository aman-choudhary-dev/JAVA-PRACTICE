package day_13;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Water bottle", 20, "1 ltr of H2O", 100);
		System.out.println("----->Product 1");
		p1.productInfo();
		Product p2 = new Product("Book", "Book about a journey of vigilante");
		System.out.println("----->Product 2");
		p2.productInfo();
		System.out.println("----->Product 3");
		Product p3 = new Product();
		p3.productInfo();
	}

}
