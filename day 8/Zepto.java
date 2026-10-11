class Zepto{
	public static void main(String a[]){
		int totalCost  = Integer.parseInt(a[0]);
		boolean isPrimeUser = true;
		System.out.println((totalCost > 500) ? "Free Delivery" : "Delivery Charge will be applicable");
		System.out.println((isPrimeUser) ? "Same Day Delivery" : "It will take 7 days");
		System.out.println("Total cost to pay");
		System.out.println((totalCost > 2000) ? (totalCost + (.03*totalCost)) : totalCost);
	}
}