package com.rakuten.ticketprj.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int ticketId;
	
	@ManyToOne
	@JoinColumn(name = "raised_by_emp_id")
	private Employee emp;
	
	@Column(name = "raised_at")
	private Date date;
	
	@Column(name = "ticket_desc")
	private String ticketDesc;
	
	@ManyToOne
	@JoinColumn(name = "resolved_by")
	private Employee resolvedBy;
	
	@Column(name = "resolved_at")
	private Date resolvedDate;
	
	@Column(name = "resolved_desc")
	private String resolvedText;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTicketDesc() {
		return ticketDesc;
	}

	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}

	public Employee getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public String getResolvedText() {
		return resolvedText;
	}

	public void setResolvedText(String resolvedText) {
		this.resolvedText = resolvedText;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", emp=" + emp + ", date=" + date + ", ticketDesc=" + ticketDesc
				+ ", resolvedBy=" + resolvedBy + ", resolvedDate=" + resolvedDate + ", resolvedText=" + resolvedText
				+ "]";
	}

	/**
	 * @param ticketId
	 * @param emp
	 * @param date
	 * @param ticketDesc
	 * @param resolvedBy
	 * @param resolvedDate
	 * @param resolvedText
	 */
	public Ticket(int ticketId, Employee emp, Date date, String ticketDesc, Employee resolvedBy, Date resolvedDate,
			String resolvedText) {
		this.ticketId = ticketId;
		this.emp = emp;
		this.date = date;
		this.ticketDesc = ticketDesc;
		this.resolvedBy = resolvedBy;
		this.resolvedDate = resolvedDate;
		this.resolvedText = resolvedText;
	}

	/**
	 * 
	 */
	public Ticket() {
	}

	

}
