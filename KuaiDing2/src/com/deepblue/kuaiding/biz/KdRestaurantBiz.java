package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.deepblue.kuaiding.dao.KdRestaurantDAO;
import com.deepblue.kuaiding.entity.KdRestaurant;

public class KdRestaurantBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdRestaurantDAO kdRestaurantDAO;
	
	public List<KdRestaurant> getRestaurantByType(String type){
		List<KdRestaurant> kdRestaurants = new ArrayList<KdRestaurant>();
		Session session = kdRestaurantDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdRestaurant.class);
			cr.add(Restrictions.eq("type", type));
			cr.addOrder(Order.asc("orderno"));
			kdRestaurants = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return kdRestaurants;
	}
	/*---------------------------------------------------------------*/
	public KdRestaurantDAO getKdRestaurantDAO() {
		return kdRestaurantDAO;
	}
	public void setKdRestaurantDAO(KdRestaurantDAO kdRestaurantDAO) {
		this.kdRestaurantDAO = kdRestaurantDAO;
	}
}
