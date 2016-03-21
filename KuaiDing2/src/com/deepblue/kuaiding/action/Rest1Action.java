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
	
	private String rstId;
	
	public String rest1 () {
		return SUCCESS;
	}
	
	public String getMenuList(){
		System.out.println("rstId: "+rstId);
		List<KdMenu> menus = kdMenuBiz.getMenuListByRst(rstId);
		feedback.setDataList(menus, new AJsonConverter<KdMenu>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	/* get set
	 * ----------------------------------------------------------
	 * */
	public String getRstId() {
		return rstId;
	}

	public void setRstId(String rstId) {
		this.rstId = rstId;
	}
	
	public KdMenuBiz getKdMenuBiz() {
		return kdMenuBiz;
	}

	public void setKdMenuBiz(KdMenuBiz kdMenuBiz) {
		this.kdMenuBiz = kdMenuBiz;
	}
}
