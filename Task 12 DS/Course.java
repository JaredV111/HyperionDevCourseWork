package working;

public class Course {
	
	 public String courseName;
	 public int numberOfStudents;
	 public String courseLecturer;
	
	 public Course(String courseName,int numberOfStudents,String courseLecturer) {
		 this.courseName = courseName;
		 this.numberOfStudents = numberOfStudents;
		 this.courseLecturer = courseLecturer;
	 }
	 //Getters
	 public String getCourseName() {
		 return courseName;
	
	 }
	public int getNumberOfStudents() {
		return numberOfStudents;
	 }
	public String getCourseLecturer() {
		return courseLecturer;
	}
	//Setters
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	
	}
	public void setCourseLecturer(String courseLecturer) {
		this.courseLecturer = courseLecturer;
	}
	public String toString() {
		return courseName + " " + courseLecturer + " " + numberOfStudents ;
	}
	
	
	 
	 
	 
}
