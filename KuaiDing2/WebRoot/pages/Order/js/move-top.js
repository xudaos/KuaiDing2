/****
//鍥炲埌椤堕儴JS
****/
$(function (){
    var win_w = $(window).width();//娴忚鍣ㄥ彲瑙佸尯鍩熶笉瀹藉害 涓嶅寘鎷粴鍔ㄦ潯鎵€鍗犲搴�
	var win_h = $(window).height();//娴忚鍣ㄥ搴�
	//alert(win_w+" "+win_h)
	var page_content = 1210;
	var go_top_left = page_content+(win_w - page_content)/2;
	
	//ie6娴忚鍣ㄥ吋瀹规€�
	if($.browser.msie&&$.browser.version<=6.0)
	{
	  $('#go_top').css({"left":go_top_left,"bottom":100,"position":"absolute"}); 
	}else	{
	 $('#go_top').css({"left":go_top_left,"bottom":100}); 
	}	
	//褰撴粴鍔ㄦ潯绉诲姩鏃跺€� 灞傞殢鐫€婊氬姩
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
	}
	$('#go_top').bind('click',function(){ $(window).scrollTop(0) });
 });