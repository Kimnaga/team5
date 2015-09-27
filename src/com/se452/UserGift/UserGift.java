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
public class UserGift {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="User_seq")
	@Column(name="GIFTID",nullable=false)
	private int gift_id;
	@OneToOne
	@JoinColumn(name="USERSENTID", table = "AppUser", referencedColumnName = "APPUSERID")
	private int user_sent_id;
	@OneToOne
	@JoinColumn(name="USERECEIVEDID", table = "AppUser", referencedColumnName = "APPUSERID")
	private int user_received_id;
	//@Temporal(TemporalType.DATE)
	@Column(name = "DATES")
	private java.util.Date modifiedTimestamp;

	public int getGift_id() {
		return gift_id;
	}
	public void seGift_id(int gift_id) {
		this.gift_id = gift_id;
	}
	

	public int getUser_sent_id() {
		return user_sent_id;
	}
	
	public void setUser_sent_id(int user_sent_id) {
		this.user_sent_id = user_sent_id;
	}
	
	public int getUser_received_id() {
		return user_received_id;
	}
	
	public void setUser_received_id(int user_received_id) {
		this.user_received_id = user_received_id;
	}


}
