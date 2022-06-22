package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import net.javacrumbs.shedlock.core.SchedulerLock;

@RestController
public class scheduletester {
	
	
//	@Scheduled(fixedDelay =  3000)
//	@SchedulerLock(name = "firstlock" )
//	, lockAtLeastFor = "5s" ,lockAtMostFor = "15s"
	
	
	@Scheduled(cron = "0 1 0 * * *")
	public void method1() {
		method2();
	}

	
	public void method2() {
		System.out.println("Heloo vijay from job 1"); 
	}
	
}
