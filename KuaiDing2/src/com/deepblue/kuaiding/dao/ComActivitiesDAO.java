package com.deepblue.kuaiding.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.deepblue.kuaiding.entity.ComActivities;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComActivities entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.deepblue.kuaiding.dao.ComActivities
 * @author MyEclipse Persistence Tools
 */
public class ComActivitiesDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ComActivitiesDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String TITLE = "title";
	public static final String PIC = "pic";
	public static final String CONTENT = "content";
	public static final String DESCRIPTION = "description";
	public static final String ORDERNO = "orderno";
	public static final String CREATOR = "creator";

	protected void initDao() {
		// do nothing
	}

	public void save(ComActivities transientInstance) {
		log.debug("saving ComActivities instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComActivities persistentInstance) {
		log.debug("deleting ComActivities instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComActivities findById(java.lang.String id) {
		log.debug("getting ComActivities instance with id: " + id);
		try {
			ComActivities instance = (ComActivities) getHibernateTemplate()
					.get("com.deepblue.kuaiding.dao.ComActivities", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ComActivities instance) {
		log.debug("finding ComActivities instance by example");
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
		log.debug("finding ComActivities instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ComActivities as model where model."
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

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByPic(Object pic) {
		return findByProperty(PIC, pic);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
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
		log.debug("finding all ComActivities instances");
		try {
			String queryString = "from ComActivities";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComActivities merge(ComActivities detachedInstance) {
		log.debug("merging ComActivities instance");
		try {
			ComActivities result = (ComActivities) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComActivities instance) {
		log.debug("attaching dirty ComActivities instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComActivities instance) {
		log.debug("attaching clean ComActivities instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComActivitiesDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ComActivitiesDAO) ctx.getBean("ComActivitiesDAO");
	}
}