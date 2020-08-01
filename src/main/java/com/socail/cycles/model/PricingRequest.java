package com.socail.cycles.model;

import java.io.Serializable;

public class PricingRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private int cycleCount = 0;
	private String date;

	public int getCycleCount() {
		return cycleCount;
	}

	public void setCycleCount(int cycleCount) {
		this.cycleCount = cycleCount;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
