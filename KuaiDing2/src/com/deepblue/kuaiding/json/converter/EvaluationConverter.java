package com.deepblue.kuaiding.json.converter;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.deepblue.kuaiding.entity.KdEvaluation;
import com.utility.json.AJsonConverter;

public class EvaluationConverter extends AJsonConverter<KdEvaluation> {
	public static final EvaluationConverter Singleton = new EvaluationConverter();
	private EvaluationConverter () {}
	
	public Map<String, Object> Convert2Record (KdEvaluation t){
		if (t == null)
            return null;
		
		Map<String, Object> record = new HashMap<String, Object>();
		record.put("objectid", t.getObjectid());
		record.put("name", t.getName());
		record.put("rst", t.getRst());
		record.put("customer", t.getCustomer());
		record.put("time", t.getTime());
		record.put("orderid", t.getOrderid());
		record.put("yes", t.getYes());
		record.put("description", t.getDescription());
		record.put("orderno", t.getOrderno());
		record.put("creator", t.getCreator());
		record.put("createtime", t.getCreatetime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(t.getTime() != null)
			record.put("time", sdf.format(t.getTime()));
		else
			record.put("time", "");
		
		return record;
	}
}
