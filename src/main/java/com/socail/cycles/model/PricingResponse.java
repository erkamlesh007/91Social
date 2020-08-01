package com.socail.cycles.model;

import java.io.Serializable;

public class PricingResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private int cycleCount=0;
	private double price ;
	public int getCycleCount() {
		return cycleCount;
	}
	public void setCycleCount(int cycleCount) {
		this.cycleCount = cycleCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
