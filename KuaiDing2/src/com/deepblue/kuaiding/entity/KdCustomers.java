package com.deepblue.kuaiding.entity;

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
	private String description;
	private Integer orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdCustomers() {
	}

	/** minimal constructor */
	public KdCustomers(String objectid, String name, String address,
			String pic, String phone, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdCustomers(String objectid, String name, String address,
			String pic, String phone, String description, Integer orderno,
			String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
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

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}