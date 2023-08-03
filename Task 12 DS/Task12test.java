package working;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12test {
	public static void main(String[]args) {
	
	List<Course> listCourse = new ArrayList<Course>();
	
	listCourse.add(new Course("Java",100,"Prof Williams"));
	listCourse.add(new Course("Intro To Programming",105,"Dr White"));
	listCourse.add(new Course("Mathematics",70,"Dr Van Blerk"));
	listCourse.add(new Course("Afrikaans",50,"Prof Lewis"));
	listCourse.add(new Course("English",80,"Prof Ebrahim"));
	
	System.out.println("before sorting: " + listCourse);
	
	Collections.sort(listCourse, new Task12Comparator());
	
	System.out.println("after sorting: " + listCourse);
	
	Collections.swap(listCourse, 0, 1);
	
	System.out.println("after swap: "+ listCourse);
	
	List<Course> listCourse2 = new ArrayList<Course>();
	
	listCourse2.add(new Course("Geography",100,"Prof Fredrick"));
	listCourse2.add(new Course("Natural Science",200,"Prof Rodgers"));
	listCourse2.add(new Course("Social Science",150,"Prof Woof"));
	listCourse2.add(new Course("Technology",80,"Prof Bardey"));
	listCourse2.add(new Course("Business",50,"Prof Coetzee"));
	
	listCourse2.addAll(listCourse2);
	System.out.println("Second Arraylist: "+ listCourse2);
	
	
	listCourse2.addAll(listCourse);
	System.out.println("Adding in listCourse to listCourse2: "+ listCourse2);
	
	listCourse2.add(new Course("Java 101",55,"Dr,P Green"));
	listCourse2.add(new Course("Advanced Programming",93,"Prof.M Milton"));
	
	System.out.println(listCourse2);
	
	int index = Collections.binarySearch(listCourse2,"Java 101");
	System.out.println("index of Java 101: index");
	
	boolean disjoint(ListCourse,ListCourse2);
	
	}
}
