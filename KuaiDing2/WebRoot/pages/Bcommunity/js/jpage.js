(function($) {
    $.fn.jBootstrapPage = function(config) {

        if (this.size() != 1)
            $.error('鐠囪渹璐熸潻娆庨嚋閹绘帊娆㈤幓鎰返娑撯偓娑擃亜鏁稉鈧惃鍕椽閸欙拷');
        
        var c = {
        	pageSize : 10,
        	total : 0,
        	maxPages : 1,
        	realPageCount : 1,
        	lastSelectedIndex : 1,
        	selectedIndex : 1,
        	maxPageButton: 3,
        	typeFlag:0,
        	onPageClicked : null
        };
        
        var firstBtn, preBtn, nextBtn, lastBtn;
        
        return this.each(function() {

            var $this = $(this);
            if (config) $.extend(c, config);
            
            init();
            bindALL();
            
            function init() {
            	$this.find('li').remove();
            	c.maxPages = Math.ceil(c.total/c.pageSize);
            	
            	if(c.maxPages <= 1) return; 
            	
            	/*$this.append('<li class="disabled"><a class="first" href="#">&laquo;</a></li>');*/
            	$this.append('<li class="disabled"><a class="pre" id="pre_page" href="#">娑撳﹣绔存い锟�/a></li>');
        		
        		var pageCount = c.maxPages < c.maxPageButton ? c.maxPages : c.maxPageButton;
        		var pNum = 0;
        		for(var index = 1; index <= pageCount; index++) {
        			pNum++;
        			$this.append('<li class="page" id="getCss" pNum="'+pNum+'"><a href="#" class="'+pNum+'" page="'+index+'">'+index+'</a></li>');
        		}
        		
        		$this.append('<li class="disabled"><a id="next_page" class="next" href="#">娑撳绔存い锟�/a></li>');
        		/*$this.append('<li><a class="last" href="#">&raquo;</a></li>');*/
        		/*閸︺劍鈧銆夐弫棰佺瑐闂堛垹濮炴禍鍡曠娑撶導d='sum_Pages'*/
        		if(c.typeFlag!=1){
        			$this.append('<li class="li1 li2"  style="font-size:14px;">閸忥拷&nbsp;'+c.maxPages+'&nbsp;妞わ拷</li>'+'<li id= "input_frame" class="li1 li2" style="font-size:14px;">閸掓壆顑�nbsp;'+'<input  value="'+c.selectedIndex+'" data-max="'+c.maxPages+'" class="goto" id="page_jump_num" onkeydown="javascript:if(event.keyCode==13){$("#btn_go").click();return false;}" type="text">&nbsp;妞わ拷</li>'+'<li class="li1 li3"><a style="line-height: 33px;" id="btn_go" href="javascript:;">绾喖鐣�/a></li>');
            		
        		}
        		if(c.maxPages==1) {
        			$this.find('li a.next').parent().addClass("disabled");
            		$this.find('li a.last').parent().addClass("disabled");
            	}else {
            		$this.find('li a.next').parent().removeClass("disabled");
            		$this.find('li a.last').parent().removeClass("disabled");
            	}
        		
        		$this.find('li:nth-child(2)').addClass('active');
        		
        		firstBtn = $this.find('li a.first').parent();
        		preBtn = $this.find('li a.pre').parent();
        		lastBtn = $this.find('li a.last').parent();
        		nextBtn = $this.find('li a.next').parent();
            }
            
            function mathPrePage(currButtonNum, currPage, maxPage, showPage) {
            	//閸欏倹鏆熼幇蹇庣疅閿涙艾鍤悳鎵畱5娑擃亝瀵滈柦顔昏厬閻ㄥ嫮顑囬崙鐘遍嚋閿涘本瀵滈柦顔荤瑐閻ㄥ嫭鏆熺�妤嬬礉妞ょ敻娼伴幀缁樻殶閿涘本妯夌粈鐑樺瘻闁筋喗鏆熼敍锟�
            	$("#pre_page").blur();//娑撳﹣绔存い鍨瘻闁筋喖銇戦崢鑽ゅ妽閻愶拷
            	if(maxPage < 1) return; 
            	
            	//闁鑵戦惃鍕瘻闁筋喖銇囨禍搴濊厬闂傚瓨鏆熼敍灞芥皑鏉╂稐绔存担锟�
            	var middle = Math.ceil(showPage/2); // 3
            	// 4 > 3
            	// 5 - 4 + 3 
            	if(currButtonNum != currPage && currButtonNum < middle) {
            		$this.find('li.page').remove();
            		//$this.find('li.page').style.display="none";
            		
            		//1 2 3 4 5 6 7 8 9 10
            		//   
            		var endPages = currPage + Math.floor(middle/2);
            		if(endPages < c.maxPageButton) endPages = c.maxPageButton+1;
            		
            		var startPages = endPages - c.maxPageButton;
            		
            		if(startPages <= 0)startPages = 1;
            		
            		if(endPages - startPages >= c.maxPageButton) {
            			var d = endPages - startPages - c.maxPageButton;
            			if(d == 0) d = 1;
            			endPages -= d;
            		} 
            		
            		var pNum = 0;
            		var html = '';
            		for(var index = startPages; index <= endPages; index++) {
            			pNum++;
            			html += '<li class="page" pNum="'+pNum+'"><a href="#" page="'+index+'">'+index+'</a></li>';
            		}
            		
            		$this.find('li:nth-child(1)').after(html);
            		
            		bindPages();
            	}
            }
            
            function mathNextPage(currButtonNum, currPage, maxPage, showPage) {
            	$("#next_page").blur();
            	if(maxPage < 1) return; 
            	var offsetRight = 2;
            	//闁鑵戦惃鍕瘻闁筋喖銇囨禍搴濊厬闂傚瓨鏆熼敍灞芥皑鏉╂稐绔存担锟�
            	var middle = showPage - 1; // 4
            	// 4 > 3
            	// 5 - 4 + 3 
            	if((currButtonNum != currPage+1 || maxPage > showPage) && currButtonNum >= middle) {
            		//閺勫墽銇氶崥搴ㄦ桨2娑擃亝瀵滈柦锟�
            		var startPages = currPage - offsetRight;
            		var endPages = currPage + middle;
            		
            		endPages = endPages >= maxPage ? maxPage : endPages;
            		
            		if(endPages <= c.maxPageButton) endPages = c.maxPageButton;
            		
            		if(endPages - startPages >= c.maxPageButton) {
            			var d = endPages - startPages - c.maxPageButton;
            			endPages -= d;
            		} 
            		
            		if(endPages == maxPage)endPages++;
            		
            		if(endPages - startPages >= c.maxPageButton) {
            			var d = c.maxPageButton - (endPages - startPages); 
            			startPages -= d;
            		}
            		
            		var pNum = 0;
            		var html = '';
            		for(var index = startPages; index < endPages; index++) {
            			pNum++;
            			html += '<li class="page" pNum="'+pNum+'"><a href="#" page="'+index+'">'+index+'</a></li>';
            		}
            		
            	
            		$this.find('li.page').remove();
            		
            		$this.find('li:nth-child(1)').after(html);
            		
            		bindPages();
            		
            	}
            	
            }
            
          //鐠哄疇娴嗘い锟�
        	function btn_go_Page(currButtonNum, currPage, maxPage, showPage) {
        		$("#btn_go").blur();
            	if(maxPage < 1) return; 
            	
            	var offsetRight = 2;
            	//闁鑵戦惃鍕瘻闁筋喖銇囨禍搴濊厬闂傚瓨鏆熼敍灞芥皑鏉╂稐绔存担锟�
            	var middle = showPage - 1; // 4
            	// 4 > 3
            	// 5 - 4 + 3 
            	
            	if(maxPage > showPage ) {
            		
            		//閺勫墽銇氶崥搴ㄦ桨2娑擃亝瀵滈柦锟�
            		var startPages = currPage - 3;
            		
            		var endPages = currPage + 1;
            		
            		if(endPages>=c.maxPages){
            			endPages = c.maxPages;
            			startPages = c.maxPages-middle;
            		}
            		if(currPage<3){
            			startPages=1;
            			endPages = showPage;
            		}
            		
            		
            		//endPages = endPages >= maxPage ? maxPage : endPages;
            		
            		//if(endPages <= c.maxPageButton) endPages = c.maxPageButton;
            		
            		/*if(endPages - startPages >= c.maxPageButton) {
            			var d = endPages - startPages - c.maxPageButton;
            			endPages -= d;
            		} */
            		
            		//if(endPages == maxPage)endPages++;
            		
            		/*if(endPages - startPages < c.maxPageButton) {
            			var d = c.maxPageButton - (endPages - startPages); 
            			startPages -= d;
            		}*/
            		
            		var pNum = 0;
            		var html = '';
            		for(var index = startPages; index <= endPages; index++) {
            			pNum++;
            			html += '<li class="page" pNum="'+pNum+'"><a href="#" page="'+index+'">'+index+'</a></li>';
            		}
            		
            		$this.find('li.page').remove();
            		$this.find('li:nth-child(1)').after(html);
            		
            		bindPages();
            	}
        	
        	}
            //閻愮懓鍤い鐢告桨閺佹澘鐡�
            function onClickPage(pageBtn) {
            	c.lastSelectedIndex = c.selectedIndex;
            	c.selectedIndex = parseInt(pageBtn.text());
            	
            	
            	if(c.onPageClicked) {
            		c.onPageClicked.call(this, $this, c.selectedIndex-1);
            		
            	}
            	
            	$this.find('li.active').removeClass('active');
            	pageBtn.parent().addClass('active');
            	
            	//濡楀棗鍞撮弫鏉跨摟闂呭繐濮�
            	if($("#page_jump_num").val() < 1){
            		
            		$("#page_jump_num").val("1");
            	}
            	if($("#page_jump_num").val() >=1 && $("#page_jump_num").val() <= c.maxPages){
            		$("#page_jump_num").val(c.selectedIndex);
            		
            	}
            	else if($("#page_jump_num").val() > c.maxPages){
            		$("#page_jump_num").val(c.maxPages);
            		//page_jump(c.maxPages);
            	}
            	currButtonNum = $("#page_jump_num").val();
            	
            	if(c.selectedIndex > 1) {
            		if(preBtn.hasClass('disabled')) {
	            		firstBtn.removeClass("disabled");
	            		preBtn.removeClass("disabled");
	            		
	            		bindFirsts();
            		}
            	}else {
            		if(!preBtn.hasClass('disabled')) {
            			firstBtn.addClass("disabled");
            			preBtn.addClass("disabled");
            		}
            	}
            	
            	if(c.selectedIndex >= c.maxPages) {
            		if(!nextBtn.hasClass('disabled')) {
            			nextBtn.addClass("disabled");
            			lastBtn.addClass("disabled");
            		}
            	}else {
            		if(nextBtn.hasClass('disabled')) {
            			nextBtn.removeClass("disabled");
            			lastBtn.removeClass("disabled");
            		
            			bindLasts();
            		}
            	}
            	
            	/*if(currPage){
            		
            	}
            	if(){
            		
            	}if(){
            		
            	}*/
            	
            }
            
            function onPageBtnClick($_this) {
            	var selectedText = $_this.text();
            	var selectedBtn = $this.find('li.active').find('a');
            	
            	if(selectedText == '娑撳绔存い锟� || selectedText == 绂�') {
            		
            		var selectedIndex = parseInt(selectedBtn.text());
            		var selectNum = parseInt($this.find('li.active').attr('pNum'))+1;
            		if(selectNum > c.maxPageButton) selectNum = c.maxPageButton-1;
            		
            		if(selectedIndex > 0) {
            			mathNextPage(selectNum, selectedIndex, c.maxPages, c.maxPageButton);
            			selectedBtn = $this.find('li.page').find('a[page="'+(selectedIndex+1)+'"]');
            		};
            	}
            	else if(selectedText == '娑撳﹣绔存い锟�  || selectedText == 鑺�') {
            		var selectedIndex = parseInt(selectedBtn.text())-1;
            		var selectNum = parseInt($this.find('li.active').attr('pNum'))-1;
            		if(selectNum < 1) selectNum = 1;
            		
            		mathPrePage(selectNum, selectedIndex, c.maxPages, c.maxPageButton);
            		selectedBtn = $this.find('li.page').find('a[page="'+(selectedIndex)+'"]');
            	}
            	else if(selectedText == '绾喖鐣� '){
            		var selectedIndex = $("#page_jump_num").val();
            		selectedIndex = handle_math(selectedIndex);//鏉╂柨娲栭崶娑滃灄娴滄柨鍙嗛崥搴ｆ畱妞ょ敻娼伴崐锟�
            		
            		/*if(selectedIndex < 1){
            			$("#page_jump_num").val("1");
            		}if(selectedIndex >= 1 && selectedIndex <= c.maxPages){
            			$("#page_jump_num").val(selectedIndex);
            		}else if($("#page_jump_num").val() > c.maxPages){
            			$("#page_jump_num").val(c.maxPages);
            			
            		}*/
            		page_jump();//鐠嬪啰鏁ょ涵顔款吇鐠哄疇娴嗛弬瑙勭《
            		
            		var selectNum = parseInt(selectedIndex);
            		btn_go_Page(selectNum, selectedIndex, c.maxPages, c.maxPageButton);
            		selectedBtn = $this.find('li.page').find('a[page="'+(selectedIndex)+'"]');
            		page_jump(selectedIndex);
            	}
            	else {
            		selectedBtn = $_this;
            	}
            	
            	onClickPage(selectedBtn);
            }
            
            function bindPages() {     	
            	$this.find("li.page a").each(function(){
            		if($(this).parent().hasClass('disabled')) return;
            		
            		$(this).on('pageClick', function(e) {
            			onPageBtnClick($(this));
            		});
                });
            	
                $this.find("li.page a").click(function(e){
                	e.preventDefault();
                	
                	$(this).trigger('pageClick', e);
                });
            }
            
            function bindFirsts() {
            	$this.find("li a.first,li a.pre").each(function() {
            		if($(this).parent().hasClass('disabled')) return;
            		
            		$(this).unbind('pageClick');
            		$(this).on('pageClick', function(e) {
            			onPageBtnClick($(this));
            		});
                });
            }
            
            function bindLasts() {
            	$this.find("li a.last,li a.next").each(function() {
            		if($(this).parent().hasClass('disabled')) return;
            		
            		$(this).unbind('pageClick');
            		$(this).on('pageClick', function(e) {
            			onPageBtnClick($(this));
            		});
                });
            }
            
            function bindALL() {
            	$this.find("li.page a,li a.first,li a.last,li a.pre,li a.next,#btn_go").each(function() {
            		if($(this).parent().hasClass('disabled')) return;
            		
            		$(this).on('pageClick', function(e) {
            			onPageBtnClick($(this));
            		});
                });
            	
                $this.find("li.page a,li a.first,li a.last,li a.pre,li a.next,#btn_go").click(function(e) {
                	e.preventDefault();
                	
                	if($(this).parent().hasClass('disabled')) return;
                	$(this).trigger('pageClick', e);
                });
            }
            //婢跺嫮鎮婃い鐢告桨閻€劍鍩涙繅顐㈠弳濡楀棛娈戦弫鏉跨摟
            function handle_math(selectedIndex){
            	if(selectedIndex <1){
            		selectedIndex = 1;
            		
            	}
            	if(selectedIndex >= 1 && selectedIndex <= c.maxPages){
            		selectedIndex = Math.round(selectedIndex);
            		
            	}
            	else if(selectedIndex > c.maxPages){
            		selectedIndex = c.maxPages;
            	}
            	return selectedIndex;
            }
        });
    };
})(jQuery);