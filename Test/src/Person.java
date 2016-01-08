import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private Long Id;
	private List<Person> friends;

	public Person(String firstName, String lastName, Long id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Id = id;
		this.friends = new ArrayList<Person>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public List<Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}

	public void addFriends(Person person) {
		friends.add(person);
	}

	public static void main(String[] args) {

		Person person1 = new Person("Yana", "Stoyanova", 8467836767L);
		Person person2 = new Person("Boyko", "Lalov", 8467836767L);
		Person person3 = new Person("Gosho", "Stoyanov", 8467836767L);
		Person person4 = new Person("Pesho", "Stoyanov", 8467836767L);

		person1.addFriends(person2);
		person1.addFriends(person3);
		person1.addFriends(person4);
		System.out.println(person1.getFirstName() + " friends are: ");
		for (Person person : person1.getFriends()) {
			System.out.println(person);
		}
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", Id=" + Id + ", friends=" + friends
				+ "]";
	}

}
