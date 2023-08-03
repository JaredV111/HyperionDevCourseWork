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
	  System.out.printn(rajesh + "\n");
	  
	  Secretary aidan = new Secretary("Aidan","Male","Lewis",21,5);
	  Secretary dylan = new Secretary("Dylan","Male","Williams",20,4);
	  Secretary shadley = new Secretary("Shadley","Male","Ebrahim",20,4);
	  
	  
	  Student sally = new Student("Sally", 15, 8, 'D');
      Student sipho = new Student("Sipho", 17 , 11, 'A');
      Student rajesh = new Student("Rajesh", 19, 12, 'B');
      
      System.out.println("Students\n");
      System.out.println(sally + "\n");
      System.out.println(sipho + "\n");
      System.out.println(rajesh);
   }
}