/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author bharath
 *
 */
public class Mobile extends Product {
	private String connectivity;

	/**
	 * 
	 */
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param connectivity
	 */
	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}


	/**
	 * @return the connectivity
	 */
	public String getConnectivity() {
		return connectivity;
	}

	/**
	 * @param connectivity the connectivity to set
	 */
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	@Override
	public boolean isExpensive() {
		if("3G".equals(connectivity) && getPrice() > 500) {
			return true;
		}
		else if ("4G".equals(connectivity) && getPrice() > 15000) {
			return true;
		}
		return false;
	}
	
}
