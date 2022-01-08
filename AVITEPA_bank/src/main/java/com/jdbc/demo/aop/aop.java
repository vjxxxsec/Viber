package com.jdbc.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect

public class aop {

	@Before( value =  "execution(* maincontroller.about(..))")
	public void p1() {
		System.out.println("user called about page ");
	}
	
	@After( value =  "execution(* maincontroller.about(..))")
	public void p2() {
		System.out.println("user in about page  ");
	}
}
