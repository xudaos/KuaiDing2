package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.deepblue.kuaiding.dao.KdGwcDAO;
import com.deepblue.kuaiding.entity.KdGwc;

public class KdGwcBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdGwcDAO kdGwcDAO;
	
	public List<KdGwc> getGwc(){
		List<KdGwc> gwcs = new ArrayList<KdGwc>();
		Session session = kdGwcDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdGwc.class);
			gwcs = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return gwcs;
	}
	
	/*--------------------------------------------*/
	public KdGwcDAO getKdGwcDAO() {
		return kdGwcDAO;
	}

	public void setKdTypeDAO(KdGwcDAO kdGwcDAO) {
		this.kdGwcDAO = kdGwcDAO;
	}
	
}
