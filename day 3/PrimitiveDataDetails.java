class PrimitiveDataType{
	public static void main(String args[]){
		PrimitiveDataType.byteDetatil();
		PrimitiveDataType.intDetail();
		PrimitiveDataType.longDetail();
		PrimitiveDataType.booleanDetail();
	}
	static void byteDetatil(){
		byte value = 123;
		System.out.println("Byte Value : " + value);
		System.out.println("Byte size  : " + Byte.SIZE + "bits");
		System.out.println("Byte range : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
	}
	static void intDetail(){
		int value = 568;
		System.out.println("Int Value  : " +value);
		System.out.println("Int Value  : " +Integer.SIZE + "bits");
		System.out.println("Int Range  : " +Integer.MIN_VALUE + " TO " +Integer.MAX_VALUE);
	}
	static void longDetail(){
		long value = 465646846;
		System.out.println("Long Value  : " +value);
		System.out.println("Long Value  : " +Long.SIZE + "bits");
		System.out.println("Long Range  : " +Long.MIN_VALUE + " TO " +Long.MAX_VALUE);
		
	}
	static void booleanDetail(){
		boolean value = true;
		System.out.println("Boolean Value  : " +value);
		System.out.println("Boolean Value  : " +Boolean.SIZE + "bits"); // Size doesn't matter in java
		//System.out.println("Boolean Range  : " +Boolean.MIN_VALUE + " TO " +Boolean.MAX_VALUE);
		// Boolean doesn't have an value range
	}
}