package pl.cthulhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.cthulhu.mail.MailClient;

@Controller
public class HomeController {
	
	public static String oldCaseAttr = "T";
	
	@Autowired
	private MailClient mailClient;

	@GetMapping({"", "/home"})
	public String home(){
		return "home";
	}
	
	@GetMapping("/members")
	public String members(){
		return "members";
	}
	
	@PostMapping("/members")
	public String membersPost(@RequestParam String email){
		String message = "Witaj!\n"
				+ "Jeżeli chciałbyś dołączyć do naszej organizacji, wystarczy żebyś wziął swoje portfolio i przyszedł na spotkanie New World Photo.\n"
				+ "Spotykamy sie w każdy ostatni czwartek miesiąca w klubie The Spotted Cat.\n"
				+ "Zapytaj barmana w rozmowie \"A czym jest prawda jeżeli nie ulotnością?\", zaprowadzi Cię.\n"
				+ "Do zobaczenia!";
		String title = "Witamy! New World Photo";
		if(email.equals("josephmccourt.nwp@gmail.com")){
			message = "Joseph...\n"
					+ "Jeżeli znowu zapomniałeś dostępu do swoich plików: kliknij na powitanie na stronie startowej (to z napisem\"Witaj Joseph\" czy jakoś tak). Login to twoje inicjały, a hasła nie pamiętam. Chyba nazwa miasta z twojej pierwszej wpadki.\n"
					+ "A jeżeli to znowu jakiś twój żart to spadaj.\n"
					+ "AD";
			title = "Joseph...";
		}
		mailClient.prepareAndSend(email, title, message);
		return "home";
	}

}
