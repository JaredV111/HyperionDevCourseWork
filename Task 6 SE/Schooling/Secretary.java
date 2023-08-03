package Schooling;

public class Secretary {

	//Attributes 
	String name;
	String gender;
	String surname;
	int age; 
	int yearsExperience;


	public Secretary(String name, String gender, String surname, int age, int yearsExperience) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.yearsExperience = yearsExperience;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getSurname() {
		return surname;
	}

public String toString() {
	String output = "Name: " + name;
	String output2 = "\nGender: " + gender;
	String output3 = "\nSurname: " + surname;
	output = "\nAge: " + age;
	output = "\nYears of Experience: " + yearsExperience;
	
	return output + output2 + output3;  
	
}


	
}
