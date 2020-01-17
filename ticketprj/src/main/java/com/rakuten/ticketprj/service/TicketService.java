package com.rakuten.ticketprj.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.ticketprj.dao.EmployeeDao;
import com.rakuten.ticketprj.dao.TicketDao;
import com.rakuten.ticketprj.entity.Employee;
import com.rakuten.ticketprj.entity.Ticket;

@Service
@Transactional
public class TicketService {
	
	@Autowired
	TicketDao ticketDao;
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public void addEmployee(Employee e) {
		employeeDao.addEmployee(e);
	}
	
	public Employee findEmployee(int empID) {
		Employee emp = employeeDao.findEmployee(empID);
		return emp;
	}
	public void showEmployees(){
		List<Employee> emps = employeeDao.showEmployees();
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}
	
	public void raiseTicket(Employee raisedBy, String ticketDesc) {
		Ticket t = new Ticket();
		Date today = new Date();
		
		t.setEmp(raisedBy);
		t.setTicketDesc(ticketDesc);
		t.setDate(today);
		ticketDao.raiseTicket(t);
	}
	
	public void resolveTicket(int ticketId, Employee resolvedBy, String resolvedText) {
		
		ticketDao.resolveTicket(ticketId, resolvedBy, resolvedText);
	}
	
	public List<Ticket> showOpenTickets() {
		return ticketDao.getOpenTickets();
	}
	
}
