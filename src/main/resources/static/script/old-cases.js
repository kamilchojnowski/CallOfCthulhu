document.addEventListener("DOMContentLoaded",function(event) {
	var body = $("body");
	var elements = $("body").find("div");
	function hideAndShow(){
		$(elements).toggle();
	}
	setTimeout(function(){
		hideAndShow();
		body.css("background-image", "url(\"http://assets.rebelcircus.com/blog/wp-content/uploads/2016/01/o-BLACK-EYED-CHILD-facebook.jpg\")");
		setTimeout(function(){
			body.css("background-image", "");
			hideAndShow();
		}, 100);
	}, 2000);

	
	
})