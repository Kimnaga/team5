package com.SE452.HoneyBridge.Entities;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Date {
	
	@Id
	private User mm;
	private User usr1;
	private User usr2;
	private String location;
	private Date date;
	private Time time;
	private String description;
	private Status status;
	
	public Date(User mm, User usr1, User usr2, String location, Date date, Time time, String description,
			Status status) {
		super();
		this.mm = mm;
		this.usr1 = usr1;
		this.usr2 = usr2;
		this.location = location;
		this.date = date;
		this.time = time;
		this.description = description;
		this.status = status;
	}

	public Date() {
		super();
	}

	public User getMm() {
		return mm;
	}

	public void setMm(User mm) {
		this.mm = mm;
	}

	public User getUsr1() {
		return usr1;
	}

	public void setUsr1(User usr1) {
		this.usr1 = usr1;
	}

	public User getUsr2() {
		return usr2;
	}

	public void setUsr2(User usr2) {
		this.usr2 = usr2;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
