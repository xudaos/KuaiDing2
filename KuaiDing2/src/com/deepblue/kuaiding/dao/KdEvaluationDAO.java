package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdEvaluation;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdEvaluation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdEvaluation
 * @author MyEclipse Persistence Tools
 */
public class KdEvaluationDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdEvaluationDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String RST = "rst";
	public static final String CUSTOMER = "customer";
	public static final String ORDERID = "orderid";
	public static final String YES = "yes";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdEvaluation transientInstance) {
		log.debug("saving KdEvaluation instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdEvaluation persistentInstance) {
		log.debug("deleting KdEvaluation instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdEvaluation findById(java.lang.String id) {
		log.debug("getting KdEvaluation instance with id: " + id);
		try {
			KdEvaluation instance = (KdEvaluation) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdEvaluation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdEvaluation instance) {
		log.debug("finding KdEvaluation instance by example");
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
		log.debug("finding KdEvaluation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from KdEvaluation as model where model."
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

	public List findByRst(Object rst) {
		return findByProperty(RST, rst);
	}

	public List findByCustomer(Object customer) {
		return findByProperty(CUSTOMER, customer);
	}

	public List findByOrderid(Object orderid) {
		return findByProperty(ORDERID, orderid);
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
		log.debug("finding all KdEvaluation instances");
		try {
			String queryString = "from KdEvaluation";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdEvaluation merge(KdEvaluation detachedInstance) {
		log.debug("merging KdEvaluation instance");
		try {
			KdEvaluation result = (KdEvaluation) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdEvaluation instance) {
		log.debug("attaching dirty KdEvaluation instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdEvaluation instance) {
		log.debug("attaching clean KdEvaluation instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdEvaluationDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (KdEvaluationDAO) ctx.getBean("KdEvaluationDAO");
	}
}