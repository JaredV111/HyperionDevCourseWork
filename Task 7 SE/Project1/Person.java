package working;

public class Person extends Poise_Projects {
	
	//Attributes
	String customer;
	String contractor;
	String architect;
	String name;
	String email;
	String address;
	int telephone_number;
	
	public Person(String customer,String contractor,String architect,String name,String email,String address,int telephone_number) {
		super(address, address, address, telephone_number, telephone_number, telephone_number, address);
		this.customer = customer;
		this.architect = architect;
		this.contractor = contractor;
		this.name = name;
		this.email = email;
		this.address = address;
		this.telephone_number = telephone_number;
	}
	//Getters
	public String getName() {
		return name;
	}
	public String getCustomer() {
		return customer;
	}
	public String getContractor() {
		return contractor;
	}
	public String getArchitect() {
		return architect;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public int getTelephoneNumber() {
		return telephone_number;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public void setArchitect(String architect) {
		this.architect = architect;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTelephoneNumber(int telephone_number) {
		this.telephone_number = telephone_number;
	}
	public String toString() {
		return name + " " + customer +" "+ contractor + " " + architect + " " + email + " " + address +" "+ telephone_number; 
}
}



