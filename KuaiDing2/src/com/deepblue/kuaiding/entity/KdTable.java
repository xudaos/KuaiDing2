package com.deepblue.kuaiding.entity;

/**
 * KdTable entity. @author MyEclipse Persistence Tools
 */

public class KdTable implements java.io.Serializable {

	// Fields

	private KdTableId id;

	// Constructors

	/** default constructor */
	public KdTable() {
	}

	/** full constructor */
	public KdTable(KdTableId id) {
		this.id = id;
	}

	// Property accessors

	public KdTableId getId() {
		return this.id;
	}

	public void setId(KdTableId id) {
		this.id = id;
	}

}