package com.rakuten.hotelbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@OneToMany(mappedBy = "user")
	@JoinColumn(name = "user_email")
	private String userEmail;
	private String firstName;
	private String lastName;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
		return "User [userEmail=" + userEmail + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	/**
	 * @param userEmail
	 * @param firstName
	 * @param lastName
	 */
	public User(String userEmail, String firstName, String lastName) {
		this.userEmail = userEmail;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
