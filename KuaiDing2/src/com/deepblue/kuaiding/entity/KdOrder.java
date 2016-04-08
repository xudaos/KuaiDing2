package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * KdOrder entity. @author MyEclipse Persistence Tools
 */

public class KdOrder implements java.io.Serializable {

	// Fields

	private String objectid;
	private String orderid;
	private String buyer;
	private String restaurant;
	private String bphone;
	private String rphone;
	private String adress;
	private Timestamp time;
	private Integer total;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdOrder() {
	}

	/** minimal constructor */
	public KdOrder(String objectid, String orderid, String buyer,
			String restaurant, String bphone, String rphone, String adress,
			Timestamp time, Integer total, String creator, Date createtime) {
		this.objectid = objectid;
		this.orderid = orderid;
		this.buyer = buyer;
		this.restaurant = restaurant;
		this.bphone = bphone;
		this.rphone = rphone;
		this.adress = adress;
		this.time = time;
		this.total = total;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdOrder(String objectid, String orderid, String buyer,
			String restaurant, String bphone, String rphone, String adress,
			Timestamp time, Integer total, String description, Integer orderno,
			String creator, Date createtime) {
		this.objectid = objectid;
		this.orderid = orderid;
		this.buyer = buyer;
		this.restaurant = restaurant;
		this.bphone = bphone;
		this.rphone = rphone;
		this.adress = adress;
		this.time = time;
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

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getBuyer() {
		return this.buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getBphone() {
		return this.bphone;
	}

	public void setBphone(String bphone) {
		this.bphone = bphone;
	}

	public String getRphone() {
		return this.rphone;
	}

	public void setRphone(String rphone) {
		this.rphone = rphone;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
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