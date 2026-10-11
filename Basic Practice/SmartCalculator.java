import java.util.*;
class SmartCalculator{
	public static void main(String args[]){
		System.out.println("Your Calculator Started");
		System.out.println("Write your first number ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println("Enter your second Number ");
		int second = sc.nextInt();
		System.out.println("What you want to do ");
		System.out.println("type - '+' , '*' , '-' , '/' , '%'");
		String operation = sc.next();
		
		if(operation.equals("+")){
			int sum = first + second;
			System.out.println("Addition of your two num is " + sum);
		}
		else if(operation.equals("-")){
			int sub = first - second;
			System.out.println("Subtraction of num is " + sub);
		}
		else if(operation.equals("*")){
			int mul = first*second;
			System.out.println("Multiplication of num is " + mul);
		}
		else if(operation.equals("/")){
			double div = first/second;
			System.out.println("Division of your num is " + div);
		}
		else if(operation.equals("%")){
			int mod = first%second;
			System.out.println("Remainder of your num is " + mod);
		}
		else{
			System.out.println("Invalid Operation");
		}
	}
}