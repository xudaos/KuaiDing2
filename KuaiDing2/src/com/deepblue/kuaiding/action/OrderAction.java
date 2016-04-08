package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdOrderBiz;
import com.deepblue.kuaiding.entity.KdOrder;
import com.deepblue.kuaiding.json.converter.OrderConverter;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class OrderAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdOrderBiz kdOrderBiz;
	
	private String objectid;
	
	public String order () {
		return SUCCESS;
	}

	public String getOrder(){
		System.out.println("objectid: "+objectid);
		List<KdOrder> kdOrders = kdOrderBiz.getOrderListByOrderid(objectid);
		feedback.setDataList(kdOrders, OrderConverter.Singleton);
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}

	/* get set
	 * ----------------------------------------------------------
	 * */
	
	public KdOrderBiz getKdOrderBiz() {
		return kdOrderBiz;
	}

	public void setKdOrderBiz(KdOrderBiz kdOrderBiz) {
		this.kdOrderBiz = kdOrderBiz;
	}

	public String getObjectid() {
		return objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

}
