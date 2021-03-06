
package com.example.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("sampleMessage", "Can we build it? YES WE CAN! - Brought to you by handlebars.java templating engine.");
		return "test";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String testConsume(Model model, String newMessage) {
		model.addAttribute("sampleMessage", "New message: "+newMessage);
		return "test";
	}
}
