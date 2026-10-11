class StudentDetail{
	String name;
	int rollNo;
	int marks;
	static String schoolName = "Shri Shankaracharya Vidyalaya";
	StudentDetail(String name , int rollNo , int marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	void displayInfo(){
		System.out.println("School Name : " + StudentDetail.schoolName);
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + rollNo);
		System.out.println("Marks Obtained : " + marks);
	}
	public static void main(String a[]){
		StudentDetail s1 = new StudentDetail("Aman" , 25 , 869);
		StudentDetail s2 = new StudentDetail("Sonu" , 28 , 500);
		s1.displayInfo();
		s2.displayInfo();
	}
}