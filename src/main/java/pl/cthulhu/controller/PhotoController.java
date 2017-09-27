package pl.cthulhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotoController {

	@GetMapping("/photos")
	public String photos(){
		return "galery";
	}

}
