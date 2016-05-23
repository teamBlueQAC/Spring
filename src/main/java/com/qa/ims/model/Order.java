package com.qa.ims.model;

import java.util.Date;

public class Order {
	
	private long id;
	private double total;
	private Date date;
	private Date dispatchDate;
	//private OrderStatus orderStatus;
	
	public Order(){
		
	}
	
	public Order(long id, double total, Date date, Date dispatchDate){
		this.id = id;
		this.total = total;
		this.date = date;
		this.dispatchDate = dispatchDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	
	

}
