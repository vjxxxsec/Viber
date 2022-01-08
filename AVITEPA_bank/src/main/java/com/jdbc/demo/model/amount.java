package com.jdbc.demo.model;

public class amount {
	
	private String accno;
	private int amount ;
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "amount [accno=" + accno + ", amount=" + amount + "]";
	}
	
	
	

}
