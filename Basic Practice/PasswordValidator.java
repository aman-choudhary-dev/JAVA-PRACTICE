import java.util.*;
class PasswordValidator{
	//static boolean passStrenght[] = {}
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int passCase=0;
		while(passCase <= 3){
			
			System.out.println("Enter the Password ");
			String password  = sc.next();
			checkStrength(password , passCase);
		}
		System.out.println("Password is Strong");
		System.out.println("Password Has Been Created");
	}
	static void checkStrength(String password , int passCase){
		if(passLength(password)) {
				passCase++;
		}
		if(upperCase(password)){
			passCase++;
		}
		if(lowerCase(password)){
			passCase++;
		}
		if(passCase <3){
			System.out.println("Password Strength is Medium");
		}
	}
	static boolean passLength(String password){
		if(password.length() < 8){
			System.out.println("insufficient character");
			return false;
		}else{
			return true;
		}
	}
	static boolean upperCase(String password){
		for(char c : password.toCharArray()){
			if(Character.isUpperCase(c)){
				return true;
			}
		}
		System.out.println("UpperCase  Letter is missing");
		return false;
	}
	static boolean lowerCase(String password){
		for(char c : password.toCharArray()){
			if(Character.isLowerCase(c)){
				return true;
			}
		}
		System.out.println("LowerCase  Letter is missing");
		return false;
	}
	static boolean containNo(String password){
		for(char c : password.toCharArray()){
			
		}
	}
}