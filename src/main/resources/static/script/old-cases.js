document.addEventListener("DOMContentLoaded",function(event) {
	var body = $("body");
	var elements = $("body").find("div");
	
	function hideAndShow(){
		$(elements).toggle();
	}
	
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
	
	window.addEventListener( "pageshow", function ( event ) {
		  var historyTraversal = event.persisted || ( typeof window.performance != "undefined" && window.performance.navigation.type === 2 );
		  if ( historyTraversal ) {
			  window.location.reload();
		  }
		});
	
	$.ajax({
		url: "/attr",
		type: 'get',
		dataType: "text",
		data: "data=oldCases",
		success: function(data){
			if(data == "T"){
				setTimeout(function(){
					hideAndShow();
					body.css("background-image", "url(\"/img/oldcases.jpg\")");
					$.playSound('/sound/childlaught.mp3');
					setTimeout(function(){
						body.css("background-image", "");
						hideAndShow();
					}, 400);
					setTimeout(function(){
						$.stopSound();
					}, 500);
				}, 2000);
			}
		},
		error: function(){
			console.log("error");
		}
	})
})