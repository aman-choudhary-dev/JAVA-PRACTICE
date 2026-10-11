class Employee{
	String name;
	int id;
	double salary;
	Employee(){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public static void main(String a[]){
		Employee ep1 = new Employee();
		ep1.name = "Aman";
		ep1.id = 123456;
		ep1.salary = 5000000;
		ep1.displayDetail();
	}
	void displayDetail(){
		System.out.println("This Name is " + name);
		System.out.println("Emp Id is " + id);
		System.out.println("Salary is " + salary);
	}
}