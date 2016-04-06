$(document).ready(function(){
	
	var day3 = 3 * 24 * 60 * 60 * 1000;
	var currYear = (new Date()).getFullYear();
	var min = new Date();
	min.setMinutes(min.getMinutes()+60);
	var now = new Date();
	now.setMinutes(now.getMinutes()+60*24*30*2);
	var opt={};
	opt.date = {preset : 'date'};
	opt.datetime = { preset : 'datetime', minDate: min, maxDate: now, stepMinute: 30  };
	
	opt.time = {preset : 'time'};
	opt.defaults = {
		theme: 'android-ics light', 
      		display: 'modal', 
      		mode: 'scroller', 
		lang:'zh',
      		startYear:currYear, 
	};
	var optDateTime = $.extend(opt['datetime'], opt['defaults']);
  	$("#presetTime").mobiscroll(optDateTime).datetime(optDateTime);
});
function search(){
	var time=$("#presetTime").val();
	var searchType=$("#searchType").val();
	var key=$("#keywords").val();
	if(time==null || time=='闁绘劗鎳撻崵顕�焻婢跺顏ラ柡鍐ㄧ埣濡潡濡存担瑙勶級闁哄牞鎷� '|| time==''){
		$(this).pointMsg({msg:"鐠囩兘锟介幏鈺傛闂傝揪绱�"});
		return
	}
	if(key==null || key=='閻犲洨鏌夌欢顓㈠礂閵夘煈娲ｅΛ鏉垮閻ｉ箖鎯冮崟顖ｆ█闁告ê鎳庨幃鏇㈠箣閺嵮勫嬀闁绘劧鎷� '|| key==''){
		window.location.href=path+'/Function/SelectTable.html?presetTime='+time+'&peopleNumber='+searchType;
		return
	}
	window.location.href=path+'/Function/SelectTable.html?keywords='+encodeURI(encodeURI(key))+'&presetTime='+time+'&peopleNumber='+searchType;
}
function showUl(){
	if($("#rsfwul").css("display")=='none'){
		$("#rsfwul").show();
	}else{
		$("#rsfwul").hide();
	}
}
function createPage(pageSize, buttons, total ,url) {
	paramMap.Set("keywords", $("#keywords").val());
	paramMap.Set("peopleNumber", $('#searchType').val());
	paramMap.Set("time", $('#presetTime').val());
	paramMap.Set("pageSize", '20');
	paramMap.Set("totalCount", total);
    $(".pagination").jBootstrapPage({
        pageSize : pageSize,
        total : total,
        maxPageButton:buttons,
        initMethod:initPage(url),
        onPageClicked: function(obj, pageIndex) {
        	paramMap.Set("page",pageIndex+1);
	    	$.post(url, paramMap, function(data) {
	        	$('#page-content').html(data);
	     	},"text");
        } 
    });
}
function initPage(url){
	paramMap.Set("page",1);
	
	$.post(url, paramMap, function(data) {
      	$('#page-content').html(data);
   	},"text");
}
function tableInfo(cNo){
	checkTime();
	var url=path+'/Function/SelectTableCount.do';
	var time=$("#presetTime").val();
	$.post(url,{time:time,companyNo:cNo}, function(data) {
		$('#tableInfo').html(data);
	},"text");
	$("input[name='money']").val('');
	$("#money").hide();
}
function orderMonye(){
	var type=$("input[name='type']:checked").val();
	var count=$("input[name='tableNumber']").val();
	if(type==1){
		var money=$("#money1").text();
		var tableCount=$("#count1").text();
		if(parseInt(tableCount)<parseInt(count)){
			$("#money").hide();
			$("input[name='money']").val('');
			$(this).pointMsg({msg:'鐎垫澘鐗婃慨鍐差潰婢舵稓绀夋繛灞稿墲濠�胶鎼鹃崘宸闁汇劌瀚、鎴﹀极閻楀牆绲瑰〒姘洴椤ｂ晝鎷嬮～顔剧＜'});
			$("#tableBtn").attr("disabled",false);
			$("#tableBtn").css("background","#f5a101");
			return false;
		}
		deposit=money*count;
		$("#moneyFont").text(deposit);
		$("input[name='money']").val(deposit);
		$("#money").show();
		return true;
	}
	if(type==2){
		var money=$("#money2").text();
		var tableCount=$("#count2").text();
		if(parseInt(tableCount)<parseInt(count)){
			$("#money").hide();
			$("input[name='money']").val('');
			$(this).pointMsg({msg:'鐎垫澘鐗婃慨鍐差潰婢舵稓绀夋繛灞稿墲濠�胶鎼鹃崘宸闁汇劌瀚、鎴﹀极閻楀牆绲瑰〒姘洴椤ｂ晝鎷嬮～顔剧＜'});
			$("#tableBtn").attr("disabled",false);
			$("#tableBtn").css("background","#f5a101");
			return false;
		}
		deposit=money*count;
		$("#moneyFont").text(deposit);
		$("input[name='money']").val(deposit);
		$("#money").show();
		return true;
	}
	if(type==3){
		var money=$("#money3").text();
		var tableCount=$("#count3").text();
		if(parseInt(tableCount)<parseInt(count)){
			$("#money").hide();
			$("input[name='money']").val('');
			$(this).pointMsg({msg:'鐎垫澘鐗婃慨鍐差潰婢舵稓绀夋繛灞稿墲濠�胶鎼鹃崘宸闁汇劌瀚、鎴﹀极閻楀牆绲瑰〒姘洴椤ｂ晝鎷嬮～顔剧＜'});
			$("#tableBtn").attr("disabled",false);
			$("#tableBtn").css("background","#f5a101");
			return false;
		}
		deposit=money*count;
		$("#moneyFont").text(deposit);
		$("input[name='money']").val(deposit);
		$("#money").show();
		return true;
	}
	if(type==4){
		var money=$("#money4").text();
		var tableCount=$("#count4").text();
		if(parseInt(tableCount)<parseInt(count)){
			$("#money").hide();
			$("input[name='money']").val('');
			$(this).pointMsg({msg:'鐎垫澘鐗婃慨鍐差潰婢舵稓绀夋繛灞稿墲濠�胶鎼鹃崘宸闁汇劌瀚、鎴﹀极閻楀牆绲瑰〒姘洴椤ｂ晝鎷嬮～顔剧＜'});
			$("#tableBtn").attr("disabled",false);
			$("#tableBtn").css("background","#f5a101");
			return false;
		}
		deposit=money*count;
		$("#moneyFont").text(deposit);
		$("input[name='money']").val(deposit);
		$("#money").show();
		return true;
	}
	$("#tableBtn").attr("disabled",false);
	$("#tableBtn").css("background","#f5a101");
	return false;
}
function checkTime(){
	var time = $("#presetTime").val();
	if(time==null || time==''){
		$("#timeError").text("閻犲洨鍏橀埀顒�槹鐎氥劑寮妷锔藉焸");
		$("#timeError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	var dateValue= new Date(Date.parse(time.replace(/-/g, "/")));
	var datNow = new Date();
	if(dateValue < datNow){
		$("#timeError").text("闁哄啨鍎插﹢鈥愁啅閹绘帇浜奸柡渚婃嫹");
		$("#timeError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#timeError").hide();
	return true;
}
function checkType(){
	var type=$("input[name='type']:checked").val();
	if(type==null || type==''){
		$("#typeError").text("閻犲洨鍏橀埀顒�槹鐎氥劌顩肩仦鑲╃Т缂侇偉顕ч悗锟�");
		$("#typeError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#typeError").hide();
	return true;
}
function checkPno(){
	var pno=$("input[name='number']").val();
	if(pno==null || pno==''){
		$("#pnoError").text("閻犲洤鍢查敐鐐哄礃濞嗗孩鐪介柡渚婃嫹");
		$("#pnoError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#pnoError").hide();
	return true;
}
function checkTno(){
	var tno=$("input[name='tableNumber']").val();
	if(tno==null || tno==''){
		$("#tnoError").text("閻犲洤鍢查敐鐐哄礃濞嗘劦鏀介柡渚婃嫹");
		$("#tnoError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#tnoError").hide();
	return true;
}
function checkName(){
	var name=$("input[name='name']").val();
	if(name==null || name==''){
		$("#nameError").text("閻犲洤鍢查敐鐐哄礃濞嗘帊绮撶紒顖濐唺濮瑰鎱ㄩ幘铏�");
		$("#nameError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#nameError").hide();
	return true;
}
function checkMobile(){
	var mobile=$("input[name='mobile']").val();
	if(mobile==null || mobile==''){
		$("#mobileError").text("閻犲洤鍢查敐鐐哄礃濞嗘劕顤侀柡鍫濇惈瑜帮拷");
		$("#mobileError").show();
		return false;
	}
	var regu =/^[1][3-8][0-9]{9}$/;
	var re = new RegExp(regu);
	if (!re.test(mobile)) {
		$("#mobileError").text("闁归潧顑嗗┃锟藉矗閾氬倻鐟濋柛姘墛绾拷");
		$("#mobileError").show();
		return false;
	}
	$("#mobileError").hide();
	$("#sendCode").css("background","#9edd4b");
	$("#sendCode").attr("disabled",false);
	return true;
}
function checkMobile2(){
	var mobile=$("input[name='mobile']").val();
	if(mobile==null || mobile==''){
		$("#mobileError").text("閻犲洤鍢查敐鐐哄礃濞嗘劕顤侀柡鍫濇惈瑜帮拷");
		$("#mobileError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	var regu =/^[1][3-8][0-9]{9}$/;
	var re = new RegExp(regu);
	if (!re.test(mobile)) {
		$("#mobileError").text("闁归潧顑嗗┃锟藉矗閾氬倻鐟濋柛姘墛绾拷");
		$("#mobileError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	$("#mobileError").hide();
	return true;
}
function sendCode2(){
	var flag=checkMobile();
	if(flag){
		$("#sendCode").attr("disabled",true);
		$("#sendCode").css("background","#ccc");
		var mobile=$("input[name='mobile']").val();
		var url=path+'/Function/ToMobileCode.do';
		$.post(url, {mobileNo:mobile}, function(data) {
	    	if(data=='success'){
	    		mobileCode();
	    	}else{
	    		notSend();
	    	}
	 	},"text");
	}
}
function checkCode(){
	var code = $("input[name='code']").val();
	var ref=false;
	if(code==null || code==''){
		$("#codeError").text("閻犲洤鍢查敐鐐哄礃濞嗘挾宕ｉ悹鍥﹁兌閻栵拷");
		$("#codeError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return ref;
	}
	var url=path+'/Function/CheckMobileCode.do';
	$.ajax({
    	type: 'POST',
    	url: url,
    	async: false,
    	data: 'code='+code, 
    	dataType: 'text',
    	success: function(data) {
			if(data=='success'){
				$("#codeError").hide();
				ref = true;
			}else{
				$("#codeError").text("濡ょ姴鐭侀惁澶愭儘娴ｉ鐟濇慨婵撶悼閳ワ拷");
				$("#codeError").show();
				$("#tableBtn").attr("disabled",false);
				$("#tableBtn").css("background","#f5a101");
				ref = false;
			}
    	}
	});
	return ref;
}
function mobileCode(){
    $("#codeSpan").text("闁告瑦鍨块埀顑跨劍閸ㄦ岸宕濋敓锟�+timeout"+"缂佸甯掗幃妤呭矗椤栫偛娅㈤柡鍌涙緲瑜板倿鏌呴敓锟�");
    $("#codeSpan").show();
    $("input[name='mobile']").attr('readonly',true);
	timeout--;
	if(timeout == 0) {
		$("#codeSpan").text("");
		$("#codeSpan").hide();
		$("#sendCode").css("background","#9edd4b");
		$("#sendCode").attr('disabled',false); 
		timeout=60;
	}else{
		setTimeout("mobileCode()", 1000);
	}
}
function notSend(){
    $("#codeSpan").html("闁告瑦鍨块埀顑跨閵囨垹鎷归敓锟介悹鍥у槻閻ㄥ墽鎷犻弴銏犳闁哄倹婢樿ぐ鍌炴焻閿燂拷");
    $("#codeSpan").show();
    $("#sendCode").css("background","#9edd4b");
    $("#sendCode").attr('disabled',false); 
}
function postForm(session_User){
	if(session_User){
		$("#loginModal").modal("show");
		return
	}
	$("#tableBtn").attr("disabled",true);
	$("#tableBtn").css("background","#ccc");
	var flag=checkTime();
	if(flag){
		flag=checkType();
		if(flag){
			flag=checkPno();
			if(flag){
				flag=checkTno();
				if(flag){
					flag=checkName();
					if(flag){
						flag=checkMobile2();
						if(flag){
							flag=checkCode();
							if(flag){
								flag=orderMonye();
								if(flag){
									var money=$("input[name='money']").val();
									var tableID=$("input[name='tableInfoID']").val();
									if(money!=null && money!=''&&tableID!=null && tableID!=''){
										$("#tableForm").attr("action",path+"/Function/SaveTableOrder.do");
										$("#tableForm").submit();
									}else{
										$("#tableBtn").attr("disabled",false);
										$("#tableBtn").css("background","#f5a101");
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
function hideType(){
	$("#typeError").text('');
	$("#typeError").hide();
	var type=$("input[name='type']:checked").val();
	if(type==1){
		$("input[name='tableInfoID']").val($("#tableInfoID1").val());
	}
	if(type==2){
		$("input[name='tableInfoID']").val($("#tableInfoID2").val());
	}
	if(type==3){
		$("input[name='tableInfoID']").val($("#tableInfoID3").val());
	}
	if(type==4){
		$("input[name='tableInfoID']").val($("#tableInfoID4").val());
	}
}