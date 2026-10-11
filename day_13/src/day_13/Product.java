package day_13;

public class Product {
	String productName;
	int price;
	String description;
	int quantity;

	public Product(String productName, int price, String description, int quantity) {
		// TODO Auto-generated constructor stub
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	public Product(String productName, String description) {
		// TODO Auto-generated constructor stub
		this.productName = productName;
		this.description = description;
	}

	public Product() {
		// TODO Auto-generated constructor stub
		System.err.println("This Product Doesn't Have Any Attributes");
	}

	void productInfo() {
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
		System.out.println("Description : " + description);
		System.out.println("Quantity Available : " + quantity);
	}
}
