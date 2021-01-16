package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home ");
		
		model.addAttribute("name","Sumit");
		return "index";
	}
	
	// sending data wirh the help of ModelView
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name","Model and view Example");
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
