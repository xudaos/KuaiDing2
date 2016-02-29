package com.deepblue.kuaiding.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;
import com.deepblue.kuaiding.biz.KdRestaurantBiz;
import com.deepblue.kuaiding.entity.KdRestaurant;

public class YdAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdRestaurantBiz kdRestaurantBiz;
	private String type;
	
	public String yd () {
		return SUCCESS;
	}
	
	public String getRest(){
		System.out.println("type: "+type);
		List<KdRestaurant> kdRestaurants = kdRestaurantBiz.getRestaurantByType(type);
		feedback.setDataList(kdRestaurants, new AJsonConverter<KdRestaurant>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	/* get set
	 * ----------------------------------------------------------
	 * */
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
