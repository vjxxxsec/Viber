package com.jdbc.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.demo.model.amount;
import com.jdbc.demo.model.amounttransfer;
import com.jdbc.demo.model.individualreg;
import com.jdbc.demo.model.jointreg;
import com.jdbc.demo.model.loginmodel;
import com.jdbc.demo.repo.indiaccountrepo;
import com.jdbc.demo.repo.jointaccrepo;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class service {
	@Autowired
	indiaccountrepo repo;
	@Autowired
	jointaccrepo repo2;
	
	int k=1;
	int j=1;
	
//	public String method11(individualreg reg) {
//		long key1 = reg.getAadhaar();
//		String key2= reg.getName();
//		int l = key2.length();
//		String key3= String.valueOf(key2.charAt(0))+ String.valueOf(key2.charAt(l-1))
//		+ String.valueOf(key1);
//		reg.setKey(k);
//		reg.setAccno(key3);
//		repo.save(reg);-
//		k+=1;
//		return("item added into the table");
//	}
	
	
	public String  method12(jointreg reg2) {
		long key1 = reg2.getAadhaar();
		String key2= reg2.getName();
		int l = key2.length();
		String key3= String.valueOf(key2.charAt(0))+ String.valueOf(key2.charAt(l-1))
		+ String.valueOf(key1);
		reg2.setKey(j);
		reg2.setAccno(key3);
		repo2.save(reg2);
		String type = reg2.getAcctype();
		j+=1;
		return  type + " account created with account number " + key3 ;
	}
	
	
	public jointreg  method13(String accno) {
		return repo2.findById(accno).get();
		}
	
	public List<jointreg>  method14( ) {
		return repo2.findAll();
		}
	
	
	
	public jointreg  landingpage(loginmodel login) throws Exception{
		jointreg obj2 = repo2.findById(login.getAccno()).get();	
			 if( obj2.getPassword().equals(login.getPass())) {
					return obj2;
				}
			 
			 else {
					throw new Exception("password is wrong or acount holder not found");
				}	
			}
	
	
	
	
	public ModelAndView editpage(String accno,String pass){
		ModelAndView mv1 = new ModelAndView();
		String password =repo2.findById(accno).get().getPassword();
		if(password.equals(pass)) {
			mv1.addObject( "obj",   repo2.findById(accno).get());

		}
		else {
			mv1.addObject("obj",null);

		}
		mv1.setViewName("detailsedit.jsp");
		return mv1;
		
	}
	
	public jointreg updatedetails(jointreg reg) {
		 jointreg obj = repo2.findById(reg.getAccno()).get();
		 obj.setAge(reg.getAge());
		 obj.setAddress(reg.getAddress());
		 obj.setMobno(reg.getMobno());
		 return repo2.save(obj);
		 
	}
	

	public String deletedetails(String  accno) {
		 jointreg obj = repo2.findById(accno).get();
		  repo2.delete(obj);
		  return "custopmer with accno "+ accno + " has been permanently deleted";  
		 
	}
	


	public String deleteall() {
		 
		  repo2.deleteAll();
		  return "Entire customer data deleted";  
		 
	}
	
	public String depositamount( amount amount2) {
		jointreg obj = repo2.findById(amount2.getAccno()).get();
		int  amt = repo2.findById(amount2.getAccno()).get().getAmount();
		int  amt2 = amt+amount2.getAmount();
		 obj.setAmount(amt2);
		repo2.save(obj);
		 return "Amount " + amt2 +" has been deposited in the account "+amount2.getAccno() ;
	}
	
	
	
	public String transfer (amounttransfer transfer) throws Exception {
		jointreg obj1 = repo2.findById(transfer.getSaccno()).get();
		jointreg obj2 = repo2.findById(transfer.getRaccno()).get();
		int amount4 = repo2.findById(transfer.getRaccno()).get().getAmount();
		int amount2 = repo2.findById(transfer.getSaccno()).get().getAmount();
		String s="";
		if(( Objects.isNull(obj2)) || transfer.getSaccno().equals(transfer.getRaccno())) {
			throw new Exception("No user found");
		}
		
		else {
			
			if(  amount2 >= transfer.getAmount()) {
				int amount3 = amount2-transfer.getAmount();
				obj1.setAmount(amount3);
				obj2.setAmount(amount4+transfer.getAmount());
				repo2.save(obj1);
				repo2.save(obj2);
				s="Amount" + transfer.getAmount() + " is transferred from " +
						transfer.getSaccno() +" to " + transfer.getRaccno();
			}
			else {
				s="Accountholder " + transfer.getSaccno() + "don't have enough money to transfer";	
				}
		}
		return s;
		
	}
	
	public ModelAndView homepage(String saccno) {
		jointreg obj1 = repo2.findById(saccno).get();
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",obj1);
		mv.setViewName("success.jsp");
		return mv;
	}
	
	public String  balancecheck(String accno) {
		 int balance = repo2.findById(accno).get().getAmount();
		return "Total balance is  " + balance;
	}
	
	
	
	
}
