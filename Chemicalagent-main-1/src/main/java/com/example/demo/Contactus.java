package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contactus {

	
	public Contactus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contactus(String name, String emailid, String phone, String subject, String message) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.subject = subject;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String name;
	@Id
	private String emailid;
	private String phone;
	private String subject;
	private String message;
}
