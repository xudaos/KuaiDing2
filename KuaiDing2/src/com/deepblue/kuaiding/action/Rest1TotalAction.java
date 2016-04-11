package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdRstinfoBiz;
import com.deepblue.kuaiding.entity.KdRstinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class Rest1TotalAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private String objectid;
	
	private KdRstinfoBiz kdRstinfoBiz;
	
	public String rest1total () {
		return SUCCESS;
	}
	
	public String getRest(){
		List<KdRstinfo> kdRstinfos = kdRstinfoBiz.getRstinfoByType(objectid);
		feedback.setDataList(kdRstinfos, new AJsonConverter<KdRstinfo>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	/* get set
	 * ----------------------------------------------------------
	 * */
	

	public String getObjectid() {
		return objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public KdRstinfoBiz getKdRstinfoBiz() {
		return kdRstinfoBiz;
	}

	public void setKdRstinfoBiz(KdRstinfoBiz kdRstinfoBiz) {
		this.kdRstinfoBiz = kdRstinfoBiz;
	}	
	
}
