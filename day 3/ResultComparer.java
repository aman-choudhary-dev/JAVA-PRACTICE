import java.util.*;
class StudentResultAnalyzer{
	public static void main(String a[]){
		Scanner sc = new Scanner (System.in);
		String []name = new String[2];		
		int marks[][] = new int[2][3];
		System.out.println("Enter the first student name");
		name[0] = sc.next();
		System.out.println("Enter marks of 3 subject");
		for(int i = 0 ; i < 3 ; i ++){
			marks[0][i] = sc.nextInt();
		}
		System.out.println("Enter the second student name");
		name[1] = sc.next();
		System.out.println("Enter marks of 3 subject");
		for(int i = 0 ; i < 3 ; i ++){
			marks[1][i] = sc.nextInt();
		}
		int firstTotal = 0;
		for(int i = 0 ; i < 3 ; i ++){
			firstTotal += marks[0][i];
		}
		int firstAverage = firstTotal/3;

		int secondTotal = 0;
		
		for(int i = 0 ; i < 3 ; i ++){
			secondTotal += marks[1][i];
		}
		int secondAverage = secondTotal/3;
		System.out.println(name[0] + " Total is " + firstTotal +" ; "+ " Average is " + firstAverage);
		System.out.println(name[1] + " Total is " + secondTotal +" ; "+ " Average is " + secondAverage);
	}
}