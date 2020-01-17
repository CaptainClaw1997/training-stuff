package com.rakuten.ticketprj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.ticketprj.cfg.AppConfig;
import com.rakuten.ticketprj.dao.EmployeeDaoJpaImpl;
import com.rakuten.ticketprj.dao.TicketDaoJpaImpl;
import com.rakuten.ticketprj.service.TicketService;

public class EmployeeClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// new ClassPathXMLApplicationContext("beans.xml");
		ctx.register(TicketService.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.register(EmployeeDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		TicketService ts = ctx.getBean("ticketService", TicketService.class);
		/*
		 * Employee[] emps = new Employee[3]; emps[0] = new Employee(0,
		 * "abc@rvce.edu.in", "First Name", "Last Name"); emps[1] = new Employee(0,
		 * "def@rvce.edu.in", "First Name", "Last Name"); emps[2] = new Employee(0,
		 * "ghi@rvce.edu.in", "First Name", "Last Name");
		 * 
		 * for (Employee employee : emps) { ts.addEmployee(employee); }
		 */

		ts.showEmployees();

		System.out.println("First employee on the list:");
		System.out.println(ts.findEmployee(1));
	}
}
