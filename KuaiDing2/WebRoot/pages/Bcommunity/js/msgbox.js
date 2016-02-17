// JavaScript Document
;(function($) {
	$.fn.publicBoxId = "msg_box"; // mini瀵懓鍤鍜篋
	
	/**
	 * 閺勫墽銇�
	 * @params {content:'閳ワ腹鈧拷', showButton:true, width:250, callback:function(){}, noCallback:''}
	 */
	$.fn.alertMsg = function(options) {
		return alertMsg(this, options);
	};
	
	/**
	 * mini閹绘劗銇氬锟�
	 * @params {msg:'閳ワ腹鈧拷', color:'red', autoClose:true}
	 */
	$.fn.pointMsg = function(options) {
		return pointMsg(this, options);
	};
	
	/**
	 * mini绾喛顓诲锟�
	 * @params {msg:'閳ワ腹鈧拷', color:'red', callback:function(){}, noCallback:''}
	 */
	$.fn.miniConfirm = function(options) {
		return miniConfirm(this, options);
	};
	
	/**
	 * 閸忣剙鍙￠惃鍑橨AX閹绘劒姘︾悰銊ュ礋閺傝纭�
	 * @params {url:'閳ワ腹鈧拷', formId:'red', successCall:function(){}, errorCall:'', showSuccessMsg:true}
	 */
	$.fn.publicAjaxPost = function(options) {
		return publicAjaxPost(this, options);
	};

	
	function showPublicBox(obj, options) {
		var opts = $.extend({}, defaults, options);
		if(typeof opts.width != 'number' || opts.width <= 0) opts.width = 350;

		$(publicBoxId).children("p").html(opts.content);
		opts.msgType=='1' ? $(publicBoxId).find("a[name='no']").hide() : $(publicBoxId).find("a[name='no']").show();
		opts.msgType=='1' ? $(publicBoxId).find("a[id='close_msg']").hide() : $(publicBoxId).find("a[id='close_msg']").show();
		opts.showButton ? $(publicBoxId).find("input").show() : $(publicBoxId).find("input").hide();

		// 闁灝鍘ら幓鎰仛濡楋拷 鐡掑懎鍤ù蹇氼潔閸ｃ劎鐛ラ崣锝堝瘱閸ワ拷
		$("#bj_div").css({height:$(document).height(), width:$(document).width(),display:'block'});
		//$(publicBoxId).css({left:($(window).width()/2-200),top:($(window).height()/2-100),_top:($(window).height()/2+top-150)}).fadeIn(180);
		$(publicBoxId).css({left:($(window).width()/2-200),top:240,_top:($(window).height()/2+top-150)}).fadeIn(180);
		if(opts.showButton) {
			boxButtonYesEvent = opts.callback;
			boxButtonNoEvent = opts.noCallback;
		}
	}
	
	/**
	 * 閸忔娊妫�
	 * @param time 瀵よ埖妞傚В顐ゎ潡閿涘苯婀猼ime濮ｎ偆顫楅崥搴″彠闂傦拷
	 */
	$.fn.closePublicBox = function(time) {
		if(typeof time != 'number') time = 3000;
		clearTimeout(closeBoxTime);
		closeBoxTime = setTimeout(function() {
			$('#bj_div').fadeOut(360);
			$(publicBoxId).fadeOut(360);
		}, time);
	};
	
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
	
	// 閺勵垰鎯侀崗浣筋啅AJAX 鐠囬攱鐪伴敍灞藉礋缁捐法鈻奸敍灞界秼閸撳秳绔存稉鐙滼AX鐠囬攱鐪版担宥呯暚閹存劖妞傞敍灞肩瑝閸忎浇顔忛崘宥嗩偧鐠囬攱鐪�
	// 鐠囬攱鐪版潻鏃囩箷 JSON 閺嶇厧绱￠弫鐗堝祦閿涘本婀伴弬瑙勭《娑擄拷 鐠佹儳鐣�data.error == 0 鐞涖劎銇氶幋鎰閿涳拷 data.msg 娑撶儤绉烽幁锟�
	allowAjaxPost = true;
	function publicAjaxPost(obj, options) {
		if(allowAjaxPost === false) {
			pointMsg(obj, {msg:'缁涘绶烝JAX鐠囬攱鐪伴梼鐔峰灙閿涳拷'});
			return;
		}
		
		var opts = $.extend({}, defaults, options);
		allowAjaxPost = false;
		
		pointMsg(obj, {msg:'缁涘绶熺拠閿嬬湴...', color:'green', autoClose:false});
		
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
		};
		
		var error = function() {
			pointMsg(obj, {msg:'鐠囬攱鐪版径杈Е閿涳拷'});
			if(typeof opts.errorCall == 'function') {
				opts.errorCall();
			}
			allowAjaxPost = true;
		};
		
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

	
	// 姒涙顓婚崣鍌涙殶
	var defaults = {
		width: 350,
		height:200,
		content: 'hello!', // 鐠嬪啰鏁�showPublicBox 閺冨墎娈戦崘鍛啇
		callback: function(){}, // "绾喖鐣�閹稿鎸抽崶鐐剁殶
		noCallback: '', // "閸欐牗绉�閹稿鎸抽崶鐐剁殶
		showButton: true, // 閺勵垰鎯侀弰鍓с仛閹稿鎸�
		msg: '', // 閻€劋绨�miniConfirm閿涳拷 閸滐拷 pointMsg
		color: 'red', // 濞戝牊浼呮０婊嗗
		autoClose: true, // 閺勵垰鎯侀懛顏勫З瀵よ埖妞傞崗鎶芥４
		autoCloseTime: 2500, // 瀵よ埖妞傞崗鎶芥４閺冨爼妫�
		msgType:'1',
		
		// 閻€劋绨�publicAjaxPost
		url: '', //娑撳秷袙闁诧拷
		formId: '', //闂団偓鐟曚焦褰佹禍銈囨畱鐞涖劌宕烮D
		successCall: function(){}, //鐠囬攱鐪伴幋鎰閺冨墎娈戦崶鐐剁殶閸戣姤鏆�
		errorCall: function(){}, //鐠囬攱鐪版径杈Е閺冨墎娈戦崶鐐剁殶閸戣姤鏆�
		showSuccessMsg: true //閺勵垰鎯侀弰鍓с仛鐠囬攱鐪伴幋鎰閻ㄥ嫭绉烽幁锟�
	},
	publicBoxId = "#"+$.fn.publicBoxId,
	closeBoxTime = '', // setTimeout 缂佹挻鐏夋穱婵堟殌
	boxButtonYesEvent = function() {}, // 閻€劋绨崫宥呯安"绾喛顓�閹稿鎸虫禍瀣╂
	boxButtonNoEvent = function() {};  // 閻€劋绨崫宥呯安"閸欐牗绉�閹稿鎸虫禍瀣╂
	
	
	$.fn.tableColor = function(table, options) {
		var opts = $.extend({}, {odd:'odd', even:'even'}, options);
		table = typeof table == 'string' ? $("#"+table) : $(table);
		
		table.find("tbody tr:visible:even").removeClass().addClass(opts.odd)
		.end().find("tbody tr:visible:odd").removeClass().addClass(opts.even);
	};
	
	/**
	 * 閹绘帊娆�閸掓繂顫愰崠锟�
	 */
	$(function() {
		
		// 缂佹垵鐣�绾喛顓�閸滐拷 閸欐牗绉烽幐澶愭尦閻拷 閻愮懓鍤禍瀣╂
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