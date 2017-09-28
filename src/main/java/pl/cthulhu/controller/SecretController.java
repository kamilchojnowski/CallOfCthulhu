package pl.cthulhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecretController {
	
	/*Critically wrong way of in logging in is cased by lack of need for creating database account or encoding the password
	This section of application is just a fun addition and is not corresponding with any "real" account*/
	@GetMapping("/login")
	public String login(Model model){
		model.addAttribute("msg", "Zaloguj się");
		return "files/login";
	}
	
	@PostMapping("/login")
	public String loginPost(@RequestParam String login, @RequestParam String password, Model model){
		if(login.equals("login") && password.equals("pass")){
			return "files/home";
		}
		model.addAttribute("msg", "Błędne dane");
		return "files/login";
	}
	
	@GetMapping("/files")
	public String files(){
		return "files/home";
	}
	
	@GetMapping("/oldCases")
	public String oldCases(){
		return "files/oldCases";
	}
	
	

}
