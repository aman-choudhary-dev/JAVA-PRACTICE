class SwitchCases{
	public static void main(String a[]){
		int day = 1;
		switch(day){
			case 1 : System.out.println("Monday");
			break; // if we remove this it will go to case 2 even if it doesn't meet the condition ;
			case 2 : System.out.println("Tuesday");
			break;
		}
	}
}