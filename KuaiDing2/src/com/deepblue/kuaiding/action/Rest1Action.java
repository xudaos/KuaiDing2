package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdEvaluationBiz;
import com.deepblue.kuaiding.biz.KdMenuBiz;
import com.deepblue.kuaiding.biz.KdMessageBiz;
import com.deepblue.kuaiding.biz.KdTypeBiz;
import com.deepblue.kuaiding.entity.KdMenu;
import com.deepblue.kuaiding.entity.KdType;
import com.deepblue.kuaiding.entity.KdMessage;
import com.deepblue.kuaiding.entity.KdEvaluation;
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
	private KdEvaluationBiz kdEvaluationBiz;
	private KdMessageBiz kdMessageBiz;
	
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
	
	public String getEvaluationList(){
		System.out.println("rst: "+rst);
		List<KdEvaluation> evaluations = kdEvaluationBiz.getEvaluationListByRst(rst);
		feedback.setDataList(evaluations, new AJsonConverter<KdEvaluation>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}
	
	public String getMessageList(){
		System.out.println("rst: "+rst);
		List<KdMessage> messages = kdMessageBiz.getMessageListByRst(rst);
		feedback.setDataList(messages, new AJsonConverter<KdMessage>());
		feedback.setSuccess(true);
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

	public KdEvaluationBiz getKdEvaluationBiz() {
		return kdEvaluationBiz;
	}

	public void setKdEvaluationBiz(KdEvaluationBiz kdEvaluationBiz) {
		this.kdEvaluationBiz = kdEvaluationBiz;
	}

	public KdMessageBiz getKdMessageBiz() {
		return kdMessageBiz;
	}

	public void setKdMessageBiz(KdMessageBiz kdMessageBiz) {
		this.kdMessageBiz = kdMessageBiz;
	}
	
}
