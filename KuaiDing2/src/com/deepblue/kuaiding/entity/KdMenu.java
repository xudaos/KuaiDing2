package com.deepblue.kuaiding.entity;

/**
 * KdMenu entity. @author MyEclipse Persistence Tools
 */

public class KdMenu implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String pic;
	private String taste;
	private Long price;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdMenu() {
	}

	/** minimal constructor */
	public KdMenu(String objectid, String name, String pic, String taste,
			Long price, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.taste = taste;
		this.price = price;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdMenu(String objectid, String name, String pic, String taste,
			Long price, String description, Long orderno, String creator,
			String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.taste = taste;
		this.price = price;
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

	public String getTaste() {
		return this.taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
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