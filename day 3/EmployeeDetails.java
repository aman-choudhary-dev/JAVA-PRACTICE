class EmployeeDetails{
	public static void main(String args[]){
		String employeeName = args[0];
		int employeeId = Integer.parseInt(args[1]);
		String employeeJobRole = args[2];
		double employeeSalary = Double.parseDouble(args[3]);
		System.out.println("Employee Id       : " + employeeId);
		System.out.println("Employee Name     : " + employeeName);
		System.out.println("Employee Job Role : " + employeeJobRole);
		System.out.println("Employee Salary   : " + employeeSalary);
	}
}