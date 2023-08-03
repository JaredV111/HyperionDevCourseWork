package Task18;

public class Task18 {

	public static void main (String[] args)
	{
	
		System.out.println("Welcome to my first program!\n");// syntax error.
		
		int ageStr = 24;//Changed to an integer. syntax error 
      
		int age = ageStr;//took out the intparse.
		
		System.out.println("I'm " + age + " years old.");
      
		double three = 3.5;//changed the value to a double.The value should have a .5 for the 6 months not shown in the calculations.Would cause a "Cannot concatenate 'str' and 'int' objects".
      
	   double answerYears = age + three;//changed the value to a double.
		
		System.out.println("Total number of years: " + answerYears);
		
		double answerMonths = answerYears * 12; //changed the value to a double.
		
		System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");
		
		//Once you've corrected all the errors, the answer should be 330.
	}

}




