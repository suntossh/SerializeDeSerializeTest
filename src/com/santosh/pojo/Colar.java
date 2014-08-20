package com.santosh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Colar implements Serializable{
	private int sizeOfColor;
	public int getSizeOfColor() {
		return sizeOfColor;
	}

	public void setSizeOfColor(int sizeOfColor) {
		this.sizeOfColor = sizeOfColor;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	private Date dateOfPurchase;

	public Colar(int sizeOfColor, Date dateOfPurchase) {
		super();
		this.sizeOfColor = sizeOfColor;
		this.dateOfPurchase = dateOfPurchase;
	}

	@Override
	public String toString() {
		return "Colar [sizeOfColor=" + sizeOfColor + ", dateOfPurchase="
				+ dateOfPurchase + "]";
	}
	
	
}
