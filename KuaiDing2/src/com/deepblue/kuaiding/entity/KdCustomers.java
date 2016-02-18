package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * KdCustomers entity. @author MyEclipse Persistence Tools
 */

public class KdCustomers implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String address;
	private String pic;
	private String phone;
	private String mycollection;
	private Integer coupon;
	private String myorder;
	private Integer score;
	private String description;
	private Integer orderno;
	private String creator;
	private Timestamp createtime;

	// Constructors

	/** default constructor */
	public KdCustomers() {
	}

	/** minimal constructor */
	public KdCustomers(String objectid, String name, String address,
			String pic, String phone, String creator) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.creator = creator;
	}

	/** full constructor */
	public KdCustomers(String objectid, String name, String address,
			String pic, String phone, String mycollection, Integer coupon,
			String myorder, Integer score, String description, Integer orderno,
			String creator, Timestamp createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.mycollection = mycollection;
		this.coupon = coupon;
		this.myorder = myorder;
		this.score = score;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMycollection() {
		return this.mycollection;
	}

	public void setMycollection(String mycollection) {
		this.mycollection = mycollection;
	}

	public Integer getCoupon() {
		return this.coupon;
	}

	public void setCoupon(Integer coupon) {
		this.coupon = coupon;
	}

	public String getMyorder() {
		return this.myorder;
	}

	public void setMyorder(String myorder) {
		this.myorder = myorder;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
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

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

}