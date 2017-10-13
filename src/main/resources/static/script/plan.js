document.addEventListener("DOMContentLoaded",function(event) {
	var PC = "#locationError:30°15'16.2\"N 89°52'31.2\"W";
	var BG = "JMLocal";
	var submitmsg = $("#submitmsg");
	var chatbox = $("#chatbox");
	var msg = $("#msg");
	$(submitmsg).on("click", function(){
		var message = $(msg).val();
		$(msg).val("");
		$(chatbox).val(message);
	});
});