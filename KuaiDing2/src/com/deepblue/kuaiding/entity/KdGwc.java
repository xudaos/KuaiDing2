package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdGwc entity. @author MyEclipse Persistence Tools
 */

public class KdGwc implements java.io.Serializable {

	// Fields

	private String objectid;
	private String id;
	private String orderid;
	private String name;
	private Integer number;
	private Integer total;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdGwc() {
	}

	/** minimal constructor */
	public KdGwc(String objectid, String id, String orderid, String name,
			Integer number, Integer total, String creator, Date createtime) {
		this.objectid = objectid;
		this.id = id;
		this.orderid = orderid;
		this.name = name;
		this.number = number;
		this.total = total;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdGwc(String objectid, String id, String orderid, String name,
			Integer number, Integer total, String description, Integer orderno,
			String creator, Date createtime) {
		this.objectid = objectid;
		this.id = id;
		this.orderid = orderid;
		this.name = name;
		this.number = number;
		this.total = total;
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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