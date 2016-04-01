package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * KdDz entity. @author MyEclipse Persistence Tools
 */

public class KdDz implements java.io.Serializable {

	// Fields

	private String objectid;
	private String no;
	private String rst;
	private String classification;
	private String name;
	private String number;
	private String avgprive;
	private String customer;
	private Timestamp time;
	private String phone;
	private String remarks;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdDz() {
	}

	/** minimal constructor */
	public KdDz(String objectid, String no, String rst, String classification,
			String name, String number, String avgprive, String customer,
			Timestamp time, String phone, String remarks, String creator,
			Date createtime) {
		this.objectid = objectid;
		this.no = no;
		this.rst = rst;
		this.classification = classification;
		this.name = name;
		this.number = number;
		this.avgprive = avgprive;
		this.customer = customer;
		this.time = time;
		this.phone = phone;
		this.remarks = remarks;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdDz(String objectid, String no, String rst, String classification,
			String name, String number, String avgprive, String customer,
			Timestamp time, String phone, String remarks, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.no = no;
		this.rst = rst;
		this.classification = classification;
		this.name = name;
		this.number = number;
		this.avgprive = avgprive;
		this.customer = customer;
		this.time = time;
		this.phone = phone;
		this.remarks = remarks;
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

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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