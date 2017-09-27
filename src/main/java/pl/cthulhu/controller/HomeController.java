package pl.cthulhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping({"", "/home", "/"})
	public String home(){
		return "home";
	}
	
	@GetMapping("/members")
	public String members(){
		return "members";
	}
	
	@PostMapping("/members")
	public String membersPost(){
		
		return "home";
	}

}
