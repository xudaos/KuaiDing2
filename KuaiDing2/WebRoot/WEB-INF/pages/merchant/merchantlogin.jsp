<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE9" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">   
<title>快订登录</title>
<link href="<%=path%>/pages/Restaurant/css/merchant/public.css" rel="stylesheet" type="text/css">
<link href="<%=path%>/pages/Restaurant/css/merchant/base_d.css" rel="stylesheet" type="text/css">

</head>

<body>

<div class="clear w1000 ma ">
    <div class="zfd mt10">
       <img src="<%=path%>/pages/Restaurant/images/logo.png" width="141" height="88">
    </div>
    <div class="zfd mt10 f32 ml10 mr10 ">|</div>
    <div class="zfd mt10 f24">商户登录</div>
</div> 

<div class="clear w100 js">
    <div class="clear w1000 ma js">
        <div class="zfd"><img src="<%=path%>/pages/Restaurant/images/login1.png" width="550" height="450">
        </div>
        <div class="yfd w380 p bai mt40"> 
           <form id="loginForm" method="post" action="/Identity/LoginNew.do" name="form1">
             <div class="w370 ma bai01 p20">
                <div class="clear w100">
                    <div class="zfd f14">手机号 </div>
                    <div class="zfd f14r">*</div>
                    <div class="yfd f12"><a href="/Identity/MainPage1.do?init=init">使用其他方式登录</a></div>
                </div>
               <div class="clear w100">
                    <div class="zfd"><img src="<%=path%>/pages/Restaurant/images/sjh.png" width="50" height="32"></div>
                    <div class="zfd"><input class="wb1 pl10" id="companyName" name="companyName" onBlur="getUser()" type="text" placeholder="请输入手机号码"></div>
               </div>
               <div class="clear w100 mt10">
                    <div class="zfd f14">用户名</div>
                    <div class="zfd f14r">*</div>
                    <div class="yfd f12r"><span id="czy"></span></div>
               </div>
               <div class="clear w100">
                    <div class="zfd"><img src="<%=path%>/pages/Restaurant/images/yhm.png" width="50" height="32"></div>
                       <div class="zfd"><!-- <input class="wb1 pl10" name="" type="text" placeholder="请输用户名"> -->
  	                     <select name="loginName" id="loginName"  onchange="getvalue(this)" style="width: 287px;height:33px; border: 1px solid #ddd;font-family: '微软雅黑',Tahoma,Geneva,sans-serif;">
                     	   <option value="">--</option>
                         </select>
                       </div>
                    </div>
                    <div class="clear w100 mt10">
                         <div class="zfd f14">密码</div>
                         <div class="zfd f14r">*</div>
                    </div>
                    <div class="clear w100">
                         <div class="zfd"><img src="<%=path%>/pages/Restaurant/images/mm.png" width="50" height="32"></div>
                         <div class="zfd"><input class="wb1 pl10" id="password" name="password" type="password" placeholder="请输入密码"></div>  </div>
                         <div class="" id="yanzhengma" style="display:none;">
                             <div class="clear w100 mt10">
                                 <div class="zfd f14">验证码</div>
                                 <div class="zfd f14r">*</div>
                             </div>
                	         <div class="zfd">
                	             <input id="verifyCode" name="verifyCode" class="wb4 pl10" type="text" />
                    	         <input id="errorNum" name="errorNum" type="hidden"/>
                             </div>
                             <div class="yzmtp zfd">
                    	         <img class="vc-pic" alt="点击刷新验证码" src='/ImageServlet?time=+new Date().getTime()' style="cursor:pointer;width:100px;height:33px;display:block;" id="v_pic" name="v_pic" />
                   		     </div>
                             <div class="yfd ml10 f14j lh33"><a href="javascript:;" onclick="jQuery('#v_pic').click();">换一张</a>
                    	</div>
         	        </div>
               <div class="clear w100 mt10 mb10">
                    <div class="yfd">
                        <div class="zfd"><input class="fxk mt02" name="" type="checkbox" value=""></div>
                        <div class="zfd ml10 f12"><a href="#">记住密码</a></div>
                        <div class="zfd f12 ml10"><a href="/company/resetWd.do">忘记密码</a></div>
                    </div>
               </div>
               <div class="clear w100 mt10">
                    <input type="submit" class="w340 js f18 pl50" id="btn" value="登录" tabindex="8" style="border-style:none;"/>
               </div>
               <div class="clear w100 mt10">
                    <div class="yfd ml10 f14j"><a href="/company/query.do">入驻查询</a></div>
                    <div class="yfd f14j"><a href="/company/reggg.do">免费注册</a></div>
               </div>
            </div>
         </form>
      </div>
  </div>
</div>
<div class=" w100 hui mt10">
    <div class=" clear w1000 hui ma f14b pt10 pb10">
                       公司地址：北京市海淀区清华大学紫光大楼 &nbsp;&nbsp;&nbsp;&nbsp;邮编：100084&nbsp;&nbsp;&nbsp;&nbsp; 电话：010-62789898 &nbsp;&nbsp;&nbsp;&nbsp;传真：010-62547462<br>
                       京ICP备15022253号 Copyright © 2014 紫光美食云(北京)信息服务有限公司.All rights reserved
    </div>
</div>

<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/common.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/jquery_form.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/jquery.blockUI.js"></script>
<script type="text/javascript" src="<%=path%>/pages/Restaurant/js/merchant/package.js"></script>
<script src="<%=path%>/pages/Restaurant/js/merchant/messagecenter.js"></script>
<script type="text/javascript">
	
    $package('Ucb.login');
     
	Ucb.login = function() {
		return {
			toLogin : function() {
				try {
					$('#btn').attr('disabled','disabled');
					$('#sjmc').text("");
					$('#mm').text("");
					$('#yzm').text("");
					$('#czy').text("");
					var strCookie=document.cookie;
					//将多cookie切割为多个名/值对
					var arrCookie=strCookie.split("; ");
					var errorNum1;
					var errorNum2;
					var errorNum3;
					//遍历cookie数组，处理每个cookie对
					for(var i=0;i<arrCookie.length;i++){
						var arr=arrCookie[i].split("=");
						//找到名称为userId的cookie，并返回它的值
						if("errorNum1"==arr[0]){
							errorNum1=arr[1];
							break;
						}
					}
					for(var j=0;j<arrCookie.length;j++){
						var arr=arrCookie[j].split("=");
						//找到名称为userId的cookie，并返回它的值
						if("errorNum2"==arr[0]){
							errorNum2=arr[1];
							break;
						}
					}
					for(var k=0;k<arrCookie.length;k++){
						var arr=arrCookie[k].split("=");
						//找到名称为userId的cookie，并返回它的值
						if("errorNum3"==arr[0]){
							errorNum3=arr[1];
							break;
						}
					}
					if(errorNum2 == 2){
						if ($('#verifyCode').val() == ''){
								$('#btn').removeAttr('disabled');
								//	$.messager.alert('提示', '请输入验证码！');
								$('#yzm').text("请输入验证码！");
								
							} 
					}
					if ($('#companyName').val() != '') {
						if ($('#password').val() != '') {
							//if ($('#verifyCode').val() != '') {
								$('#loginForm').ajaxSubmit(
												{
													success : function(data) {

														if (data == 'success') {
															document.cookie="errorNum2=";
															document.cookie="errorNum1=";
															window.open('/Identity/MainPage.do','_self');
															
														}else if (data == 'nameAndPassError') {
															
															if(errorNum1 == null || errorNum1 == ''){
																if(errorNum2 == 2){
																	//addCookie(errorNum3,3,0.5);
																	//document.cookie="errorNum3=3";
																	$('#yanzhengma').show();
																	$('#errorNum').val(errorNum2);
																	//document.cookie="errorNum2=";
																}else{
																	
																		document.cookie="errorNum1=1";  
																}	
															}else{//第三次登录
																document.cookie="errorNum2=2";
																//delCookie(errorNum1);
																document.cookie="errorNum1=";
															}
														
															
															$('#czy').text("密码错误！");
															
															
														}else if (data == 'noverify2') {
															$.messager.alert('提示','亲，审核没有通过哦 请查看原因！','error');
															return;
														}  else if (data == 'vcodeError') {
															$('#verifyCode').val('');
															//$.messager.alert('提示','验证码输入错误！','error');
															$('#czy').text("验证码错误！");
														}else if (data == 'companyNameError') {
															$('#companyName').val('');
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');
															//$.messager.alert('提示','此门店不存在！','error');
															$('#czy').text("手机号不存在！");
														} else if (data == 'nameAndPassError') {
															//$('.companyName').val('');
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');
														
														} else if (data == 'userInactive') {
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');
															//$.messager.alert('提示','此操作员已被禁用！','error');
															$('#czy').text("操作员禁用！");
														} else if (data == 'forbidden') {
															$('#companyName').val('');
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');
															//$.messager.alert('提示','此门店已被禁用！','error');
															$('#czy').text("门店禁用！！");
														}else if (data == 'mobileError') {
															$('#companyName').val('');
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');                                           
															//$.messager.alert('提示','此门店已被禁用！','error');
															$('#czy').text("手机号异常！");
														} else {
															$('#companyName').val('');
															$('#loginName').val('');
															$('#password').val('');
															$('#verifyCode').val('');
														//	$.messager.alert('提示','系统故障，请联系管理员！','error');
														}
														 $('#btn').removeAttr('disabled');
														Ucb.login.loadVrifyCode();//刷新验证码 
													},
													error : function(data) {
														$('#verifyCode').val('');
														Ucb.login.loadVrifyCode();//刷新验证码
													//	$.messager.alert('提示','系统故障，请联系管理员！','error');
													}
												});
							 /* } else {
								$('#btn').removeAttr('disabled');
							//	$.messager.alert('提示', '请输入验证码！');
							$('#yzm').text("请输入验证码！");
							}  */
						} else {
							$('#btn').removeAttr('disabled');
							//$.messager.alert('提示', '请输入密码！');
							$('#czy').text("请输入密码！"); 
						}
					} else {
						$('#btn').removeAttr('disabled');
						//$.messager.alert('提示', '请输入店铺名称！');
						$('#czy').text("请输入手机号！");
					}
				} catch (e) {

				}
				return false;
			},
			loadVrifyCode : function() {//刷新验证码
				var _url = '/ImageServlet?time='
						+ new Date().getTime();
				$(".vc-pic").attr('src', _url);
			},
			init : function() {
				if (window.top != window.self) {
					window.top.location = window.self.location;
				}
				//验证码图片绑定点击事件
				$(".vc-pic").click(Ucb.login.loadVrifyCode);

				var form = $("#loginForm");
				form.submit(Ucb.login.toLogin);
			}
		};
	}();	

$(function() {
		var strCookie=document.cookie;
		//将多cookie切割为多个名/值对
		var arrCookie=strCookie.split("; ");
		var errorNum2;
		//遍历cookie数组，处理每个cookie对
		for(var i=0;i<arrCookie.length;i++){
			var arr=arrCookie[i].split("=");
			//找到名称为userId的cookie，并返回它的值
			if("errorNum2"==arr[0]){
				errorNum2=arr[1];
				break;
			}
		}
		if(errorNum2 == 2){
				$('#errorNum').val(errorNum2);
				$('#yanzhengma').show();
		}
		var companyName = '';
		
		if(companyName!='') {
			$('#companyName').val(companyName);
		}
		$('#loginName').val('');
		Ucb.login.init();
		
		
		$('#btn').click(function(){
			//$("#loginForm").submit();
		});
		
		
	});
	
	function checkParent() {
		if (window.parent.length > 0) {
			window.parent.location = "../";
			alert('页面已过期，请重新登录！');
		}
	}
	function resetform(formname) {
		for ( var i = 0; i < formname.elements.length; i++) {
			formname.elements[i].value = "";
		}
	}
	
	function getUser(){
		$('#czy').text("");
		var mobile = $('#companyName').val();
		if(mobile==""){
			$('#czy').text("请输入手机号！");
		}else{
		var reg_phone = /^1[34578]\d{9}$/;
        		if(!reg_phone.test(mobile)){
        			$('#czy').text("手机号错误！");
        			   	return;
        	}else{
        			$.ajax({
                                    type: 'POST',
                                    url: '/company/queryUser.do',
                                    dataType: 'json',
                                    data:{
        			               	companyName:$('#companyName').val()
        			            	},
                                    success: function(r) {
                                     if(r && r.success) {
                                         var a = r.obj;
                                         
                                         $('#loginName').html('');
										 var result = '';
	                                         
	                                      $.each(a,function(name,value) {
										    result = '<option value="'+value.text+'">'+value.text+'</option>';
											$('#loginName').append(result);
										  }); 
										 	 
										 //$('#ddlResourceType').html(result);
                                         /* $('#loginName').combobox({
			        						data:a,
								           	valueField:'text',   
											textField:'text',
											editable:false,
										    formatter:function(row){
										        return '<input class="">'+row.text+'</input>';
										    }
							        	}) */
                                     }else {
                                           $('#czy').text(r.msg);
                                       } 
                                    },
                                    error: function(data) {
                                     //   $.messager.alert('提示','删除出错!');
                                    }
                                  });	  	   						
        	}
		}
		//查询用户					
	}
</script>

</body>
</html>
