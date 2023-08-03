package L3Task8;

// Imports
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;

public class Project {
	// Variables
	static String projName;
	static String projNum;
	static String buildingType;
	static String buildingAddress;
	static String erfNum;
	static String deadline;
	static double totalFee;
	static double totalPaidDate;

	// People
	static Person architect;
	static Person customer;
	static Person contractor;

	static String finalised;

	// Constructors
	public Project() {
	}

	public Project(String projName, String projNum, String buildingType, String buildAddress, String erfNum,
				   String deadline, double totalFee, double totalPaidDate, Person architect, Person customer,
				   Person contractor, String finalised) {

		this.projName = projName;
		this.projNum = projNum;
		this.buildingType = buildingType;
		this.buildingAddress = buildAddress;
		this.erfNum = erfNum;
		this.deadline = deadline;
		this.totalFee = totalFee;
		this.totalPaidDate = totalPaidDate;
		this.architect = architect;
		this.customer = customer;
		this.contractor = contractor;
		this.finalised = finalised;
	}

	// Methods
	Scanner input = new Scanner(System.in);

	// Print out Projects Details Method

	public void printProject() {
		// Joining into single string
		String projectDetails = "\nProject Name: " + projName;
		projectDetails += "\nProject Number: " + projNum;
		projectDetails += "\nBuilding Type: " + buildingType;
		projectDetails += "\nBuilding Address: " + buildingAddress;
		projectDetails += "\nERF Number: " + erfNum;
		projectDetails += "\nProject Deadline: " + deadline;
		projectDetails += "\nProject Total Fee: " + totalFee;
		projectDetails += "\nAmount Paid to Date: " + totalPaidDate;
		projectDetails += "\n" + finalised;

		// Output
		System.out.println(projectDetails);

		customer.printPerson();
		architect.printPerson();
		contractor.printPerson();
	}

	// Changes Due Date of a Project
	public void changeDate() {		
		while(true) {
			try {
				System.out.print("Please enter a New Deadline Date: ");
				String temp = input.nextLine();
				Date newDate = new SimpleDateFormat("yyyy-MM-dd").parse(temp);
				this.deadline = new SimpleDateFormat("yyyy-MM-dd").format(newDate);
				break;
			}
			catch(Exception e) {
				System.out.println("Please enter in valid date format! eg (2020-05-27)");
			}
		}
		System.out.println("Deadline Updated!");
	}

	// Change Total Paid to Date
	public void changeAmountPaid() {
		System.out.print("Please enter a New Total Amount Paid: ");
		input.nextLine();
		double newAmount = input.nextDouble();
		Project.totalPaidDate = newAmount;
		System.out.println("Total Paid to Date Updated!");
	}

	// Updates Contractors Details
	public void updateContractor() {
		// Check if user wants to update phone number
		System.out.println("Would you like to update the Contractors Phone Number? Enter yes or no");
		String choice = input.next();
		// Update it with user input
		if (choice.equalsIgnoreCase("Yes")) {
			System.out.print("Please enter the Contractors new Phone Number: ");
			String newPhoneNum = input.next();
			Project.contractor.phoneNum = newPhoneNum;
			System.out.println("Contractors Phone Number has been Updated!");
		}
		// Check if user wants to update email
		System.out.println("Would you like to update the Contractors Email Address? Enter yes or no");
		choice = input.next();
		// Update it with user input
		if (choice.equalsIgnoreCase("Yes")) {
			System.out.print("Please enter the Contractors new Email Address: ");
			String newEmail = input.next();
			Project.contractor.email = newEmail;
			System.out.println("Contractors Email Address has been Updated!");
		}
	}

	// Finalize Project by Creating invoice

	public String[] finaliseProject(double total, double totalPaid) {
		String[] invoice = new String[5];
		double amountToPay = total - totalPaid;
		// Creating invoice
		if (amountToPay > 0) {
			invoice[0] = "Customer Phone Number: " + Project.customer.phoneNum;
			invoice[1] = "Customer Email Address: " + Project.customer.email;
			invoice[2] = "Amount owed: " + amountToPay;
			invoice[3] = "Finalised";
			invoice[4] = "Date Finalised: " + LocalDateTime.now();
			Project.finalised = "Finalised";
		}

		return invoice;
	}
	
	final static String OUTPUT_FILE = "src/Completed_Projects.txt";

	private String getFileOutputString(Project project){

		FileWriter fw;
		try {
			fw = new FileWriter(OUTPUT_FILE);
		
		fw.append(project.getProjName() + "~");
		fw.append(project.getProjNum() + "~");
		fw.append(project.getBuildingType() + "~");
		fw.append(project.getBuildingAddress() + "~");
		fw.append(project.getErfNum() + "~");
		fw.append(project.getDeadline() + "~");
		fw.append(project.getTotalFee() + "~");
		fw.append(project.getTotalPaidDate() + "~");
		fw.append(project.getArchitect().getFirstName() + "~");
		fw.append(project.getArchitect().getSurname() + "~");
		fw.append(project.getArchitect().getPhoneNum() + "~");
		fw.append(project.getArchitect().getEmail() + "~");
		fw.append(project.getArchitect().getAddress() + "~");
		fw.append(project.getCustomer().getFirstName() + "~");
		fw.append(project.getCustomer().getSurname() + "~");
		fw.append(project.getCustomer().getPhoneNum() + "~");
		fw.append(project.getCustomer().getEmail() + "~");
		fw.append(project.getCustomer().getAddress() + "~");
		fw.append(project.getContractor().getFirstName() + "~");
		fw.append(project.getContractor().getSurname() + "~");
		fw.append(project.getContractor().getPhoneNum() + "~");
		fw.append(project.getContractor().getEmail() + "~");
		fw.append(project.getContractor().getAddress() + "~");
		fw.append(project.getFinalised() + "#");
		fw.append("\n");
		
		} catch (IOException e) 
			{
				System.out.println("File Not Found!");
					}

		return "";
	}

	public static String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public static String getProjNum() {
		return projNum;
	}

	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}

	public static String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public static String getBuildingAddress() {
		return buildingAddress;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public static String getErfNum() {
		return erfNum;
	}

	public void setErfNum(String erfNum) {
		this.erfNum = erfNum;
	}

	public static String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public static double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public static double getTotalPaidDate() {
		return totalPaidDate;
	}

	public void setTotalPaidDate(double totalPaidDate) {
		this.totalPaidDate = totalPaidDate;
	}

	public static Person getArchitect() {
		return architect;
	}

	public void setArchitect(Person architect) {
		this.architect = architect;
	}

	public static Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public static Person getContractor() {
		return contractor;
	}

	public void setContractor(Person contractor) {
		this.contractor = contractor;
	}

	public static String getFinalised() {
		return finalised;
	}

	public void setFinalised(String finalised) {
		this.finalised = finalised;
	}

}