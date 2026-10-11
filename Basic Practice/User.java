class Users{
		public static void main(String a[]){
			BankAccount u1 = new BankAccount(a[0] , a[1] , Integer.parseInt(a[2]));
			u1.getBalance();
			u1.deposit(5000 , a[1]);
			u1.withdraw(a[1] , 3000);
			u1.printDetail();
			
		}
}