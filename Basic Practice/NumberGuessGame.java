import java.util.*;
//Computer chooses a number between 1–100 and the user keeps guessing.
//Tell them: Too High , Too Low , Correct!
//Attempt counter , Maximum 10 attempts
class NumberGuessGame{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("     Guess Game      ");
		System.out.println("=====================");
		NumberGuessGame.gameApp(sc);
	}
	static void gameApp(Scanner sc){
		int attempt = 10;
		Random random = new Random();
		int rightNo = random.nextInt(100)+1;
		System.out.println("Enter Your Guessed No Between 1 - 100 ");
		
		while(attempt != 0){
			
			int guessNo = sc.nextInt();
			if(guessNo == rightNo){
				System.out.println("You guessed the right no. : " + guessNo);
				System.out.println("===============");
				System.out.println("   YOU WON :)   ");
				break;
			}else if(guessNo > rightNo){
				attempt--;
				System.out.println("Wrong Answer Attempt Left :" + attempt);
				System.out.println("Tips - Too High");
			}else if(guessNo < rightNo){
				attempt--;
				System.out.println("Wrong Answer Attempt Left :" + attempt);
				System.out.println("Tips - Too Low");
			}
			if(attempt == 0){
				System.out.println("===================");
				System.out.println("    You Loose -_-      ");
			}else{
				System.out.println("Guess Again");
			}
		}
	}
}