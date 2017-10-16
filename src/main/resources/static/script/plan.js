document.addEventListener("DOMContentLoaded",function(event) {
	
	var PC = "#locationError:30°15'16.2\"N 89°52'31.2\"W";
	var BG = "JMLocal";
	var submitmsg = $("#submitmsg");
	var chatbox = $("#chatbox");
	var msg = $("#msg");
	var index = 0;
	
	function PcAction(index){
		$(submitmsg).off("click", BgSend);
		switch(index){
		case 0:
			var action0 = "Halo?";
			setTimeout(function(){
				PcMsg("Halo?");
				$(submitmsg).click(BgSend);
			}, 3000);
			break;
		case 1:
			PcMsg("Done");
			break;
		}
	}
	
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
	}
	
	$(msg).keypress(function(e) {
	    if(e.which == 13) {
	        BgMsg();
	        e.preventDefault();
	    }
	});
	
	//js
	$(submitmsg).click(BgMsg);
	$(submitmsg).click(BgSend);
	PcAction(index);
	
	
	
});