document.addEventListener("DOMContentLoaded",function(event) {
	
	var PC = "#locationError:30°15'16.2\"N 89°52'31.2\"W";
	var BG = "JMLocal";
	var submitmsg = $("#submitmsg");
	var chatbox = $("#chatbox");
	var msg = $("#msg");
	var index = 0;
	var on = false;
	var body = $("body");
	var wrapper = $("#wrapper");
	//
	
	function PcMsg (message){
		var temp = "From '" + PC.bold() + "': " + message + "<br>" ;
		$(chatbox).append(temp);
	}
	
	function BgMsg(){
		var message = $(msg).val();
		$(msg).val("");
		var temp ="From '" + BG.bold() + "': " + message + "<br>" ;
		$(chatbox).append(temp);
	}
	
	function BgSend(){
		console.log("S");
		index++;
		PcAction(index);
		on = false;
	}
	
	function halo(){
			setTimeout(function(){
				if (!clicked){
				PcMsg("Halo?");
				halo();}
			}, 40000);
	}
	
	function PcAction(index){
		switch(index){
		case 0:
			setTimeout(function(){
				PcMsg("Halo?");
				$(submitmsg).one("click", BgSend);
				on = true;
				setTimeout(function(){
					if (!clicked){
						PcMsg("Ktoś tam jest?");
						halo();
					}
				}, 10000);
			}, 4000);
			break;
		case 1:
			setTimeout(function(){
				PcMsg("Kim jesteś?")
				$(submitmsg).one("click", BgSend);
				on = true;
				halo();
			}, 2000);
			break;
		case 2:
			setTimeout(function(){
				PcMsg("Nie jesteś nim?");
				$(submitmsg).one("click", BgSend);
				on = true;
				halo();
			}, 3000);
			break;
		case 3:
			setTimeout(function(){
				PcMsg("Zaraz, jesteś w jego pracowni");
				setTimeout(function(){
					PcMsg("To niebezpieczne!");
					setTimeout(function(){
						PcMsg("Musisz uciekać!");
						setTimeout(function(){
							PcMsg("pomóż mi");
							setTimeout(function(){
								PcMsg("błagamm");
								setTimeout(function(){
									PcMsg("On nadchodzi");
									setTimeout(function(){
										PcMsg("UCIEKAJ");
										setTimeout(function(){
											errorImitation(0);
										}, 1000);
									}, 3000);
								}, 4500);
							}, 1000);
						}, 1985);
					}, 2651);
				}, 2315);
			}, 3724);
		}
	}
	
	function Color(color, time){
		setTimeout(function(){
			body.css("background-image", "");
			body.css("background-color", color);
		}, time)
	}
	
	function Img(url, time){
		setTimeout(function(){
			body.css("background-image", url);
		}, time)
		
	}
	
	function initialize(){
		Color("black", 100);
		Color("darkblue", 200);
		Color("black", 300);
		Color("darkblue", 400);
		Color("black", 500);
		Color("darkblue", 600);
		Color("black", 700);
		Color("darkblue", 800);
		setTimeout(function(){
			wrapper.show();
		}, 800);
		
	}
	
	function errorImitation(time){
		wrapper.hide();
		Color("black", time + 100);
		Color("darkred", time + 200);
		Img("url('/img/error/1.jpg')", time + 300);
		Img("url('/img/error/2.jpg')", time + 400);
		Color("darkblue", time + 500);
		Img("url('/img/error/3.jpg')", time + 500);
		Color("darkyellow", time + 600);
		Color("darkred", time + 700);
		Img("url('/img/error/4.jpg')", time + 800);
		Color("darkgray", time + 1000);
		Img("url('/img/error/5.jpg')", time + 1100);
		Color("black", time + 1200);
		Img("url('/img/error/6.jpg')", time + 1300);
		Img("url('/img/error/eyes.png')", time + 1400);
		Color("blue", time + 2400);
		setTimeout(function(){
			window.location="/ErrorCode211034526ExternUsageOutOfData";
		}, time + 3400)
	}
	
	$(msg).keypress(function(e) {
	    if(e.which == 13) {
	        BgMsg();
	        if(on) {
	        	BgSend();
	        };
	        e.preventDefault();
	    }
	});
	
	//js
	$(submitmsg).click(BgMsg);
	//initialize();
	//PcAction(index);
	errorImitation(0);
});
	
