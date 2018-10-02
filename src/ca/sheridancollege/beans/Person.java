package ca.sheridancollege.beans;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

	
//	private String firstName;
//	private String lastName;
	private String email;
	private String color;
	private String age;
	private String[] skills;
	
	
//	public Person(String firstName, String lastName, String email) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//	}	
		
	public Person(String email, String color, String age, String[] skills) {
		super();
		
		this.email = email;
		this.color = color;
		this.age = age;
		this.skills = skills;
	}	
	
//	public String getFirstName() {
//		return firstName;
//	}
//	
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	
//	public String getLastName() {
//		return lastName;
//	}
//	
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String[] getSkill() {
		return skills;
	}
	public void setSkill(String[] skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Person [email=" + email + ", color=" + color
				+ ", age=" + age + ", skills=" + Arrays.toString(skills) + "]";
	}
		
}
