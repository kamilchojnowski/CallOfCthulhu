var body = $("body");
var span = $("#write");

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
	
setTimeout(function(){
	$.playSound('/sound/buzz.wav');
}, 0);

function rand (min, max) {      
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

//js

span.typeIt({
    strings: 'Error code #211034526',
    speed: 30,
    autoStart: true,
})
.tiPause(500)
.tiBreak()
.tiType('Error couse: ExternUsageOutOfData')
.tiPause(1000)
.tiBreak()
.tiType('System force close of process(es):')
.tiPause(1000)
.tiSettings({speed: 0})
.tiBreak()
.tiType('#117342560000')
.tiBreak()
.tiType('#117342560001')
.tiBreak()
.tiType('#117342560002')
.tiBreak()
.tiType('#117342560003')
.tiBreak()
.tiType('#102300060000')
.tiBreak()
.tiType('#102300060001')
.tiBreak()
.tiType('#102300060002')
.tiBreak()
.tiType('#100000000000')
.tiBreak()
.tiType('#100000000001')
.tiSettings({speed: 30})
.tiPause(1000)
.tiBreak()
.tiType('System forced to execute Error Statement Configuration')
.tiPause(1000)
.tiBreak()
.tiType('System forced to close inner-process #002')
.tiPause(1000)
.tiBreak()
.tiType('System forced to close inner-process #001')
.tiPause(1000)
.tiBreak()
.tiType('System forced to execute Error Secure Procedure')
.tiPause(1000)
.tiBreak()
.tiType('System forced to exterminate Users')
.tiPause(1000)
.tiBreak()
.tiType('System forced to exterminate Admin Users')
.tiPause(2000)
.tiBreak()
.tiType('System forced to exterminate System')
.tiPause(3000)
.tiBreak()
.tiSettings({speed: 200})
.tiType('There is no hope')
.tiPause(50);

setTimeout(function(){
	span.hide();
	body.css("background-image", "url('http://i48.tinypic.com/v7z7g3.png')")
    setInterval(function() {
        
        var randPosOne = rand(0,200),
            randPosTwo = rand(0,200),
            bgPosition = randPosOne + 'px ' + randPosTwo + 'px';
        
        body.css({
            "background-position": bgPosition
        });
    }, 90);
	setTimeout(function(){
        $.ajax({
        	url: "/end",
        	dataType : "text",
        	success: function(){
        		alert("s");
        	}
        })
	}, 3000);
}, 30000);