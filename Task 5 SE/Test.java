package working;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		final int NUMBER = 5;//How many questions will be asked.
		int int2 = 0;
		int int1 = 0; 
		long startTime = System.currentTimeMillis();
		String string1 = " "; 
		Scanner s = new Scanner(System.in);
		
		while (int1 < NUMBER) {
			int randomnum1 = (int)(Math.random() * 10);
			int randomnum2 = (int)(Math.random() * 10);
		if (randomnum1 < randomnum2) {
			int temp = randomnum1; 
			randomnum1 = randomnum2; 	
			randomnum2 = temp;
		}
		
		System.out.print("What is " + randomnum1 + " - " + randomnum2 + "? ");
		
		int answer = s.nextInt();
		if (randomnum1 - randomnum2 == answer){ 
			System.out.println("You are correct!"); 
			int2++; // Increase the correct answer count
		}
		else
			System.out.println("Your answer is wrong.\n" + randomnum1 + " - " + randomnum2 + " should be " + (randomnum1 - randomnum2));//Printing out the answer is wrong and what the answer should be.
			int1++;
			string1 += "\n" + randomnum1 + "-" + randomnum2 + "=" + answer + ((randomnum1 - randomnum2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + int2 +"\nTest time is " + testTime / 1000 + " seconds\n" + string1);
		s.close();
		}
	
		}
	

