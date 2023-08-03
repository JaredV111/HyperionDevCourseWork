package Task1;
import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please Enter 0,1,2. scissors = 0, rock = 1, paper = 2");//the user must enter 0,1,2
		int letters = number.nextInt();
		System.out.println("you have picked: " + letters);
		Random rand = new Random();
		int randomNumber = rand.nextInt(3);//Randomly generate a number between 0,1,2
		System.out.println(randomNumber);
		
		if(letters == randomNumber){ // if and else if statements to show if the user won or not.
			System.out.println("It's a tie.");
			
		} else if ((letters ==1)&&(randomNumber== 0)){
			System.out.println("rock beats scissors you win!");
		}
		
		else if ((letters == 2)&&(randomNumber == 1)){
				System.out.println("paper beats rock you win!");
		}
		
		else if((letters == 0)&&(randomNumber == 2)){
				System.out.println("scissors beats paper you win!");
		}
		
		else if((letters == 1)&&(randomNumber ==2)){
			System.out.println("Paper beats rock you lose!");
		}
		
		else if((letters == 0)&&(randomNumber == 1)){	
			System.out.println("Rock beats scissors you lose!");
			number.close();
		}	
	}

}