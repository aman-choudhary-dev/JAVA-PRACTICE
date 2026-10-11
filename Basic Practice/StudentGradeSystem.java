import java.util.*;
class StudentGradeSystem{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		String []names  = new String [5];
		int [][]marks  = new int [5][3];
		System.out.println("Enter your Student Name And Their Marks :");
		// To Get the NAmes of student and their marks
		for(int i = 0 ; i < 5  ; i++){
			System.out.println("Enter The Name of Student");
			names[i] = sc.next();
			System.out.println("Enter The marks of 3 subject ");
			for(int j = 0 ; j < 3 ; j++){
				marks[i][j] = sc.nextInt();
			}
		}
		int highestTotal = 0;
		String topperName = "";
		int total[] = new int[5];
		// To get the total of each student 
		for(int i = 0 ; i < 5 ;i++){
			int eachTotal = 0;
			for(int j = 0 ; j < 3 ; j++){
				eachTotal += marks[i][j];
				total[i] = eachTotal;
				if(total[i] > highestTotal){
					highestTotal = total[i];
					topperName = names[i];
				}
			}
		}
		// To print Result
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(names[i] + " Total : " + total[i]);
		}
		System.out.println("Highest Total Obtain By " + topperName + "  marks  : " + highestTotal);
	}
}