package ca.sheridancollege.beans;

import java.io.Serializable;

public class Person implements Serializable {

	private String firstName;
	private String lastName;
	private String email;
	private String[] color;
	private int age;
	private String[] skill;
	
	
	public Person(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}	
		
	public Person(String firstName, String lastName, String email, String[] color, int age, String[] skill) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.color = color;
		this.age = age;
		this.skill = skill;
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

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String[] getColor() {
		return color;
	}
	
	public void setColor(String[] color) {
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String[] getSkill() {
		return skill;
	}
	public void setSkill(String[] skill) {
		this.skill = skill;
	}
	
		
}
