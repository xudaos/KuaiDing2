package com.deepblue.kuaiding.action;

import java.util.List;

import com.deepblue.kuaiding.biz.KdTableBiz;
import com.deepblue.kuaiding.entity.KdTable;
import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

public class Rest1DZAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private KdTableBiz kdTableBiz;
	
	private String rst;
	
	public String rest1dz () {
		return SUCCESS;
	}
	
	public String getTableList(){
		System.out.println("rst: "+rst);
		List<KdTable> tables = kdTableBiz.getTableListByRst(rst);
		feedback.setDataList(tables, new AJsonConverter<KdTable>());
		feedback.setSuccess(true);
		return JsonFeedback.STRUTS_RESULT;
	}

	
	/* get set
	 * ----------------------------------------------------------
	 * */

	public KdTableBiz getKdTableBiz() {
		return kdTableBiz;
	}

	public void setKdTableBiz(KdTableBiz kdTableBiz) {
		this.kdTableBiz = kdTableBiz;
	}

	public String getRst() {
		return rst;
	}

	public void setRst(String rst) {
		this.rst = rst;
	}
	
}
