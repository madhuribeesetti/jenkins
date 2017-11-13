package com.Bean;

public class CustomerDetails 
{
	int custid;
	String cname;
	String atype;
	float amount;
	String date;
	
	public CustomerDetails() {
		super();
		this.custid = custid;
		this.cname = cname;
		this.atype = atype;
		this.amount = amount;
		this.date = date;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
