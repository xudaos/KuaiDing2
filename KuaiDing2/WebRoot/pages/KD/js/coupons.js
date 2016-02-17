//浼樻儬鍒稿垵濮嬫柟娉�
$(function(){
	
	$('.rebate-left-nav form').children('input').focus(function(){
		$('.rebate-left-nav form').css('borderColor','#89c935').children('.input2').css('background','#89c935');
	}).blur(function(){
		$('.rebate-left-nav form').css('borderColor','#c1c1c1').children('.input2').css('background','#c1c1c1');
	});
});
//寮傛鍔犺浇浼樻儬鍒镐俊鎭�
function receiveCoupons(no,session_User,count){
	if(parseInt(count)<=0){
		$(this).pointMsg({msg:'寰堟姳姝夛紝娌℃湁瓒冲鐨勪紭鎯犲埜渚涢鍙栵紒'});
		return
	}
	if(session_User){
		$("#loginModal").modal("show");
		return;
	}
	loadVCode();
	var url=path+'/Coupons/ReceiveCoupons.do';
	$.post(url,{couponsNo:no}, function(data) {
		$('.modal-body').html(data);
	},"text");
	$('#myModal').modal("show");
}

//鍒锋柊楠岃瘉鐮�
function loadVCode(){
	var _url = path+'/ImageServlet?time='+new Date().getTime();
   	$('#v_pic').attr('src',_url);
}

//棰嗗彇浼樻儬鍒�
function receive(){
	var no = $("#couponsNo").text();
	var vcode = $("#verifyCode").val();
	$("#lingqu").attr("disabled",true);
	$("#lingqu").css("background","#ccc");
	$.ajax({
	    type: 'POST', 
        dataType: 'text', 
		url :path+'/Coupons/GetCoupons.do',
		data :'couponsNo='+no+'&vcode='+vcode,
		error: function (XMLHttpRequest, textStatus, errorThrown) { },
		success:function(data){
			if(data=='0'){
				$("#nothingError").hide();
				$("#codeError").hide();
				$("#repeatError").hide();
				$("#success").show();
				success();
			}else if(data=='1'){
				$("#success").hide();
				$("#nothingError").hide();
				$("#codeError").hide();
				$("#repeatError").show();
				$("#lingqu").attr("disabled",false);
				$("#lingqu").css("background","#9edd4b");
			}else if(data=='2'){
				$("#success").hide();
				$("#codeError").hide();
				$("#repeatError").hide();
				$("#nothingError").show();
				$("#lingqu").attr("disabled",false);
				$("#lingqu").css("background","#9edd4b");
			}else{
				$("#success").hide();
				$("#repeatError").hide();
				$("#nothingError").hide();
				$("#codeError").show();
				$("#lingqu").attr("disabled",false);
				$("#lingqu").css("background","#9edd4b");
			}
		}
	});
}

var timeout2 = 5;
//鍊掕鏃跺埛鏂伴〉闈�
function success(){
	timeout2--;
	if(timeout2 == 0) {
		window.location.reload();
	}else{
		setTimeout("success()", 1000);
	}
}