package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdCustomers;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdCustomers entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdCustomers
 * @author MyEclipse Persistence Tools
 */
public class KdCustomersDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdCustomersDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ADDRESS = "address";
	public static final String PIC = "pic";
	public static final String PHONE = "phone";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";
	public static final String CREATETIME = "createtime";

	protected void initDao() {
		// do nothing
	}

	public void save(KdCustomers transientInstance) {
		log.debug("saving KdCustomers instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdCustomers persistentInstance) {
		log.debug("deleting KdCustomers instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdCustomers findById(java.lang.String id) {
		log.debug("getting KdCustomers instance with id: " + id);
		try {
			KdCustomers instance = (KdCustomers) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdCustomers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdCustomers instance) {
		log.debug("finding KdCustomers instance by example");
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
		log.debug("finding KdCustomers instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdCustomers as model where model."
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

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByPic(Object pic) {
		return findByProperty(PIC, pic);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
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

	public List findByCreatetime(Object createtime) {
		return findByProperty(CREATETIME, createtime);
	}

	public List findAll() {
		log.debug("finding all KdCustomers instances");
		try {
			String queryString = "from KdCustomers";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdCustomers merge(KdCustomers detachedInstance) {
		log.debug("merging KdCustomers instance");
		try {
			KdCustomers result = (KdCustomers) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdCustomers instance) {
		log.debug("attaching dirty KdCustomers instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdCustomers instance) {
		log.debug("attaching clean KdCustomers instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdCustomersDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (KdCustomersDAO) ctx.getBean("KdCustomersDAO");
	}
}