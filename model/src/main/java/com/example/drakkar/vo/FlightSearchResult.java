package com.example.drakkar.vo;

import java.io.Serializable;

import com.example.drakkar.model.Discount;
import com.example.drakkar.model.Flight;

public class FlightSearchResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private Flight inbound;
	private Flight outbound;
	private Discount discount = null;

	public FlightSearchResult(Flight inbound, Flight outbound) {
		this.inbound = inbound;
		this.outbound = outbound;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public FlightSearchResult() {

	}

	public Flight getInbound() {
		return inbound;
	}

	public void setInbound(Flight inbound) {
		this.inbound = inbound;
	}

	public Flight getOutbound() {
		return outbound;
	}

	public void setOutbound(Flight outbound) {
		this.outbound = outbound;
	}

	public Double getPrice() {
		double val = outbound != null ? outbound.getPrice() : .0D;
		val += inbound != null ? inbound.getPrice() : .0D;
		return val;
	}

	public boolean isDiscount() {
		return discount != null;
	}

	public Double getPriceWithOffer() {
		double val = getPrice();
		if (isDiscount()) {
			double percent = discount.getPercentage();
			val -= val * percent;
		}
		return val;
	}

}
