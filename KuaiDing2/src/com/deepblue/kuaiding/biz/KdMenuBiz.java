package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.deepblue.kuaiding.dao.KdMenuDAO;
import com.deepblue.kuaiding.entity.KdMenu;
import com.deepblue.kuaiding.entity.KdRestaurant;

public class KdMenuBiz {
	private Log logger = LogFactory.getLog(getClass());
	private KdMenuDAO kdMenuDAO;
	
	public List<KdMenu> getMenuListByRst(String rst){
		List<KdMenu> menus = new ArrayList<KdMenu>();
		Session session = kdMenuDAO.getSessionFactory().openSession();
		try{
			Criteria cr = session.createCriteria(KdMenu.class);
			if(StringUtils.isNotBlank(rst)){
				cr.add(Restrictions.eq("rst", rst));
			}
			menus = cr.list();
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error(ex);
		}finally{
			session.close();
		}
		return menus;
	}
	
	/*--------------------------------------------*/
	public KdMenuDAO getKdMenuDAO() {
		return kdMenuDAO;
	}
	public void setKdMenuDAO(KdMenuDAO kdMenuDAO) {
		this.kdMenuDAO = kdMenuDAO;
	}
}
