package com.deepblue.kuaiding.entity;

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
	private Integer distance;
	private String region;
	private Integer avgprice;
	private String description;
	private Integer orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdRestaurant() {
	}

	/** minimal constructor */
	public KdRestaurant(String objectid, String name, String address,
			String pic, String phone, Integer distance, String region,
			Integer avgprice, String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.distance = distance;
		this.region = region;
		this.avgprice = avgprice;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdRestaurant(String objectid, String name, String address,
			String pic, String phone, Integer distance, String region,
			Integer avgprice, String description, Integer orderno,
			String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.phone = phone;
		this.distance = distance;
		this.region = region;
		this.avgprice = avgprice;
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

	public Integer getDistance() {
		return this.distance;
	}

	public void setDistance(Integer distance) {
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