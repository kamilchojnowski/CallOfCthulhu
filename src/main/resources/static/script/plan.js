document.addEventListener("DOMContentLoaded",function(event) {
	
	var PC = "#locationError:30°15'16.2\"N 89°52'31.2\"W";
	var BG = "JMLocal";
	var submitmsg = $("#submitmsg");
	var chatbox = $("#chatbox");
	var msg = $("#msg");
	
	function PcMsg (message){
		var temp = $(chatbox).val() + "From '" + PC + "': " + message + "\n" ;
		$(chatbox).val(temp);
	}
	
	function BgMsg(){
		var message = $(msg).val();
		$(msg).val("");
		var temp = $(chatbox).val() + "From '" + BG + "': " + message + "\n" ;
		$(chatbox).val(temp);
	}
	
	$(msg).keypress(function(e) {
	    if(e.which == 13) {
	        BgMsg();
	        e.preventDefault();
	    }
	});
	
	$(submitmsg).on("click", BgMsg);
	
});