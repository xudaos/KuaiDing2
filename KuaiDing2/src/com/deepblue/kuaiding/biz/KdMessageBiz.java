package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.deepblue.kuaiding.dao.KdMessageDAO;
import com.deepblue.kuaiding.entity.KdMessage;

public class KdMessageBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdMessageDAO kdMessageDAO;
	
	public List<KdMessage> getMessageListByRst(String rst){
		List<KdMessage> messages = new ArrayList<KdMessage>();
		Session session = kdMessageDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdMessage.class);
			if(StringUtils.isNotBlank(rst)){
				cr.add(Restrictions.eq("rst", rst));
			}
			messages = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return messages;
	}
	
	/*--------------------------------------------*/

	public KdMessageDAO getKdMessageDAO() {
		return kdMessageDAO;
	}

	public void setKdMessageDAO(KdMessageDAO kdMessageDAO) {
		this.kdMessageDAO = kdMessageDAO;
	}
	
}
