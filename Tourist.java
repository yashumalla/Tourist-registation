package com.springboot.TRA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Tourist_Details")


public class Tourist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
    @Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column
	private String gender;
	
	@Column
	private int age;
	
	@Column
	private String fromPlace;
	
	@Column
	private int numberOfDaysVisits;
	
	public Tourist() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public int getNumberOfDaysVisits() {
		return numberOfDaysVisits;
	}

	public void setNumberOfDaysVisits(int numberOfDaysVisits) {
		this.numberOfDaysVisits = numberOfDaysVisits;
	}

	public Tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfDaysVisits) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfDaysVisits = numberOfDaysVisits;
	}

	

	

	

}
