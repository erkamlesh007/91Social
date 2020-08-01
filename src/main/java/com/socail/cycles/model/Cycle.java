package com.socail.cycles.model;

import java.io.Serializable;

public class Cycle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private double basePrice = 1000;
	private double framePrice = 100;
	private double handleBarWithBrakesPrice = 100;
	private double seatingPrice = 100;
	private double wheelsPrice = 100;
	private double chaianAsemblyPrice = 100;
	private String date;

	public Cycle(double basePrice, double framePrice, double handleBarWithBrakesPrice, double seatingPrice,
			double wheelsPrice, double chaianAsemblyPrice, String date) {
		super();
		this.basePrice = basePrice;
		this.framePrice = framePrice;
		this.handleBarWithBrakesPrice = handleBarWithBrakesPrice;
		this.seatingPrice = seatingPrice;
		this.wheelsPrice = wheelsPrice;
		this.chaianAsemblyPrice = chaianAsemblyPrice;
		this.date = date;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getFramePrice() {
		return framePrice;
	}

	public void setFramePrice(double framePrice) {
		this.framePrice = framePrice;
	}

	public double getHandleBarWithBrakesPrice() {
		return handleBarWithBrakesPrice;
	}

	public void setHandleBarWithBrakesPrice(double handleBarWithBrakesPrice) {
		this.handleBarWithBrakesPrice = handleBarWithBrakesPrice;
	}

	public double getSeatingPrice() {
		return seatingPrice;
	}

	public void setSeatingPrice(double seatingPrice) {
		this.seatingPrice = seatingPrice;
	}

	public double getWheelsPrice() {
		return wheelsPrice;
	}

	public void setWheelsPrice(double wheelsPrice) {
		this.wheelsPrice = wheelsPrice;
	}

	public double getChaianAsemblyPrice() {
		return chaianAsemblyPrice;
	}

	public void setChaianAsemblyPrice(double chaianAsemblyPrice) {
		this.chaianAsemblyPrice = chaianAsemblyPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Cycle [basePrice=" + basePrice + ", framePrice=" + framePrice + ", handleBarWithBrakesPrice="
				+ handleBarWithBrakesPrice + ", seatingPrice=" + seatingPrice + ", wheelsPrice=" + wheelsPrice
				+ ", chaianAsemblyPrice=" + chaianAsemblyPrice + ", date=" + date + "]";
	}

}
