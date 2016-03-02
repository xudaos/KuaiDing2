package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdMenu entity. @author MyEclipse Persistence Tools
 */

public class KdMenu implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String rst;
	private String pic;
	private String taste;
	private Integer price;
	private Integer quantity;
	private String evaluation;
	private String type;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;
	private String yes;

	// Constructors

	/** default constructor */
	public KdMenu() {
	}

	/** minimal constructor */
	public KdMenu(String objectid, String name, String rst, String pic,
			String taste, Integer price, Integer quantity, String evaluation,
			String type, String creator, Date createtime, String yes) {
		this.objectid = objectid;
		this.name = name;
		this.rst = rst;
		this.pic = pic;
		this.taste = taste;
		this.price = price;
		this.quantity = quantity;
		this.evaluation = evaluation;
		this.type = type;
		this.creator = creator;
		this.createtime = createtime;
		this.yes = yes;
	}

	/** full constructor */
	public KdMenu(String objectid, String name, String rst, String pic,
			String taste, Integer price, Integer quantity, String evaluation,
			String type, String description, Integer orderno, String creator,
			Date createtime, String yes) {
		this.objectid = objectid;
		this.name = name;
		this.rst = rst;
		this.pic = pic;
		this.taste = taste;
		this.price = price;
		this.quantity = quantity;
		this.evaluation = evaluation;
		this.type = type;
		this.description = description;
		this.orderno = orderno;
		this.creator = creator;
		this.createtime = createtime;
		this.yes = yes;
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

	public String getRst() {
		return this.rst;
	}

	public void setRst(String rst) {
		this.rst = rst;
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

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
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

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getYes() {
		return this.yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
	}

}