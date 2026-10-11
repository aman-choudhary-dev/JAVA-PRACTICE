import java.util.Scanner;
class ScannerClass{
	public static void main(String a[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age");
		while(!sc.hasNextInt()){  // Check if the next input is an integer
			System.out.println("Invalid input Add a valid Int");
			sc.next();// Clear the invalid input from the scanner
		}
		int age = sc.nextInt();
		System.out.println("Enter Your Name ");
		while(!sc.hasNext()){ // We can't validate name using this method java can take every thing as a string 
			System.out.println("Enter Valid Name");
			sc.next();
		}
		String name = sc.next();
		System.out.println("Enter Salary");
		while(!sc.hasNextDouble()){
			System.out.println("Enter Valid Salary");
			sc.next();
		}
		double salary = sc.nextDouble();
	}
}