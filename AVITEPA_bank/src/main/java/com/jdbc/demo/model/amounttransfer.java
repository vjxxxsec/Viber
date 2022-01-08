package com.jdbc.demo.model;

public class amounttransfer {
	
	private String saccno;
	private String raccno;
	private int amount ;
	public String getSaccno() {
		return saccno;
	}
	public void setSaccno(String saccno) {
		this.saccno = saccno;
	}
	public String getRaccno() {
		return raccno;
	}
	public void setRaccno(String raccno) {
		this.raccno = raccno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "amounttransfer [saccno=" + saccno + ", raccno=" + raccno + ", amount=" + amount + "]";
	}
	
	
}
