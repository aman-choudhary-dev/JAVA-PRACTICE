class Audi{
	double price = 100000000;
	Audi(){
		
	}
}
class CarPrice {
	public static void main(String a[]){
		Audi car1 = new Audi();
		double discount = .1;
		double finalPrice = discountedPrice(car1 , discount);
		System.out.println("Final Price is " + finalPrice);
	}
	static double discountedPrice(Audi car1 , double discount){
		return car1.price - (car1.price*discount);
	}
}