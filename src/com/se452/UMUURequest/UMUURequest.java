package com.se452.UMUURequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.se452.AppUser.AppUser;



@Entity
@Table(name="UMUUREQUEST")
public class UMUURequest {

	@Id
	//@ManyToOne
    //@JoinColumn(name="USER_ID", nullable=false)
	private AppUser requestUser;
	@Id
	//@OneToOne
	//@JoinColumn(name="Friend_ID",nullable=false)
	private AppUser receiveRequestUser;
	@Id
	@Column(name="request_send_time",nullable=false,length=320)
	private String requestSendTime;
	@Id
	private AppUser matchMaker;
	
	@Column(name="request_update_time",length=320)
	private String requestUpdateTime;
	
	@Column(name="request_status")
	private String requestStatus;

	


	public AppUser getRequestUser() {
		return requestUser;
	}

	public void setRequestUser(AppUser requestUser) {
		this.requestUser = requestUser;
	}

	public AppUser getReceiveRequestUser() {
		return receiveRequestUser;
	}

	public void setReceiveRequestUser(AppUser receiveRequestUser) {
		this.receiveRequestUser = receiveRequestUser;
	}

	public AppUser getMatchMaker() {
		return matchMaker;
	}

	public void setMatchMaker(AppUser matchMaker) {
		this.matchMaker = matchMaker;
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
