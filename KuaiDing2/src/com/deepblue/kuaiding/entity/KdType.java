package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdType entity. @author MyEclipse Persistence Tools
 */

public class KdType implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String rst;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdType() {
	}

	/** minimal constructor */
	public KdType(String objectid, String name, String rst, String creator,
			Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.rst = rst;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdType(String objectid, String name, String rst, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.rst = rst;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRst() {
		return this.rst;
	}

	public void setRst(String rst) {
		this.rst = rst;
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