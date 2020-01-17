package com.rakuten.hotelbooking.dao;

import java.util.List;

import com.rakuten.hotelbooking.entity.Hotel;

public interface HotelDao {
	List<Hotel> listHotel(String inp, String filter);
}
