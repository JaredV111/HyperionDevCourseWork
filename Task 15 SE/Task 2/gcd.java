package Task15;
import java.util.Scanner;

public class gcd {
	static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		return gcd(b,a %b);
	
	}
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	int a = Integer.parseInt(s);
	System.out.println(s);
	
	Scanner in2 = new Scanner(System.in);
	String s2 = in2.nextLine();
	int b = Integer.parseInt(s2);
	System.out.println(s2);
	
	System.out.println("GCD of " + a + "and" + b + "is" + gcd(a,b));
	
	}

}
