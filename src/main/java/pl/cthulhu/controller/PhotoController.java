package pl.cthulhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PhotoController {

	@GetMapping("/photos")
	public String photos() {
		return "galery";
	}

	@GetMapping("/photo/{name}")
	public String photo(@PathVariable String name, Model model) {
		String link = "";
		String place = "";
		String[] poem = null;
		switch (name) {
		case "whenthemoonisgone":
			link = "https://olxpl-ring04.akamaized.net/images_tablicapl/546831588_2_644x461_lalka-lalki-sliczne-porcelana-porcelanowe-vintage-duze-stare-dekoracja-dodaj-zdjecia_rev009.jpg";
			place = "Savannah, Georgia, marzec 2006";
			//poem = "";
			break;
		case "welcome":
			link = "https://i.pinimg.com/736x/fe/c5/a7/fec5a70b0f373149ec55d4ba1e0e2221.jpg";
			place = "Gardner, Georgia, luty 2007";
			
			String[] str2 = {"Like one that on a lonesome road doth walk in fear and dread,",
					"and having once turned \'round, walks on, and turns no more his head,",
					"because he knows a frightful fiend doth close behind him tread.",
					"- Samuel Coleridge"};
			poem = str2;
			break;
		case "thecolouroutofspace":
			link = "https://i.wpimg.pl/644x331/d.wpimg.pl/852962691-712552319/zorza-polarna.jpg";
			place = "Korgen, Norwegia, styczeń 2010";
			//poem = "";
			break;
		case "storyofunseen":
			link = "https://i.pinimg.com/736x/e7/d0/06/e7d006a9a265c012ace2130c04dece15--creepy-horror-gothic-horror.jpg";
			place = "Abu Dulayq, Sudan, czerwiec 2012";
			//poem = "";
			break;
		case "double":
			link = "http://www.teamjimmyjoe.com/wp-content/uploads/2014/11/scary-creepy-real-photos-popes-bishops-priests-glowing-eyes.jpg";
			place = "Banor Rogue, Luisiana, grudzień 2013";
			//poem = "";
			break;
		case "whenthetimecomes":
			link = "https://i.ytimg.com/vi/FQwbxy0QszI/hqdefault.jpg";
			place = "New Orlean, Luisiana, maj 2014";
			String[] str6 ={"Oh mother, I can feel the soil falling over my head",
					"See, the sea wants to take me",
					"The knife wants to slit me",
					"Do you think you can help me ?",
							"-The Smiths "};
			poem = str6;
			break;
		case "waiting":
			link = "https://i.ytimg.com/vi/qm-Gek2TXrk/maxresdefault.jpg";
			place = "Bagna Big Branch, Luisiana, czerwiec 2014";
			//poem = "";
			break;
		}
		model.addAttribute("link", link);
		model.addAttribute("place", place);
		model.addAttribute("poem", poem);
		return "photo";
	}
}
