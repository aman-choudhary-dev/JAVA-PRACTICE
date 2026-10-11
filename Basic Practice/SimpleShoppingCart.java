import java.util.*;
class SimpleShoppingCart{
	static String []products = {"Laptop" , "SmartPhone" , "HeadPhone" ,"Keyboard" ,"Mouse"};
	static int []prices = {50000 , 20000 , 5000 , 2000 , 1000};
	static String cartProduct [] = new String [5];
	static int productAmount [] = new int [5];
	static int priceOfCart[] = new int [5];
	static int totalProduct = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int btn = 0;
		while(btn != 5){
			System.out.println();
			System.out.println("=====================");
			System.out.println("    Shopping Cart    ");
			System.out.println("=====================");
			System.out.println("1. Show Products \n2. Add Products \n3. View Cart \n4. Checkout \n5. Exit ");
			System.out.println("=====================");
			System.out.println("Enter your choice");
			btn = sc.nextInt();
			if(btn == 1){
				showProduct();
			}
			else if(btn == 2){
				addToCart(sc);
			}
			else if(btn == 3){
				viewCart();
			}
			else if(btn == 4 ){
				checkout();
				break;
			}
		}
		System.out.println("Exiting The Cart   ");
		System.out.println("   Thank You      ");
	}
	static void showProduct(){
		for(int i = 0 ; i < products.length ; i++){
			System.out.println( (i+1) + " " + products[i] + "  " + prices[i]);
		}
	}
	static void addToCart(Scanner sc){
		System.out.println("Enter the Product no ");
		int prNo = sc.nextInt();
		cartProduct[totalProduct] = products[prNo-1];
		priceOfCart[totalProduct] = prices[prNo-1];
		
		System.out.println("Enter the amount you want ");
		int prAm = sc.nextInt();
		productAmount[totalProduct] = prAm;
		totalProduct++;
	}
	static void viewCart(){
		int n = 0;
		System.out.println("Product  PrAmount  Price");
		while(n <totalProduct){
			System.out.println(cartProduct[n] + "     " + productAmount[n] + "      " + priceOfCart[n]);
			n++;
		}
		
	}
	static void checkout(){
		System.out.println("CHECKING OUT");
		int n = 0;
		System.out.println("Product  PrAmount  Price");
		while(n < totalProduct){
			System.out.println(cartProduct[n] + "     " + productAmount[n] + "      " + (productAmount[n]*priceOfCart[n]));
			n++;
		}
		int subtotal = totalAmount();
		double total = subtotal;
		if(subtotal > 50000){
			total = subtotal -(.1*subtotal);
		}
		
		System.out.println("SubTotal = "+ subtotal);
		System.out.println("Total = "+ total);
		System.out.println("Your Order has been Placed");
	}
	static int totalAmount(){
		int total = 0;
		for(int i = 0 ; i < totalProduct ; i++){
			int prTotal = productAmount[i]*priceOfCart[i];
			total += prTotal;
		}
		return total;
	}
	
}