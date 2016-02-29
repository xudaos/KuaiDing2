package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdActivity entity. @author MyEclipse Persistence Tools
 */

public class KdActivity implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String pic;
	private String remark;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdActivity() {
	}

	/** minimal constructor */
	public KdActivity(String objectid, String name, String pic, String remark,
			String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.remark = remark;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdActivity(String objectid, String name, String pic, String remark,
			String description, Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.remark = remark;
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

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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