class AddTwoNum{
	public static void main(String a[]){
		int first = Integer.parseInt(a[0]); // if inpur is something wrong it will give  numberformat Exception'
		int second = Integer.parseInt(a[1]);
		int sum = first+second;
		System.out.println("Sum Of Your Num is " +sum);
	}
}