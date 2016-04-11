package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdRstinfoBiz;
import com.deepblue.kuaiding.entity.KdRstinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class YdAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private String type;
	
	private KdRstinfoBiz kdRstinfoBiz;
	
	public String yd () {
		return SUCCESS;
	}
	
	public String getRestInfo(){
		List<KdRstinfo> kdRstinfos = kdRstinfoBiz.getRstinfoByType(type);
		feedback.setDataList(kdRstinfos, new AJsonConverter<KdRstinfo>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	/* get set
	 * ----------------------------------------------------------
	 * */
	
	public KdRstinfoBiz getKdRstinfoBiz() {
		return kdRstinfoBiz;
	}

	public void setKdRstinfoBiz(KdRstinfoBiz kdRstinfoBiz) {
		this.kdRstinfoBiz = kdRstinfoBiz;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
