package com.rakuten.ticketprj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.ticketprj.cfg.AppConfig;
import com.rakuten.ticketprj.dao.EmployeeDaoJpaImpl;
import com.rakuten.ticketprj.dao.TicketDaoJpaImpl;
import com.rakuten.ticketprj.service.TicketService;

public class TicketClient {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    // new ClassPathXMLApplicationContext("beans.xml");
		ctx.register(TicketService.class);
	    ctx.register(TicketDaoJpaImpl.class);
	    ctx.register(EmployeeDaoJpaImpl.class);
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    
	    TicketService ts = ctx.getBean("ticketService", TicketService.class);
	    
	    
	    //ts.raiseTicket(ts.findEmployee(1), "Randomly reboots lol");
	    //System.out.println(ts.showOpenTickets());
	    
	    //ts.resolveTicket(1, ts.findEmployee(1), "Update your machine lol");
	    
	    System.out.println(ts.showOpenTickets());
	}	
}
	
