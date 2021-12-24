package com.jdbc.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.demo.model.individualreg;
import com.jdbc.demo.model.jointreg;
import com.jdbc.demo.model.loginmodel;
import com.jdbc.demo.repo.indiaccountrepo;
import com.jdbc.demo.repo.jointaccrepo;

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
//		repo.save(reg);
//		k+=1;
//		return("item added into the table");
//	}
	public ModelAndView method12(jointreg reg2) {
		long key1 = reg2.getAadhaar();
		String key2= reg2.getName();
		int l = key2.length();
		String key3= String.valueOf(key2.charAt(0))+ String.valueOf(key2.charAt(l-1))
		+ String.valueOf(key1);
		reg2.setKey(j);
		reg2.setAccno(key3);
		repo2.save(reg2);
		j+=1;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("acccreated.jsp");
		return mv;
	}
	
	public individualreg  method13(String accno) {
		return repo.findById(accno).get();
		}
	
	
	public ModelAndView landingpage(loginmodel login){
		ModelAndView mv = new ModelAndView();
		jointreg obj2 = repo2.findById(login.getAccno()).get();	
		
		if(Objects.isNull(obj2)) {
			mv.addObject("error","User not found ");
			mv.setViewName("login.jsp");
			}
		else {
			 if( obj2.getPassword().equals(login.getPass()) && obj2.getAcctype().equals("Individual")  ) {
					mv.addObject( "obj",obj2);
					mv.setViewName("success.jsp");
				}
			 else if( obj2.getPassword().equals(login.getPass()) && obj2.getAcctype().equals("joint")  ) {
					mv.addObject( "obj",obj2);
					mv.setViewName("success2.jsp");
				}
			 else {
					mv.addObject("error","Entered accno or pass is invalid");
					mv.setViewName("login.jsp");
				}	
		}
		return mv;	
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
	
	public ModelAndView updatedetails(jointreg reg) {
		 jointreg obj = repo2.findById(reg.getAccno()).get();
		 obj.setAge(reg.getAge());
		 obj.setAddress(reg.getAddress());
		 obj.setMobno(reg.getMobno());
		 repo2.save(obj);
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("obj", obj);
		 mv.setViewName("success.jsp");
		 return mv;
		 
	}
	
	public ModelAndView depositamount( String accno,  int amount) {
		jointreg obj = repo2.findById(accno).get();
		int  amt = repo2.findById(accno).get().getAmount();
		int  amt2 = amt+amount;
		 obj.setAmount(amt2);
		repo2.save(obj);
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("obj",obj);
//		 mv.addObject("amount",amount);
		 mv.setViewName("success.jsp");
		 return mv;
	}
	
	public ModelAndView transfer (String saccno,String raccno,int amount) {
		jointreg obj1 = repo2.findById(saccno).get();
		jointreg obj2 = repo2.findById(raccno).get();
		int amount4 = repo2.findById(raccno).get().getAmount();
		int amount2 = repo2.findById(saccno).get().getAmount();
		ModelAndView mv = new ModelAndView();
		
		if(( Objects.isNull(obj2)) || saccno.equals(raccno)) {
			mv.setViewName("nouserfound.jsp");
		}
		
		else {
			
			if(  amount2 >= amount) {
				int amount3 = amount2-amount;
				obj1.setAmount(amount3);
				obj2.setAmount(amount4+amount);
				repo2.save(obj1);
				repo2.save(obj2);
				mv.addObject("obj",obj1);
				mv.setViewName("success.jsp");
			}
			else {
				mv.addObject("amount",obj1);
				mv.setViewName("notenough.jsp");	
				}
		}
     
		return mv;
		
	}
	
	public ModelAndView homepage(String saccno) {
		jointreg obj1 = repo2.findById(saccno).get();
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",obj1);
		mv.setViewName("success.jsp");
		return mv;
	}
	
	
	
	
}
