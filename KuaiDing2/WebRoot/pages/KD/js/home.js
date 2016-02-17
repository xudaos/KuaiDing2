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
	var banner_img = document.getElementById('banner-img');//閸ュ墽澧栭柇锝勯嚋ul
	var imgLi = banner_img.getElementsByTagName('li');
	var banner_ico = document.getElementById('banner-ico');//鐏忓繒鍋ｉ悙褰掑亝娑撶尳l
	var icoLi = banner_ico.getElementsByTagName('li');
	var iClick = 0;
	var timer = null;//閼奉亜濮╂潪顔芥尡鐎规碍妞傞崳锟�
	var i = 0;
	
	//閺�懓褰塽l鐎硅棄瀹虫稊瀣閼惧嘲褰囩仦蹇撶閸掑棜椴搁悳鍥╃舶li閸ュ搫鐣剧�钘夊閿涳拷
	banner_img.style.width = imgLi[0].offsetWidth * imgLi.length + 'px';

	function move(){
		startMove(banner_img,'left',-imgLi[0].offsetWidth*iClick);//鏉╂劕濮﹗l
		ico(icoLi,iClick);//閺�懓鐨悙鍦仯閻ㄥ嫰顤侀懝锟�
	}
	
	//娑撳娼扮亸蹇曞仯閻愮懓濮炴禍瀣╂
	for(i=0;i<icoLi.length;i++){
		icoLi[i].index = i;
		icoLi[i].onmouseover = function(){
			iClick = this.index;
			move();
		};
	}
	
	//閼奉亜濮╅幘顓熸杹
	function autoPlay(){
		clearInterval(timer);
		timer = setInterval(function(){
			iClick<imgLi.length-1?iClick++:iClick = 0;
			move();	
		},4000);
	}
	//姒х姵鐖ｇ粔璇插弳閸嬫粍顒涢懛顏勫З閹绢厽鏂�
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