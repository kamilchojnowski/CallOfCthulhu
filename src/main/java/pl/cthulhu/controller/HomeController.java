package pl.cthulhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.cthulhu.mail.MailClient;

@Controller
public class HomeController {
	
	@Autowired
	private MailClient mailClient;

	@GetMapping({"", "/home", "/"})
	public String home(){
		return "home";
	}
	
	@GetMapping("/members")
	public String members(){
		return "members";
	}
	
	@PostMapping("/members")
	public String membersPost(@RequestParam String email){
		mailClient.prepareAndSend(email);
		return "home";
	}

}
