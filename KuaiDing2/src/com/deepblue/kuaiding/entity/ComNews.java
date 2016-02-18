package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * ComNews entity. @author MyEclipse Persistence Tools
 */

public class ComNews implements java.io.Serializable {

	// Fields

	private String objectid;
	private String title;
	private String pic;
	private String content;
	private Timestamp vardate;
	private String description;
	private Integer orderno;
	private String creator;
	private Timestamp createtime;

	// Constructors

	/** default constructor */
	public ComNews() {
	}

	/** minimal constructor */
	public ComNews(String objectid, String pic, String content,
			Timestamp vardate, String creator, Timestamp createtime) {
		this.objectid = objectid;
		this.pic = pic;
		this.content = content;
		this.vardate = vardate;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public ComNews(String objectid, String title, String pic, String content,
			Timestamp vardate, String description, Integer orderno,
			String creator, Timestamp createtime) {
		this.objectid = objectid;
		this.title = title;
		this.pic = pic;
		this.content = content;
		this.vardate = vardate;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getVardate() {
		return this.vardate;
	}

	public void setVardate(Timestamp vardate) {
		this.vardate = vardate;
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