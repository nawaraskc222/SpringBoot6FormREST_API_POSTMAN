package com.example.SpringBoot6REST_API.SpringBoot6REST_API;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int cid;
	private String cname;
	private String cmail;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmail=" + cmail + "]";
	}
	

}
