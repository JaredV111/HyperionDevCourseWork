package Task15;

import java.util.Scanner;

public class Task15 {
	public static int fibonacciRecursion(int n) {
		if(n == 0) {
					return 0;
		}
		if(n == 1 || n == 2) {
							 return 1;
					}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
	public static void main(String args[]) {
		System.out.println("Please enter the max value of numbers you want to see: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Fibonacci Series of " + n + " numbers: ");
		for(int i = 0;i < n;i++) {
		System.out.println(fibonacciRecursion(i));
		
	}
		in.close();
}
}