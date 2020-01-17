package com.rakuten.hotelbooking.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.hotelbooking.cfg.AppConfig;
import com.rakuten.hotelbooking.dao.BookingDaoJpaImpl;
import com.rakuten.hotelbooking.dao.HotelDaoJpaImpl;
import com.rakuten.hotelbooking.service.AppService;

public class ListingBookings {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppService.class);
		ctx.register(HotelDaoJpaImpl.class);
		ctx.register(BookingDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		AppService as = ctx.getBean("appService", AppService.class);
	}
}
