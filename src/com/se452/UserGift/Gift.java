package com.se452.Gift;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.eclipse.persistence.internal.jpa.parsing.TemporalLiteralNode.TemporalType;

import sun.util.calendar.LocalGregorianCalendar.Date;

@Entity
@Table(name="USERGIFT")
public class Gift {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="User_seq")
	@Column(name = "GIFT")
	private int GiftId;
	@Column(name="GIFTDESCIRPTION",nullable=false)
	private String GiftDescription;
	@Column(name="GiftMessage",nullable=false)
	private String GiftMessage;
	

	public int getGift_id() {
		return GiftId;
	}
	public void seGift_id(int gift_id) {
		this.GiftId = GiftId;
	}

	public String getGiftDescription() {
		return GiftDescription;
	}
	
	public void setGiftDescription(String GfitDescription) {
		this.GiftDescription = GiftDescription;
	}
	
	public String GiftMessage() {
		return GiftDescription;
	}
	
	public void setGiftMessage(String GiftMessage) {
		this.GiftDescription = GiftDescription;
	}
}
