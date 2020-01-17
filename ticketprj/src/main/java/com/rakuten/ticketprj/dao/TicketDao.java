package com.rakuten.ticketprj.dao;

import java.util.List;

import com.rakuten.ticketprj.entity.Employee;
import com.rakuten.ticketprj.entity.Ticket;

public interface TicketDao {
	void raiseTicket(Ticket t);
	void resolveTicket(int ticketId, Employee resolvedBy, String resolvedText);
	List<Ticket> getOpenTickets();
}
