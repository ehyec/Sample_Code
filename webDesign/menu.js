$(document).ready(function() {
	$('#gnb li ul').hide();
	$('.menu_box').hide();

    $('#gnb').hover(
    	function() { //박스올릴때랑 이미지 변경 속도제어 - 1000 = 1초
        	$('#gnb .sub_menu ul').fadeIn('normal',function()
{$(this).stop();});
        	$('#header').animate({height:250},'fast').clearQueue();
		},
    	function() {
			$('#gnb .sub_menu ul').fadeOut('fast');
			$('#header').animate
({height:102},'fast').clearQueue();
       	});
   		$('#gnb .sub_menu').hover(
        	function() { 
   				$('a.depth1', this).animate({top:-50},'fast').clearQueue();
        	},
        	function() {
   			$('a.depth1', this).animate
({top:0},'fast').clearQueue();
       });
       //tab 처리
       $('#gnb .sub_menu .depth1').bind('focus', function () {        
                    $('#gnb .sub_menu ul').slideDown('fast');
                    $('#header').animate({height:250},'fast').clearQueue();
       });

       $('#gnb li.gnb_05 li:last').find('a').bind('blur', function () {       
 
                  $('#gnb .sub_menu ul').slideUp('fast');
                  $('#header').animate({height:250},'fast').clearQueue();
                 
       });
  });
