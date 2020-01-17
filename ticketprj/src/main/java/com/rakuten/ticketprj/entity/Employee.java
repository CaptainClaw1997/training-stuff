package com.rakuten.ticketprj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String email, firstName, lastName;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

	/**
	 * @param empId
	 * @param email
	 * @param firstName
	 * @param lastName
	 */
	public Employee(int empId, String email, String firstName, String lastName) {
		this.empId = empId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
	 */
	public Employee() {
	}
	
	
}
