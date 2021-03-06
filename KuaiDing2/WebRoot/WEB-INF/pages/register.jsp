<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="zh-cn">
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户登录-快订-专业的餐饮服务平台,提供餐厅自助点餐、外卖、预订及美食社区资讯</title>
    <meta name="keywords" content="快订,餐饮O2O平台,外卖订餐,预订点餐,餐厅订桌,打折优惠,美食社区,网上订餐,快餐外卖,美食资讯" />
    <meta name="description" content="快订-拥有众多优质餐厅,为您提供快速,便捷的线上订餐服务,为您提供最全,最新鲜的美食信息,致力打造中国最大的订餐平台和美食分享社区,轻松实现网上订餐,手机App订餐!" />
    <meta name="baidu-site-verification" content="zcXqQTs5gr" />
    <link rel="shortcut icon" href="<%=path%>/pages/Login/images/200.png" />

    <link rel="stylesheet" href="<%=path%>/pages/Login/css/login/common.css" type="text/css"/>
    <link rel="stylesheet" href="<%=path%>/pages/Login/css/login/msgbox.css" type="text/css"/>
    <link rel="stylesheet" href="<%=path%>/pages/Login/css/login/bootstrap_modal.css" type="text/css"/>
    <link rel="stylesheet" href="<%=path%>/pages/Login/css/login/login.css" type="text/css"/>

</head>

<body>

    <div class="login">
	    <div class="login-logo">
    	    <a href="home.do"><img src="<%=path%>/pages/Login/images/logo.png" /></a>
            <h1>欢迎注册</h1>
        </div>
    
        <div class="login-main">
    	    <div class="main-left">
        	    <img src="<%=path%>/pages/Login/images/login-img.png" />
        	</div>
        	<input id="login_type" type="hidden" value="0" />
        
	<div class="login-main-right">
		<ul class="right-nav">
    		<li data-type="1" class="li1 lihover">邮箱注册</li>
        	<li data-type="2" class="li2">手机号注册</li>
    	</ul>
    	<div id="general_login" class="form" onkeydown="Enterpt(event)">
    		<form action="/Operate/DoLogin.do" method="post" id="general_login_form">
    		<p>
        		<span class="span1">邮&nbsp;&nbsp;&nbsp;箱：</span>
            	<input class="input1" name="loginName" id="loginName" type="text" placeholder="请输入邮箱" />
            
       	 	</p>
        	<p>
            	<span class="span1">密&nbsp;&nbsp;&nbsp;码：</span>
            	<input class="input1" name="loginPass" id="loginPass" type="password" />
           
        	</p>
        	<p>
            	<span class="span1">确认密码：</span>
            	<input class="input1" name="loginPass2" id="loginPass" type="password2" />
           
        	</p>
        	<p class="p2">
            	<span class="span1"></span>
            	<input class="input3" name="chkRememberLoginName" id="chkRememberLoginName" type="checkbox" />
            	<label for="chkRememberLoginName">我同意</label>
            	<a class="a1" href="/findpass/">《用户服务协议》</a>
        	</p>
        	<input type="button" id="pt_login" name="submit" class="go" value="注册" />
    		</form>
    		<p class="cuowu yhmcw"></p>
        	<p class="cuowu mmcw"></p>
        	<p class="cuowu yzmcw"></p>
    	</div>
    
    	<div id="dynamic_login" class="form fonm-none" onkeydown="Enterdt(event)">
    		<form id="dynamic_login_form" action="/Operate/DynamicLogin.do" method="post">
    		<p class="shouji-p">
        		<span class="span1">手机号：</span>
            	<input class="input1" id="loginMobile" name="loginMobile" type="text" placeholder="手机号" />
        	</p>
         	<p class="sj-yzm">
        		<span class="span1"></span>
        		<input id="loadCode" type="button" class="shouji-span" value="获取动态码" />
        	</p>
        	<p>
            	<span class="span1">动态码：</span>
            	<input class="input2" id="mobileCode" name="mobileCode" type="text" />
        	</p>
        	
        	<p class="p2">
            	<span class="span1"></span>
            	<input class="input3" name="chkRememberLoginName" id="chkRememberLoginName" type="checkbox" />
            	<label for="chkRememberLoginName">我同意</label>
            	<a class="a1" href="/findpass/">《用户服务协议》</a>
        	</p>
        	<input type="button" class="go" name="submit" id="dt_login" value="注册" />
    		</form>
    		<p class="cuowu sj-yhmcw"></p>
        	<p class="cuowu sj-mmcw"></p>
    	</div>
  	</div>
</div>
<div class="footer">
	<p>公司地址：北京市海淀区清华大学紫光大楼 邮编：100084 电话：010-62789898 传真：010-62547462<br />京ICP备15022253号 Copyright © 2014 紫光美食云(北京)信息服务有限公司.All rights reserved<span style="padding-left:5px;display: inline-block;vertical-align: middle;"></span></p>
</div>
</div>
<!-- 弹框提示 -->
<div id="bj_div" style="top:0;left:0;position:absolute;z-index:10000;background:#666;opacity:0.5; display:none;"></div>
	<div id="msg_box" class="msg-box">
		<div class="p1"><a id="close_msg" href="javascript:;">&times;</a>快订提醒您！</div>
		<p class="p2" id="msg_info"></p>
    	<a id="msg_btn" href="javascript:void(0)" class="input_btn" name="yes">确定</a>
    	<a id="no_btn" href="javascript:void(0)" class="input_btn" name="no">取消</a>
</div>

<script type="text/javascript" src="<%=path%>/pages/Login/js/login/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/common.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/jquery.placeholder.js"></script>
<script src="<%=path%>/pages/Login/js/login/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/msgbox.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/move-top.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/package.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/jquery_form.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Login/js/login/login.js"></script>

<script type="text/javascript">
$(function(){
	Operate.login.init();
	Operate.mobile_login.init();
	//头步切换
	$(".right-nav li").live("click",function(){
		$(".right-nav li").removeClass("lihover");
		$(this).addClass("lihover");
		if($(this).attr("data-type")==1){
			$("#general_login").removeClass("fonm-none");
			$("#dynamic_login").addClass("fonm-none");	
		}else{
			$("#general_login").addClass("fonm-none");
			$("#dynamic_login").removeClass("fonm-none");
		}
	});
	
	//普通方式登录
	$("#pt_login").click(function(){
		_login_ing();
		$("#general_login_form").submit();
	});
	
	//动态方式登录
	$("#dt_login").click(function(){
		_login_ing();
		$("#dynamic_login_form").submit();
	});
	
	//获取动态验证码
	$("#loadCode").click(function(){
		var v = $('#loginMobile').val();
		if(v =='' || !mfilter.test(v)){
			$(".sj-yhmcw").html("请输入正确手机号！");
			$(".sj-yhmcw").show();
		}else{
			$(".sj-yhmcw").html("");
			$(".sj-yhmcw").hide();
			$.ajax({
			    type: 'POST', 
	            dataType: 'text', 
				url		:  path+'/Operate/GetDynamicCode.do',
				data	:  'mobile='+v,
				error: function (XMLHttpRequest, textStatus, errorThrown) { },
				success:function(data){
					if(data==1){
						yes_Send();
					}else if(data=='4085'){
						$(".sj-yhmcw").html("同一手机号一天只能接收5次短信!");
						$(".sj-yhmcw").show();
					}else {
						no_Send();
					}
				}
			});
		}
	});
});

</script>

</body>
	
</html>
