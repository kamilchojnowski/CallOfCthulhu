document.addEventListener("DOMContentLoaded",function(event) {
	
	var PC = "#locationError:30°15'16.2\"N 89°52'31.2\"W";
	var BG = "JMLocal";
	var submitmsg = $("#submitmsg");
	var chatbox = $("#chatbox");
	var msg = $("#msg");
	var index = 0;
	var clicked = false;
	
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
		index++;
		PcAction(index);
		clicked = true;
	}
	
	function halo(){
			setTimeout(function(){
				if (!clicked){
				PcMsg("Halo?");
				halo();}
			}, 40000);
	}
	
	function PcAction(index){
		$(submitmsg).off("click", BgSend);
		switch(index){
		case 0:
			var action0 = "Halo?";
			setTimeout(function(){
				PcMsg("Halo?");
				$(submitmsg).click(BgSend);
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
				halo();
			}, 2000);
			break;
		case 2:
			setTimeout(function(){
				PcMsg("Nie jesteś nim?");
				$(submitmsg).one("click", BgSend);
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
							PcMsg("Pomóż mi");
							setTimeout(function(){
								PcMsg("Błagam");
								setTimeout(function(){
									PcMsg("On nadchodzi");
									setTimeout(function(){
										PcMsg("UCIEKAJ");
									}, 3000);
								}, 6000);
							}, 1438);
						}, 1985);
					}, 2651);
				}, 2315);
			}, 3724);
		}
	}
	
	$(msg).keypress(function(e) {
	    if(e.which == 13) {
	        BgMsg();
	        e.preventDefault();
	    }
	});
	
	//js
	$(submitmsg).click(BgMsg);
	PcAction(index);
	
});