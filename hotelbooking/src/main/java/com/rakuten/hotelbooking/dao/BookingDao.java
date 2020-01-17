package com.rakuten.hotelbooking.dao;

import java.util.Date;
import java.util.List;

import com.rakuten.hotelbooking.entity.Booking;

public interface BookingDao {
	void book(Booking b);
	List<Booking> listBooking(Date checkInDate, Date checkOutDate);
	
}
