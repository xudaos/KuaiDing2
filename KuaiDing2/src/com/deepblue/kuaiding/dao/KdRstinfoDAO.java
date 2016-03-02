package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdRstinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdRstinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdRstinfo
 * @author MyEclipse Persistence Tools
 */
public class KdRstinfoDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdRstinfoDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String PIC = "pic";
	public static final String PICSTAR = "picstar";
	public static final String TIME = "time";
	public static final String SALES = "sales";
	public static final String SENDPRICE = "sendprice";
	public static final String DELIVERYPRICE = "deliveryprice";
	public static final String NOTICE = "notice";
	public static final String ACTIVITY = "activity";
	public static final String YES = "yes";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdRstinfo transientInstance) {
		log.debug("saving KdRstinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdRstinfo persistentInstance) {
		log.debug("deleting KdRstinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdRstinfo findById(java.lang.String id) {
		log.debug("getting KdRstinfo instance with id: " + id);
		try {
			KdRstinfo instance = (KdRstinfo) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdRstinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdRstinfo instance) {
		log.debug("finding KdRstinfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding KdRstinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdRstinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByPic(Object pic) {
		return findByProperty(PIC, pic);
	}

	public List findByPicstar(Object picstar) {
		return findByProperty(PICSTAR, picstar);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findBySales(Object sales) {
		return findByProperty(SALES, sales);
	}

	public List findBySendprice(Object sendprice) {
		return findByProperty(SENDPRICE, sendprice);
	}

	public List findByDeliveryprice(Object deliveryprice) {
		return findByProperty(DELIVERYPRICE, deliveryprice);
	}

	public List findByNotice(Object notice) {
		return findByProperty(NOTICE, notice);
	}

	public List findByActivity(Object activity) {
		return findByProperty(ACTIVITY, activity);
	}

	public List findByYes(Object yes) {
		return findByProperty(YES, yes);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByOrderno(Object orderno) {
		return findByProperty(ORDERNO, orderno);
	}

	public List findByCreator(Object creator) {
		return findByProperty(CREATOR, creator);
	}

	public List findAll() {
		log.debug("finding all KdRstinfo instances");
		try {
			String queryString = "from KdRstinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdRstinfo merge(KdRstinfo detachedInstance) {
		log.debug("merging KdRstinfo instance");
		try {
			KdRstinfo result = (KdRstinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdRstinfo instance) {
		log.debug("attaching dirty KdRstinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdRstinfo instance) {
		log.debug("attaching clean KdRstinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdRstinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdRstinfoDAO) ctx.getBean("KdRstinfoDAO");
	}
}