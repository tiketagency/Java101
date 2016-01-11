package friday.sortbygrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Diary {
	private List<Student> students;

	public Diary() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudent() {
		return students;
	}

	public void sortByGrade() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int compare = (int) (o1.getSum() > o2.getSum() ? -1 : o1
						.getSum() < o2.getSum() ? 1 : 0);
				if (compare == 0) {
					compare = o1.getFirstName().compareTo(o2.getFirstName());
				}
				return compare;
			}
		});
	}
}
