package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdMenuBiz;
import com.deepblue.kuaiding.biz.KdTypeBiz;
import com.deepblue.kuaiding.entity.KdMenu;
import com.deepblue.kuaiding.entity.KdType;
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
	private KdTypeBiz kdTypeBiz;
	
	private String rst;
	
	public String rest1 () {
		return SUCCESS;
	}
	
	public String getMenuList(){
		System.out.println("rst: "+rst);
		List<KdMenu> menus = kdMenuBiz.getMenuListByRst(rst);
		feedback.setDataList(menus, new AJsonConverter<KdMenu>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	public String getType(){
		List<KdType> types = kdTypeBiz.getType();
		if(types != null && types.size() > 0){
			feedback.setDataList(types, new AJsonConverter<KdType>());
			feedback.setSuccess(true);
		}
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
	
	public KdMenuBiz getKdMenuBiz() {
		return kdMenuBiz;
	}

	public void setKdMenuBiz(KdMenuBiz kdMenuBiz) {
		this.kdMenuBiz = kdMenuBiz;
	}

	public KdTypeBiz getKdTypeBiz() {
		return kdTypeBiz;
	}

	public void setKdTypeBiz(KdTypeBiz kdTypeBiz) {
		this.kdTypeBiz = kdTypeBiz;
	}
}
