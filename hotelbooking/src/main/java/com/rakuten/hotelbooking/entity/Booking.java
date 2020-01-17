package com.rakuten.hotelbooking.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Booking")
public class Booking {
	
	@Id
	@Column(name = "booking_id")
	private int bookingId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel")
	private Hotel hotel;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user")
	private User user;
	
	@Column(name = "check_in_date")
	@Temporal(TemporalType.DATE)
	private Date checkInDate;
	
	@Column(name = "check_out_date")
	@Temporal(TemporalType.DATE)
	private Date checkOutDate;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotel=" + hotel + ", user=" + user + "]";
	}
	
	
}
