package com.jdbc.demo;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jdbc.demo.services.service;

@Controller
public class controller {
	@Autowired
	service service;
	
	 @RequestMapping("/")
		public String   method2(  ) {
			return "Home.jsp";
		}
	 
   @PostMapping("/upload")
	public String    method( @RequestParam("file")  MultipartFile file  ) {
		return service.method01(file);
	}
}
