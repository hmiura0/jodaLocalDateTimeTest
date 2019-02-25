package com.redhat.gss;

import org.joda.time.LocalDateTime;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Card implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private long id;
	private java.lang.String cardNo;
	private java.lang.String cardType;
	private org.joda.time.LocalDate timeStamp;

	public Card() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.lang.String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(java.lang.String cardNo) {
		this.cardNo = cardNo;
	}

	public java.lang.String getCardType() {
		return this.cardType;
	}

	public void setCardType(java.lang.String cardType) {
		this.cardType = cardType;
	}

	public org.joda.time.LocalDate getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(org.joda.time.LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Card(long id, java.lang.String cardNo, java.lang.String cardType,
			org.joda.time.LocalDate timeStamp) {
		this.id = id;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.timeStamp = timeStamp;
	}

}