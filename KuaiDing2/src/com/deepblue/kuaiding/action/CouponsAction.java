package com.deepblue.kuaiding.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

import com.deepblue.kuaiding.entity.KdRestaurant;

public class CouponsAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	public String coupons () {
		return SUCCESS;
	}
	
	
	/* get set
	 * ----------------------------------------------------------
	 * */
	
	
}
