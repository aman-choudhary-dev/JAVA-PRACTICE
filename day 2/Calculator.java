class Add{
	public static void main(String args[]){
		int arrSize = Integer.parseInt(args[0]);  // It will take inpur from the args first num will be the size
		int arr[] = new int[arrSize]; // it will set the size of arr
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(args[1+i]);    // we use 1 + i to take input because we have already 0th place for size
		}
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			 sum += arr[i];
		}
		System.out.println("Total Sum of Your Calculation is " + sum);
 	}
}

class Multiplication{
	public static void main(String args[]){
		int arrSize =  Integer.parseInt(args[0]);
		int totalNum [] = new int [arrSize];
		// Can we take no and do the calculation in one loop instead of diff ???
		
		int product = 1;
		for(int i = 0 ; i < totalNum.length ; i++){
			totalNum[i] = Integer.parseInt(args[1+ i]);
			product *= totalNum[i];
			
		}
		System.out.println("The Product of your num is " + product);
			
	}
}

class ComplexCalculation{
	public static void main(String args[]){
		int [] arr = new int[4];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		int remainder = giveRemainder(arr[0] , arr[1]);
		System.out.println("Remainder of first 2 no was " + remainder);
		
		int remainderMultiply = giveMultiplicationWithRemainder(remainder , arr[2]);
		System.out.println("This is after we multiply with remainder " + remainderMultiply);
		int add = giveAdd(remainderMultiply  , arr[3]);	
		System.out.println("Final Answer is " + add);
	}
	static int giveRemainder(int first , int second){
		return first%second;
	}
	static int giveMultiplicationWithRemainder(int remainder , int second){
		return remainder*second;
	}
	static int giveAdd(int first , int second){
		return first + second;
	}
}