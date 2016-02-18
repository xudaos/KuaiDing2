package com.deepblue.kuaiding.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.utility.json.AJsonConverter;
import com.utility.json.JsonFeedback;
import com.utility.json.iJsonable;

import com.deepblue.kuaiding.biz.TzggBiz;
import com.deepblue.kuaiding.entity.ComNews;

public class TzggAction extends ActionSupport implements iJsonable{
	private static final long serialVersionUID = 1L;
	private JsonFeedback feedback = new JsonFeedback();
	public JsonFeedback getJsonObject() {
		return feedback;
	}
	
	private TzggBiz tzggBiz;
	
	private String search;
	private String type;
	private String total;
	private String page;
	
	public String toTzgg () {
		return SUCCESS;
	}
	
	public String getNews () {
		System.out.println("total: "+total);
		System.out.println("page: "+page);
		List<ComNews> list = tzggBiz.getNewsBySearchAndType(search, type);
		feedback.setDataList(list, new AJsonConverter<ComNews>());
		return JsonFeedback.STRUTS_RESULT;
	}

	/* get set
	 * ----------------------------------------------------------
	 * */
	public TzggBiz getTzggBiz() {
		return tzggBiz;
	}

	public void setTzggBiz(TzggBiz tzggBiz) {
		this.tzggBiz = tzggBiz;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		String searchStr = null;
		try {
			searchStr = java.net.URLDecoder.decode(search,"utf-8");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		this.search = searchStr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
