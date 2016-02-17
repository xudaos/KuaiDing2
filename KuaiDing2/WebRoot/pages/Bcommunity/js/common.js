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

//閹绘劕褰囬弻銉﹀鐎涙顑佹稉韫闂傚娈戦幍鈧張澶婄摟缁楋拷
function getBetween(mainstr,beginchstr,endchstr){
    foundoffset=mainstr.indexOf(beginchstr);
    foundoffset2=mainstr.indexOf(endchstr);
    if(foundoffset==-1 || foundoffset2==-1){
       return null;
    }
    return mainstr.substring(foundoffset+beginchstr.length,foundoffset2);
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
	}; 

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

var paramMap = {     
	Set : function(key,value){this[key] = value},     
	Get : function(key){return this[key]}     
	//Contains : function(key){return this.Get(key) == null?false:true},     
	//Remove : function(key){delete this[key]}     
}; 

/**
 * 缂佹┎tring 濞ｈ濮瀟rim閺傝纭�
 */
String.prototype.trim=function(){
    return this.replace(/(^\s*)|(\s*$)/g, "");
};

/**
 * 婢х偛濮炵粣妤�經
 * @param title
 * @param url
 */
function addTab(title, url){
	
    if (window.parent.$('#tabs').tabs('exists', title)){
        window.parent.$('#tabs').tabs('select', title);
    } else {
        window.parent.$('#tabs').tabs('add',{
            title:title,
            content:'<iframe scrolling="yes" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>',
            collapsible: true,
            closable:true,
            icon:'icon icon-nav'
        });
        window.parent.tabClose();
    }
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