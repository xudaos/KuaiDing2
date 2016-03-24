package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdGwc;

/**
 * A data access object (DAO) providing persistence and search support for KdGwc
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdGwc
 * @author MyEclipse Persistence Tools
 */
public class KdGwcDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdGwcDAO.class);
	// property constants
	public static final String ID = "id";
	public static final String ORDERID = "orderid";
	public static final String NAME = "name";
	public static final String NUMBER = "number";
	public static final String TOTAL = "total";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdGwc transientInstance) {
		log.debug("saving KdGwc instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdGwc persistentInstance) {
		log.debug("deleting KdGwc instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdGwc findById(java.lang.String id) {
		log.debug("getting KdGwc instance with id: " + id);
		try {
			KdGwc instance = (KdGwc) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdGwc", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdGwc instance) {
		log.debug("finding KdGwc instance by example");
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
		log.debug("finding KdGwc instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdGwc as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findById(Object id) {
		return findByProperty(ID, id);
	}

	public List findByOrderid(Object orderid) {
		return findByProperty(ORDERID, orderid);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByTotal(Object total) {
		return findByProperty(TOTAL, total);
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
		log.debug("finding all KdGwc instances");
		try {
			String queryString = "from KdGwc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdGwc merge(KdGwc detachedInstance) {
		log.debug("merging KdGwc instance");
		try {
			KdGwc result = (KdGwc) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdGwc instance) {
		log.debug("attaching dirty KdGwc instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdGwc instance) {
		log.debug("attaching clean KdGwc instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdGwcDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdGwcDAO) ctx.getBean("KdGwcDAO");
	}
}