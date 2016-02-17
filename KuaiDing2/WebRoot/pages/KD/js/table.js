$(document).ready(function(){
	/** 閺冦儲婀￠幓鎺嶆 **/
	var day3 = 3 * 24 * 60 * 60 * 1000;
	var currYear = (new Date()).getFullYear();
	var min = new Date();
	min.setMinutes(min.getMinutes()+60);
	var now = new Date();
	now.setMinutes(now.getMinutes()+60*24*30*2);
	var opt={};
	opt.date = {preset : 'date'};
	opt.datetime = { preset : 'datetime', minDate: min, maxDate: now, stepMinute: 30  };
	//opt.datetime = {preset : 'datetime'};
	opt.time = {preset : 'time'};
	opt.defaults = {
		theme: 'android-ics light', //閻喛鍋嗛弽宄扮础
      		display: 'modal', //閺勫墽銇氶弬鐟扮础 
      		mode: 'scroller', //閺冦儲婀￠柅澶嬪濡�绱�閵嗘仩croller閵嗘垯鈧亪lickpick閵嗘垯鈧仐ixed閵嗭拷
		lang:'zh',
      		startYear:currYear, //瀵偓婵鍕炬禒锟�
      		endYear:currYear + 5 //缂佹挻娼獮缈犲敜
	};
	var optDateTime = $.extend(opt['datetime'], opt['defaults']);
  	$("#presetTime").mobiscroll(optDateTime).datetime(optDateTime);
});
function search(){
	var time=$("#presetTime").val();
	var searchType=$("#searchType").val();
	var key=$("#keywords").val();
	if(time==null || time=='閻愮懓鍤柅澶嬪閺冨爼妫块妴浣规）閺堬拷' || time==''){
		$(this).pointMsg({msg:"璇烽�鎷╂椂闂达紒"});
		return
	}
	if(key==null || key=='鐠囩柉绶崗銉洣妫板嫬鐣鹃惃鍕樀閸樺懎鎮曢幋鏍ф勾閻愶拷' || key==''){
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
	//$('#page-content').html('<div id="loading" class="loading">Loading pages...</div>');
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
			$(this).pointMsg({msg:'瀵板牊濮冲澶涚礉濞屸剝婀佺搾鍐差檮閻ㄥ嫭顢戦弫鐗堝絹娓氭盯顣╃拋顫磼'});
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
			$(this).pointMsg({msg:'瀵板牊濮冲澶涚礉濞屸剝婀佺搾鍐差檮閻ㄥ嫭顢戦弫鐗堝絹娓氭盯顣╃拋顫磼'});
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
			$(this).pointMsg({msg:'瀵板牊濮冲澶涚礉濞屸剝婀佺搾鍐差檮閻ㄥ嫭顢戦弫鐗堝絹娓氭盯顣╃拋顫磼'});
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
			$(this).pointMsg({msg:'瀵板牊濮冲澶涚礉濞屸剝婀佺搾鍐差檮閻ㄥ嫭顢戦弫鐗堝絹娓氭盯顣╃拋顫磼'});
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
		$("#timeError").text("鐠囩兘鈧瀚ㄩ弮銉︽埂");
		$("#timeError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	var dateValue= new Date(Date.parse(time.replace(/-/g, "/")));
	var datNow = new Date();
	if(dateValue < datNow){
		$("#timeError").text("閺冦儲婀″鎻掋亼閺侊拷");
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
		$("#typeError").text("鐠囩兘鈧瀚ㄥ灞肩秴缁鐎�");
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
		$("#pnoError").text("鐠囧嘲锝為崘娆庢眽閺侊拷");
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
		$("#tnoError").text("鐠囧嘲锝為崘娆愵攽閺侊拷");
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
		$("#nameError").text("鐠囧嘲锝為崘娆掍粓缁姹夋慨鎾虫倳");
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
		$("#mobileError").text("鐠囧嘲锝為崘娆愬閺堝搫褰�");
		$("#mobileError").show();
		return false;
	}
	var regu =/^[1][3-8][0-9]{9}$/;
	var re = new RegExp(regu);
	if (!re.test(mobile)) {
		$("#mobileError").text("閹靛婧�崣铚傜瑝閸氬牊纭�");
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
		$("#mobileError").text("鐠囧嘲锝為崘娆愬閺堝搫褰�");
		$("#mobileError").show();
		$("#tableBtn").attr("disabled",false);
		$("#tableBtn").css("background","#f5a101");
		return false;
	}
	var regu =/^[1][3-8][0-9]{9}$/;
	var re = new RegExp(regu);
	if (!re.test(mobile)) {
		$("#mobileError").text("閹靛婧�崣铚傜瑝閸氬牊纭�");
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
		$("#codeError").text("鐠囧嘲锝為崘娆撶崣鐠囦胶鐖�");
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
				$("#codeError").text("妤犲矁鐦夐惍浣风瑝濮濓絿鈥�");
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
    $("#codeSpan").text("閸欐垿鈧焦鍨氶崝锟�"+timeout+"缁夋帒鎮楅崣顖炲櫢閺傛澘褰傞柅锟�");
    $("#codeSpan").show();
    $("input[name='mobile']").attr('readonly',true);
	timeout--;
	if(timeout == 0) {
		$("#codeSpan").text("");
		$("#codeSpan").hide();
		$("#sendCode").css("background","#9edd4b");
		$("#sendCode").attr('disabled',false); //缁夊娅巇isabled鐏炵偞鈧拷
		timeout=60;
	}else{
		setTimeout("mobileCode()", 1000);
	}
}
function notSend(){
    $("#codeSpan").html("閸欐垿鈧礁銇戠拹锟�鐠囧嘲鐨剧拠鏇㈠櫢閺傛澘褰傞柅锟�");
    $("#codeSpan").show();
    $("#sendCode").css("background","#9edd4b");
    $("#sendCode").attr('disabled',false); //缁夊娅巇isabled鐏炵偞鈧拷
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