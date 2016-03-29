package com.deepblue.kuaiding.action;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.deepblue.kuaiding.biz.KdRstinfoBiz;
import com.deepblue.kuaiding.entity.KdRstinfo;
import com.deepblue.kuaiding.json.converter.RestaurantConverter;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class HomeAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdRstinfoBiz kdRstinfoBiz;
	
	private String type;
	private String loginName;
	private String loginPass;
	
	public String login () {
		System.out.println("loginName: "+loginName);
		System.out.println("loginPass: "+loginPass);
		if (StringUtils.isBlank(loginName)||StringUtils.isBlank(loginPass)) {
			return INPUT;
		} else if (StringUtils.equals("admin", loginName)&&StringUtils.equals("admin", loginPass)) {
			feedback.setSuccess(true);
		} else {
			feedback.setSuccess(false);
		}
		return JsonFeedback.STRUTS_RESULT;
	}
	
	public String home () {
		return SUCCESS;
	}
	
	public String getRst(){
		System.out.println("type: "+type);
		List<KdRstinfo> kdRstinfos = kdRstinfoBiz.getRstinfoByType(type);
		feedback.setDataList(kdRstinfos, RestaurantConverter.Singleton);
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	
	/* get set
	 * -----------------------------------------------------------------*/

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public KdRstinfoBiz getKdRstinfoBiz() {
		return kdRstinfoBiz;
	}

	public void setKdRstinfoBiz(KdRstinfoBiz kdRstinfoBiz) {
		this.kdRstinfoBiz = kdRstinfoBiz;
	}
	
	
}
