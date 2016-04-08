package com.deepblue.kuaiding.json.converter;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.deepblue.kuaiding.entity.KdOrder;
import com.utility.json.AJsonConverter;

public class OrderConverter extends AJsonConverter<KdOrder> {
	public static final OrderConverter Singleton = new OrderConverter();
	private OrderConverter () {}
	
	public Map<String, Object> Convert2Record (KdOrder t){
		if (t == null)
            return null;
		
		Map<String, Object> record = new HashMap<String, Object>();
		record.put("objectid", t.getObjectid());
		record.put("orderid", t.getOrderid());
		record.put("buyer", t.getBuyer());
		record.put("restaurant", t.getTime());
		record.put("bphone", t.getBphone());
		record.put("rphone", t.getRphone());
		record.put("adress", t.getAdress());
		record.put("time", t.getTime());
		record.put("total", t.getTotal());
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
