package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * KdRestaurant entity. @author MyEclipse Persistence Tools
 */

public class KdRestaurant implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String address;
	private String pic;
	private String phone;
	private Double distance;
	private String region;
	private Integer avgprice;
	private String type;
	private String description;
	private Integer orderno;
	private String creator;
	private Timestamp createtime;
	private Timestamp date;
	private String pic2;
	private String remarks;

	// Constructors

	/** default constructor */
	public KdRestaurant() {
	}

	/** minimal constructor */
	public KdRestaurant(String objectid, String name, String address,
			String pic, String phone, Double distance, String region,
			Integer avgprice, String type, String creator) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.distance = distance;
		this.region = region;
		this.avgprice = avgprice;
		this.type = type;
		this.creator = creator;		
	}

	/** full constructor */
	public KdRestaurant(String objectid, String name, String address,
			String pic, String phone, Double distance, String region,
			Integer avgprice, String type, String description, Integer orderno,
			String creator, Timestamp createtime,Timestamp date,
			String pic2, String remarks) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.distance = distance;
		this.region = region;
		this.avgprice = avgprice;
		this.type = type;
		this.description = description;
		this.orderno = orderno;
		this.creator = creator;
		this.createtime = createtime;
		this.date = date;
		this.pic2 = pic2;
		this.remarks = remarks;
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

	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getAvgprice() {
		return this.avgprice;
	}

	public void setAvgprice(Integer avgprice) {
		this.avgprice = avgprice;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public String getPic2() {
		return this.pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}