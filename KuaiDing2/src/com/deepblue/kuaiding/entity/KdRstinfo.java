package com.deepblue.kuaiding.entity;

import java.util.Date;

/**
 * KdRstinfo entity. @author MyEclipse Persistence Tools
 */

public class KdRstinfo implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String pic;
	private String picstar;
	private String time;
	private Integer sales;
	private Integer sendprice;
	private Integer deliveryprice;
	private String notice;
	private String activity;
	private String yes;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdRstinfo() {
	}

	/** minimal constructor */
	public KdRstinfo(String objectid, String name, String pic, String picstar,
			Integer sales, Integer sendprice, Integer deliveryprice,
			String yes, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.picstar = picstar;
		this.sales = sales;
		this.sendprice = sendprice;
		this.deliveryprice = deliveryprice;
		this.yes = yes;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdRstinfo(String objectid, String name, String pic, String picstar,
			String time, Integer sales, Integer sendprice,
			Integer deliveryprice, String notice, String activity, String yes,
			String description, Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.picstar = picstar;
		this.time = time;
		this.sales = sales;
		this.sendprice = sendprice;
		this.deliveryprice = deliveryprice;
		this.notice = notice;
		this.activity = activity;
		this.yes = yes;
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

	public String getPicstar() {
		return this.picstar;
	}

	public void setPicstar(String picstar) {
		this.picstar = picstar;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getSendprice() {
		return this.sendprice;
	}

	public void setSendprice(Integer sendprice) {
		this.sendprice = sendprice;
	}

	public Integer getDeliveryprice() {
		return this.deliveryprice;
	}

	public void setDeliveryprice(Integer deliveryprice) {
		this.deliveryprice = deliveryprice;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getYes() {
		return this.yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
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

}