import java.util.*;
class CalculatePerimeter{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("  PERIMETER CAL  ");
		System.out.println("=================");
		System.out.println("First Enter The Shape");
		String shape = sc.next();
		if(shape.equals("Circle")){
			CalculatePerimeter.perimeterCirle(sc);
		}
		else if(shape.equals("Rectangle")){
			CalculatePerimeter.perimeterRectangle(sc);
		}
		else if(shape.equals("Square")){
			CalculatePerimeter.perimeterSquare(sc);
		}
		else{
			System.out.println("Enter The Valid Shape");
		}
	}
	static void perimeterCirle(Scanner sc){
		System.out.println("Enter The Radius of Circle");
		int radius  = sc.nextInt();
		double perimeter = 2 * 3.14 * radius;
		System.out.println("Perimeter is " + perimeter);
	}
	static void perimeterRectangle(Scanner sc){
		System.out.println("Enter The Length and Width of Rectangle");
		int length  = sc.nextInt();
		int width  = sc.nextInt();
		double perimeter = (length+width)*2;
		System.out.println("Perimeter is " + perimeter);
	}
	static void perimeterSquare(Scanner sc){
		System.out.println("Enter The Length of Square Side");
		int length  = sc.nextInt();
		double perimeter = 4*length;
		System.out.println("Perimeter is " + perimeter);
	}
}