package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * BcomPost entity. @author MyEclipse Persistence Tools
 */

public class BcomPost implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String title;
	private String pic;
	private String content;
	private Timestamp vardate;
	private Timestamp retime;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public BcomPost() {
	}

	/** minimal constructor */
	public BcomPost(String objectid, String name, String title, String pic,
			String content, Timestamp vardate, Timestamp retime,
			String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.title = title;
		this.pic = pic;
		this.content = content;
		this.vardate = vardate;
		this.retime = retime;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public BcomPost(String objectid, String name, String title, String pic,
			String content, Timestamp vardate, Timestamp retime,
			String description, Long orderno, String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.title = title;
		this.pic = pic;
		this.content = content;
		this.vardate = vardate;
		this.retime = retime;
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

	public Timestamp getRetime() {
		return this.retime;
	}

	public void setRetime(Timestamp retime) {
		this.retime = retime;
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