package com.deepblue.kuaiding.entity;

/**
 * KdOrder entity. @author MyEclipse Persistence Tools
 */

public class KdOrder implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String buyer;
	private String restaurant;
	private String bphone;
	private String rphone;
	private String badress;
	private String radress;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdOrder() {
	}

	/** minimal constructor */
	public KdOrder(String objectid, String name, String buyer,
			String restaurant, String bphone, String rphone, String badress,
			String radress, String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.buyer = buyer;
		this.restaurant = restaurant;
		this.bphone = bphone;
		this.rphone = rphone;
		this.badress = badress;
		this.radress = radress;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdOrder(String objectid, String name, String buyer,
			String restaurant, String bphone, String rphone, String badress,
			String radress, String description, Long orderno, String creator,
			String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.buyer = buyer;
		this.restaurant = restaurant;
		this.bphone = bphone;
		this.rphone = rphone;
		this.badress = badress;
		this.radress = radress;
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

	public String getBadress() {
		return this.badress;
	}

	public void setBadress(String badress) {
		this.badress = badress;
	}

	public String getRadress() {
		return this.radress;
	}

	public void setRadress(String radress) {
		this.radress = radress;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Long orderno) {
		this.orderno = orderno;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}