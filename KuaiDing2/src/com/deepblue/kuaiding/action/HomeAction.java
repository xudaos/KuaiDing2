package com.deepblue.kuaiding.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class HomeAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
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
}
