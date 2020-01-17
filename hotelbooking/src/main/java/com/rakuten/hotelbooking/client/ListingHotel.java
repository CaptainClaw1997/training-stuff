package com.rakuten.hotelbooking.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.hotelbooking.cfg.AppConfig;
import com.rakuten.hotelbooking.dao.BookingDaoJpaImpl;
import com.rakuten.hotelbooking.dao.HotelDaoJpaImpl;
import com.rakuten.hotelbooking.entity.Hotel;
import com.rakuten.hotelbooking.service.AppService;

public class ListingHotel {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppService.class);
		ctx.register(HotelDaoJpaImpl.class);
		ctx.register(BookingDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		AppService as = ctx.getBean("appService", AppService.class);
		Hotel[] hotels = new Hotel[5];
		hotels[0] = new Hotel("Holiday Inn", "Manhattan, New York", "USA");
		hotels[1] = new Hotel("Marriott", "St. Marks Road, Bengaluru", "India");
		hotels[2] = new Hotel("Econa Inn", "Tilton, New Hampshire", "USA");
		hotels[3] = new Hotel("Taj", "Wilson Garden, Bengaluru", "India");
		hotels[4] = new Hotel("Hotel Park Inn", "Coimbatore", "India");
		hotels[5] = new Hotel("The Grand Hotel", "Manhattanm, New York", "USA");
	}
}
