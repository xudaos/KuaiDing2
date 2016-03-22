package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdMenuBiz;
import com.deepblue.kuaiding.entity.KdMenu;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class Rest1Action extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdMenuBiz kdMenuBiz;
	
	private String rst;
	private String type;
	
	public String rest1 () {
		return SUCCESS;
	}
	
	public String getMenuList(){
		System.out.println("rst: "+rst);
		System.out.println("type: "+type);
		List<KdMenu> menus = kdMenuBiz.getMenuListByRst(rst);
		feedback.setDataList(menus, new AJsonConverter<KdMenu>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	/* get set
	 * ----------------------------------------------------------
	 * */
	public String getRst() {
		return rst;
	}

	public void setRst(String rst) {
		this.rst = rst;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public KdMenuBiz getKdMenuBiz() {
		return kdMenuBiz;
	}

	public void setKdMenuBiz(KdMenuBiz kdMenuBiz) {
		this.kdMenuBiz = kdMenuBiz;
	}
}
