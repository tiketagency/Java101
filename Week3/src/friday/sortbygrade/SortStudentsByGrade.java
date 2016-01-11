package friday.sortbygrade;

public class SortStudentsByGrade {
	public static void main(String[] args) {
		Student student1 = new Student("Gosho", 1);
		student1.setGrades(2, 3, 4, 5, 6);
		Student student2 = new Student("Pesho", 2);
		student2.setGrades(2, 4, 5, 6, 5);
		Student student3 = new Student("Penka", 3);
		student3.setGrades(2, 3, 4, 5, 6, 5, 5, 5);
		Student student4 = new Student("Anka", 4);
		student4.setGrades(2, 3, 4, 5, 6, 5, 5, 5);
		Diary diary = new Diary();
		diary.addStudent(student1);
		diary.addStudent(student2);
		diary.addStudent(student3);
		diary.addStudent(student4);
		diary.sortByGrade();
		for (Student string : diary.getStudent()) {
			System.out.println(string);
		}
	}
}
