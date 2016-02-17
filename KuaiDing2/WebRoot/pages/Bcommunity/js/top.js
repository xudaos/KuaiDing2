// JavaScript Document
$(document).ready(function(){
    $('.top .li1').hover(function(){
		$(this).children('ul').show();
		$(this).children('a').addClass('ahover');
	},function(){
		$(this).children('ul').hide();
		$(this).children('a').removeClass('ahover');
	});
	
	$('.top-left .dz').toggle(function(){
	 	$(this).children('ul').show();
  	},function(){
	 	$(this).children('ul').hide();
   	});
	
	$('#form1').children('input').focus(function(){
		$('#form1').css('background','#89c935');
	}).blur(function(){
		$('#form1').css('background','#c1c1c1');
	});
	
	
	/*閸掑棜椴搁悳鍥х毈娴滐拷1200閺冨墎缂夐弨缍給dy閿涘奔绗夐崗鐓庮啇ie
	if($(window).width()<=1200){
		var aHeight = -$(document).height()*0.2;
		$('body').css({
			'width' : '1200px',
			'-webkit-transform' : 'scale(.8,0.8)',
			'-moz-transform' : 'scale(.8,0.8)',
			'-ms-transform' : 'scale(.8,0.8)',
			'transform' : 'scale(.8,0.8)',
			'margin' : aHeight/2 + 'px' + ' ' + '0' + aHeight + 'px' + ' ' + '-100px'		
		});
	}*/
	
	
	//婢舵挳鍎撮幖婊呭偍
	$('#top_search').click(function(){
		var searchType = $('#searchType').val();
		var key = $('#key').val().trim();
		if(key==''){
			$(this).pointMsg({msg:'鐠囩柉绶崗銉︽偝缁便垹鍙ч柨顔肩摟!'});
		}else{
			window.location.href=path+'/Web/Search.html?searchType='+searchType+'&key='+encodeURI(encodeURI(key));
			
		}
			
	});

	//閸ョ偠婧呴柨顔剧拨鐎规碍鎮崇槐銏″瘻闁斤拷
	$("#key").keydown(function(event){
		if(event.keyCode == 13){
			$('#top_search').click();
		}
	});
	
	// 閺�儼妫岀純鎴犵彲 
	$('#collectionWeb').addFavorite('閺堝绶ㄦ鐔锋櫌閹寸柉顔戦崸锟�,location.href');

	
});
jQuery.fn.addFavorite = function(l, h) {
    return this.click(function() {
        var t = jQuery(this);
        if(jQuery.browser.msie) {
            window.external.addFavorite(h, l);
        } else if (jQuery.browser.mozilla || jQuery.browser.opera) {
            t.attr("rel", "sidebar");
            t.attr("title", l);
            t.attr("href", h);
        } else {
            alert("璇蜂娇鐢–trl+D灏嗘湰椤靛姞鍏ユ敹钘忓す锛�");
        }
    });
};