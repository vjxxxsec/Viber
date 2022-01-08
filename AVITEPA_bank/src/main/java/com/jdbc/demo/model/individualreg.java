package com.jdbc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class individualreg {
	private Integer key;
	@Id
	private String accno;
	private String name;
	private String age;
	private String address;
	private long aadhaar;
	private long mobno;
	private String password;
	private String repass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAge() {
		return age;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "individualreg [name=" + name + ", age=" + age + ", address=" + address + ", aadhaar=" + aadhaar
				+ ", mobno=" + mobno + ", password=" + password + ", repass=" + repass + "]";
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	
}
