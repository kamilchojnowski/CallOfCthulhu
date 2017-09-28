document.addEventListener("DOMContentLoaded",function(event) {
	var body = $("body");
	var elements = $("body").find("div");
	function hideAndShow(){
		$(elements).toggle();
	}
	var attr = "${oldCasesAttr}";
	$.ajax({
		url: "/attr",
		type: 'get',
		dataType: "text",
		data: "data=oldCases",
		success: function(data){
			console.log(data);
			if(data == "T"){
				setTimeout(function(){
					hideAndShow();
					body.css("background-image", "url(\"http://assets.rebelcircus.com/blog/wp-content/uploads/2016/01/o-BLACK-EYED-CHILD-facebook.jpg\")");
					setTimeout(function(){
						body.css("background-image", "");
						hideAndShow();
					}, 100);
				}, 2000);
			}
		},
		error: function(){
			console.log("error");
		}
	})
})