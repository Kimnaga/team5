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
	@OneToOne
	@JoinColumn(table = "Gift", referencedColumnName = "GIFTID")
	private int GiftId;
	@OneToOne
	@JoinColumn(name = "USERSENTID", table = "AppUser", referencedColumnName = "App_User_Id")
	private int UserSentId;
	@OneToOne
	@JoinColumn(name = "USERRECEIVEDID", table = "AppUser", referencedColumnName = "App_User_Id")
	private int UserReceivedId;
	public int getGift_id() {
		return GiftId;
	}
	public void seGift_id(int gift_id) {
		this.GiftId = GiftId;
	}

	public int getUser_sent_id() {
		return UserSentId;
	}
	
	public void setUser_sent_id(int user_sent_id) {
		this.UserSentId = UserSentId;
	}
	
	public int getUser_received_id() {
		return UserReceivedId;
	}
	
	public void setUser_received_id(int user_received_id) {
		this.UserReceivedId = UserReceivedId;
	}


}
