package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.deepblue.kuaiding.dao.KdOrderDAO;
import com.deepblue.kuaiding.entity.KdOrder;

public class KdOrderBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdOrderDAO kdOrderDAO;
	
	public List<KdOrder> getOrder(){
		List<KdOrder> orders = new ArrayList<KdOrder>();
		Session session = kdOrderDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdOrder.class);
			orders = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return orders;
	}
	
	/*--------------------------------------------*/
	public KdOrderDAO getKdOrderDAO() {
		return kdOrderDAO;
	}

	public void setKdOrderDAO(KdOrderDAO kdOrderDAO) {
		this.kdOrderDAO = kdOrderDAO;
	}
	
}
