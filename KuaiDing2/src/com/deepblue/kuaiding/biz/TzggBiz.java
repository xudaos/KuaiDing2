package com.deepblue.kuaiding.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.deepblue.kuaiding.dao.ComNewsDAO;
import com.deepblue.kuaiding.entity.ComNews;
import com.deepblue.kuaiding.system.Utils;

public class TzggBiz {
	private Log logger = LogFactory.getLog(getClass());
	
	private ComNewsDAO comnewsDAO;

	public List<ComNews> getNewsBySearchAndType (String search, String type) {
		List<ComNews> list = new ArrayList<ComNews> ();
		Session session = comnewsDAO.getSessionFactory().openSession();
		try {
			Criteria cr = session.createCriteria(ComNews.class);
			if (!StringUtils.isEmpty(search)) {
				SimpleExpression exp1 = Restrictions.eq("title", search);
				SimpleExpression exp2 = null;
				if (Utils.isInt(search)) {
					int idInt = Integer.parseInt(search);
					exp2 = Restrictions.eq("id", idInt);
					cr.add(Restrictions.or(exp1, exp2));
				} else {
					cr.add(exp1);
				}
			}
			if (!StringUtils.equals("-1", type)&&!StringUtils.isEmpty(type)) {
				cr.add(Restrictions.eq("type", type));
			}
			list = cr.list();
		} catch (Exception ex) {
			logger.error(ex);
		} finally {
			session.close();
		}
		return list;
	}
	
	/* get set other
	 * -----------------------------------------------------------*/
	public ComNewsDAO getComNewsDAO() {
		return comnewsDAO;
	}

	public void setComNewsDAO(ComNewsDAO comnewsDAO) {
		this.comnewsDAO = comnewsDAO;
	}
}
