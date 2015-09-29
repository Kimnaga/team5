package com.se452.Date;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.se452.AppUser.AppUser;
import com.se452.Status.Status;
@Entity
@Table(name="DateInformation")
public class DateInformation {

	
	
		
		@Id
		private AppUser mm;
		@Id
		private AppUser usr1;
		@Id
		private AppUser usr2;
		private String location;
		@Id
		private Date date;
		private Time time;
		private String description;
		private Status status;
		
		



		public AppUser getMm() {
			return mm;
		}

		public void setMm(AppUser mm) {
			this.mm = mm;
		}

		public AppUser getUsr1() {
			return usr1;
		}

		public void setUsr1(AppUser usr1) {
			this.usr1 = usr1;
		}

		public AppUser getUsr2() {
			return usr2;
		}

		public void setUsr2(AppUser usr2) {
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


