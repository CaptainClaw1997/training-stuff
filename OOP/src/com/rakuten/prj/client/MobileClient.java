package com.rakuten.prj.client;

import com.rakuten.prj.dao.MobileDAO;
import com.rakuten.prj.dao.MobileDAOMongoImpl;
import com.rakuten.prj.entity.Mobile;

public class MobileClient {

		public static void main(String[] args) {
			Mobile m = new Mobile();
			MobileDAO mobileDAO = new MobileDAOMongoImpl();
			mobileDAO.addMobile(m);
		}
}
