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
<title>快订-专业的餐饮服务平台,提供餐厅自助点餐、外卖、预订及美食社区资讯</title>

<meta name="baidu-site-verification" content="zcXqQTs5gr" />
<link rel="shortcut icon" href="<%=path%>/pages/Restaurant/images/200.png" />

<link href="<%=path%>/pages/Restaurant/css/common.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/pages/Restaurant/css/msgbox.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/pages/Restaurant/css/bootstrap_modal.css" rel="stylesheet" type="text/css" />

<style type="text/css">
var path = '';
</style>

<link rel="stylesheet" href="<%=path%>/pages/Restaurant/css/home.css" type="text/css"/>
<link rel="stylesheet" href="<%=path%>/pages/Restaurant/css/jBootstrapPage.css" type="text/css"/>

</head>

<body>

<div class="top">
	<div class="container">
    	<div class="top-left">
        	<div>
        		<a class="a1" href="javascript:;">收藏网站</a>
            </div>
            <div class="dz">
                <a class="a2" id="city_addr" href="javascript:;">北京市[更换]</a>
                <ul id="city_list">
                	
                		<li><a data-id="110100" href="javascript:;">北京市</a></li>
                	
                		<li><a data-id="120100" href="javascript:;">天津市</a></li>
                	
                		<li><a data-id="130100" href="javascript:;">石家庄市</a></li>
                	
                		<li><a data-id="130300" href="javascript:;">秦皇岛市</a></li>
                	
                		<li><a data-id="130400" href="javascript:;">邯郸市</a></li>
                	
                		<li><a data-id="130500" href="javascript:;">邢台市</a></li>
                	
                		<li><a data-id="130600" href="javascript:;">保定市</a></li>
                	
                		<li><a data-id="130900" href="javascript:;">沧州市</a></li>
                	
                		<li><a data-id="131000" href="javascript:;">廊坊市</a></li>
                	
                		<li><a data-id="131100" href="javascript:;">衡水市</a></li>
                	
                		<li><a data-id="140200" href="javascript:;">大同市</a></li>
                	
                		<li><a data-id="140400" href="javascript:;">长治市</a></li>
                	
                		<li><a data-id="140500" href="javascript:;">晋城市</a></li>
                	
                		<li><a data-id="140700" href="javascript:;">晋中市</a></li>
                	
                		<li><a data-id="140800" href="javascript:;">运城市</a></li>
                	
                		<li><a data-id="141000" href="javascript:;">临汾市</a></li>
                	
                		<li><a data-id="150100" href="javascript:;">呼和浩特市</a></li>
                	
                		<li><a data-id="150400" href="javascript:;">赤峰市</a></li>
                	
                		<li><a data-id="150900" href="javascript:;">乌兰察布市</a></li>
                	
                		<li><a data-id="210100" href="javascript:;">沈阳市</a></li>
                	
                		<li><a data-id="210200" href="javascript:;">大连市</a></li>
                	
                		<li><a data-id="210300" href="javascript:;">鞍山市</a></li>
                	
                		<li><a data-id="210400" href="javascript:;">抚顺市</a></li>
                	
                		<li><a data-id="210500" href="javascript:;">本溪市</a></li>
                	
                		<li><a data-id="210700" href="javascript:;">锦州市</a></li>
                	
                		<li><a data-id="211100" href="javascript:;">盘锦市</a></li>
                	
                		<li><a data-id="220100" href="javascript:;">长春市</a></li>
                	
                		<li><a data-id="220200" href="javascript:;">吉林市</a></li>
                	
                		<li><a data-id="220800" href="javascript:;">白城市</a></li>
                	
                		<li><a data-id="230100" href="javascript:;">哈尔滨市</a></li>
                	
                		<li><a data-id="230200" href="javascript:;">齐齐哈尔市</a></li>
                	
                		<li><a data-id="230300" href="javascript:;">鸡西市</a></li>
                	
                		<li><a data-id="230400" href="javascript:;">鹤岗市</a></li>
                	
                		<li><a data-id="230500" href="javascript:;">双鸭山市</a></li>
                	
                		<li><a data-id="230600" href="javascript:;">大庆市</a></li>
                	
                		<li><a data-id="230700" href="javascript:;">伊春市</a></li>
                	
                		<li><a data-id="230800" href="javascript:;">佳木斯市</a></li>
                	
                		<li><a data-id="230900" href="javascript:;">七台河市</a></li>
                	
                		<li><a data-id="231000" href="javascript:;">牡丹江市</a></li>
                	
                		<li><a data-id="231100" href="javascript:;">黑河市</a></li>
                	
                		<li><a data-id="231200" href="javascript:;">绥化市</a></li>
                	
                		<li><a data-id="320100" href="javascript:;">南京市</a></li>
                	
                		<li><a data-id="320200" href="javascript:;">无锡市</a></li>
                	
                		<li><a data-id="320300" href="javascript:;">徐州市</a></li>
                	
                		<li><a data-id="320400" href="javascript:;">常州市</a></li>
                	
                		<li><a data-id="320500" href="javascript:;">苏州市</a></li>
                	
                		<li><a data-id="330100" href="javascript:;">杭州市</a></li>
                	
                		<li><a data-id="330200" href="javascript:;">宁波市</a></li>
                	
                		<li><a data-id="330300" href="javascript:;">温州市</a></li>
                	
                		<li><a data-id="330700" href="javascript:;">金华市</a></li>
                	
                		<li><a data-id="331100" href="javascript:;">丽水市</a></li>
                	
                		<li><a data-id="340100" href="javascript:;">合肥市</a></li>
                	
                		<li><a data-id="340500" href="javascript:;">马鞍山市</a></li>
                	
                		<li><a data-id="340800" href="javascript:;">安庆市</a></li>
                	
                		<li><a data-id="341200" href="javascript:;">阜阳市</a></li>
                	
                		<li><a data-id="350100" href="javascript:;">福州市</a></li>
                	
                		<li><a data-id="350500" href="javascript:;">泉州市</a></li>
                	
                		<li><a data-id="360100" href="javascript:;">南昌市</a></li>
                	
                		<li><a data-id="360200" href="javascript:;">景德镇市</a></li>
                	
                		<li><a data-id="360300" href="javascript:;">萍乡市</a></li>
                	
                		<li><a data-id="360400" href="javascript:;">九江市</a></li>
                	
                		<li><a data-id="360500" href="javascript:;">新余市</a></li>
                	
                		<li><a data-id="361000" href="javascript:;">抚州市</a></li>
                	
                		<li><a data-id="361100" href="javascript:;">上饶市</a></li>
                	
                		<li><a data-id="370100" href="javascript:;">济南市</a></li>
                	
                		<li><a data-id="370200" href="javascript:;">青岛市</a></li>
                	
                		<li><a data-id="370300" href="javascript:;">淄博市</a></li>
                	
                		<li><a data-id="370400" href="javascript:;">枣庄市</a></li>
                	
                		<li><a data-id="370500" href="javascript:;">东营市</a></li>
                	
                		<li><a data-id="370600" href="javascript:;">烟台市</a></li>
                	
                		<li><a data-id="370700" href="javascript:;">潍坊市</a></li>
                	
                		<li><a data-id="370800" href="javascript:;">济宁市</a></li>
                	
                		<li><a data-id="370900" href="javascript:;">泰安市</a></li>
                	
                		<li><a data-id="371000" href="javascript:;">威海市</a></li>
                	
                		<li><a data-id="371100" href="javascript:;">日照市</a></li>
                	
                		<li><a data-id="371300" href="javascript:;">临沂市</a></li>
                	
                		<li><a data-id="371500" href="javascript:;">聊城市</a></li>
                	
                		<li><a data-id="371600" href="javascript:;">滨州市</a></li>
                	
                		<li><a data-id="410100" href="javascript:;">郑州市</a></li>
                	
                		<li><a data-id="410200" href="javascript:;">开封市</a></li>
                	
                		<li><a data-id="410300" href="javascript:;">洛阳市</a></li>
                	
                		<li><a data-id="410400" href="javascript:;">平顶山市</a></li>
                	
                		<li><a data-id="410500" href="javascript:;">安阳市</a></li>
                	
                		<li><a data-id="410700" href="javascript:;">新乡市</a></li>
                	
                		<li><a data-id="410800" href="javascript:;">焦作市</a></li>
                	
                		<li><a data-id="410900" href="javascript:;">濮阳市</a></li>
                	
                		<li><a data-id="411000" href="javascript:;">许昌市</a></li>
                	
                		<li><a data-id="411200" href="javascript:;">三门峡市</a></li>
                	
                		<li><a data-id="411300" href="javascript:;">南阳市</a></li>
                	
                		<li><a data-id="411400" href="javascript:;">商丘市</a></li>
                	
                		<li><a data-id="411500" href="javascript:;">信阳市</a></li>
                	
                		<li><a data-id="411600" href="javascript:;">周口市</a></li>
                	
                		<li><a data-id="411700" href="javascript:;">驻马店市</a></li>
                	
                		<li><a data-id="420100" href="javascript:;">武汉市</a></li>
                	
                		<li><a data-id="420600" href="javascript:;">襄樊市</a></li>
                	
                		<li><a data-id="429000" href="javascript:;">省直辖行政单位</a></li>
                	
                		<li><a data-id="430100" href="javascript:;">长沙市</a></li>
                	
                		<li><a data-id="430600" href="javascript:;">岳阳市</a></li>
                	
                		<li><a data-id="440100" href="javascript:;">广州市</a></li>
                	
                		<li><a data-id="440300" href="javascript:;">深圳市</a></li>
                	
                		<li><a data-id="440800" href="javascript:;">湛江市</a></li>
                	
                		<li><a data-id="450100" href="javascript:;">南宁市</a></li>
                	
                		<li><a data-id="450200" href="javascript:;">柳州市</a></li>
                	
                		<li><a data-id="450300" href="javascript:;">桂林市</a></li>
                	
                		<li><a data-id="510100" href="javascript:;">成都市</a></li>
                	
                		<li><a data-id="520100" href="javascript:;">贵阳市</a></li>
                	
                		<li><a data-id="520400" href="javascript:;">安顺市</a></li>
                	
                		<li><a data-id="522400" href="javascript:;">毕节地区</a></li>
                	
                		<li><a data-id="530100" href="javascript:;">昆明市</a></li>
                	
                		<li><a data-id="610100" href="javascript:;">西安市</a></li>
                	
                		<li><a data-id="610400" href="javascript:;">咸阳市</a></li>
                	
                		<li><a data-id="620600" href="javascript:;">武威市</a></li>
                	
                		<li><a data-id="620700" href="javascript:;">张掖市</a></li>
                	
                		<li><a data-id="630100" href="javascript:;">西宁市</a></li>
                	
                		<li><a data-id="632100" href="javascript:;">海东地区</a></li>
                	
                		<li><a data-id="640100" href="javascript:;">银川市</a></li>
                	
                		<li><a data-id="650100" href="javascript:;">乌鲁木齐市</a></li>
                	
                		<li><a data-id="659000" href="javascript:;">省直辖行政单位</a></li>
                	
                </ul>
                </div>
            <div style="padding-left: 10px; margin-top: 1px;">
            	<a target="_blank" href="http://www.youmeishi.com.cn">紫光美食云</a>
            </div>
            <br class="clear" />
        </div>
        <ul id="top-right" class="top-right">
        	 <li class="li1">
            	<a class="a3" href="javascript:;">食客中心</a>&nbsp;|
            	<ul>
                    <li><a target="_blank" href="/register-process/">用户帮助</a></li>
                    <li><a href="javascript:;">售后服务</a></li>
                    <li><a target="_blank"  href="http://chat.looyu.com/chat/chat/p.do?c=52642&f=117797&g=82368">在线客服</a></li>
                    <li><a href="javascript:;">建议反馈</a></li>
                </ul>
            </li>
            <li style="width: 88px;" class="li1">
            	<a class="a3" href="javascript:;">商户中心</a>&nbsp;|
            	<ul>
            		<li><a target="_blank" href="http://platformucb.youmeishi.cn">商户入口</a></li>
            		<!-- <li><a target="_blank" href="http://info.unisapp.cn/Agents/">代理商入口</a></li> -->
                    <li><a target="_blank" href="http://platformucb.youmeishi.cn/company/reggg.do">免费开店</a></li>
                    <li><a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/page/download-center.html">下载中心</a></li>
                    <li><a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/page/video.jsp">培训中心</a></li>
                    <li><a target="_blank"  href="http://chat.looyu.com/chat/chat/p.do?c=52642&f=117797&g=82368">在线客服</a></li>
                </ul>
            </li>
            <li style="width: 88px;" class="li1">
            	<a class="a3" href="javascript:;">代理中心</a>&nbsp;|
            	<ul>
            		<li><a target="_blank" href="http://info.unisapp.cn/Agents/">代理商入口</a></li>
                    <li><a target="_blank" href="http://www.youmeishi.com.cn/ymsSite/downloads/紫光有美食·云餐饮管理系统agent.zip">软件下载</a></li>
                </ul>
            </li>
            <li class="li1">
            	<a class="a3" href="javascript:;">网站导航</a>&nbsp;|
            	<ul>
                    <li><a href="home.do">首页</a></li>
                    <li><a href="yd.do">预订点餐</a></li>
                    <li><a href="dz.do">预订桌位</a></li>
                    <li><a href="coupons.do">优惠折扣</a></li>
                </ul>
            </li>
            <li class="li1">
            	<a class="a4" href="javascript:;"><span class="span1"></span>手机客户端<span class="span2"></span></a>
            	<ul class="top-right-ewm">
                    <li>
                    	<img src="<%=path%>/pages/KD/images/yms-ewm.png" />
                    	<div>
                            <p>手机客户端</p>
                            <a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/downloads/yms.apk">立即下载 </a>
                        </div>
                    </li>
                    <li>
                    	<img src="<%=path%>/pages/KD/images/yms-ewm.png" />
                    	<div>
                            <p>二维码</p>
                            <a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/downloads/yms.apk">立即下载</a>
                        </div>
                    </li>
                </ul>
            </li>
            <br class="clear" />
        </ul>
<p class="top-right">
        	
				<span>您好，欢迎来到快订！</span>
	            <a target="_blank" href="login.do">[登录]</a>
	            <a href="register.do" target="_blank">[免费注册]</a>&nbsp;|			
        </p>
        <br class="clear" />
    </div>
</div>
<div class="header">
	<div class="container">
    	<div class="logo">
        	<p>一网扫尽天下美食</p>
        	<a href="home.do"><img src="<%=path%>/pages/KD/images/logo.png" alt="" /></a>
        </div>
        <div class="search">
        	<div id="top_search_form">
                <input class="input1" type="text" id="top_search_text" placeholder="请输入美食分类、区域位置、商圈等关键字" value="" name="keywords"/>
                <input class="input2" type="button" value="搜索" id="top_search_btn"/>
            </div>
            <p id="top_search_link">
            	<a target="_blank" title="湘间小灶" href="javascript:;">湘间小灶</a>
                <a target="_blank" title="北京土著部落" href="javascript:;">北京土著部落</a>
                <a target="_blank" title="波斯波利斯餐厅" href="javascript:;">波斯波利斯餐厅</a>
                <a target="_blank" title="佐译茶餐厅" href="javascript:;">佐译茶餐厅</a>
            </p>
        </div>
        <div class="order">
        	<a class="a1" href="gwc.do">查看购物车
        		<span>0</span>
                
            </a>
            <a class="a2" href="myorder.do">我的订单</a>
        </div>
    </div>
</div>

<div class="nav">
	<div class="container clearfix">
    	<ul class="nav-ul clearfix">
        	<li><a  href="home.do">首页</a></li>
            <li><a  href="yd.do">预订点餐</a></li>
            <li><a  href="dz.do">预订桌位</a></li>
        </ul>
        <div class="shangquan">
        	<p>热门商圈：</p>
            <ul>
            	
            		<li><a href="/BusinessCircle/1/">五道口</a></li>
            	
            		<li><a href="/BusinessCircle/2/">中关村</a></li>
            	
            		<li><a href="/BusinessCircle/11/">西直门</a></li>
            	     
            		<li><a href="/BusinessCircle/4/">马家堡</a></li>       	
            		<li><a href="/BusinessCircle/3/">工体</a></li>
                    
            		<li><a href="/BusinessCircle/7/">白纸坊</a></li>
            	
            		<li><a href="/BusinessCircle/5/">广安门</a></li>
            	
            		<li><a href="/BusinessCircle/13/">魏公村</a></li>
            	
            </ul>
            <a class="qbsq" href="/businesscircle/">全部商圈</a>
        </div>
    </div>
</div>

<div class="rst">
	<div class="container">
       <div class="rst-left">
          <ul class="rst-nav1">
             <img src="<%=path%>/pages/Restaurant/images/rst1.png" width="160" height="60" />
             <h4 style="margin-left:8px">中国全聚德大连烤鸭店</h4>
          </ul>
       </div>
      
       <div class="rst-right">
          <ul class="rst-nav2">
                <li class="bg5">
                	<a href=#>
                		<h4 style="margin-left:65px">留言</h4>
                    </a>
                </li>
                <li class="bg4">
                	<a href=#>
                		<h4 style="margin-left:65px">评价</h4>
                    </a>
                </li>
                <li class="bg3">
                	<a href=#>
                		<h4 style="margin-left:55px">美食墙</h4>
                    </a>
                </li>
                <li class="bg2">
                	<a href=#>
                		<h4 style="margin-left:40px">商家信息</h4>
                    </a>
                </li>
                <li class="bg1">
                	<a href=#>
                		<h4 style="margin-left:65px">菜单</h4>
                	</a>
                </li>
            </ul>
       </div>
    </div>
</div>

<div class="rst-lists">
   <div class="container">
          <div class="rst-menu">
             <div class="menu-top">
                <ul class="bg1">
                	  <li><h4 style="margin-left:50px">菜单</h4></li>
                </ul>
             </div>
             
             <div class="menu">
                <div id="menuKinds" class="menu-kinds">                  
                   <ul class="title">
                      <li>
                         <h1>美食分类</h1>
                      </li>
                   </ul>
                   <ul id="menuLists" class="menu-lists">
                   </ul>
                </div>
             </div>
          </div>         
       
          <div class="rst-sjxx">
             <div class="sjxx-top">
                <ul class="bg2">
                	  <li><h4 style="margin-left:50px">商家信息</h4></li>
                </ul>
             </div>
             
             <div class="sjxx">
                <div class="sjxx-info">                  
                   <ul class="title">
                      <li>
                         <h1>商家基本资料</h1>
                      </li>
                   </ul>
                   <ul class="sjxx-lists" id="sjxx_lists">
                      <li><h5>商家简介:</h5></li>
                      <li><h5>商家地址:</h5></li>
                      <li><h5>营业时间:</h5></li>
                      <li><h5>距离:</h5></li>
                      <li><h5>电话:</h5></li>
                      <li><h5>起送价:</h5></li>
                   </ul>
                </div>
             </div>
          </div>
          
          <div class="rst-pics">
             <div class="pics-top">
                <ul class="bg3">
                	  <li><h4 style="margin-left:50px">美食墙</h4></li>
                </ul>
             </div>
             
             <div class="pics">
                <div class="pics-info">                  
                   <ul class="title">
                      <li><button class="button3">图片最赞</button></li>
                      <li><button class="button3">销量最高</button></li>
                      <li><button class="button3">评价最好</button></li>
                      <li><button class="button3">价格最低</button></li>
                   </ul>
                   <ul class="pics-lists" id="pics">
                      
                   </ul>
                </div>
             </div>
          </div>
          
          <div class="rst-evaluate">
             <div class="evaluate-top">
                <ul class="bg4">
                	  <li><h4 style="margin-left:50px">评价</h4></li>
                </ul>
             </div>
             
             <div class="evaluate">
                <div class="evaluate-info">
                   <ul class="evaluate-rst">
                      <li class="p0">
                         <h1>中国全聚德大连烤鸭店</h1>
                         <h3>4.6</h3>
                         <span>
                               <img  src="<%=path%>/pages/Restaurant/images/star5.png" />
                               <br />
                               <h7 style="margin-left:20px">320人评价</h7>
                          </span> 
                      </li>
                      <li class="pingjia1">
                         <p><img  src="<%=path%>/pages/Restaurant/images/star5.png" /></p>
                         <p><img  src="<%=path%>/pages/Restaurant/images/star4.png" /></p>
                         <p><img  src="<%=path%>/pages/Restaurant/images/star3.png" /></p>
                         <p><img  src="<%=path%>/pages/Restaurant/images/star2.png" /></p>
                         <p><img  src="<%=path%>/pages/Restaurant/images/star1.png" /></p>
                      </li>
                      <li class="pingjia2">
                         <p class="rectangle5"></p>
                         <p class="rectangle4"></p>
                         <p class="rectangle3"></p>
                         <p class="rectangle2"></p>
                         <p class="rectangle1"></p> 
                      </li>
                      <li class="pingjia3">
                          <p><h7>76%</h7></p>
                          <p><h7>16%</h7></p>
                          <p><h7>5%</h7></p>
                          <p><h7>2%</h7></p>
                          <p><h7>1%</h7></p>
                      </li>
                   </ul>                  
                   <ul class="title">
                      <li><button class="button3">全部评价</button></li>
                   </ul>
                   <ul class="evaluate-lists" id="evaluations">
                      
                   </ul>
                </div>
             </div>
          </div>
          
          <div class="rst-comments">
          <div class="comments-top">
                <ul class="bg5">
                	  <li><h4 style="margin-left:50px">留言</h4></li>
                </ul>
             </div>
             
             <div class="comments">
                <div class="comments-info">                  
                   <ul class="title">
                      <li><button class="button3">全部留言</button></li>
                   </ul>
                   <ul class="comments-lists" id="comments">
                      
                   </ul>
                </div>
             </div>
          </div>       
   </div>
</div>

<div class="footer">
    <div class="container">
    	<div class="footer-about">
        	<div>
            	<p class="p1">关于我们</p>
                <ul>
                	<li><a target="_blank" href="/introduction/">快订简介</a></li>
                    <li><a target="_blank" href="/contact/">联系我们</a></li>
                    <li><a target="_blank" href="/partners/">合作伙伴</a></li>
                    <li><a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/RecType/ConListPre.do">诚聘英才</a></li>
                </ul>
            </div>
            <div>
            	<p class="p2">加入我们</p>
                <ul>
                	<li><a target="_blank" href="http://platformucb.youmeishi.cn">商户入口</a></li>
                    <li><a target="_blank" href="http://info.unisapp.cn/Agents/">代理商入口</a></li>
                </ul>
            </div>
            <div>
            	<p class="p3">网站条款</p>
                <ul>
                	<li><a target="_blank" href="/member/">会员条款</a></li>
                    <li><a target="_blank" href="/bbsguide/">社区指南</a></li>
                    <li><a target="_blank" href="/copyright/">版权声明</a></li>
                    <li><a target="_blank" href="/disclaimer/">免责声明</a></li>
                </ul>
            </div>
            <div>
            	<p class="p4">帮助中心</p>
                <ul>
                	<li><a target="_blank" href="/register-process/">用户帮助</a></li>
                    <li><a href="javascript:;">商家帮助</a></li>
                    <li><a target="_blank" href="http://self.youmeishi.cn/TrainPlatform/page/video.jsp">培训中心</a></li>
                    <li><a target="_blank" href="http://chat.looyu.com/chat/chat/p.do?c=52642&f=117797&g=82368" target="_blank">在线客服</a></li>
                </ul>
            </div>
            <div>
            	<p class="p5">关注我们</p>
                <ul>
                	<li><a target="_blank" href="http://weibo.com/youmeishi">新浪微博</a></li>
                	<li><a target="_blank" href="http://www.youmeishi.com.cn">紫光美食云</a></li>
                </ul>
            </div>
            <div class="div1">
            	<p>快订微信</p>
                <img src="<%=path%>/pages/KD/images/footer-ewm.png" />
                <a href="javascript:;">扫描二维码</a>
                <a href="javascript:;">关注快订微信</a>
            </div>
            <div class="div1">
            	<p>快订APP</p>
                <img src="<%=path%>/pages/KD/images/yms-ewm.png" />
                <a href="javascript:;">扫描二维码</a>
                <a href="javascript:;">下载快订APP</a>
            </div>
            <div class="div1">
            	<a href="http://platformucb.youmeishi.cn" target="_blank"><img class="img1" src="<%=path%>/pages/KD/images/footer-sj.png" /></a>
            </div>
        </div>
        <div class="blogroll">
        	<span>友情链接：</span>
        	<a target="_blank" href="http://www.thunis.com/">紫光股份有限公司</a>
            <a target="_blank" href="http://www.tusholdings.com/">启迪控股</a>
            <a target="_blank" href="http://www.tsinghua.edu.cn/publish/newthu/index.html">清华大学</a>
            <a target="_blank" href="http://www.unisapp.cn/">Unis紫光</a>
        </div>
        <div class="div1">
            <p><a target="_blank" href="http://www.miitbeian.gov.cn/publish/query/indexFirst.action">京ICP备15022253号</a>&nbsp;Copyright&nbsp;&copy;&nbsp;2014&nbsp;紫光美食云(北京)信息服务有限公司.All&nbsp;rights&nbsp;reserved</p>
            <p>公司地址：北京市海淀区清华大学紫光大楼&nbsp;&nbsp;邮编：100084&nbsp;&nbsp;电话：010-62789898&nbsp;&nbsp;传真：010-62547462</p>
        </div>
    </div>
</div>
<div id="go_top"><a href="javascript:;" title="返回顶部">返回顶部</a></div>

<!-- 弹框提示 -->
<div id="bj_div" style="top:0;left:0;position:absolute;z-index:10000;background:#666;filter:alpha(opacity=50);opacity:0.5; display:none;"></div>
<div id="msg_box" class="msg-box">
	<div class="p1"><a id="close_msg" href="javascript:;">&times;</a>快订提醒您！</div>
	<p class="p2" id="msg_info"></p>
    <a id="msg_btn" href="javascript:void(0)" class="input_btn" name="yes">确定</a>
    <a id="no_btn" href="javascript:void(0)" class="input_btn" name="no">取消</a>
</div>

<script type="text/javascript" src="<%=path%>/pages/KD/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=path%>/pages/KD/js/common.js"></script>
<script type="text/javascript" src="<%=path%>/pages/KD/js/jquery.placeholder.js"></script>
<script src="<%=path%>/pages/KD/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/pages/KD/js/msgbox.js"></script>
<script type="text/javascript" src="<%=path%>/pages/KD/js/move-top.js"></script>

<script type="text/javascript">

//获取type并缓存
var typeArr = [];
function getType(){
	$.ajax({
		type: 'post',
		url: '<%=path%>/rest1/getType.do',
		dataType: 'json',
		success: function(result){
			if(result.success){
				var types = result.dataList;
				for(var i = 0;i < types.length;i++){
					typeArr[types[i].objectid] = types[i].name;
				}
			}
		}
	});
}

$(function(){
	getType();
	getFenlei();
	getPics();
	getEvaluations();
	getComments();
});

//加载美食分类
var data;
var types = [];
function getFenlei(){
	$.ajax({
		type: 'post',
		url: '<%=path%>/rest1/getMenuList.do',
		data: {
			rst: '1'
		},
		dataType: 'json',
		success: function(result){
			data = result.dataList;
			var htmlStr = '';
			for(var i=0;i<data.length;i++){
				var res = true;
				for(var j=0;j<types.length;j++){
					if(data[i].type === types[j]){
						res = false;
					}
				}
				if(res){
					types.push(data[i].type);
				}
			}
			for(var i=0;i<types.length;i++){
				htmlStr += '<li><a><h2 href="javascript:void(0);">'+typeArr[types[i]]+'</h2></a></li>';				
			}
			$('#menuLists').html(htmlStr);
			getMenuList();
		}
	});
}

//加载菜单
function getMenuList(){
	var htmlStr = '';
	for(var i=0;i<types.length;i++){
		htmlStr += '<div class="menu-meals">';
		htmlStr += '<ul class="list-title">';
		htmlStr += '<li><h3>'+typeArr[types[i]]+'</h3></li>';
		htmlStr += '<button class="button1">价格</button>';
		htmlStr += '<button class="button1">销量</button>';
		htmlStr += '<button class="button1">评分</button>';
		htmlStr += '<button class="button1">默认排序</button>';
		htmlStr += '</ul>';
		htmlStr += '<div class="list-meals">';
		htmlStr += '<ul class="price">';
		for(var j=0;j<data.length;j++){
			if(types[i] === data[j].type){
				htmlStr += '<li>';
				htmlStr += '<h2>'+data[j].name+'</h2>';
				htmlStr += '<button class="button2">'+data[j].price+'</button>';
				htmlStr += '<span>';
				htmlStr += '<img src="<%=path%>/pages/Restaurant/images/stars.png"/>';
				htmlStr += '<h5>月售'+data[j].quantity+'份</h5>';
				htmlStr += '</span>';
				htmlStr += '</li>';
			}
		}
		htmlStr += '</ul></div></div>';
	}
	$('#menuKinds').after(htmlStr);
}

//加载美食墙
function getPics(){
	$.ajax({
		type: 'post',
		url: '<%=path%>/rest1/getMenuList.do',
		data: {
			rst: '1'
		},
		dataType: 'json',
		success: function(result){
			var data = result.dataList;
			var htmlStr = '';
			for(var i=0;i<data.length;i++){
				htmlStr += '<li><img src="<%=path%>'+data[i].pic+'" /><h6 href="javascript:void(0);">'+data[i].name+'</h6><button class="btn4" href="javascript:void(0);">'+data[i].price+'</button><span><img src="<%=path%>'+data[i].evaluation+'" /><br /><h7 href="javascript:void(0);">月售'+data[i].quantity+'份</h7></span></li>';				
			}
			$('#pics').html(htmlStr);
		}
	});
}

//加载评价
function getEvaluations(){
	$.ajax({
		type: 'post',
		url: '<%=path%>/rest1/getEvaluationList.do',
		data: {
			rst: '1'
		},
		dataType: 'json',
		success: function(result){
			var data = result.dataList;
			var htmlStr = '';
			for(var i=0;i<data.length;i++){
				htmlStr += '<li><p><a href="javascript:void(0);">'+data[i].name+'</a></p><p class="evaluate-text" href="javascript:void(0);">'+data[i].description+'</p><p><span href="javascript:void(0);">'+data[i].customer+'</span><span class="pjrq" href="javascript:void(0);">'+data[i].time+'</span></p></li>';				
			}
			$('#evaluations').html(htmlStr);
		}
	});
}

//加载留言
function getComments(){
	$.ajax({
		type: 'post',
		url: '<%=path%>/rest1/getMessageList.do',
		data: {
			rst: '1'
		},
		dataType: 'json',
		success: function(result){
			var data = result.dataList;
			var htmlStr = '';
			for(var i=0;i<data.length;i++){
				htmlStr += '<li><p href="javascript:void(0);">'+data[i].customer+'</p><p class="comments-text" href="javascript:void(0);">'+data[i].description+'</p><p class="comments-info" href="javascript:void(0);">'+data[i].time+'</p></li>';				
			}
			$('#comments').html(htmlStr);
		}
	});
}

var collectCompany = '';
//收藏方法
function collectp(n,t){
	if(true){
		$(this).pointMsg({msg:"登录后可添加收藏！"});
	}else{
		$.post(path+"/Function/CollectProduct.do", {no:n,type:t}, function(data) {
        	if(data=='1'){
        		var call = function(){
        			if(t=='1'){$("#c_"+n).text("已收藏");}
        			$.fn.closePublicBox(0);
        		};
        		$(this).alertMsg({msg:"收藏成功！",callback:call});
				
			}else if(data=='2'){
				$(this).pointMsg({msg:"您已收藏成功！"});
			}else{
				$(this).pointMsg({msg:"收藏失败,请稍后再试！"});
			}
     	},"text");
	}
}
</script>

</body>
</html>
