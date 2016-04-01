package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdNumber entity. @author MyEclipse Persistence Tools
 */

public class KdNumber implements java.io.Serializable {

	// Fields

	private String objectid;
	private String number;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdNumber() {
	}

	/** minimal constructor */
	public KdNumber(String objectid, String number, String creator,
			Date createtime) {
		this.objectid = objectid;
		this.number = number;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdNumber(String objectid, String number, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.number = number;
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

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
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