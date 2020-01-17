package com.rakuten.hotelbooking.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.hotelbooking.dao.BookingDao;
import com.rakuten.hotelbooking.dao.HotelDao;
import com.rakuten.hotelbooking.entity.Booking;
import com.rakuten.hotelbooking.entity.Hotel;


@Service
@Transactional
public class AppService {
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private BookingDao bookingDao;
		
	public void insertBooking(Booking b) {
		bookingDao.book(b);
	}	
	
	public void showBookings(Date checkInDate, Date checkOutDate) {
		bookingDao.listBooking(checkInDate, checkOutDate);
	}
	
	public void showHotels(String inp, String filter) {
		List<Hotel> result = hotelDao.listHotel(inp, filter);
		
		for (Hotel hotel : result) {
			System.out.println(hotel);
		}
	}
}
