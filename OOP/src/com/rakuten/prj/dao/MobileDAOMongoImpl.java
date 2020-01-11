package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

public class MobileDAOMongoImpl implements MobileDAO {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored in MongoDB");

	}

}
