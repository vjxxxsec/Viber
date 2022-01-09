package com.jdbc.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.demo.model.individualreg;
import com.jdbc.demo.model.jointreg;
import com.jdbc.demo.model.loginmodel;
import com.jdbc.demo.service.service;

@Controller
public class maincontroller {

	@Autowired
	service service;
	
	Logger logger = LoggerFactory.getLogger(maincontroller.class);
//	============Home page====================
	
	@RequestMapping("/" )
	public String method1() {
		logger.trace("Invoking the home page");
		return "home.jsp";
	}
	

	
// =======================Registration page===============
	
//	@RequestMapping("/register" )
//	public String register() {
//		return "register.jsp";
//	 }
//	
	// ============individual account=================
//	@ResponseBody
//	@PostMapping("/individual")
//	public String  individualacc( @RequestBody individualreg indacc ) {
//		return service.method11(indacc);
//	}
	
	// =============joint account==========
	@ResponseBody
	@PostMapping("/register")
	public String  individual ( @RequestBody jointreg reg ) 
	{
		logger.trace("Invoking the individual register page");
		return service.method12(reg);	
	}
	
	
	@ResponseBody
	@PostMapping("/register2")
	public String  joint (@RequestBody jointreg reg ) 
	{
		logger.trace("Invoking the joint  reister page");
		return service.method12(reg);		
	}
	 
	
	// =============savepersonal details==========
		@ResponseBody
		@PostMapping("/savepersonaldetails")
		public ModelAndView  savedetails (@RequestBody jointreg reg) {
			return service.updatedetails(reg);
				
		}

		
// =======About page===================
	@RequestMapping("/About" )
	public String about() {
		return "About.jsp";
	}

//=====Fetch the user details==========
	@ResponseBody
	@GetMapping("/getuser/{accno}")
	public individualreg ftechuserdetailswinteintint(@PathVariable String accno) {
		return service.method13(accno);
	}
	
	// ===========personaldetails page===============
	
	loginmodel editform = new loginmodel();
	@GetMapping("/personaldetails")
	public ModelAndView  personaldetails( @RequestBody  loginmodel login ) {
			return service.landingpage(login);		
	}

	//editreesult page
	@GetMapping("/editpage")
	public ModelAndView  editpage() {
		String accno =editform.getAccno();
		String pass = editform.getPass();
		return service.editpage(accno,pass);

		}
	
	//========================== Deposit page ======================
			@PostMapping("/deposit")
			public ModelAndView deposit(@RequestParam("amount") int amount) {
				 String accno = editform.getAccno();
				return service.depositamount(accno,amount);
			}
			
//   ==================Transfer amount===================			
			
			@PostMapping("/transfer")
			public ModelAndView transfer(@RequestParam("raccno") String raccno , @RequestParam("samount") int amount) {
				String saccno = editform.getAccno();
				return service.transfer(saccno,raccno,amount);
				
			}
			
			
//=============== Home page ===========================
			
			@PostMapping("/home" )
			public ModelAndView home() {
				String saccno = editform.getAccno();
				return service.homepage(saccno);
				
			}
			
			@ExceptionHandler(IllegalArgumentException.class)
			public String demo() {
				return "nouserfound.jsp";
			}

// =============Login page==================

	@GetMapping("/login" )
	public String login(Model model) {
//		model.addAttribute("mode",new loginmodel());
		return "login.jsp";
	}
	
//===============Contact p[age====================
	
	@RequestMapping("/contact" )
	public String contact() {
		return "contact.jsp";
	}
}
