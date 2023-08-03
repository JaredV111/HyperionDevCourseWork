package working;

import java.util.Comparator;

public class Task12Comparator implements Comparator<Course> {

	@Override
	public int compare(Course course1,Course course2) {
		return course1.getNumberOfStudents() - course2.getNumberOfStudents();
	}

}
