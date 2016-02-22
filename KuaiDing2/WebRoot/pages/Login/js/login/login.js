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
					                		SetCookie("LOGIN_NAME",ln.trim(),7);
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
					                	$(".yhmcw").html("您输入的用户名不存在");
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
						                	$(this).pointMsg({msg:'您输入的用户名或密码错误'});
					                	}
					                }
					                $('#verifyCode').val('');
					                Operate.login.loadVrifyCode();
					            },
					            error: function(data) {
					            	//$.messager.progress('close');
					            	$(this).pointMsg({msg:'您输入的用户名或密码错误'});
					            	_login_ed();
					                $('#verifyCode').val('');
					                Operate.login.loadVrifyCode();
					            }
							});
						}else{
							_login_ed();
							$(".yzmcw").html("请输入验证码");
							$(".yzmcw").show();
						}
					}else{
						_login_ed();
						$(".mmcw").html("请输入密码");
						$(".mmcw").show();
					}
				}else{
					_login_ed();
					$(".yhmcw").html("请输入用户名");
					$(".yhmcw").show();
				} 
			}catch(e){
							
			}
			return false;
		},
		loadVrifyCode:function(){
			var _url = path+"/ImageServlet?time="+new Date().getTime();
			$('#v_pic').attr('src',_url);
		},
		init:function(){
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
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
						$(".sj-yhmcw").html("请输入正确的手机号");
						$(".sj-yhmcw").show();
					}else{
						if($('#mobileCode').val() != ''){
							$(".sj-mmcw").html("");
							$(".sj-mmcw").hide();
							$('#dynamic_login_form').ajaxSubmit({
					        	success: function(data) {
					                if(data == 'memSuccess') {
					                	if($("#rememberLoginMobile").attr("checked")=="checked"){
					                		SetCookie("LOGIN_MOBILE",$('#loginMobile').val().trim().trim(),7);
					                	}
					                	if(login_type==1){
					                		window.location.reload();
					                	}else{
					                		window.open(path+"/index/", '_self');
					                	}
					                } else if(data == 'vcodeError'){
					                	_login_ed();
					                	$(".sj-mmcw").html("您输入的密码错误");
					                	$(".sj-mmcw").show();
										$('#mobileCode').select();
					                } else if(data == 'userInactive'){
					                	_login_ed();
					                	$(".sj-yhmcw").html("您输入的用户名不存在");
					                	$(".sj-yhmcw").show();
					                    $('#mobileCode').val('');
					                } else{
					                	$(this).pointMsg({msg:'您输入的手机号或动态码错误'});
					                	_login_ed();
					                }
					                $('#mobileCode').val('');
					            },
					            error: function(data) {
					            	$(this).pointMsg({msg:'您输入的手机号或动态码错误'});
					                $('#mobileCode').val('');
					                _login_ed();
					        	}
					        });
						}else{
							_login_ed();
							$(".sj-mmcw").html("请输入动态码");
							$(".sj-mmcw").show();
						}
					}
				}else{
					_login_ed();
					$(".sj-yhmcw").html("请输入手机号");
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
	$("input[name='submit']").val("正在加载..");
}
function _login_ed(){
	$("input[name='submit']").attr("disabled",false);
	$("input[name='submit']").removeClass("go-hui");
	$("input[name='submit']").val("确定");
}

function yes_Send(){
	$("#loadCode").attr('disabled',true);
	$("#loadCode").addClass("shouji-hui");
    $("#loadCode").val("请在"+timeout+"秒后重新登录");
	timeout--;
	if(timeout == 0) {
		$("#loadCode").val("点击获取动态码");
		$("#loadCode").removeClass("shouji-hui");
		$("#loadCode").attr('disabled',false); 
		timeout=60;
	}else{
		setTimeout("yes_Send()", 1000);
	}
}
function no_Send(){
	$("#loadCode").attr('disabled',true);
	$("#loadCode").addClass("shouji-hui");
	$("#loadCode").val("请在"+timeout+"秒后重新登录");
	timeout--;
	if(timeout == 0) {
		$("#loadCode").val("点击获取动态码");
		$("#loadCode").removeClass("shouji-hui");
		$("#loadCode").attr('disabled',false);
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