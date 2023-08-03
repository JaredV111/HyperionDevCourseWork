package Schooling;

public class Teacher {
	//Attributes 
	String name;
	String surname;
	String qualifications;
	int age;
	String gender;
	//Constructor
	public Teacher(String name,String surname,String qualifications,int age,String gender) {
		this.name = name;
		this.age = age;
		this.qualifications = qualifications;
		this.surname = surname;
		this.gender = gender;
}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getQualifications() {
		return qualifications;
	}
	public String getGender() {
		return gender;
		
	}

	public String toString() {
		String output = "Name: " + name;
		String output1 = "\nSurname: " + surname;
		String output2 = "\nQualifications: " + qualifications;
		String output3 = "\nGender: " + gender;
		output += "\nAge: " + age;
		
		return output + output2 + output3 + output1;
		
		
	}	
		
}