package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.deepblue.kuaiding.dao.KdTypeDAO;
import com.deepblue.kuaiding.entity.KdType;

public class KdTypeBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdTypeDAO kdTypeDAO;
	
	public List<KdType> getType(){
		List<KdType> types = new ArrayList<KdType>();
		Session session = kdTypeDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdType.class);
			types = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return types;
	}
	
	/*--------------------------------------------*/
	public KdTypeDAO getKdTypeDAO() {
		return kdTypeDAO;
	}

	public void setKdTypeDAO(KdTypeDAO kdTypeDAO) {
		this.kdTypeDAO = kdTypeDAO;
	}
	
}
