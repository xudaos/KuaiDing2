// JavaScript Document
function getStyle(obj, attr){
	return obj.currentStyle?obj.currentStyle[attr]:getComputedStyle(obj, false)[attr];
}

function startMove(obj,attr,iTarget){
	var iSpeed = 0;
	var sty = 0;
	clearInterval(obj.timer);
	obj.timer = setInterval(function(){
		sty = parseInt(getStyle(obj,attr));
		iSpeed = (iTarget - sty)/7;
		iSpeed = iSpeed>0?Math.ceil(iSpeed):Math.floor(iSpeed);
		//if(Math.abs(iSpeed)>1){
		if(Math.abs(iTarget - sty)>3){
			obj.style[attr] = sty + iSpeed + 'px';
		}else{
			clearInterval(obj.timer);
			obj.style[attr] = iTarget + 'px';
		}
	},30);
}

function ico(obj,iClick){
	for(i=0;i<obj.length;i++){
		obj[i].className = '';
	}
	obj[iClick].className = 'ico';
}

function banner(){
	var banner_img = document.getElementById('banner-img');//鍥剧墖閭ｄ釜ul
	var imgLi = banner_img.getElementsByTagName('li');
	var banner_ico = document.getElementById('banner-ico');//灏忕偣鐐归偅涓猽l
	var icoLi = banner_ico.getElementsByTagName('li');
	var iClick = 0;
	var timer = null;//鑷姩杞挱瀹氭椂鍣�
	var i = 0;
	
	//鏀瑰彉ul瀹藉害涔嬪墠鑾峰彇灞忓箷鍒嗚鲸鐜囩粰li鍥哄畾瀹藉害锛�
	banner_img.style.width = imgLi[0].offsetWidth * imgLi.length + 'px';

	function move(){
		startMove(banner_img,'left',-imgLi[0].offsetWidth*iClick);//杩愬姩ul
		ico(icoLi,iClick);//鏀瑰皬鐐圭偣鐨勯鑹�
	}
	
	//涓嬮潰灏忕偣鐐瑰姞浜嬩欢
	for(i=0;i<icoLi.length;i++){
		icoLi[i].index = i;
		icoLi[i].onmouseover = function(){
			iClick = this.index
			move();
		}
	}
	
	//鑷姩鎾斁
	function autoPlay(){
		clearInterval(timer);
		timer = setInterval(function(){
			iClick<imgLi.length-1?iClick++:iClick = 0;
			move();	
		},4000);
	}
	//榧犳爣绉诲叆鍋滄鑷姩鎾斁
	banner_img.onmouseover = function(){
		clearInterval(timer);
	}
	banner_img.onmouseout = function(){
		autoPlay();
	}
	autoPlay();
}

window.onload = function(){
	banner();
}