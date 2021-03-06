package com.se452.FriendRequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.se452.AppUser.AppUser;
import com.se452.Status.Status;


@Entity
@Table(name="FRIENDREQUEST")
public class FriendRequest {
	
	
	@Id
	//@ManyToOne
    //@JoinColumn(name="USER_ID", nullable=false)
	private AppUser au;
	@Id
	//@OneToOne
	//@JoinColumn(name="Friend_ID",nullable=false)
	private AppUser friend;
	@Id
	@Column(name="request_send_time",nullable=false,length=100)
	private String requestSendTime;
	
	@Column(name="request_update_time",nullable=false,length=100)
	private String requestUpdateTime;
	
	@Column(name="request_status",nullable=false)
	private String requestStatus;

	

	public AppUser getAu() {
		return au;
	}

	public void setAu(AppUser au) {
		this.au = au;
	}

	public AppUser getFriend() {
		return friend;
	}

	public void setFriend(AppUser friend) {
		this.friend = friend;
	}

	public String getRequestSendTime() {
		return requestSendTime;
	}

	public void setRequestSendTime(String requestSendTime) {
		this.requestSendTime = requestSendTime;
	}

	public String getRequestUpdateTime() {
		return requestUpdateTime;
	}

	public void setRequestUpdateTime(String requestUpdateTime) {
		this.requestUpdateTime = requestUpdateTime;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String s) {
		this.requestStatus = s;
	}

	
	
}



