// JavaScript Document
;(function($) {
	$.fn.publicBoxId = "msg_box"; // mini寮瑰嚭妗咺D
	
	/**
	 * 鏄剧ず
	 * @params {content:'鈥︹€�', showButton:true, width:250, callback:function(){}, noCallback:''}
	 */
	$.fn.alertMsg = function(options) {
		return alertMsg(this, options);
	}
	
	/**
	 * mini鎻愮ず妗�
	 * @params {msg:'鈥︹€�', color:'red', autoClose:true}
	 */
	$.fn.pointMsg = function(options) {
		return pointMsg(this, options);
	}
	
	/**
	 * mini纭妗�
	 * @params {msg:'鈥︹€�', color:'red', callback:function(){}, noCallback:''}
	 */
	$.fn.miniConfirm = function(options) {
		return miniConfirm(this, options);
	}
	
	/**
	 * 鍏叡鐨凙JAX鎻愪氦琛ㄥ崟鏂规硶
	 * @params {url:'鈥︹€�', formId:'red', successCall:function(){}, errorCall:'', showSuccessMsg:true}
	 */
	$.fn.publicAjaxPost = function(options) {
		return publicAjaxPost(this, options);
	}

	
	function showPublicBox(obj, options) {
		var opts = $.extend({}, defaults, options);
		if(typeof opts.width != 'number' || opts.width <= 0) opts.width = 350;

		$(publicBoxId).children("p").html(opts.content);
		opts.msgType=='1' ? $(publicBoxId).find("a[name='no']").hide() : $(publicBoxId).find("a[name='no']").show();
		opts.msgType=='1' ? $(publicBoxId).find("a[id='close_msg']").hide() : $(publicBoxId).find("a[id='close_msg']").show();
		opts.showButton ? $(publicBoxId).find("input").show() : $(publicBoxId).find("input").hide();

		// 閬垮厤鎻愮ず妗� 瓒呭嚭娴忚鍣ㄧ獥鍙ｈ寖鍥�
		$("#bj_div").css({height:$(document).height(), width:$(document).width(),display:'block'});
		$(publicBoxId).css({left:($(window).width()/2-200),top:($(window).height()/2-100),_top:($(window).height()/2+top-150)}).fadeIn(180);
		
		if(opts.showButton) {
			boxButtonYesEvent = opts.callback;
			boxButtonNoEvent = opts.noCallback;
		}
	}
	
	/**
	 * 鍏抽棴
	 * @param time 寤舵椂姣锛屽湪time姣鍚庡叧闂�
	 */
	$.fn.closePublicBox = function(time) {
		if(typeof time != 'number') time = 3000;
		clearTimeout(closeBoxTime);
		closeBoxTime = setTimeout(function() {
			$('#bj_div').fadeOut(360);
			$(publicBoxId).fadeOut(360);
		}, time);
	}
	
	function pointMsg(obj, options) {
		var opts = $.extend({}, defaults, options);
		
		opts.content = opts.msg,
		opts.msgType = '1';
		opts.callback = function() {
			$.fn.closePublicBox(0);
		};
		opts.width = 300;
		if(opts.color != 'red' && opts.autoClose === true) $.fn.closePublicBox(opts.autoCloseTime);
		
		showPublicBox(obj, opts);
	}
	
	function alertMsg(obj, options) {
		var opts = $.extend({}, defaults, options);
		
		opts.content = opts.msg,
		opts.msgType = '1';
		opts.width = 300;
		if(opts.color != 'red' && opts.autoClose === true) $.fn.closePublicBox(opts.autoCloseTime);
		
		showPublicBox(obj, opts);
	}
	
	function miniConfirm(obj, options) {
		var opts = $.extend({}, defaults, options);
		opts.content = opts.msg,
		opts.msgType = '2';
		opts.width = 300;
		showPublicBox(obj, opts);
	}
	
	// 鏄惁鍏佽AJAX 璇锋眰锛屽崟绾跨▼锛屽綋鍓嶄竴涓狝JAX璇锋眰浣嶅畬鎴愭椂锛屼笉鍏佽鍐嶆璇锋眰
	// 璇锋眰杩旇繕 JSON 鏍煎紡鏁版嵁锛屾湰鏂规硶涓� 璁惧畾 data.error == 0 琛ㄧず鎴愬姛锛� data.msg 涓烘秷鎭�
	allowAjaxPost = true;
	function publicAjaxPost(obj, options) {
		if(allowAjaxPost === false) {
			pointMsg(obj, {msg:'绛夊緟AJAX璇锋眰闃熷垪锛�'});
			return;
		}
		
		var opts = $.extend({}, defaults, options);
		allowAjaxPost = false;
		
		pointMsg(obj, {msg:'绛夊緟璇锋眰...', color:'green', autoClose:false});
		
		var success = function(data) {
			if(data && data.error == 0) {
				if(typeof opts.successCall == 'function') {
					opts.successCall(data);
				}
				opts.showSuccessMsg===true && pointMsg(obj, {msg:data.msg, color:'green'});
			} else {
				pointMsg(obj, {msg:data.msg});
			}
			allowAjaxPost = true;
		}
		
		var error = function() {
			pointMsg(obj, {msg:'璇锋眰澶辫触锛�'});
			if(typeof opts.errorCall == 'function') {
				opts.errorCall();
			}
			allowAjaxPost = true;
		}
		
		var postData = null;
		if(typeof opts.formId == 'string') opts.formId = "#"+opts.formId;
		if($(opts.formId).length) postData = $(opts.formId).serialize();
		
		$.ajax({
			url: opts.url,
			type: 'post',
			data: postData,
			dataType: 'json',
			success: success,
			error: error
		});
	}

	
	// 榛樿鍙傛暟
	var defaults = {
		width: 350,
		height:200,
		content: 'hello!', // 璋冪敤 showPublicBox 鏃剁殑鍐呭
		callback: function(){}, // "纭畾"鎸夐挳鍥炶皟
		noCallback: '', // "鍙栨秷"鎸夐挳鍥炶皟
		showButton: true, // 鏄惁鏄剧ず鎸夐挳
		msg: '', // 鐢ㄤ簬 miniConfirm锛� 鍜� pointMsg
		color: 'red', // 娑堟伅棰滆壊
		autoClose: true, // 鏄惁鑷姩寤舵椂鍏抽棴
		autoCloseTime: 2500, // 寤舵椂鍏抽棴鏃堕棿
		msgType:'1',
		
		// 鐢ㄤ簬 publicAjaxPost
		url: '', //涓嶈В閲�
		formId: '', //闇€瑕佹彁浜ょ殑琛ㄥ崟ID
		successCall: function(){}, //璇锋眰鎴愬姛鏃剁殑鍥炶皟鍑芥暟
		errorCall: function(){}, //璇锋眰澶辫触鏃剁殑鍥炶皟鍑芥暟
		showSuccessMsg: true //鏄惁鏄剧ず璇锋眰鎴愬姛鐨勬秷鎭�
	},
	publicBoxId = "#"+$.fn.publicBoxId,
	closeBoxTime = '', // setTimeout 缁撴灉淇濈暀
	boxButtonYesEvent = function() {}, // 鐢ㄤ簬鍝嶅簲"纭"鎸夐挳浜嬩欢
	boxButtonNoEvent = function() {};  // 鐢ㄤ簬鍝嶅簲"鍙栨秷"鎸夐挳浜嬩欢
	
	
	$.fn.tableColor = function(table, options) {
		var opts = $.extend({}, {odd:'odd', even:'even'}, options);
		table = typeof table == 'string' ? $("#"+table) : $(table);
		
		table.find("tbody tr:visible:even").removeClass().addClass(opts.odd)
		.end().find("tbody tr:visible:odd").removeClass().addClass(opts.even);
	}
	
	/**
	 * 鎻掍欢 鍒濆鍖�
	 */
	$(function() {
		
		// 缁戝畾 纭 鍜� 鍙栨秷鎸夐挳鐨� 鐐瑰嚮浜嬩欢
		$(publicBoxId).find("a[name=yes]").unbind("click").on("click", function() {
			typeof boxButtonYesEvent === "function" ? boxButtonYesEvent() : $.fn.closePublicBox(0);
		})
		.end().find("a[name=no]").unbind("click").on("click", function() {
			typeof boxButtonNoEvent === "function" ? boxButtonNoEvent() : $.fn.closePublicBox(0);
		});
		$('#close_msg').click(function(){
			$.fn.closePublicBox(0);
		});
	});
})(jQuery);