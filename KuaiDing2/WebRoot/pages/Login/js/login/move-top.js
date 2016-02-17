/****
//閸ョ偛鍩屾い鍫曞劥JS
****/
$(function (){
    var win_w = $(window).width();//濞村繗顫嶉崳銊ュ讲鐟欎礁灏崺鐔剁瑝鐎硅棄瀹�娑撳秴瀵橀幏顒佺泊閸斻劍娼幍鈧崡鐘差啍鎼达拷
	var win_h = $(window).height();//濞村繗顫嶉崳銊ヮ啍鎼达拷
	//alert(win_w+" "+win_h)
	var page_content = 1210;
	var go_top_left = page_content+(win_w - page_content)/2;
	
	//ie6濞村繗顫嶉崳銊ュ悑鐎硅鈧拷
	if($.browser.msie&&$.browser.version<=6.0)
	{
	  $('#go_top').css({"left":go_top_left,"bottom":100,"position":"absolute"}); 
	}else	{
	 $('#go_top').css({"left":go_top_left,"bottom":100}); 
	}	
	//瑜版挻绮撮崝銊︽蒋缁夎濮╅弮璺衡偓锟�鐏炲倿娈㈤惈鈧姘З
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