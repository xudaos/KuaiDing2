package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdDz;

/**
 * A data access object (DAO) providing persistence and search support for KdDz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdDz
 * @author MyEclipse Persistence Tools
 */
public class KdDzDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdDzDAO.class);
	// property constants
	public static final String NO = "no";
	public static final String RST = "rst";
	public static final String CLASSIFICATION = "classification";
	public static final String NAME = "name";
	public static final String NUMBER = "number";
	public static final String AVGPRIVE = "avgprive";
	public static final String CUSTOMER = "customer";
	public static final String PHONE = "phone";
	public static final String REMARKS = "remarks";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(KdDz transientInstance) {
		log.debug("saving KdDz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdDz persistentInstance) {
		log.debug("deleting KdDz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdDz findById(java.lang.String id) {
		log.debug("getting KdDz instance with id: " + id);
		try {
			KdDz instance = (KdDz) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdDz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdDz instance) {
		log.debug("finding KdDz instance by example");
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
		log.debug("finding KdDz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdDz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNo(Object no) {
		return findByProperty(NO, no);
	}

	public List findByRst(Object rst) {
		return findByProperty(RST, rst);
	}

	public List findByClassification(Object classification) {
		return findByProperty(CLASSIFICATION, classification);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByAvgprive(Object avgprive) {
		return findByProperty(AVGPRIVE, avgprive);
	}

	public List findByCustomer(Object customer) {
		return findByProperty(CUSTOMER, customer);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
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
		log.debug("finding all KdDz instances");
		try {
			String queryString = "from KdDz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdDz merge(KdDz detachedInstance) {
		log.debug("merging KdDz instance");
		try {
			KdDz result = (KdDz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdDz instance) {
		log.debug("attaching dirty KdDz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdDz instance) {
		log.debug("attaching clean KdDz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdDzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdDzDAO) ctx.getBean("KdDzDAO");
	}
}