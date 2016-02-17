if ($.fn.pagination){
	$.fn.pagination.defaults.beforePageText = '缁楋拷';
	$.fn.pagination.defaults.afterPageText = '閸忕湧pages}妞わ拷';
	$.fn.pagination.defaults.displayMsg = '閺勫墽銇歿from}閸掔殫to},閸忕湧total}鐠佹澘缍�';
}
if ($.fn.datagrid){
	$.fn.datagrid.defaults.loadMsg = '濮濓絽婀径鍕倞閿涘矁顕粙宥呯窡閵嗗倶鈧倶鈧拷';
}
if ($.fn.treegrid && $.fn.datagrid){
	$.fn.treegrid.defaults.loadMsg = $.fn.datagrid.defaults.loadMsg;
}
if ($.messager){
	$.messager.defaults.ok = '纭畾';
	$.messager.defaults.cancel = '鍙栨秷';
}
if ($.fn.validatebox){
	$.fn.validatebox.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
	$.fn.validatebox.defaults.rules.email.message = '鐠囩柉绶崗銉︽箒閺佸牏娈戦悽闈涚摍闁喕娆㈤崷鏉挎絻';
	$.fn.validatebox.defaults.rules.url.message = '鐠囩柉绶崗銉︽箒閺佸牏娈慤RL閸︽澘娼�';
	$.fn.validatebox.defaults.rules.length.message = '鏉堟挸鍙嗛崘鍛啇闂�灝瀹宠箛鍛淬�娴犲绨瑊0}閸滃瘚1}娑斿妫�';
	$.fn.validatebox.defaults.rules.remote.message = '鐠囪渹鎱ㄥ锝堫嚉鐎涙顔�';
}
if ($.fn.numberbox){
	$.fn.numberbox.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
}
if ($.fn.combobox){
	$.fn.combobox.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
}
if ($.fn.combotree){
	$.fn.combotree.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
}
if ($.fn.combogrid){
	$.fn.combogrid.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
}
if ($.fn.calendar){
	$.fn.calendar.defaults.weeks = ['閺冿拷','娑撯偓','娴滐拷','娑擄拷','閸ワ拷','娴滐拷','閸忥拷'];
	$.fn.calendar.defaults.months = ['娑撯偓閺堬拷','娴滃本婀�','娑撳婀�','閸ユ稒婀�','娴滄梹婀�','閸忣厽婀�','娑撳啯婀�','閸忣偅婀�','娑旀繃婀�','閸椾焦婀�','閸椾椒绔撮張锟�','閸椾椒绨╅張锟�'];
}
if ($.fn.datebox){
	$.fn.datebox.defaults.currentText = '娴犲﹤銇�';
	$.fn.datebox.defaults.closeText = '閸忔娊妫�';
	$.fn.datebox.defaults.okText = '纭畾';
	$.fn.datebox.defaults.missingMessage = '鐠囥儴绶崗銉┿�娑撳搫绻�潏鎾汇�';
	$.fn.datebox.defaults.formatter = function(date){
		var y = date.getFullYear();
		var m = date.getMonth()+1;
		var d = date.getDate();
		return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
	};
	$.fn.datebox.defaults.parser = function(s){
		if (!s) return new Date();
		var ss = s.split('-');
		var y = parseInt(ss[0],10);
		var m = parseInt(ss[1],10);
		var d = parseInt(ss[2],10);
		if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
			return new Date(y,m-1,d);
		} else {
			return new Date();
		}
	};
}
if ($.fn.datetimebox && $.fn.datebox){
	$.extend($.fn.datetimebox.defaults,{
		currentText: $.fn.datebox.defaults.currentText,
		closeText: $.fn.datebox.defaults.closeText,
		okText: $.fn.datebox.defaults.okText,
		missingMessage: $.fn.datebox.defaults.missingMessage
	});
}