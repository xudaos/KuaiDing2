package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdOrder;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdOrder entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdOrder
 * @author MyEclipse Persistence Tools
 */
public class KdOrderDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdOrderDAO.class);
	// property constants
	public static final String ORDERID = "orderid";
	public static final String BUYER = "buyer";
	public static final String RESTAURANT = "restaurant";
	public static final String BPHONE = "bphone";
	public static final String RPHONE = "rphone";
	public static final String ADRESS = "adress";
	public static final String TOTAL = "total";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdOrder transientInstance) {
		log.debug("saving KdOrder instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdOrder persistentInstance) {
		log.debug("deleting KdOrder instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdOrder findById(java.lang.String id) {
		log.debug("getting KdOrder instance with id: " + id);
		try {
			KdOrder instance = (KdOrder) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdOrder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdOrder instance) {
		log.debug("finding KdOrder instance by example");
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
		log.debug("finding KdOrder instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdOrder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderid(Object orderid) {
		return findByProperty(ORDERID, orderid);
	}

	public List findByBuyer(Object buyer) {
		return findByProperty(BUYER, buyer);
	}

	public List findByRestaurant(Object restaurant) {
		return findByProperty(RESTAURANT, restaurant);
	}

	public List findByBphone(Object bphone) {
		return findByProperty(BPHONE, bphone);
	}

	public List findByRphone(Object rphone) {
		return findByProperty(RPHONE, rphone);
	}

	public List findByAdress(Object adress) {
		return findByProperty(ADRESS, adress);
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
		log.debug("finding all KdOrder instances");
		try {
			String queryString = "from KdOrder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdOrder merge(KdOrder detachedInstance) {
		log.debug("merging KdOrder instance");
		try {
			KdOrder result = (KdOrder) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdOrder instance) {
		log.debug("attaching dirty KdOrder instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdOrder instance) {
		log.debug("attaching clean KdOrder instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdOrderDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdOrderDAO) ctx.getBean("KdOrderDAO");
	}
}