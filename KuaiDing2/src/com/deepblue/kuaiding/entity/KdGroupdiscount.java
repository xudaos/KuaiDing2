package com.deepblue.kuaiding.entity;

/**
 * KdGroupdiscount entity. @author MyEclipse Persistence Tools
 */

public class KdGroupdiscount implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String address;
	private String pic;
	private Long discount;
	private Long distance;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdGroupdiscount() {
	}

	/** minimal constructor */
	public KdGroupdiscount(String objectid, String name, String address,
			String pic, Long discount, Long distance, String creator,
			String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.discount = discount;
		this.distance = distance;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdGroupdiscount(String objectid, String name, String address,
			String pic, Long discount, Long distance, String description,
			Long orderno, String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.discount = discount;
		this.distance = distance;
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

	public Long getDiscount() {
		return this.discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Long getDistance() {
		return this.distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
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