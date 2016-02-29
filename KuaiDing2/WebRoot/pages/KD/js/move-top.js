$(function (){
    var win_w = $(window).width();
	var win_h = $(window).height();
	//alert(win_w+" "+win_h)
	var page_content = 1210;
	var go_top_left = page_content+(win_w - page_content)/2;
	
	if($.browser.msie&&$.browser.version<=6.0)
	{
	  $('#go_top').css({"left":go_top_left,"bottom":100,"position":"absolute"}); 
	}else	{
	 $('#go_top').css({"left":go_top_left,"bottom":100}); 
	}	

	window.onscroll = function()
	{
		if($('#go_top').css("display")=='block')
		{
		 if($.browser.msie&&$.browser.version<=6.0)
		  {
			 var objTop_ie6 = $(window).scrollTop()+$(window).height()/2 +300 -$('#go_top').height()/2;
			 $("#go_top").animate({"top":objTop_ie6},0);
		  }
		}
		if($(window).scrollTop() < 20){
			$('#go_top').fadeOut(300);
		}else{
			$('#go_top').fadeIn(300);
		}	  
	};
	$('#go_top').bind('click',function(){ $(window).scrollTop(0); });
 });