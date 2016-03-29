package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdEvaluationBiz;
import com.deepblue.kuaiding.biz.KdMenuBiz;
import com.deepblue.kuaiding.biz.KdMessageBiz;
import com.deepblue.kuaiding.biz.KdTypeBiz;
import com.deepblue.kuaiding.biz.KdRstinfoBiz;
import com.deepblue.kuaiding.entity.KdMenu;
import com.deepblue.kuaiding.entity.KdRstinfo;
import com.deepblue.kuaiding.entity.KdType;
import com.deepblue.kuaiding.entity.KdMessage;
import com.deepblue.kuaiding.entity.KdEvaluation;
import com.deepblue.kuaiding.json.converter.MessageConverter;
import com.deepblue.kuaiding.json.converter.RestaurantConverter;
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
	private KdRstinfoBiz kdRstinfoBiz;
	private KdEvaluationBiz kdEvaluationBiz;
	private KdMessageBiz kdMessageBiz;
	
	private String rst;
	private String objectid;
	
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
	
	public String getRstinfo(){
		System.out.println("objectid: "+objectid);
		List<KdRstinfo> kdRstinfos = kdRstinfoBiz.getRstinfoByType(objectid);
		feedback.setDataList(kdRstinfos, RestaurantConverter.Singleton);
		feedback.setSuccess(true);
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
		feedback.setDataList(messages, MessageConverter.Singleton);
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
	
	
	public String getObjectid() {
		return objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
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

	public KdRstinfoBiz getKdRstinfoBiz() {
		return kdRstinfoBiz;
	}

	public void setKdRstinfoBiz(KdRstinfoBiz kdRstinfoBiz) {
		this.kdRstinfoBiz = kdRstinfoBiz;
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
