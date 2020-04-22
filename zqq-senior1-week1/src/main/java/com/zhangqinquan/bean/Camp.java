package com.zhangqinquan.bean;

public class Camp {

	private int id;
	private String cname;
	@Override
	public String toString() {
		return "Camp [id=" + id + ", cname=" + cname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Camp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camp(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	
}
