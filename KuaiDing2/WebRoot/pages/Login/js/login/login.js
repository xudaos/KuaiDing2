var timeout=60;
var ln = '';
$package('Operate.login');
$package('Operate.mobile_login');
Operate.login = function(){
	return {
		toLogin:function(){
			try{
				var login_type = $("#login_type").val();
				if($('#loginName').val().trim() != ''){
					$(".yhmcw").html("");
					$(".yhmcw").hide();
					ln = $('#loginName').val().trim();
					if($('#loginPass').val().trim() != ''){
						$(".mmcw").html("");
						$(".mmcw").hide();
						if($('#verifyCode').val() != ''){
							$(".yzmcw").html("");
							$(".yzmcw").hide();
							//$.messager.progress({title: 'Please waiting',msg: 'Loading data...'});
							$('#general_login_form').ajaxSubmit({
					        	success: function(data) {
					        		//$.messager.progress('close');
					                if(data == 'memSuccess') {
					                	if($("#chkRememberLoginName").attr("checked")=="checked"){
					                		SetCookie("LOGIN_NAME",ln.trim(),7);//娣囨繂鐡ㄩ崚鐧坥okie娑擄拷  娣囨繂鐡�婢讹拷
					                	}
					                	if(login_type==1){
					                		window.location.reload();
					                	}else{
					                		window.open(path+"/index/", '_self');
					                	}
					                } else if(data == 'vcodeError'){
					                	_login_ed();
					                	$(".yzmcw").html("妤犲矁鐦夐惍浣界翻閸忋儲婀佺拠顖ょ磼");
					                	$(".yzmcw").show();
										$('#verifyCode').select();
					                    
					                } else if(data == 'nameAndPassError'){
					                	_login_ed();
					                	$(".yhmcw").html("閻€劍鍩涢崥宥呯槕閻線鏁婄拠顖ょ磼");
					                	$(".yhmcw").show();
					                   	$('#loginPass').val('');
					                   	$('#loginName').select();
					                    
					                } else if(data == 'userInactive'){
					                	_login_ed();
					                	$(".yhmcw").html("濮濄倛澶勯幋宄板嚒鐞氼偆顩﹂悽锟�");
					                	$(".yhmcw").show();
					                    $('#loginPass').val('');
					                }else if(data == 'userNoExamMobile'){
					                	_login_ed();
					                	$(".yhmcw").html("濮濄倛澶勯幋宄扮毣閺堫亝绺哄ú浼欑磼");
					                	$(".yhmcw").show();
					                    $('#loginPass').val('');
					                } else{
					                	if(data.length>10){
						                	window.open(data, '_self');
						                }else{
						                	$(this).pointMsg({msg:'鎮ㄨ緭鍏ョ殑鐢ㄦ埛鍚嶆垨瀵嗙爜閿欒锛�'});
					                	}
					                }
					                $('#verifyCode').val('');
					                Operate.login.loadVrifyCode();//閸掗攱鏌婃宀冪槈閻拷
					            },
					            error: function(data) {
					            	//$.messager.progress('close');
					            	$(this).pointMsg({msg:'鎮ㄨ緭鍏ョ殑鐢ㄦ埛鍚嶆垨瀵嗙爜閿欒锛�'});
					            	_login_ed();
					                $('#verifyCode').val('');
					                Operate.login.loadVrifyCode();//閸掗攱鏌婃宀冪槈閻拷
					            }
							});
						}else{
							_login_ed();
							$(".yzmcw").html("璇疯緭鍏ラ獙璇佺爜锛�");
							$(".yzmcw").show();
						}
					}else{
						_login_ed();
						$(".mmcw").html("璇疯緭鍏ュ瘑鐮侊紒");
						$(".mmcw").show();
					}
				}else{
					_login_ed();
					$(".yhmcw").html("璇疯緭鍏ラ偖绠憋紒");
					$(".yhmcw").show();
				} 
			}catch(e){
							
			}
			return false;
		},
		loadVrifyCode:function(){//閸掗攱鏌婃宀冪槈閻拷
			var _url = path+"/ImageServlet?time="+new Date().getTime();
			$('#v_pic').attr('src',_url);
		},
		init:function(){
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
			//妤犲矁鐦夐惍浣告禈閻楀洨绮︾�姘卞仯閸戣绨ㄦ禒锟�
			$('#v_pic').click(Operate.login.loadVrifyCode);
			var form = $('#general_login_form');
			form.submit(Operate.login.toLogin);
	   
			var uname=getCookie("LOGIN_NAME");
			if(uname!=null&&!uname.toString().isnullorempty()){
				$('#loginName').val(uname);
				$('#chkRememberLoginName').attr("checked",true);
			}
		}
	};
}();

//閸斻劍鈧礁鐦戦惍浣烘瑜帮拷
var mfilter=/^(((1[3|5|8][0-9]{1}))+\d{8})$/;
Operate.mobile_login = function(){
	return {
		toLogin:function(){
			try{
				var login_type = $("#login_type").val();
				if($('#loginMobile').val().trim() != ''){
					$(".sj-yhmcw").html("");
					$(".sj-yhmcw").hide();
					if(!mfilter.test($('#loginMobile').val().trim())){
						_login_ed();
						$(".sj-yhmcw").html("璇疯緭鍏ユ墜鏈哄彿锛�");
						$(".sj-yhmcw").show();
					}else{
						if($('#mobileCode').val() != ''){
							$(".sj-mmcw").html("");
							$(".sj-mmcw").hide();
							$('#dynamic_login_form').ajaxSubmit({
					        	success: function(data) {
					                if(data == 'memSuccess') {
					                	if($("#rememberLoginMobile").attr("checked")=="checked"){
					                		SetCookie("LOGIN_MOBILE",$('#loginMobile').val().trim().trim(),7);//娣囨繂鐡ㄩ崚鐧坥okie娑擄拷  娣囨繂鐡�婢讹拷
					                	}
					                	if(login_type==1){
					                		window.location.reload();
					                	}else{
					                		window.open(path+"/index/", '_self');
					                	}
					                } else if(data == 'vcodeError'){
					                	_login_ed();
					                	$(".sj-mmcw").html("閸斻劍鈧胶鐖滈柨娆掝嚖閿涳拷");
					                	$(".sj-mmcw").show();
										$('#mobileCode').select();
					                } else if(data == 'userInactive'){
					                	_login_ed();
					                	$(".sj-yhmcw").html("濮濄倛澶勯幋宄板嚒鐞氼偆顩﹂悽锟�");
					                	$(".sj-yhmcw").show();
					                    $('#mobileCode').val('');
					                } else{
					                	$(this).pointMsg({msg:'鎮ㄨ緭鍏ョ殑鎵嬫満鍙锋垨鍔ㄦ�鐮侀敊璇紒'});
					                	_login_ed();
					                }
					                $('#mobileCode').val('');
					            },
					            error: function(data) {
					            	$(this).pointMsg({msg:'鎮ㄨ緭鍏ョ殑鎵嬫満鍙锋垨鍔ㄦ�鐮侀敊璇紒'});
					                $('#mobileCode').val('');
					                _login_ed();
					        	}
					        });
						}else{
							_login_ed();
							$(".sj-mmcw").html("璇疯緭鍏ュ姩鎬佺爜锛�");
							$(".sj-mmcw").show();
						}
					}
				}else{
					_login_ed();
					$(".sj-yhmcw").html("璇疯緭鍏ユ墜鏈哄彿锛�");
					$(".sj-yhmcw").show();
				}
			}catch(e){}
			return false;
		},
		init:function(){
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
   
			var form = $('#dynamic_login_form');
			form.submit(Operate.mobile_login.toLogin);
   
			var umobile=getCookie("LOGIN_Mobile");
			if(umobile!=null&&!umobile.toString().isnullorempty()){
				$('#loginMobile').val(umobile);
				$('#rememberLoginMobile').attr("checked",true);
			}
		}
	};
}();


function _login_ing(){
	$("input[name='submit']").attr("disabled",true);
	$("input[name='submit']").addClass("go-hui");
	$("input[name='submit']").val("濮濓絽婀惂璇茬秿..");
}
function _login_ed(){
	$("input[name='submit']").attr("disabled",false);
	$("input[name='submit']").removeClass("go-hui");
	$("input[name='submit']").val("鐧诲綍");
}

function yes_Send(){
	$("#loadCode").attr('disabled',true);//濞ｈ濮瀌isabled
	$("#loadCode").addClass("shouji-hui");
    $("#loadCode").val("鍔ㄦ�鐮佸彂閫佹垚鍔�"+timeout+"鍚庡彲閲嶆柊鍙戦�锛�");
	timeout--;
	if(timeout == 0) {
		$("#loadCode").val("閼惧嘲褰囬崝銊︹偓浣虹垳");
		$("#loadCode").removeClass("shouji-hui");
		$("#loadCode").attr('disabled',false); //缁夊娅巇isabled鐏炵偞鈧拷
		timeout=60;
	}else{
		setTimeout("yes_Send()", 1000);
	}
}
function no_Send(){
	$("#loadCode").attr('disabled',true);//濞ｈ濮瀌isabled
	$("#loadCode").addClass("shouji-hui");
	$("#loadCode").val("鍔ㄦ�鐮佸彂閫佹垚鍔�"+timeout+"鍚庡彲閲嶆柊鍙戦�锛�");
	timeout--;
	if(timeout == 0) {
		$("#loadCode").val("閼惧嘲褰囬崝銊︹偓浣虹垳");
		$("#loadCode").removeClass("shouji-hui");
		$("#loadCode").attr('disabled',false); //缁夊娅巇isabled鐏炵偞鈧拷
		timeout=60;
	}else{
		setTimeout("no_Send()", 1000);
	}
}
function Enterpt(obj){
	if(obj.keyCode == 13){
		$("#pt_login").click();
	}
}
function Enterdt(obj){
	if(obj.keyCode == 13){
		$("#dt_login").click();
	}
}