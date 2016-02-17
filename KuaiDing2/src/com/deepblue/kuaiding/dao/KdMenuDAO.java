package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.KdMenu;

/**
 * A data access object (DAO) providing persistence and search support for
 * KdMenu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.KdMenu
 * @author MyEclipse Persistence Tools
 */
public class KdMenuDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KdMenuDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String PIC = "pic";
	public static final String TASTE = "taste";
	public static final String PRICE = "price";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";
	public static final String CREATETIME = "createtime";

	protected void initDao() {
		// do nothing
	}

	public void save(KdMenu transientInstance) {
		log.debug("saving KdMenu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KdMenu persistentInstance) {
		log.debug("deleting KdMenu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KdMenu findById(java.lang.String id) {
		log.debug("getting KdMenu instance with id: " + id);
		try {
			KdMenu instance = (KdMenu) getHibernateTemplate().get(
					"com.deepblue.kuaiding.dao.KdMenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KdMenu instance) {
		log.debug("finding KdMenu instance by example");
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
		log.debug("finding KdMenu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KdMenu as model where model."
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

	public List findByTaste(Object taste) {
		return findByProperty(TASTE, taste);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
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
		log.debug("finding all KdMenu instances");
		try {
			String queryString = "from KdMenu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KdMenu merge(KdMenu detachedInstance) {
		log.debug("merging KdMenu instance");
		try {
			KdMenu result = (KdMenu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KdMenu instance) {
		log.debug("attaching dirty KdMenu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KdMenu instance) {
		log.debug("attaching clean KdMenu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KdMenuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KdMenuDAO) ctx.getBean("KdMenuDAO");
	}
}