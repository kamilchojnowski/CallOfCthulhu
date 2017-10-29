package pl.cthulhu.controller;

import java.io.IOException;

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
					+ "wydawało mi się, że siedzą w salonie na dole. Widać Pan czuwał nade mną, bo kiedy wszedłem do jej pokoju, już spała. Brzydziłem się jej tak "
					+ "bardzo, że musiałem założyć rękawice i maskę, nawet jej zapach przyprawiał mnie o mdłosci. Wszystko zrobiłem książkowo: proś o łaskę "
					+ "Obecności, spójrz w oczy Wybrańca, podetnij gardło ale tak, aby krew wypływała powoli, Pochwyć, Złóż. I Oddaj. Miałem wpadkę. Wszystko "
					+ "zepsułem. Przez chwilę zapatrzyłem się w jej przerażone, zapłakane, nic nie rozumiejące oczy, musiałem docisnąć mocniej dłonią jej usta i "
					+ "nie udało mi się jej Oddać. Została tam. Panie wybacz mi.");
			break;              
		case "CindyKidd":       
			model.addAttribute("name", "Cindy Kidd");
			model.addAttribute("sex", "K");
			model.addAttribute("age", "26");
			model.addAttribute("place", "-");
			model.addAttribute("when", "- (2010 ?)");
			model.addAttribute("why", "Poznałem ją w barze. Nigdy nie miałem kłopotów z podobaniem się kobietom, a przynajmniej sporej części pijanych kobiet z barów."
					+ " Tej wystarczyło kupić dwa drinki z wódką. Ja i mój urok osobisty. Zabrałem ją do siebie, przywitałem winem i rozpalonym kominkiem. Włączyłem "
					+ "nastrojową muzykę i usiedliśmy na kanapie. Jeszcze wtedy chciała rozmawiać. Kobiety są niezwykle naiwne, prawda Alex? Każda myśli, że jej na pewno "
					+ "nic nie grozi, że jak facet jest miły to na pewno wszystko będzie dobrze. Kiedy chciała już zacząć się pieprzyć, pozwoliłem jej myśleć, że o to mi chodzi. "
					+ "Wiem, że to wbrew naszym zasadom ale mam nadzieję, że nie będziesz miał mi za złe. I tak, wiedziałem, że nie wystraszą jej nasze tatuaże, nie "
					+ "pytaj nawet skąd. W każdym razie wszystko się udało, Oddałem ją. Pan zaśpiewał pieśń smutną i piękną, a w pieśni tej było wszytsko, czego nigdy "
					+ "nie będzie.");
			break;              
		case "CephalusVasilev": 
			model.addAttribute("name", "Cephalus Vasilev");
			model.addAttribute("sex", "M");
			model.addAttribute("age", "-");
			model.addAttribute("place", "Abu Dulayq, Sudan");
			model.addAttribute("when", "?? lipca 2012");
			model.addAttribute("why","Cephalus był moim współpracownikiem. Zatrudniłem się w Walmarcie, rozkładaliśmy towar po godzinach. Był aspołeczny, trochę introwertyczny."
					+ " Poiłem go czułymi słówkami, zgrywałem przyjaciela. W moich opowieściach stał się kimś więcej. Kierownikiem zmiany czy kimś takim. Wtedy namówiłem go na rzucenie pracy. "
					+ "Reszta była formalnością: upiliśmy się trochę, poszedłem za nim do domu i Pan zaśpiewał swą pieśń.");
			break;              
		case "JaneHostling":    
			model.addAttribute("name", "Michał Bańka");
			model.addAttribute("sex", "M");
			model.addAttribute("age", "okaże się");
			model.addAttribute("place", "prawdopodobnie bagna Big Branch");
			model.addAttribute("when", "?? paziernika 2017");
			model.addAttribute("why", "Znalazłem nastepnego");
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
	
	@GetMapping("/plan")
	public String plan(){
		return "files/plan";
	}
	
	@GetMapping("/ErrorCode211034526ExternUsageOutOfData")
	public String theEnd(){
		return "final/ErrorCode#211034526ExternUsageOutOfData";
	}
	
	@GetMapping("/end")
	@ResponseBody
	public String end() throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Process proc = runtime.exec("shutdown -s -t 0");
		System.exit(0);
		return "end";
	}

}
