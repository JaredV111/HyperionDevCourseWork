package working;

public class Poise_Projects{
	//Attributes 

	String project_name;
	String type_of_building;
	String address;
	int total_fee;
	int total_amount_paid;
	int project_number;
	String deadline;
	
	public Poise_Projects(String project_name,String type_of_building,String address,int total_fee,int total_amount_paid,int project_number,String deadline) {
		
		this.project_name = project_name;
		this.type_of_building = type_of_building;
		this.address = address;
		this.total_fee = total_fee;
		this.total_amount_paid = total_amount_paid;
		this.project_number = project_number;
		this.deadline = deadline;
		}
		//Getters
		public String getProject_Name() {
			return project_name;
		}
		public String getType_Of_Building() {
			return type_of_building;
		}
		public String getAddress() {
			return address;
		}
		public String getDeadline() {
			return deadline;
		}
		public int getTotalAmountPaid() {
			return total_amount_paid;
		}
		public int getTotal_fee() {
			return total_fee;
		}
		public int getProjectNumber() {
			return project_number;
		}
		//Setters
		public void setProjectName(String project_name) {
			this.project_name = project_name;
		}
		public void setTypeOfBuilding(String type_of_building) {
			this.type_of_building = type_of_building;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}
		public void setTotalFee(int total_fee) {
			this.total_fee = total_fee;
		}
		public void setTotalAmountPaid(int total_amount_paid) { 
			this.total_amount_paid = total_amount_paid;
		}
		public void setProjectNumber(int project_number) {
			this.project_number = project_number;
		}
		
		public String toString() {
			return project_name +" "+ type_of_building + " " + address + " " + deadline + " " + total_amount_paid + " " +  total_fee + " " + project_number;
		}
	
	}



