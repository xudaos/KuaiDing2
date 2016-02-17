package com.deepblue.kuaiding.entity;

import java.sql.Timestamp;

/**
 * KdTableId entity. @author MyEclipse Persistence Tools
 */

public class KdTableId implements java.io.Serializable {

	// Fields

	private String objectid;
	private String name;
	private String address;
	private String pic;
	private Long distance;
	private Timestamp time;
	private Long no;
	private String description;
	private Long orderno;
	private String creator;
	private String createtime;

	// Constructors

	/** default constructor */
	public KdTableId() {
	}

	/** minimal constructor */
	public KdTableId(String objectid, String name, String address, String pic,
			Long distance, Timestamp time, Long no, String creator,
			String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.distance = distance;
		this.time = time;
		this.no = no;
		this.creator = creator;
		this.createtime = createtime;
	}

	/** full constructor */
	public KdTableId(String objectid, String name, String address, String pic,
			Long distance, Timestamp time, Long no, String description,
			Long orderno, String creator, String createtime) {
		this.objectid = objectid;
		this.name = name;
		this.address = address;
		this.pic = pic;
		this.distance = distance;
		this.time = time;
		this.no = no;
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

	public Long getDistance() {
		return this.distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Long getNo() {
		return this.no;
	}

	public void setNo(Long no) {
		this.no = no;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KdTableId))
			return false;
		KdTableId castOther = (KdTableId) other;

		return ((this.getObjectid() == castOther.getObjectid()) || (this
				.getObjectid() != null && castOther.getObjectid() != null && this
				.getObjectid().equals(castOther.getObjectid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getPic() == castOther.getPic()) || (this.getPic() != null
						&& castOther.getPic() != null && this.getPic().equals(
						castOther.getPic())))
				&& ((this.getDistance() == castOther.getDistance()) || (this
						.getDistance() != null
						&& castOther.getDistance() != null && this
						.getDistance().equals(castOther.getDistance())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null
						&& castOther.getTime() != null && this.getTime()
						.equals(castOther.getTime())))
				&& ((this.getNo() == castOther.getNo()) || (this.getNo() != null
						&& castOther.getNo() != null && this.getNo().equals(
						castOther.getNo())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getOrderno() == castOther.getOrderno()) || (this
						.getOrderno() != null && castOther.getOrderno() != null && this
						.getOrderno().equals(castOther.getOrderno())))
				&& ((this.getCreator() == castOther.getCreator()) || (this
						.getCreator() != null && castOther.getCreator() != null && this
						.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this
						.getCreatetime() != null
						&& castOther.getCreatetime() != null && this
						.getCreatetime().equals(castOther.getCreatetime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getObjectid() == null ? 0 : this.getObjectid().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result
				+ (getPic() == null ? 0 : this.getPic().hashCode());
		result = 37 * result
				+ (getDistance() == null ? 0 : this.getDistance().hashCode());
		result = 37 * result
				+ (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result + (getNo() == null ? 0 : this.getNo().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getOrderno() == null ? 0 : this.getOrderno().hashCode());
		result = 37 * result
				+ (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37
				* result
				+ (getCreatetime() == null ? 0 : this.getCreatetime()
						.hashCode());
		return result;
	}

}