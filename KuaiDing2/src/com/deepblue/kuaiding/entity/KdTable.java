package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdTable entity. @author MyEclipse Persistence Tools
 */

public class KdTable implements java.io.Serializable {

	// Fields

	private String objectid;
	private String rst;
	private String classification;
	private String name;
	private String number;
	private String avgprive;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdTable() {
	}

	/** minimal constructor */
	public KdTable(String objectid, String rst, String classification,
			String name, String number, String avgprive, String creator,
			Date createtime) {
		this.objectid = objectid;
		this.rst = rst;
		this.classification = classification;
		this.name = name;
		this.number = number;
		this.avgprive = avgprive;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdTable(String objectid, String rst, String classification,
			String name, String number, String avgprive, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.rst = rst;
		this.classification = classification;
		this.name = name;
		this.number = number;
		this.avgprive = avgprive;
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

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAvgprive() {
		return this.avgprive;
	}

	public void setAvgprive(String avgprive) {
		this.avgprive = avgprive;
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