package week5.friday.bank.account;

import java.io.Serializable;

import javax.naming.InvalidNameException;

import week5.friday.bank.exception.AgeException;
import week5.friday.bank.util.MessageUtil;

public class Person implements Serializable {
	private static final long serialVersionUID = 3735072141726972112L;
	private static final String NAME_PATTERN = "[A-Z][a-zA-Z]{2,15}$";
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws InvalidNameException {
		if (validateName(firstName)) {
			this.firstName = firstName;
		} else {
			throw new InvalidNameException("Invalid name: " + firstName);
		}
	}

	public boolean validateName(String name) throws InvalidNameException {
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		if (name.matches(NAME_PATTERN)) {
			return true;
		} else {
			if (name.length() < 3 || name.length() > 15) {
				throw new InvalidNameException(MessageUtil.INVALID_NAME_LENGHT);
			}
			if (name.matches(".*\\d+.*")) {
				throw new InvalidNameException();
			}
			throw new InvalidNameException(MessageUtil.INVALID_NAME + name);
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws InvalidNameException {
		if (validateName(lastName)) {
			this.lastName = lastName;
		} else {
			throw new IllegalArgumentException(MessageUtil.INVALID_NAME
					+ lastName);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException(MessageUtil.INVALID_AGE);
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

}
