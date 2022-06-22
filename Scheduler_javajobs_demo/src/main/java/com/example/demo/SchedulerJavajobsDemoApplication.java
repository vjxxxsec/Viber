package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;

@SpringBootApplication
public class SchedulerJavajobsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerJavajobsDemoApplication.class, args);
	}
	
	
	@Configuration
	@EnableScheduling
	@EnableSchedulerLock(defaultLockAtMostFor = "15m")
	@ConditionalOnProperty(name = "scheduling.enabled" , matchIfMissing = true)
	class schedulerconfiguration{
		
	}
	
	
//	@Bean
//    public LockProvider lockProvider(DataSource dataSource) {
//        return new JdbcTemplateLockProvider(dataSource);
//    }

}
