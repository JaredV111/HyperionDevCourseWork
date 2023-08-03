package L3Task8;

// Imports
import java.util.*;
import java.text.*;

public class Menu {
	// Projects list
	public static ArrayList<Project> projectsList = ProjectReader.getProjects();
	// Person Variables
	private static String firstName;
	private static String surname;
	private static String phoneNum;
	private static String email;
	private static String address;

	// Methods
	// Outputs a Project Options Menu
	public static void printProjectMenu() {
		System.out.println("1 - Print Project\n" + "2 - Change projects due date\n"
				+ "3 - Change total amount paid to date for project\n" + "4 - Update projects contractors details\n"
				+ "5 - Finalise project\n" + "0 - Exit\n");
	}

	// Outputs Main Options Menu
	public static void printMainMenu() {
		System.out.println("1 - Please select a Project\n" + "2 - Create new Project\n" + "3 - Print all Projects\n"
				+ "4 - Print all Unfinished Projects\n" + "5 - Print all Overdue Projects\n" + "0 - Exit Program");
	}

	// Gets the users Menu Selection

	// return Number Option as an Integer that user Selected

	public static int selectedOption() {
		Scanner input = new Scanner(System.in);

		String choiceStr = input.nextLine();
		int choice = 42;

		try {
			// Convert choice to integer
			choice = Integer.parseInt(choiceStr);
			if (choice < 0) {
				throw new Exception();
			}
			return choice;
		} catch (Exception e) {
			System.out.println("That is not a valid option. Please enter a number from 1 to 6\n");
			return selectedOption();
		}
	}

	// Displays all Projects by their Names only
	public static void printAllProjectsNames() {
		for (int i = 0; i < projectsList.size(); i++) {
			System.out.println((i + 1) + " " + projectsList.get(i).projName);
		}
	}

	// Displays all Projects
	public static void printAllProjects() {
		for (int i = 0; i < projectsList.size(); i++) {
			System.out.println("Project " + (i + 1));
			projectsList.get(i).printProject();
		}
	}

	// Displays selected Project

	// (i) Projects Number to be chosen

	public static void printSelectedProject(int i) {
		projectsList.get(i).printProject();
	}

	// Displays Projects that are not marked Finalized
	public static void printUnfinishedProjects() {
		for (int i = 0; i < projectsList.size(); i++) {
			if (projectsList.get(i).finalised.equals("Not Finalized")) {
				projectsList.get(i).printProject();
			}
		}
	}

	// Displays Overdue Projects
	public static void printOverdueProjects() {
		for (int i = 0; i < projectsList.size(); i++) {
			try {
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(projectsList.get(i).deadline);
				Date now = new Date();
				if (projectsList.get(i).finalised.equals("Not Finalized") && now.compareTo(date) > 0) {
					projectsList.get(i).printProject();
				}
			} catch (ParseException e) {
				System.out.println("\nProject " + i + " Date invalid format! Please change the format");
			}
		}
	}

	// Creates a new Project Object

	// return New Project Object

	public static Project createProject() {
		// Variables
		String projName;
		String projNum;
		String buildingType;
		String buildingAddress;
		String erfNum;
		String deadline;
		double totalFee = 0;
		double totalPaidToDate = 0;
		String finalised = "Not Finalized";

		// Getting Project Details
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Project Name: ");
			projName = input.nextLine();
			if (projName.equals("")) {
				System.out.println("Please enter Something!");
			}
		} while (projName.equals(""));

		do {
			System.out.print("Project Number: ");
			projNum = input.nextLine();
			if (projNum.equals("")) {
				System.out.println("Please enter Something!");
			}
		} while (projNum.equals(""));

		do {
			System.out.print("Projects Building type: ");
			buildingType = input.nextLine();
			if (buildingType.equals("")) {
				System.out.println("Please enter Something!");
			}
		} while (buildingType.equals(""));

		do {
			System.out.print("Projects Address: ");
			buildingAddress = input.nextLine();
			if (buildingAddress.equals("")) {
				System.out.println("Please enter Something!");
			}
		} while (buildingAddress.equals(""));

		do {
			System.out.print("Projects ERF Number: ");
			erfNum = input.nextLine();
			if (erfNum.equals("")) {
				System.out.println("Please enter Something!");
			}
		} while (erfNum.equals(""));

		while (true) {
			try {
				System.out.print("Project Deadline: ");
				String temp = input.nextLine();
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(temp);
				deadline = new SimpleDateFormat("yyyy-MM-dd").format(date);
				break;
			} catch (Exception e) {
				System.out.println("Please enter in valid date format! eg (2020-05-27)");
			}
		}

		while (true) {
			try {
				System.out.print("Projects Total Fee: ");
				String temp = input.nextLine();
				totalFee = Double.valueOf(temp);
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid number");
			}
		}

		while (true) {
			try {
				System.out.print("Project Total Paid to Date: ");
				String temp = input.nextLine();
				totalPaidToDate = Double.valueOf(temp);
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid number");
			}
		}

		// Creating Person Objects
		Person architect = createPerson("Architect");
		Person customer = createPerson("Customer");
		Person contractor = createPerson("Contractor");

		if (projName.equalsIgnoreCase("")) {
			projName = customer.surname;
		}

		// Creating Project Object
		Project project = new Project(projName, projNum, buildingType, buildingAddress, erfNum, deadline, totalFee,
				totalPaidToDate, architect, customer, contractor, finalised);

		System.out.println("New Project Successfully Created");
		return project;
	}

	// Creates a Person Object

	public static Person createPerson(String role) {
		Scanner input = new Scanner(System.in);

		// Getting info, checking it and using to Create a Person Object
		System.out.println("\nProjects " + role + "s" + " Details:");

		do {
			System.out.print("Name: ");
			firstName = input.nextLine();
			if (firstName.equals("")) {
				System.out.println("Please Enter Something!");
			}
		} while (firstName.equals(""));

		do {
			System.out.print("Name: ");
			surname = input.nextLine();
			if (surname.equals("")) {
				System.out.println("Please Enter Something!");
			}
		} while (surname.equals(""));

		do {
			System.out.print("Phone Number: ");
			phoneNum = input.nextLine();
			if (phoneNum.equals("")) {
				System.out.println("Please Enter Something!");
			}
		} while (phoneNum.equals(""));

		do {
			System.out.print("Email Address: ");
			email = input.nextLine();
			if (email.equals("")) {
				System.out.println("Please Enter Something!");
			}
		} while (email.equals(""));

		do {
			System.out.print("Physical Address: ");
			address = input.nextLine();
			if (address.equals("")) {
				System.out.println("Please Enter Something!");
			}
		} while (address.equals(""));

		// Creating Architect Object
		Person person = new Person(role, firstName, surname, phoneNum, email, address);

		return person;
	}
}