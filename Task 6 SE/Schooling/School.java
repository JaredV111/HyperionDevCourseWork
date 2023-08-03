package Schooling;

public class School
{
   public static void main (String [] args)
   {
   
      Teacher sally = new Teacher("Sally", "Williams","Bachelors",25,"Female");
	  Teacher sipho = new Teacher("Sipho","Williams","Bachelors",30,"Male");
	  Teacher rajesh = new Teacher("Rajesh","Williams","Diploma",35,"Male");
	  
	  System.out.println("Teachers\n");
	  System.out.println(sally + "\n");
	  System.out.println(sipho + "\n");
	  System.out.println(rajesh + "\n");
	  
	  Secretary aidan = new Secretary("Aidan","Male","Lewis",20,5);
	  Secretary dylan = new Secretary("Dylan","Williams","Male",20,4);
	  Secretary shadley = new Secretary("Shadley","Ebrahim","Male",20,4);
	  
	  System.out.println("Secretary\n");
	  System.out.println(aidan + "\n");
	  System.out.println(dylan + "\n");
	  System.out.println(shadley +"\n");
	    
	  Students raj = new Students("Sally", 15, 8, 'D');
      Students neo = new Students("Sipho", 17 , 11, 'A');
      Students howard = new Students("Rajesh", 19, 12, 'B');
      
      System.out.println("Students\n");
      System.out.println(raj + "\n");
      System.out.println(neo + "\n");
      System.out.println(howard);
   }
}