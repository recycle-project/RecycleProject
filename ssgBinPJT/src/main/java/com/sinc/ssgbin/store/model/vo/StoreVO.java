package com.sinc.ssgbin.store.model.vo;

public class StoreVO {
	private int store_id;
	private String store_name, location, open_time, close_time;
	public StoreVO() {
		super();
	}
	public StoreVO(int store_id, String store_name, String location, String open_time, String close_time) {
		super();
		this.store_id = store_id;
		this.store_name = store_name;
		this.location = location;
		this.open_time = open_time;
		this.close_time = close_time;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	@Override
	public String toString() {
		return "StoreVO [store_id=" + store_id + ", store_name=" + store_name + ", location=" + location
				+ ", open_time=" + open_time + ", close_time=" + close_time + "]";
	}
	
}
