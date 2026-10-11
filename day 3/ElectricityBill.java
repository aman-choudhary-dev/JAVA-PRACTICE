class ElectricityBill{
	public static void main(String args[]){
		System.out.println("===================");
		System.out.println("  ElectricityBill  ");
		System.out.println("===================");
		System.out.println("Customer Name        : " + args[0] );
		int unitsConsumed = Integer.parseInt(args[1]);
		System.out.println("Total Units Consumed : " + unitsConsumed);
		System.out.println();
		System.out.println("-------------------");
		double fixedPerUnitCharge = 8.50;
		System.out.println("Fixed Charges        : " + fixedPerUnitCharge);
		double totalCharge = unitsConsumed * fixedPerUnitCharge;
		System.out.println("Total Charges        : " +totalCharge );
		System.out.println("-------------------");
		
	}
	
}
