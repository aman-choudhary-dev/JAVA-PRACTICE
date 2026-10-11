  class Operators{
	public static void main(String a[]){
		int minAge = 18;
		int maxAge = 60;
		String name = a[0];
		int userAge = Integer.parseInt(a[1]);
		System.out.println(name + " is allowed to enter " + (minAge < userAge));
		// && || condition for same input can give different answers
		System.out.println("Is Allowed to get DL " + ((userAge > minAge)&&(userAge<maxAge)));
		System.out.println("Is Allowed to get DL " + ((userAge > minAge)||(userAge<maxAge))); // it will still give me true for 70 cause one condition is getting true
		
		//Ternary Operators
		int amount = 500;
		// based on the condition if it is true first case will execute other wise the second case will be execute for flase
		System.out.println((amount > 1) ? "Allowed to transfer" : "Not allowed to transfer");
	}
  }