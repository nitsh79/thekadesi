package com.theka.model;

import java.sql.Time;
import java.util.Date;

public class LunchBooking {
	private Date bookingDdate;
	private String emailId;
	private int phoneNo;
	private String deliveryLocation;
	private int noofTiffin;
	private String deliveryTime;
	//below two are extracted fields from delivery time 
	private Date expectedDeliveryDate;
	private Time excpectedDeliveryTime;
	
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public Date getBookingDdate() {
		return bookingDdate;
	}
	public void setBookingDdate(Date bookingDdate) {
		this.bookingDdate = bookingDdate;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public int getNoofTiffin() {
		return noofTiffin;
	}
	public void setNoofTiffin(int noofTiffin) {
		this.noofTiffin = noofTiffin;
	}
	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public Time getExcpectedDeliveryTime() {
		return excpectedDeliveryTime;
	}
	public void setExcpectedDeliveryTime(Time excpectedDeliveryTime) {
		this.excpectedDeliveryTime = excpectedDeliveryTime;
	}
	
	
	
	
	
	
	

}
