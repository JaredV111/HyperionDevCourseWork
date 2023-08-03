package Task13;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("If a cub, if a male answer false, Weight: ");
		String cub = input.next();
		boolean male = input.nextBoolean();
		int weight1 = input.nextInt();
		
		Lion Lion1 = new Lion(cub, male, weight1);
		if (120 < weight1) {
			System.out.print("The lion is a male.");
		}
		else if (weight1 < 80) {
			System.out.print("The lion is a cub.");
		}
		else {
			System.out.println("The lion is a female. ");
			
		}
		System.out.println(Lion1);
		
		

input.close();
	}

}
