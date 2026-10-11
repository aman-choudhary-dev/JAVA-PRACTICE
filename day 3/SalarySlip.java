class SalaryCalculator{
	public static void main(String args[]){
		String employeeName = args[0];
		int baseSalary = Integer.parseInt(args[1]);
		int hraPercentage= Integer.parseInt(args[2]);
		int daPercentage = Integer.parseInt(args[3]);
		int pfPercentage = Integer.parseInt(args[4]);
		System.out.println("====================");
		System.out.println("     Salary Slip    ");
		System.out.println("====================");
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Base Salary   : " + baseSalary );
		double hra = (baseSalary*hraPercentage)/100;
		System.out.println("HRA           : " + hra);
		double da = (baseSalary * daPercentage)/100;
		System.out.println("DA            : " + da);
		double grossSalary = baseSalary + da+ hra;
		System.out.println("Gross Salary  : " + grossSalary);
		double pf  = (baseSalary*pfPercentage)/100;
		System.out.println("PF Deduction  : " + pf);
		double netsalary = baseSalary + hra+ da - pf;
		System.out.println("Net Salary    : " + netsalary);
		System.out.println("=====================");
	}
}