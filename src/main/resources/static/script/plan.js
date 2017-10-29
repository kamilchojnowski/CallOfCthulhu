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
	
	(function ($) {
	    $.extend({
	        playSound: function () {
	            return $(
	                   '<audio class="sound-player" autoplay="autoplay" style="display:none;">'
	                     + '<source src="' + arguments[0] + '" />'
	                     + '<embed src="' + arguments[0] + '" hidden="true" autostart="true" loop="false"/>'
	                   + '</audio>'
	                 ).appendTo('body');
	        },
	        stopSound: function () {
	            $(".sound-player").remove();
	        }
	    });
	})(jQuery);
	
	function PcMsg (message){
		var temp = "From '" + PC.bold() + "': " + message + "<br>" ;
		$(chatbox).append(temp);
		$.playSound("/sound/msg.wav");
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
	
	function Sound(url, time){
		setTimeout(function(){
			$.playSound(url);
		}, time)
	}
	
	function StopSound(time){
		setTimeout(function(){
			$.stopSound();
		}, time)
	}
	
	function initialize(){
		$.playSound("/sound/static.mp3");
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
			$.stopSound();
		}, 800);
		
	}
	
	function errorImitation(time){
		wrapper.hide();
		Color("black", time + 100);
		Sound("/sound/hell.mp3", time + 100);
		Sound("/sound/demon - soul.mp3", time + 200);
		Color("darkred", time + 200);
		Img("url('/img/error/1.jpg')", time + 300);
		Img("url('/img/error/2.jpg')", time + 400);
		Color("darkblue", time + 500);
		Img("url('/img/error/3.jpg')", time + 500);
		Color("darkyellow", time + 600);
		Color("darkred", time + 700);
		Sound("/sound/screamM.mp3", time + 700);
		Img("url('/img/error/4.jpg')", time + 800);
		Color("darkgray", time + 1000);
		Img("url('/img/error/5.jpg')", time + 1100);
		Sound("/sound/screamW.mp3");
		Color("black", time + 1200);
		Img("url('/img/error/6.jpg')", time + 1300);
		Color("darkred", time + 1400);
		Color("white", time + 1500);
		Img("url('/img/error/7.jpg')", time + 1600);
		Color("darkbrown", time + 1700);
		Color("black", time + 1800);
		Color("darkgrey", time + 1900);
		Img("url('/img/error/8.jpg')", time + 2000);
		Color("black", time + 2100);
		Color("darkyellow", time + 2200);
		Img("url('/img/error/9.jpg')", time + 2300);
		Color("darkblue", time + 2400);
		Img("url('/img/error/10.jpg')", time + 2500);
		Color("darkgreen", time + 2600);
		Img("url('/img/error/11.jpg')", time + 2700);
		Color("black", time + 2800);
		Img("url('/img/error/12.jpg')", time + 2900);
		Img("url('/img/error/eyes.png')", time + 3000);
		StopSound(time + 3000);
		Sound("/sound/eyes.mp3", time + 3001);
		Color("blue", time + 6000);
		setTimeout(function(){
			window.location="/ErrorCode211034526ExternUsageOutOfData";
		}, time + 6000)
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
	initialize();
	PcAction(index);
});
	
