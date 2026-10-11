class AddTwoNumber{
	public static void main(String a[])
	{
		int firstNum = Integer.parseInt(a[0]);
		int secondNum = Integer.parseInt(a[1]);
		System.out.println("Sum of your no. is : " +addTwoNum(firstNum , secondNum));
	}
	
	static int addTwoNum(int firstNum , int secondNum)
	{
		return firstNum + secondNum ;
	}
}