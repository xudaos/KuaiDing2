package com.deepblue.kuaiding.action;

import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class MydzListAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	
	public String mydzlist () {
		return SUCCESS;
	}
	
	
	/* get set
	 * ----------------------------------------------------------
	 * */
	

}
