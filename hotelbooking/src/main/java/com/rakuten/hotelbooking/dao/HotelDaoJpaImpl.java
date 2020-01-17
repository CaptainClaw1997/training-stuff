package com.rakuten.hotelbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.hotelbooking.entity.Hotel;

@Repository
public class HotelDaoJpaImpl implements HotelDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Hotel> listHotel(String inp, String filter) {

		String hotelFilter = "";
		if (filter.equalsIgnoreCase("name")) {
			hotelFilter = "h.name";
		}
		else if (filter.equalsIgnoreCase("hotel id")) {
			hotelFilter = "h.hotelId";
		}
		else if (filter.equalsIgnoreCase("location")) {
			hotelFilter = "h.location";
		}
		else if (filter.equalsIgnoreCase("country")) {
			hotelFilter = "h.country";
		}
		else {
			System.out.println("Invalid Filter! Showing all Hotels!");
			String jpql = "from Hotel";
			TypedQuery<Hotel> queryEmpty = em.createQuery(jpql, Hotel.class);
			return queryEmpty.getResultList();
		}
		
		Query query = em.createQuery("select h from hotel h where " + hotelFilter + " = ?2");

		query.setParameter(2, inp);

		List<Hotel> result = (List<Hotel>) query.getResultList();

		return result;
	}

}
