package com.jdbc.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class jointreg {
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
	private String Acctype;
	
	private int  amount = 0;
	
	private String accholdname;
	@Column(name = "Jointeraccno")
	private String accnum;
	@Column(name = "Joiterrelation")
	private String relation;
	@Column(name = "jointerage")
	private Integer age2;
	@Column(name = "Jointermonno")
	private long mobnum;
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	
	public String getAcctype() {
		return Acctype;
	}
	public void setAcctype(String acctype) {
		Acctype = acctype;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
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
	public String getAccholdname() {
		return accholdname;
	}
	public void setAccholdname(String accholdname) {
		this.accholdname = accholdname;
	}
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accno) {
		accnum = accno;
	}
	public String getRelation() {
		return relation;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Integer getAge2() {
		return age2;
	}

	
	@Override
	public String toString() {
		return "jointreg [key=" + key + ", accno=" + accno + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", aadhaar=" + aadhaar + ", mobno=" + mobno + ", password=" + password + ", repass=" + repass
				+ ", Acctype=" + Acctype + ", amount=" + amount + ", accholdname=" + accholdname + ", accnum=" + accnum
				+ ", relation=" + relation + ", age2=" + age2 + ", mobnum=" + mobnum + "]";
	}
	public void setAge2(Integer age) {
		age2 = age;
	}
	public long getMobnum() {
		return mobnum;
	}
	public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	}


	
	
	
}
