package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdRestaurant;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdRestaurant entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdRestaurant
 * @author MyEclipse Persistence Tools
 */
public class KdRestaurantDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdRestaurantDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ADDRESS = "address";
	public static final String PIC = "pic";
	public static final String PHONE = "phone";
	public static final String DISTANCE = "distance";
	public static final String REGION = "region";
	public static final String AVGPRICE = "avgprice";
	public static final String TYPE = "type";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";
	public static final String DATE = "date";
	public static final String PIC2 = "pic2";
	public static final String REMARKS = "remarks";

	protected void initDao() {
		// do nothing
	}

	public void save(KdRestaurant transientInstance) {
		log.debug("saving KdRestaurant instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdRestaurant persistentInstance) {
		log.debug("deleting KdRestaurant instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdRestaurant findById(java.lang.String id) {
		log.debug("getting KdRestaurant instance with id: " + id);
		try {
			KdRestaurant instance = (KdRestaurant) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdRestaurant", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdRestaurant instance) {
		log.debug("finding KdRestaurant instance by example");
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
		log.debug("finding KdRestaurant instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from KdRestaurant as model where model."
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

	public List findByDistance(Object distance) {
		return findByProperty(DISTANCE, distance);
	}

	public List findByRegion(Object region) {
		return findByProperty(REGION, region);
	}

	public List findByAvgprice(Object avgprice) {
		return findByProperty(AVGPRICE, avgprice);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
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
	
	public List findByDate(Object date) {
		return findByProperty(DATE, date);
	}
	
	public List findByPic2(Object pic2) {
		return findByProperty(PIC2, pic2);
	}
	
	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List findAll() {
		log.debug("finding all KdRestaurant instances");
		try {
			String queryString = "from KdRestaurant";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdRestaurant merge(KdRestaurant detachedInstance) {
		log.debug("merging KdRestaurant instance");
		try {
			KdRestaurant result = (KdRestaurant) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdRestaurant instance) {
		log.debug("attaching dirty KdRestaurant instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdRestaurant instance) {
		log.debug("attaching clean KdRestaurant instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdRestaurantDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (KdRestaurantDAO) ctx.getBean("KdRestaurantDAO");
	}
}