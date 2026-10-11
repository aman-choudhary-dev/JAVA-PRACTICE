package com;
class Invoice extends Object{
	static int gst = 18;
	static String  deleiveryPartner = "Express Deleivery";
	int amount ;
	String itemName;
	String customerId;
	public Invoice(int amount , String itemName , String customerId) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.itemName = itemName;
		this.customerId = customerId;
	}
}
public class Driver {
	public static void main(String[] args) {
		Invoice inv1 = new Invoice(10000 , "HeadPhone" , "PS132");
		Invoice inv2 = new Invoice(70000 , "Laptop" , "PG5132");
		System.out.println(inv1.itemName + " Price : " + inv1.amount + " ID : "+ inv1.customerId);
		System.out.println("Common GST for all Obj : " +Invoice.gst);
		Notificationservice n1 = new Notificationservice();
		n1.sendNotification("sms");
	}
}
