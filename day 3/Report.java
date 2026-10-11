class ResultAnalyzer{
	public static void main(String args[]){
		System.out.println("====================");
		System.out.println("   Student Report   ");
		System.out.println("====================");
		System.out.println();
		System.out.println("Student Name : Aman Choudhary ");
		System.out.println("Roll No : 13");
		int marks[] = new int[5];
		for(int i = 0 ; i < marks.length ; i++){
			marks[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Maths      :  " + marks[0]);
		System.out.println("English    :  " + marks[1]);
		System.out.println("Physics	   :  " + marks[2]);
		System.out.println("Chemistry  :  " + marks[3]);
		System.out.println("Java       :  " + marks[4]);
		int total = 0;
		for(int x : marks){
			total += x;
		}
		System.out.println("===================");
		System.out.println("Total Marks The Student Got Was  :" + total);
		double percentage = total/5.0; // It need to be 5.0 not 5 cause dividing it by double is the only way we get double
		System.out.println("Percentage : " + percentage);
	}
}