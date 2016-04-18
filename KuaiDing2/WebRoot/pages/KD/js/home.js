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
	var banner_img = document.getElementById('banner-img');
	var imgLi = banner_img.getElementsByTagName('li');
	var banner_ico = document.getElementById('banner-ico');
	var icoLi = banner_ico.getElementsByTagName('li');
	var iClick = 0;
	var timer = null;
	var i = 0;
	
	
	banner_img.style.width = imgLi[0].offsetWidth * imgLi.length + 'px';

	function move(){
		startMove(banner_img,'left',-imgLi[0].offsetWidth*iClick);
		ico(icoLi,iClick);
	}
	
	
	for(i=0;i<icoLi.length;i++){
		icoLi[i].index = i;
		icoLi[i].onmouseover = function(){
			iClick = this.index;
			move();
		};
	}
	
	
	function autoPlay(){
		clearInterval(timer);
		timer = setInterval(function(){
			iClick<imgLi.length-1?iClick++:iClick = 0;
			move();	
		},4000);
	}
	
	banner_img.onmouseover = function(){
		clearInterval(timer);
	};
	banner_img.onmouseout = function(){
		autoPlay();
	};
	autoPlay();
}

window.onload = function(){
	banner();
};