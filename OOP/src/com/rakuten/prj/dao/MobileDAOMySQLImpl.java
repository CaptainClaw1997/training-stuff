/**
 * 
 */
package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

/**
 * @author bharath
 *
 */
public class MobileDAOMySQLImpl implements MobileDAO {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored in MySQL!!!");

	}

}
