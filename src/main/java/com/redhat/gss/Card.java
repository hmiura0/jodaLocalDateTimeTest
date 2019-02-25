package com.redhat.gss;

import org.joda.time.LocalDateTime;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Card implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private long ID;
	private java.lang.String cardNo;
	private java.lang.String cardType;
	private org.joda.time.LocalDateTime timeStamp;

	public Card() {
	}

	public long getID() {
		return this.ID;
	}

	public void setId(long ID) {
		this.ID = ID;
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

	public org.joda.time.LocalDateTime getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(org.joda.time.LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Card(long ID, java.lang.String cardNo, java.lang.String cardType,
			org.joda.time.LocalDateTime timeStamp) {
		this.ID = ID;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.timeStamp = timeStamp;
	}
	
	@Override
    public String toString() {
        return "Card [ID=" + ID + ", timeStamp=" + timeStamp + ", cardNo=" + cardNo + ", cardType=" + cardType + "]";
    }

}