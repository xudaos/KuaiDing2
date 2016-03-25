package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.deepblue.kuaiding.dao.KdRstinfoDAO;
import com.deepblue.kuaiding.entity.KdRstinfo;

public class KdRstinfoBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdRstinfoDAO kdRstinfoDAO;
	
	public List<KdRstinfo> getRstinfo(){
		List<KdRstinfo> kdRstinfos = new ArrayList<KdRstinfo>();
		Session session = kdRstinfoDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdRstinfo.class);
			kdRstinfos = cr.list();
		}catch(Exception ex){
			logger.error(ex);
		}finally{
			session.close();
		}
		return kdRstinfos;
	}
	/*---------------------------------------------------------------*/
	public KdRstinfoDAO getKdRstinfoDAO() {
		return kdRstinfoDAO;
	}
	public void setKdRstinfoDAO(KdRstinfoDAO kdRstinfoDAO) {
		this.kdRstinfoDAO = kdRstinfoDAO;
	}
}
