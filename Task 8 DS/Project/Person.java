package L3Task8;

public class Person {
	// Variables
	String firstName;
	String surname;
	String phoneNum;
	String email;
	String address;
	String role;

	public Person() {
	}

	public Person(String role, String firstName, String surname, String phoneNum, String email,
				  String address) {
		this.role = role;
		this.firstName = firstName;
		this.surname = surname;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
	}
	
	// Methods	
	// Prints a Person Objects details
	public void printPerson() {
		String personDetails = "\n" + role;
		personDetails += "\nName: " + firstName;
		personDetails += "\nSurname: " + surname;
		personDetails += "\nPhone Number: " + phoneNum;
		personDetails += "\nEmail Address: " + email;
		personDetails += "\nPhysical Address: " + address;

		System.out.println(personDetails);
	}

	@Override
	public String toString() {
		return	"firstName='" + firstName + '\'' +
				", surname='" + surname + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", email='" + email + '\'' +
				", address='" + address + '\'' +
				", role='" + role;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}