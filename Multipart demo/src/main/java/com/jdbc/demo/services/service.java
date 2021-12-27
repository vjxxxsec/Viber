package com.jdbc.demo.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class service {
	
	private static String pathname ="C:\\Users\\EV20182308\\uploaded_";

	public String    method01(MultipartFile file) {
		String s = null;
		try {
			byte[] data = file.getBytes();
			Path path = Paths.get( pathname + file.getOriginalFilename());
			Files.write(path,data);
			s="success.jsp";
		}
		catch (IOException e) {
			e.printStackTrace();
			s="error.jsp";
		}
		return s;
	}
	
}
