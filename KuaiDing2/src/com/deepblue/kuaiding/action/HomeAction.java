package com.deepblue.kuaiding.action;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.deepblue.kuaiding.biz.KdRestaurantBiz;
import com.deepblue.kuaiding.entity.KdRestaurant;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class HomeAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdRestaurantBiz kdRestaurantBiz;
	
	private String type;
	private String username;
	private String password;
	
	public String login () {
		if (StringUtils.isBlank(username)||StringUtils.isBlank(password)) {
			return INPUT;
		} else if (StringUtils.equals("admin", username)&&StringUtils.equals("admin", password)) {
			feedback.setSuccess(true);
		} else {
			feedback.setSuccess(false);
		}
		return JsonFeedback.STRUTS_RESULT;
	}
	
	public String home () {
		return SUCCESS;
	}
	
	public String getLunbo(){
		System.out.println("type: "+type);
		List<KdRestaurant> kdRestaurants = kdRestaurantBiz.getRestaurantByType(type);
		feedback.setDataList(kdRestaurants, new AJsonConverter<KdRestaurant>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	
	/* get set
	 * -----------------------------------------------------------------*/
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public KdRestaurantBiz getKdRestaurantBiz() {
		return kdRestaurantBiz;
	}

	public void setKdRestaurantBiz(KdRestaurantBiz kdRestaurantBiz) {
		this.kdRestaurantBiz = kdRestaurantBiz;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
