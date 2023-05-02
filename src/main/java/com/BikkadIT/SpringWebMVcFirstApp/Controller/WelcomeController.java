package com.BikkadIT.SpringWebMVcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcomeMessage")
	public String welcome(Model model) {
		String welMsg = "Welcome To BikkadIT";
		model.addAttribute("MSG", welMsg);
		return "wel";

	}

}
