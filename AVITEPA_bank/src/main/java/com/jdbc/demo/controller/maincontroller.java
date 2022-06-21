package com.jdbc.demo.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.demo.model.amount;
import com.jdbc.demo.model.amounttransfer;
import com.jdbc.demo.model.individualreg;
import com.jdbc.demo.model.jointreg;
import com.jdbc.demo.model.loginmodel;
import com.jdbc.demo.service.service;

@RestController
public class maincontroller {

	@Autowired
	service service;
	
	Logger logger = LoggerFactory.getLogger(maincontroller.class);
//	============Home page====================
	
//	@RequestMapping("/" )
//	public String method1() {
//		logger.trace("Invoking the home page");
//		return "home.jsp";
//	}
	

	
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
	
	@ResponseBody
	@PostMapping("/register3")
	public String  current (@RequestBody jointreg reg ) 
	{
		logger.trace("Invoking the current  reister page");
		return service.method12(reg);		
	}
	
	

		//=====Fetch the user details==========
		@ResponseBody
		@GetMapping("/getuser/{accno}")
		public jointreg ftechuserdetailswinteintint(@PathVariable String accno) {
			return service.method13(accno);
		}
		
		
		//=====Fetch the users details==========
		@ResponseBody
		@GetMapping("/getusers")
		public List<jointreg> ftechuserdetailswinteintint() {
			return service.method14();
		}
		
		
		
		
//// =======About page===================
//	@RequestMapping("/About" )
//	public String about() {
//		return "About.jsp";
//	}


	
	// ===========fetch user personal  page===============
	@GetMapping("/personaldetails")
	public jointreg  personaldetails( @RequestBody  loginmodel login ) throws Exception {
		return service.landingpage(login);		
	}

	
	// ============= edit and update details==========
			@ResponseBody
			@PutMapping("/updatedetails")
			public jointreg  savedetails (@RequestBody jointreg reg) {
				return service.updatedetails(reg);
					
			}

	//========================== Deposit page ======================
			@PostMapping("/deposit")
			public String deposit(@RequestBody amount amount) {
				return service.depositamount(amount);
			}
			
//==========================check balance ======================
			@GetMapping("/balance/{accno}")
			public String balancecheck(@PathVariable String accno) {
				return service.balancecheck(accno);
			}
		
//   ==================Transfer amount===================			
			
			@PostMapping("/transferamount")
			public String transfer(@RequestBody amounttransfer transfer) throws Exception {
				return service.transfer(transfer);
				
			}

//	=============== Delete customer account ==============
			@DeleteMapping("/deleteuser/{accno}")
			public String  deletedetails (@PathVariable String  accno) {
				return service.deletedetails(accno);
					
			}
			
//			=============== Delete all customer account ==============
					@DeleteMapping("/deleteall")
					public String  deleteall () {
						return service.deleteall();
							
					}	
			
					
					
					
//			//editreesult page
//			@GetMapping("/editpage")
//			public ModelAndView  editpage() {
//				String accno =editform.getAccno();
//				String pass = editform.getPass();
//				return service.editpage(accno,pass);
//
//				}
			
//=============== Home page ===========================
//			
//			@PostMapping("/home" )
//			public ModelAndView home() {
//				String saccno = editform.getAccno();
//				return service.homepage(saccno);
//				
//			}
//			
//			@ExceptionHandler(IllegalArgumentException.class)
//			public String demo() {
//				return "nouserfound.jsp";
//			}

//// =============Login page==================
//
//	@GetMapping("/login" )
//	public String login(Model model) {
////		model.addAttribute("mode",new loginmodel());
//		return "login.jsp";
//	}
	
//===============Contact p[age====================
	
//	@RequestMapping("/contact" )
//	public String contact() {
//		return "contact.jsp";
//	}
}
