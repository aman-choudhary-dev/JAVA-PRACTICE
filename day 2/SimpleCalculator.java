class Add{
	public static void main(String args[]){
		int first = Integer.parseInt(args[0]);   // THis will only work for limited
		int second = Integer.parseInt(args[1]);
		int add = first + second ;
		System.out.println("Addition of your num is  " + add);
	}
}

class Subtract{
	public static void main(String args[]){
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int subtract = first - second;
		System.out.println("Subtraction of two num is " + subtract);
	}
}

class Multiply{
	public static void main(String args[]){
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int multiply = first * second;
		System.out.println("Multiplication of two num is " + multiply);
	}
}