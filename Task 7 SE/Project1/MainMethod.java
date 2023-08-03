package working;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in); //Creating a Scanner Object
		System.out.println("Enter the Project Name: ");
		//String input
		String proName = n.nextLine();
		System.out.println("Enter the type of Building: ");
		String typeBuilding = n.nextLine();
		System.out.println("Enter the address of the building: ");
		String address1 = n.nextLine();
		System.out.println("Enter the deadline of the project: ");
		String deadline1 = n.nextLine();
		//Numerical Value 
		System.out.println("Enter the total Amount paid: R ");
		int totalPaid = n.nextInt();
		System.out.println("Enter the project number: R");
		int proNumber = n.nextInt();
		System.out.println("Enter the total fee of the project: R ");
		int totalFee = n.nextInt();
		
		
		
		Poise_Projects project1 = new Poise_Projects(proName,typeBuilding,address1,totalFee,totalPaid,proNumber,deadline1);
 		project1.toString();
		System.out.println(project1);
		project1.setDeadline("8 May 2020");
		project1.setTotalAmountPaid(6000000);
		System.out.println("Updated Information:");
		System.out.println(project1);
		
		//Person Information
		System.out.println("Enter name: ");
		String name1 = n.nextLine();
		System.out.println("Enter your email: ");
		String email1 = n.nextLine();
		System.out.println("Enter your address: ");
		String address2 = n.nextLine();
		System.out.println("Enter your telephone number: ");
		int telephone1 = n.nextInt();
		System.out.println("Enter yes or no if you are a contractor: ");
		String contractor1 = n.nextLine();
		System.out.println("Enter yes or no if you are a customer: ");
		String customer1 = n.nextLine();
		System.out.println("Enter yes or no if you are a architect: ");
		String architect1 = n.nextLine();
		
		
		Person person1 = new Person(customer1,contractor1,architect1,name1,email1,address2,telephone1);
		person1.toString();
		System.out.println(person1);
			n.close();
		}
		
	
	} 




