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
			link = "/img/whenthemoonisgone.jpg";
			place = "Savannah, Georgia, marzec 2006";
			String[] str1 = {"In echoes,", "It goes,", "The silence mourns,", "A manifestation,",
					"It'll shatter windows,", "It'll maim, it will kill,", "It will reveal"};
			poem = str1;
			break;
		case "welcome":
			link = "/img/welcome.jpg";
			place = "Gardner, Georgia, luty 2007";
			
			String[] str2 = {"Like one that on a lonesome road doth walk in fear and dread,",
					"and having once turned \'round, walks on, and turns no more his head,",
					"because he knows a frightful fiend doth close behind him tread.",
					"- Samuel Coleridge"};
			poem = str2;
			break;
		case "thecolouroutofspace":
			link = "/img/thecolouroutofspace.jpg";
			place = "Korgen, Norwegia, styczeń 2010";
			String[] str3 = {"The oldest and strongest emotion of mankind is fear,", "and the oldest and strongest kind of",
					"fear", "is the fear of", "unknown"};
			poem = str3;
			break;
		case "storyofunseen":
			link = "/img/storyofunseen.jpg";
			place = "Abu Dulayq, Sudan, czerwiec 2012";
			String[] str4 = {"Dark girl so filled with strife", "Dark Dark girl she'll take your life",
					"Dark girl stay for a while", "Dark Dark girl she makes me smile", "Dark girl she shows no fear",
					"Dark Dark girl is always near", "Dark girl won't see her cry", "Dark Dark girl just want you to die"};
			poem = str4;
			break;
		case "double":
			link = "/img/double.jpg";
			place = "Banor Rogue, Luisiana, grudzień 2013";
			String[] str5 = {"I want to sleep awhile,", "awhile, a minute, a century,", "but all must know that I have not died;",
					"that there is a stable of gold in my lips;", "that I am the small friend of the West wing;", "that I am the intense shadow of my tears.",
					"- Federico Garcia Lorca"};
			poem = str5;
			break;
		case "whenthetimecomes":
			link = "/img/whenthetimecomes.jpg";
			place = "New Orlean, Luisiana, maj 2014";
			String[] str6 ={"Oh mother, I can feel the soil falling over my head",
					"See, the sea wants to take me",
					"The knife wants to slit me",
					"Do you think you can help me ?",
							"-The Smiths "};
			poem = str6;
			break;
		case "waiting":
			link = "/img/waiting.jpg";
			place = "Bagna Big Branch, Luisiana, czerwiec 2014";
			String[] str7 = {"He comes", "just look", "but close you", "r eyes", "just", "here"};
			poem = str7;
			break;
		}
		model.addAttribute("link", link);
		model.addAttribute("place", place);
		model.addAttribute("poem", poem);
		return "photo";
	}
}
