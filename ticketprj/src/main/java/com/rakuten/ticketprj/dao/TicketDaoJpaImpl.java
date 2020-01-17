package com.rakuten.ticketprj.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.ticketprj.entity.Employee;
import com.rakuten.ticketprj.entity.Ticket;

@Repository
public class TicketDaoJpaImpl implements TicketDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void raiseTicket(Ticket t) {
		em.persist(t);
	}

	@Override
	public void resolveTicket(int ticketId, Employee resolvedBy, String resolvedText) {
		Ticket ticket = em.find(Ticket.class, ticketId);
		ticket.setResolvedBy(resolvedBy);
		ticket.setResolvedText(resolvedText);
	
		//Calendar cal = Calendar.getInstance();
		ticket.setResolvedDate(new Date()); // Resolving Date and Time.
		
	}

	@Override
	public List<Ticket> getOpenTickets() {
		String jpql = "from Ticket where resolvedBy is NULL";
		TypedQuery<Ticket> query = em.createQuery(jpql, Ticket.class);
		return query.getResultList();
	}
	
}
