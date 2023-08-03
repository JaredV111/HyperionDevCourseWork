package Task3;
import java.util.Scanner;
public class IdenticalArrays {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array: ");//The length the user wants in the first array
		n = s.nextInt();
		int a[]= new int[n];
		System.out.print("Enter all the elements: ");//all the elements the user wants in the array
		for(int i = 0; i < n ; i++) {
			a[i] = s.nextInt();
		}
		int u;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array: ");//The length the user wants in the second array 
		u = scan.nextInt();
		int b[]= new int[u];
		System.out.print("Enter all the elements: ");//All the elements the user wants in the array
		for(int counter = 0; counter < u ; counter++) {
			b[counter] = scan.nextInt();
		}
		if(b != a)//checking to see if the arrays are equal.
			System.out.println("Same");
		else System.out.println("Not the same");
      s.close();
      scan.close();
        }
	

	}

