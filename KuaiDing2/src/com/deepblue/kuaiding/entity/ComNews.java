package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * ComNews entity. @author MyEclipse Persistence Tools
 */

public class ComNews implements java.io.Serializable {

	// Fields

	private String objectid;
	private String title;
	private String content;
	private String pic;
	private Timestamp vardate;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public ComNews() {
	}

	/** minimal constructor */
	public ComNews(String objectid, String title, String content, String pic,
			Timestamp vardate, String creator, String createtime) {
		this.objectid = objectid;
		this.title = title;
		this.content = content;
		this.pic = pic;
		this.vardate = vardate;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public ComNews(String objectid, String title, String content, String pic,
			Timestamp vardate, String description, Long orderno,
			String creator, String createtime) {
		this.objectid = objectid;
		this.title = title;
		this.content = content;
		this.pic = pic;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
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