package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	/**
	 * Traditional way to get data from view
	 * 
	 *  method to get data with httpservletrequest request object
	 * 
	 */
	/*
	  @RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleform(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		return "";
	}
	
	*/
	
	/**
	 *  Using @RequestParam
	 *  
	 *  getting data from view and sending it to new success.jsp view
	 */
/*	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleform(
	
		@RequestParam("email") String email,
		@RequestParam("username") String userName,
		@RequestParam("password") String userpassword,
		
			Model model) {
		
		model.addAttribute("name",userName);
		model.addAttribute("password",userpassword);
		model.addAttribute("email",email);
		
		return "sucess";
		
		}*/
	
	/**
	 * using @ModelAttribute
	 */
	//here ModelAttribute will take user data from form and map automatically to user and Model will send the data to success jsp
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
		if(user.getUsername().isEmpty()) {
			return "redirect:/contact";
		}
		this.userService.createUser(user);
		return "sucess";
		
	}
	
}
