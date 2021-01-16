package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	// simple redirect
	@RequestMapping("/one")
	public String one() {

		return "redirect:/enjoy";
	}

	// using redirectview
	@RequestMapping("/onee")
	public RedirectView  onee() {
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

	@RequestMapping("/enjoy")
	public String two() {

		return "sucess";
	}

}
