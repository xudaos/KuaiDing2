/*** 
 * function for two select component swap options.
 *
 * "do_op_moveSelected" is use to swap selected options.
 * "do_op_moveAll" is use to swap all options.
 *
 * parameter:
 *   "srcComponent" the name of select component where options come from.
 *   "targetComponent" the name of select component where options will to add.
 **/
function do_op_moveSelected(srcComponent, targetComponent) {
    var src = document.getElementsByName(srcComponent)[0];
    var target = document.getElementsByName(targetComponent)[0];
    for(var i=0;i<src.options.length;i++) {
        if(src.options[i].selected == true) {
            target.options.add(new Option(src.options[i].text,src.options[i].value));
        }
    }
    for(var j=src.options.length - 1;j>=0;j--) {
        if(src.options[j].selected == true) {
            //src.options.remove(j);
            $(src.options[j]).remove();
        }
    }
}

function do_op_moveAll(srcComponent, targetComponent) {
    var src = document.getElementsByName(srcComponent)[0];
    var target = document.getElementsByName(targetComponent)[0];
    for(var i=0;i<src.options.length;i++) {
        target.options.add(new Option(src.options[i].text,src.options[i].value));
    }
//    for(var j=src.options.length - 1;j>=0;j--) {
//        src.options.remove(j);
//    }
    $(src).empty();
}

/***
 * function for join select component values. value seperate with ","
 *
 * parameter:
 *   "srcComponent" the name of select component where values come from.
 *   "targetComponent" the name of hidden compnent to store joined value.
 **/
function do_op_joinValues(srcComponent, targetComponent) {
    var src = document.getElementsByName(srcComponent)[0];
    var target = document.getElementsByName(targetComponent)[0];
    target.value = "";
    for(var i=0;i<src.options.length;i++) {
        target.value += src.options[i].value + ",";
    }
    target.value = target.value.substring(0, target.value.length - 1);
    alert(target.value);
}

/***
 * function for date format when datetime in millisecond value type.
 *
 * parameter:
 *   "dateNumber" the datetime of integer value type for format.
 **/
//format: yyyy-MM-dd
function Millisecond2Date(dateNumber) {
    if(isNaN(dateNumber) || dateNumber == null) {
        return "";
    } else {
        var date = new Date(parseInt(dateNumber));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        return date.getFullYear() + "-" + month + "-" + currentDate;
    }
}

//format: yyyy-MM-dd HH:mm
function Millisecond2Datetime(dateNumber) {
    if(isNaN(dateNumber) || dateNumber == null) {
        return "";
    } else {
        var date = new Date(parseInt(dateNumber));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hour + ":" + min;
    }
}
//format: yyyy-MM-dd HH:mm:ss
function Millisecond2Datetime2(dateNumber) {
    if(isNaN(dateNumber) || dateNumber == null) {
        return "";
    } else {
        var date = new Date(parseInt(dateNumber));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var sed = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hour + ":" + min+ ":" + sed;
    }
}

/***
 * function for format date or datetime
 * 
 * parameter:
 *   "dateSpliter" the spliter of date. example: '/' = yyyy/MM/dd, '-' = yyyy-MM-dd
 *   "timeSpliter" the spliter of time. example: ':' = HH:mm:ss
 *   "datetimeSpliter" the spliter between date and time. example: ' ' = yyyy-MM-dd HH:mm:ss
 **/
function FormatDate(dateObj, dateSpliter) {
    var date = dateObj;
    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    return date.getFullYear() + dateSpliter + month + dateSpliter + currentDate;
}

function FormatDatetime(dateObj, dateSpliter, timeSpliter, datetimeSpliter) {
    var date = dateObj;
    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
    var min = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
    var sec = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
    return date.getFullYear() + dateSpliter + month + dateSpliter + currentDate + datetimeSpliter + hour + timeSpliter + min + timeSpliter + sec;
}

//鎻愬彇鏌ユ壘瀛楃涓插墠闈㈡墍鏈夌殑瀛楃
function getFront(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(0,foundoffset);
}

//鎻愬彇鏌ユ壘瀛楃涓插悗闈㈢殑鎵€鏈夊瓧绗�
function getEnd(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(foundoffset+searchstr.length,mainstr.length);
}
//鎻愬彇鏌ユ壘瀛楃涓插墠闈㈡墍鏈夌殑瀛楃
function getFront(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(0,foundoffset);
}

//鎻愬彇鏌ユ壘瀛楃涓蹭箣闂寸殑鎵€鏈夊瓧绗�
function getBetween(mainstr,beginchstr,endchstr){
    foundoffset=mainstr.indexOf(beginchstr);
    foundoffset2=mainstr.indexOf(endchstr);
    if(foundoffset==-1 || foundoffset2==-1){
       return null;
    }
    return mainstr.substring(foundoffset+beginchstr.length,foundoffset2);
}
//杩斿洖鏁板瓧  鍘婚櫎灏忔暟鐐瑰悗鏈熬鐨�0
function reNum(nb){
	if(isNaN(nb))
		{return 0;}
	else
		{if(nb==''){return 0;}else{return parseFloat(nb);}}
}
//js鏃堕棿鏍煎紡鍖� 鐢ㄦ硶锛歞ate.format('鏍煎紡鍖栨牱寮�');
Date.prototype.format = function(format){ 
	var o = { 
		"M+" : this.getMonth()+1, //month 
		"d+" : this.getDate(), //day 
		"h+" : this.getHours(), //hour 
		"m+" : this.getMinutes(), //minute 
		"s+" : this.getSeconds(), //second 
		"q+" : Math.floor((this.getMonth()+3)/3), //quarter 
		"S" : this.getMilliseconds() //millisecond 
	} 

	if(/(y+)/.test(format)) { 
		format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	} 

	for(var k in o) { 
		if(new RegExp("("+ k +")").test(format)) { 
			format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length)); 
		} 
	} 
	return format; 
}


/**璁＄畻鏃堕棿宸�
 * 
 * interval 锛欴琛ㄧず鏌ヨ绮剧‘鍒板ぉ鏁扮殑涔嬪樊
 * interval 锛欻琛ㄧず鏌ヨ绮剧‘鍒板皬鏃朵箣宸�
 * interval 锛歁琛ㄧず鏌ヨ绮剧‘鍒板垎閽熶箣宸�
 * interval 锛歋琛ㄧず鏌ヨ绮剧‘鍒扮涔嬪樊
 * interval 锛歍琛ㄧず鏌ヨ绮剧‘鍒版绉掍箣宸�
 * **/
function getDateDiff(interval, date1, date2)
{
   var objInterval = {'D':1000 * 60 * 60 * 24,'H':1000 * 60 * 60,'M':1000 * 60,'S':1000,'T':1};
   interval = interval.toUpperCase();
   var dt1 = new Date(Date.parse(date1.replace(/-/g, '/')));
   var dt2 = new Date(Date.parse(date2.replace(/-/g, '/')));
   var v = dt2.getTime()-dt1.getTime();
   var day=Math.floor(v/(24*3600*1000))
   return day;

}

var paramMap = {     
    Set : function(key,value){this[key] = value},     
    Get : function(key){return this[key]}     
    //Contains : function(key){return this.Get(key) == null?false:true},     
    //Remove : function(key){delete this[key]}     
} 

/**
 * JS鑾峰彇n鑷砿闅忔満鏁存暟
 */
function getRandom(n,m){
	var c = m-n+1;	
	return Math.floor(Math.random() * c + n);
}

//澶撮儴鎼滅储妗�
function top_search(){
	var form1 = document.getElementById('top_search_form');
	var btn1 = $('#top_search_text');
	$('#top_search_text').focus(function(){
		form1.style.background = '#89c935';
	}).blur(function(){
		form1.style.background = '#c1c1c1';
	});
}



/** 鎿嶄綔Cookie   娣诲姞   
* @param name
* @param value
* @return
*/
function SetCookie(name,value,days)//涓や釜鍙傛暟锛屼竴涓槸cookie鐨勫悕瀛愶紝涓€涓槸鍊�
{
	var Days = 30;
	if(typeof(days)=="undefined"||isNaN(days))
		Days=parseInt(days.toString());
    //姝� cookie 灏嗚淇濆瓨 30 澶� -1涓烘祻瑙堝櫒鍏抽棴銆€銆€
	if(Days!=-1){
		var exp = new Date();    //new Date("December 31, 9998");
		exp.setTime(exp.getTime() + Days*24*60*60*1000);
       document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
	}else{
		document.cookie = name + "="+ escape (value) + ";expires=-1";
	}
}

/**
* 鎿嶄綔Cookie 鎻愬彇   鍚庡彴蹇呴』鏄痚scape缂栫爜
* @param name
* @return
*/
function getCookie(name)//鍙朿ookies鍑芥暟
{
   var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
   if(arr != null) return unescape(arr[2]); return null;
}
/**
* 鎿嶄綔Cookie 鍒犻櫎
* @param name
* @return
*/
function delCookie(name)//鍒犻櫎cookie
{   
	var exp = new Date();
   exp.setTime(exp.getTime() - (86400 * 1000 * 1));
   var cval=getCookie(name);
   if(cval!=null)
       document.cookie = name + "="+ escape (cval) + ";expires="+exp.toGMTString();
}  

//鏇挎崲鍙傛暟
var filtUrl = function (d, c, j) {
    var e, f;
    if (!d && !c) {
        return ""
    } else {
        if (!c) {
            e = window.location.pathname + window.location.search;
            f = d
        } else {
            e = d;
            f = c
        }
    }
    return e.replace(new RegExp("(^|\\?|&)" + f + "=([^&]*)", "gi"), j)
};

//璺宠浆鍒版寚瀹氱殑椤电爜
var page_jump = function(maxPageNo){
    var page_jump_num = $('#page_jump_num').val();
    var max_page = $("#max_page_count").val();
    if(!!page_jump_num){
    	if(parseInt(page_jump_num)>parseInt(max_page) || parseInt(page_jump_num)<1){
    		page_jump_num = '1';
    	}
        window.location = filtUrl(window.location.href,'page','?page='+parseInt(page_jump_num));
    }
};

/**
 * 缁橲tring 娣诲姞trim鏂规硶
 */
String.prototype.trim=function(){
    return this.replace(/(^\s*)|(\s*$)/g, "");
}

/**
 * 缁橲tring娣诲姞isNullOrempty鐨勬柟娉�
 */
String.prototype.isnullorempty=function(){
	if(this==null||typeof(this)=="undefined"||this.trim()=="")
		return true;
	return false;
	
}

/**
 * 璁＄畻璁㈠崟鏃堕棿鏄惁鍦ㄨ惀涓氭椂闂磋寖鍥村唴
 * **/
function query_orderTime_businessTime(hours,orderTime){
	if(hours==''){
		return true;
	}else{
		var hour = hours.split(",");//鍒嗘
		var order = orderTime.substring(11);
		var flag = false;
		/**钀ヤ笟鏃堕棿鍒嗘**/
		for(var i=0;i<hour.length;i++){
			var times = hour[i].split("-");//鍒嗗紑濮嬬粨鏉熸椂闂�
			if(order>times[0] && order<times[1]){
				flag = true;
				break;
			}
		}
		return flag;
	}
}

//绂佹鍒锋柊锛屽洖閫€ 
function onKeyDown(){ 
	if ( (event.altKey) || ((event.keyCode == 8) && (event.srcElement.type != "text" && event.srcElement.type != "textarea" && 
			event.srcElement.type != "password")) || ((event.ctrlKey) && ((event.keyCode == 78) || (event.keyCode == 82)) ) || (event.keyCode == 116) ) { 
		event.keyCode = 0; 
		event.returnValue = false; 
	} 
} 

$(document).ready(function(){
	//澶撮儴 鍒囨崲 鑿滃崟鍒囨崲
	$('.top .li1').hover(function(){
		var a = this;
		$(this).children('ul').show();
		$(this).children('a').addClass('ahover');
	},function(){
		$(this).children('ul').hide();
		$(this).children('a').removeClass('ahover');
	});
	top_search();
	
	//鍦板潃淇℃伅鍒囨崲
	$('.top-left .dz').click(function(){
	 	$(this).children('ul').show();
  	});
	$(".top-left .dz").hover(function() {
		//$(this).children('ul').hide();
	}, function() {
		$(this).children('ul').hide();
	});
	
	//鏇存柊鍧€鍦板潃淇℃伅
	$("#city_list a").click(function(){
		var text = $(this).text();
		var id = $(this).attr("data-id");
		$.ajax({
	        type: 'POST',
	        url: path+'/Operate/UpdateSessionCity.do',
	        data: 'city_id='+id+'&city_name='+text,
	        dataType: 'text',
	        success: function(data) {
	        	if(data=='success'){
	        		var path_name = location.pathname.split("/");
	        		//var pn = path_name.split("/");
	        		//alert(path_name[path_name.length-3]);
	        		var pn = path_name[path_name.length-3];
	        		if(pn=='yd'){
	        			location.href= path+'/yd/'+id+'/';
	        		}else{
	        			location.reload();
	        		}
	        	}
	        },
	        error: function(data) {
	        	alert('鍒囨崲鍦板潃淇℃伅澶辫触锛岀◢鍚庡啀璇�!');
	        }
	    });
	});
	
	
	//椤甸潰鍔犺浇鏇存敼 鏉′欢鏌ヨ 鍙傛暟閰嶇疆
	$.each($("a[data-log='log_params']"),function(i){ 
		var data_flag = $(this).attr("data-flag");
		var data_id = $(this).attr("data-id");
		var href = $(this).attr("href");
		var flag_index = href.indexOf(data_flag);
		if(flag_index == -1){
			href += data_flag+data_id+"/"
		}else{
			var flag_length = data_flag.length;
			var h = href.substring(flag_index,(flag_index+flag_length+1));
			href = href.replace(h,(data_flag+data_id+""));
		}
		$(this).attr("href",href);
	});
	
	
	//鐧诲嚭
	$("#loginOut").click(function(){
		var callback = function() {
			location.href = path+'/loginOut/';
		},
		noCallback = function() {
			$.fn.closePublicBox(0);
		}
		$(this).miniConfirm({msg:'纭畾閫€鍑烘湰娆＄櫥褰曪紵',callback:callback,noCallback:noCallback});
		
	});
	//document.onkeydown = onKeyDown;
	
	//澶撮儴鎼滅储
	$("#top_search_btn").click(function(){
		$(this).attr("disabled",true);
		var text = $("#top_search_text").val().trim();
		location.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
		
		//$("#top_search_form").attr("action",path+'/Function/check_store.html');
		//$("#top_search_form").submit();
	});
	
	//澶撮儴鎼滅储
	$("#top_search_link a").click(function(){
		var text = $(this).attr("title");
		this.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
	});
	
	//鍥炶溅閿粦瀹氭悳绱㈡寜閽�
	$("#top_search_text").keydown(function(event){
		if(event.keyCode == 13){
			var text = $("#top_search_text").val().trim();
			location.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
		}
	});
});