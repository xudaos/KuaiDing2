package com.deepblue.kuaiding.json.converter;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.deepblue.kuaiding.entity.KdRestaurant;
import com.utility.json.AJsonConverter;

public class RestaurantConverter extends AJsonConverter<KdRestaurant> {
	public static final RestaurantConverter Singleton = new RestaurantConverter();
	private RestaurantConverter () {}
	
	public Map<String, Object> Convert2Record (KdRestaurant t){
		if (t == null)
            return null;
		
		Map<String, Object> record = new HashMap<String, Object>();
		record.put("objectid", t.getObjectid());
		record.put("name", t.getName());
		record.put("address", t.getAddress());
		record.put("pic", t.getPic());
		record.put("phone", t.getPhone());
		record.put("distance", t.getDistance());
		record.put("region", t.getRegion());
		record.put("avgprice", t.getAvgprice());
		record.put("type", t.getType());
		record.put("description", t.getDescription());
		record.put("orderno", t.getOrderno());
		record.put("creator", t.getCreator());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(t.getCreatetime() != null)
			record.put("createtime", sdf.format(t.getCreatetime()));
		else
			record.put("createtime", "");
		if(t.getDate() != null)
			record.put("date", sdf.format(t.getDate()));
		else
			record.put("date", "");
		record.put("pic2", t.getPic2());
		record.put("remarks", t.getRemarks());
		
		return record;
	}
}
