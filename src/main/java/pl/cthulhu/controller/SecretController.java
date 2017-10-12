package pl.cthulhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecretController {
	
	private String oldCaseAttr = "T";
	
	/*Critically wrong way of in logging in is cased by lack of need for creating database account or encoding the password
	This section of application is just a fun addition and is not corresponding with any "real" account*/
	@GetMapping("/login")
	public String login(Model model){
		model.addAttribute("msg", "Zaloguj się");
		return "files/login";
	}
	
	@PostMapping("/login")
	public String loginPost(@RequestParam String login, @RequestParam String password, Model model){
		if(login.equals("JM") && password.equals("Gardner")){
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
	
	@GetMapping("/futureCases")
	public String futureCases(){
		return "files/futureCases";
	}
	
	@GetMapping("/case")
	public String josephsCase(@RequestParam String name, Model model){
		switch(name){
		case "MerryLongherb":
			model.addAttribute("name", "Merry Longherb");
			model.addAttribute("sex", "K");
			model.addAttribute("age", "11");
			model.addAttribute("place", "Gardner, Georgia");
			model.addAttribute("when", "luty 2007");
			model.addAttribute("why", "Obserwowałem ją dniami i nocami. Nie mogłem spać, jeść pić, wszystko we mnie wypełniało chore, płomienne pragnienie"
					+ " jej niewinnego ciała. Jej skóra była zbyt gładka, jej ząbki zbyt proste, jej oczy zbyt głebokie i zbyt przypominające mi letnie niebo "
					+ "odbite w stawie. Nienawidziłem jej z całego serca. Była idealna. Pewnej nocy zakradłem się do jej domu. Nie wiem co było z jej rodzicami, "
					+ "wydawało mi się, że siedzą w salonie na dole. Widać Pan czuwał nade mną, bo kiedy wszedłem do jej pokoju, już spała. Brzydziłem się jej tak bardzo, że musiałem założyć rękawice i maskę, nawet jej zapach przyprawiał mnie o mdłosci."
					+ " Wszystko zrobiłem książkowo: proś o łaskę Obecności, spójrz w oczy Wybrańca, podetnij gardło ale tak, aby krew wypływała powoli, Pochwyć, Złóż. I Oddaj. Miałem wpadkę. Wszystko zepsułem. Przez chwilę zapatrzyłem się w jej przerażone, zapłakane, nic nie rozumiejące oczy i nie udało mi się jej Oddać. Została tam. Panie wybacz mi.");
			break;              
		case "CindyKidd":       
			model.addAttribute("name", "Cindy Kidd");
			model.addAttribute("sex", "");
			model.addAttribute("age", "");
			model.addAttribute("place", "");
			model.addAttribute("when", "");
			model.addAttribute("why", "");
			break;              
		case "CephalusVasilev": 
			model.addAttribute("name", "Cephalus Vasilev");
			model.addAttribute("sex", "");
			model.addAttribute("age", "");
			model.addAttribute("place", "");
			model.addAttribute("when", "");
			model.addAttribute("why", "");
			break;              
		case "JaneHostling":    
			model.addAttribute("name", "Jane Hostling");
			model.addAttribute("sex", "");
			model.addAttribute("age", "");
			model.addAttribute("place", "");
			model.addAttribute("when", "");
			model.addAttribute("why", "");
			break;
		}
		return "files/case";
	}
	
	@GetMapping("/attr")
	@ResponseBody
	public String attr(@RequestParam String data){
		switch(data){
		case "oldCases":
		if(oldCaseAttr.equals("T")){
			oldCaseAttr = "N";
			return "T";
		}
		return "N";
		}
		return "Yup";
	}
	
	
	

}
