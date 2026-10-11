import java.util.*;
class SQLCW{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("*SELECT From employees WHERE 1 = 1;");
		System.out.println("Enter filter");
		String filter1 = sc.next();
		if(filter1.equals("salary")){
			sb.append(" AND salary > 100000");
		}
		System.out.println(sb);
	}
}