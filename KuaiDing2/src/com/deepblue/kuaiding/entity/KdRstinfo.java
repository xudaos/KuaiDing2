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
	private String address;
	private String phone;
	private String region;
	private String picstar;
	private Integer sales;
	private Integer sendprice;
	private Integer deliveryprice;
	private String sendtime;
	private Integer avgprice;
	private String notice;
	private String activity;
	private String remarks;
	private String pic2;
	private String yes;
	private String type;
	private String description;
	private Integer orderno;
	private String creator;
	private Date createtime;

	// Constructors

	/** default constructor */
	public KdRstinfo() {
	}

	/** minimal constructor */
	public KdRstinfo(String objectid, String name, String pic, String address,
			String phone, String region, String picstar, Integer sales,
			Integer sendprice, Integer deliveryprice, String sendtime,
			Integer avgprice, String yes, String type, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.address = address;
		this.phone = phone;
		this.region = region;
		this.picstar = picstar;
		this.sales = sales;
		this.sendprice = sendprice;
		this.deliveryprice = deliveryprice;
		this.sendtime = sendtime;
		this.avgprice = avgprice;
		this.yes = yes;
		this.type = type;
		this.description = description;
		this.orderno = orderno;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdRstinfo(String objectid, String name, String pic, String address,
			String phone, String region, String picstar, Integer sales,
			Integer sendprice, Integer deliveryprice, String sendtime,
			Integer avgprice, String notice, String activity, String remarks,
			String pic2, String yes, String type, String description,
			Integer orderno, String creator, Date createtime) {
		this.objectid = objectid;
		this.name = name;
		this.pic = pic;
		this.address = address;
		this.phone = phone;
		this.region = region;
		this.picstar = picstar;
		this.sales = sales;
		this.sendprice = sendprice;
		this.deliveryprice = deliveryprice;
		this.sendtime = sendtime;
		this.avgprice = avgprice;
		this.notice = notice;
		this.activity = activity;
		this.remarks = remarks;
		this.pic2 = pic2;
		this.yes = yes;
		this.type = type;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPicstar() {
		return this.picstar;
	}

	public void setPicstar(String picstar) {
		this.picstar = picstar;
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

	public String getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

	public Integer getAvgprice() {
		return this.avgprice;
	}

	public void setAvgprice(Integer avgprice) {
		this.avgprice = avgprice;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPic2() {
		return this.pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getYes() {
		return this.yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
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

}