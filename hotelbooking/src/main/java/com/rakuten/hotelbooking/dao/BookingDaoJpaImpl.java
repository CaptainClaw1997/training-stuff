package com.rakuten.hotelbooking.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.rakuten.hotelbooking.entity.Booking;
import com.rakuten.hotelbooking.entity.Hotel;

@Repository
public class BookingDaoJpaImpl implements BookingDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void book(Booking b) {
		em.persist(b);
	}

	@Override
	public List<Booking> listBooking(Date checkInDate, Date checkOutDate) {
		Query query = em.createQuery("select b from Booking b where b.checkInDate = ?1 and b.checkOutDate = ?2");
		query.setParameter(1, checkInDate);
		query.setParameter(2, checkOutDate);
		
		List<Booking> result = (List<Booking>)query.getResultList();
		
		return result;
	}


}
