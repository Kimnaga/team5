package com.se452.AppUser;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.Lob;

@Embeddable
public class Profile {
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] picture;
	private String hobby;
	private String aboutMe;
	private String idealPartner;
	
	
	public Profile(byte[] picture, String hobby, String aboutMe, String idealPartner) {
		super();
		this.picture = picture;
		this.hobby = hobby;
		this.aboutMe = aboutMe;
		this.idealPartner = idealPartner;
	}
	
	public Profile() {
		super();
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getIdealPartner() {
		return idealPartner;
	}

	public void setIdealPartner(String idealPartner) {
		this.idealPartner = idealPartner;
	}

}
