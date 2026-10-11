class EmployeeDetail{
	static int companyCode = 2568;
	static int totalEmployee = 0;
	String name;
	int age;
	String department;
	EmployeeDetail(String name , int age , String department){
		this.name = name;
		this.age = age;
		this.department = department;
		totalEmployee++;
	}
	void displayDetail(){
		System.out.println("Name : " + name + " | Age : " + age + " | Position " + department);
	}
	public static void main(String a[]){
		EmployeeDetail emp1 = new EmployeeDetail("Aman" , 24 , "Engineer");
		EmployeeDetail emp2 = new EmployeeDetail("Akash" , 28 , "CEO");
		EmployeeDetail emp3 = new EmployeeDetail("Prasana" , 26 , "Director");
		System.out.println( "Name : " +emp1.name + " "  + "Age : " + emp1.age + " Position " + emp1.department);
		System.out.println( "Name : " +emp2.name + " "  + "Age : " + emp2.age + " Position " + emp2.department);
		System.out.println( "Name : " +emp3.name + " "  + "Age : " + emp3.age + " Position " + emp3.department);
		emp1.displayDetail();   // This will directly say just acces my information
		emp2.displayDetail();
		System.out.println("Total No of Employee is " + totalEmployee);
	}
}