document.addEventListener("DOMContentLoaded",function(event) {
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
	
	$.playSound("https://www.soundjay.com/human/sounds/heartbeat-03.mp3");
	setTimeout(function(){
		$.stopSound();
	},2300)
})