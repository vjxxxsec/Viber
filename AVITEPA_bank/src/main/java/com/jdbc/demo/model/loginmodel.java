package com.jdbc.demo.model;

public class loginmodel {
	
	private String accno;
	private String pass;
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "loginmodel [accno=" + accno + ", pass=" + pass + "]";
	}
	

}
