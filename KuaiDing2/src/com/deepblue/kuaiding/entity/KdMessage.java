package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * KdMessage entity. @author MyEclipse Persistence Tools
 */

public class KdMessage implements java.io.Serializable {

	// Fields

	private String objectid;
	private String rst;
	private String customer;
	private Timestamp time;
	private String yes;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdMessage() {
	}

	/** minimal constructor */
	public KdMessage(String objectid, String rst, String customer,
			Timestamp time, String yes, String description, String creator,
			Date createtime) {
		this.objectid = objectid;
		this.rst = rst;
		this.customer = customer;
		this.time = time;
		this.yes = yes;
		this.description = description;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdMessage(String objectid, String rst, String customer,
			Timestamp time, String yes, String description, Integer orderno,
			String creator, Date createtime) {
		this.objectid = objectid;
		this.rst = rst;
		this.customer = customer;
		this.time = time;
		this.yes = yes;
		this.description = description;
		this.orderno = orderno;
		this.creator = creator;
		this.createtime = createtime;
	}

	// Property accessors

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getRst() {
		return this.rst;
	}

	public void setRst(String rst) {
		this.rst = rst;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getYes() {
		return this.yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}