class StringManipulation{
	public static void main(String a[]){
		String s1 = "Aman Choudhary"; // This literal will be save in SCP
		String s3 = "AMAN CHOUDHARY"; // This literal will be save in SCP
		String s2 = new String("Aman Choudhary"); // This will be stored in the heap memory
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println("Character at Index " + s1.charAt(3)); // to access the character
		System.out.println(s1 == s2 + " This return false because they are referencing to the diff point ");
		System.out.println(s1.equals(s2) +  " This return true because this will comparing the content not reference");
		System.out.println(s1.equalsIgnoreCase(s3)); // will ignore the capital or small letter and just check the character
		
		System.out.println(s1.indexOf("c")); // will return the index of first occurence
		System.out.println(s1.lastIndexOf("a")); // will return the last index of that char
		
		System.out.println(s1.substring(4)); // will give from 4th index till end
		System.out.println(s1.substring(0 ,4)); // from 0 to 4 which will include 0,1,2,3 indexes;
		
		String s4 = "    KodeWala Academy ";
		String s5 = s4.trim();
		//System.out.println(s4.trim()); // will remove space from the first and last, doesn't remove the space between word
		System.out.println(s5.replace('W','V'));
		
	}
}