package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.deepblue.kuaiding.dao.KdTableDAO;
import com.deepblue.kuaiding.entity.KdTable;

public class KdTableBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdTableDAO kdTableDAO;
	
	public List<KdTable> getTableListByRst(String rst){
		List<KdTable> tables = new ArrayList<KdTable>();
		Session session = kdTableDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdTable.class);
			if(StringUtils.isNotBlank(rst)){
				cr.add(Restrictions.eq("rst", rst));
			}
			tables = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return tables;
	}
	
	/*--------------------------------------------*/
	public KdTableDAO getKdTableDAO() {
		return kdTableDAO;
	}
	public void setKdTableDAO(KdTableDAO kdTableDAO) {
		this.kdTableDAO = kdTableDAO;
	}
}
