package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdMessage;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdMessage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdMessage
 * @author MyEclipse Persistence Tools
 */
public class KdMessageDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdMessageDAO.class);
	// property constants
	public static final String RST = "rst";
	public static final String CUSTOMER = "customer";
	public static final String YES = "yes";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdMessage transientInstance) {
		log.debug("saving KdMessage instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdMessage persistentInstance) {
		log.debug("deleting KdMessage instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdMessage findById(java.lang.String id) {
		log.debug("getting KdMessage instance with id: " + id);
		try {
			KdMessage instance = (KdMessage) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdMessage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdMessage instance) {
		log.debug("finding KdMessage instance by example");
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
		log.debug("finding KdMessage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdMessage as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRst(Object rst) {
		return findByProperty(RST, rst);
	}

	public List findByCustomer(Object customer) {
		return findByProperty(CUSTOMER, customer);
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
		log.debug("finding all KdMessage instances");
		try {
			String queryString = "from KdMessage";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdMessage merge(KdMessage detachedInstance) {
		log.debug("merging KdMessage instance");
		try {
			KdMessage result = (KdMessage) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdMessage instance) {
		log.debug("attaching dirty KdMessage instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdMessage instance) {
		log.debug("attaching clean KdMessage instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdMessageDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdMessageDAO) ctx.getBean("KdMessageDAO");
	}
}