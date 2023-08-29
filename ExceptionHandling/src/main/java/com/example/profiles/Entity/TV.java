package com.example.profiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TV {
	@Id
	private int tvid;
	private String tvname;
	private double tvcost;
	private String tvcompany;
	public int getTvid() {
		return tvid;
	}
	public void setTvid(int tvid) {
		this.tvid = tvid;
	}
	public String getTvname() {
		return tvname;
	}
	public void setTvname(String tvname) {
		this.tvname = tvname;
	}
	public double getTvcost() {
		return tvcost;
	}
	public void setTvcost(double tvcost) {
		this.tvcost = tvcost;
	}
	public String getTvcompany() {
		return tvcompany;
	}
	public void setTvcompany(String tvcompany) {
		this.tvcompany = tvcompany;
	}
	

}
