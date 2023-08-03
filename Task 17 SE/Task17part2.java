package Task17;
import java.util.*;

public class Task17part2 {
	public static void main(String[] args) {
		//Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		//Invoke getArray method 
		int[] array = getArray();
		
		//Prompt the user to enter the index of the array
		System.out.print("Enter the index of the array: ");
		String hex = input.nextLine();
		
		System.out.println("the decimal value for hex number " + hex + " is " + hextoDecimal(hex.toUpperCase()));
		try {
			//Display the corresponding element value 
			System.out.print("The corresponding element value is " + array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}
	
	public static int hextoDecimal(String hex) {
		int decimalValue = 0; 
		for( int i = 0; i < hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else //ch is 's' , '1' .....,or '9'
			return ch - '0';
	}

	/** Returns an array with 1000 randomly chosen integers */
	
	public static int[] getArray() {
		int[]array = new int[100];
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() *100) +1;
		}
		return array;
		
	}
	
	
}
