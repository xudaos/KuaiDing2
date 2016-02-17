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
            closable:true
        });
    }
}