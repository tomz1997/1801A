package com.zhangqinquan.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Hero {

	private int id;
	private String name;
	private double price;
	@DateTimeFormat(pattern="yyyy-MM-DD")
	private Date uptime;
	private int status;
	private int cid;
	private String cname;
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", price=" + price + ", uptime=" + uptime + ", status=" + status
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
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
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(int id, String name, double price, Date uptime, int status, int cid, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.uptime = uptime;
		this.status = status;
		this.cid = cid;
		this.cname = cname;
	}
	
}
