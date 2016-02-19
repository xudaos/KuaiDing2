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

//閹绘劕褰囬弻銉﹀鐎涙顑佹稉鎻掑闂堛垺澧嶉張澶屾畱鐎涙顑�
function getFront(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(0,foundoffset);
}

//閹绘劕褰囬弻銉﹀鐎涙顑佹稉鎻掓倵闂堛垻娈戦幍鈧張澶婄摟缁楋拷
function getEnd(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(foundoffset+searchstr.length,mainstr.length);
}
//閹绘劕褰囬弻銉﹀鐎涙顑佹稉鎻掑闂堛垺澧嶉張澶屾畱鐎涙顑�
function getFront(mainstr,searchstr){
    foundoffset=mainstr.indexOf(searchstr);
    if(foundoffset==-1){
       return null;
    }
    return mainstr.substring(0,foundoffset);
}

//閹绘劕褰囬弻銉﹀鐎涙顑佹稉韫闂傚娈戦幍鈧張澶婄摟缁楋拷
function getBetween(mainstr,beginchstr,endchstr){
    foundoffset=mainstr.indexOf(beginchstr);
    foundoffset2=mainstr.indexOf(endchstr);
    if(foundoffset==-1 || foundoffset2==-1){
       return null;
    }
    return mainstr.substring(foundoffset+beginchstr.length,foundoffset2);
}
//鏉╂柨娲栭弫鏉跨摟  閸樺娅庣亸蹇旀殶閻愮懓鎮楅張顐㈢啲閻拷0
function reNum(nb){
	if(isNaN(nb))
		{return 0;}
	else
		{if(nb==''){return 0;}else{return parseFloat(nb);}}
}
//js閺冨爼妫块弽鐓庣础閸栵拷 閻€劍纭堕敍姝瀉te.format('閺嶇厧绱￠崠鏍ㄧ壉瀵拷');
Date.prototype.format = function(format){ 
	var o = { 
		"M+" : this.getMonth()+1, //month 
		"d+" : this.getDate(), //day 
		"h+" : this.getHours(), //hour 
		"m+" : this.getMinutes(), //minute 
		"s+" : this.getSeconds(), //second 
		"q+" : Math.floor((this.getMonth()+3)/3), //quarter 
		"S" : this.getMilliseconds() //millisecond 
	} ;

	if(/(y+)/.test(format)) { 
		format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	} 

	for(var k in o) { 
		if(new RegExp("("+ k +")").test(format)) { 
			format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length)); 
		} 
	} 
	return format; 
};


/**鐠侊紕鐣婚弮鍫曟？瀹革拷
 * 
 * interval 閿涙鐞涖劎銇氶弻銉嚄缁墽鈥橀崚鏉裤亯閺佹壆娈戞稊瀣▕
 * interval 閿涙鐞涖劎銇氶弻銉嚄缁墽鈥橀崚鏉跨毈閺冩湹绠ｅ锟�
 * interval 閿涙瓉鐞涖劎銇氶弻銉嚄缁墽鈥橀崚鏉垮瀻闁界喍绠ｅ锟�
 * interval 閿涙瓔鐞涖劎銇氶弻銉嚄缁墽鈥橀崚鎵潡娑斿妯�
 * interval 閿涙瓖鐞涖劎銇氶弻銉嚄缁墽鈥橀崚鐗堫嚑缁夋帊绠ｅ锟�
 * **/
function getDateDiff(interval, date1, date2)
{
   var objInterval = {'D':1000 * 60 * 60 * 24,'H':1000 * 60 * 60,'M':1000 * 60,'S':1000,'T':1};
   interval = interval.toUpperCase();
   var dt1 = new Date(Date.parse(date1.replace(/-/g, '/')));
   var dt2 = new Date(Date.parse(date2.replace(/-/g, '/')));
   var v = dt2.getTime()-dt1.getTime();
   var day=Math.floor(v/(24*3600*1000));
   return day;

}

var paramMap = {     
    Set : function(key,value){this[key] = value},     
    Get : function(key){return this[key]}     
    //Contains : function(key){return this.Get(key) == null?false:true},     
    //Remove : function(key){delete this[key]}     
} ;

/**
 * JS閼惧嘲褰噉閼风牽闂呭繑婧�弫瀛樻殶
 */
function getRandom(n,m){
	var c = m-n+1;	
	return Math.floor(Math.random() * c + n);
}

//婢舵挳鍎撮幖婊呭偍濡楋拷
function top_search(){
	var form1 = document.getElementById('top_search_form');
	var btn1 = $('#top_search_text');
	$('#top_search_text').focus(function(){
		form1.style.background = '#89c935';
	}).blur(function(){
		form1.style.background = '#c1c1c1';
	});
}



/** 閹垮秳缍擟ookie   濞ｈ濮�  
* @param name
* @param value
* @return
*/
function SetCookie(name,value,days)//娑撱倓閲滈崣鍌涙殶閿涘奔绔存稉顏呮Цcookie閻ㄥ嫬鎮曠�鎰剁礉娑撯偓娑擃亝妲搁崐锟�
{
	var Days = 30;
	if(typeof(days)=="undefined"||isNaN(days))
		Days=parseInt(days.toString());
    //濮濓拷 cookie 鐏忓棜顫︽穱婵嗙摠 30 婢讹拷 -1娑撶儤绁荤憴鍫濇珤閸忔娊妫撮妴鈧妴鈧�
	if(Days!=-1){
		var exp = new Date();    //new Date("December 31, 9998");
		exp.setTime(exp.getTime() + Days*24*60*60*1000);
       document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
	}else{
		document.cookie = name + "="+ escape (value) + ";expires=-1";
	}
}

/**
* 閹垮秳缍擟ookie 閹绘劕褰�  閸氬骸褰磋箛鍛淬�閺勭棜scape缂傛牜鐖�
* @param name
* @return
*/
function getCookie(name)//閸欐溈ookies閸戣姤鏆�
{
   var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
   if(arr != null) return unescape(arr[2]); return null;
}
/**
* 閹垮秳缍擟ookie 閸掔娀娅�
* @param name
* @return
*/
function delCookie(name)//閸掔娀娅巆ookie
{   
	var exp = new Date();
   exp.setTime(exp.getTime() - (86400 * 1000 * 1));
   var cval=getCookie(name);
   if(cval!=null)
       document.cookie = name + "="+ escape (cval) + ";expires="+exp.toGMTString();
}  

//閺囨寧宕查崣鍌涙殶
var filtUrl = function (d, c, j) {
    var e, f;
    if (!d && !c) {
        return "";
    } else {
        if (!c) {
            e = window.location.pathname + window.location.search;
            f = d;
        } else {
            e = d;
            f = c;
        }
    }
    return e.replace(new RegExp("(^|\\?|&)" + f + "=([^&]*)", "gi"), j);
};

//鐠哄疇娴嗛崚鐗堝瘹鐎规氨娈戞い鐢电垳
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
 * 缂佹┎tring 濞ｈ濮瀟rim閺傝纭�
 */
String.prototype.trim=function(){
    return this.replace(/(^\s*)|(\s*$)/g, "");
};

/**
 * 缂佹┎tring濞ｈ濮瀒sNullOrempty閻ㄥ嫭鏌熷▔锟�
 */
String.prototype.isnullorempty=function(){
	if(this==null||typeof(this)=="undefined"||this.trim()=="")
		return true;
	return false;
	
};

/**
 * 鐠侊紕鐣荤拋銏犲礋閺冨爼妫块弰顖氭儊閸︺劏鎯�稉姘闂傜瀵栭崶鏉戝敶
 * **/
function query_orderTime_businessTime(hours,orderTime){
	if(hours==''){
		return true;
	}else{
		var hour = hours.split(",");//閸掑棙顔�
		var order = orderTime.substring(11);
		var flag = false;
		/**閽�儰绗熼弮鍫曟？閸掑棙顔�*/
		for(var i=0;i<hour.length;i++){
			var times = hour[i].split("-");//閸掑棗绱戞慨瀣波閺夌喐妞傞梻锟�
			if(order>times[0] && order<times[1]){
				flag = true;
				break;
			}
		}
		return flag;
	}
}

//缁備焦顒涢崚閿嬫煀閿涘苯娲栭柅鈧�
function onKeyDown(){ 
	if ( (event.altKey) || ((event.keyCode == 8) && (event.srcElement.type != "text" && event.srcElement.type != "textarea" && 
			event.srcElement.type != "password")) || ((event.ctrlKey) && ((event.keyCode == 78) || (event.keyCode == 82)) ) || (event.keyCode == 116) ) { 
		event.keyCode = 0; 
		event.returnValue = false; 
	} 
} 

$(document).ready(function(){
	//婢舵挳鍎�閸掑洦宕�閼挎粌宕熼崚鍥ㄥ床
	$('.top .li1').hover(function(){
		var a = this;
		$(this).children('ul').show();
		$(this).children('a').addClass('ahover');
	},function(){
		$(this).children('ul').hide();
		$(this).children('a').removeClass('ahover');
	});
	top_search();
	
	//閸︽澘娼冩穱鈩冧紖閸掑洦宕�
	$('.top-left .dz').click(function(){
	 	$(this).children('ul').show();
  	});
	$(".top-left .dz").hover(function() {
		//$(this).children('ul').hide();
	}, function() {
		$(this).children('ul').hide();
	});
	
	//閺囧瓨鏌婇崸鈧崷鏉挎絻娣団剝浼�
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
	        	alert('您选择的城市不存在或不提供服务');
	        }
	    });
	});
	
	
	//妞ょ敻娼伴崝鐘烘祰閺囧瓨鏁�閺夆�娆㈤弻銉嚄 閸欏倹鏆熼柊宥囩枂
	$.each($("a[data-log='log_params']"),function(i){ 
		var data_flag = $(this).attr("data-flag");
		var data_id = $(this).attr("data-id");
		var href = $(this).attr("href");
		var flag_index = href.indexOf(data_flag);
		if(flag_index == -1){
			href += data_flag+data_id+"/";
		}else{
			var flag_length = data_flag.length;
			var h = href.substring(flag_index,(flag_index+flag_length+1));
			href = href.replace(h,(data_flag+data_id+""));
		}
		$(this).attr("href",href);
	});
	
	
	//閻ц鍤�
	$("#loginOut").click(function(){
		var callback = function() {
			location.href = path+'/loginOut/';
		},
		noCallback = function() {
			$.fn.closePublicBox(0);
		};
		$(this).miniConfirm({msg:'确定退出当前用户？',callback:callback,noCallback:noCallback});
		
	});
	//document.onkeydown = onKeyDown;
	
	//婢舵挳鍎撮幖婊呭偍
	$("#top_search_btn").click(function(){
		$(this).attr("disabled",true);
		var text = $("#top_search_text").val().trim();
		location.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
		
		//$("#top_search_form").attr("action",path+'/Function/check_store.html');
		//$("#top_search_form").submit();
	});
	
	//婢舵挳鍎撮幖婊呭偍
	$("#top_search_link a").click(function(){
		var text = $(this).attr("title");
		this.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
	});
	
	//閸ョ偠婧呴柨顔剧拨鐎规碍鎮崇槐銏″瘻闁斤拷
	$("#top_search_text").keydown(function(event){
		if(event.keyCode == 13){
			var text = $("#top_search_text").val().trim();
			location.href = path+"/Function/check_store.html?keywords="+encodeURI(encodeURI(text));
		}
	});
});