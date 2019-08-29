package com.sinc.ssgbin.log.model.vo;

public class LogVO {
	private int logId;
	private String category, contents, timestamp;
	private int equiment_id;
	
	public LogVO() {
		super();
	}
	public LogVO(int logId, String category, String contents, String timestamp, int equiment_id) {
		super();
		this.logId = logId;
		this.category = category;
		this.contents = contents;
		this.timestamp = timestamp;
		this.equiment_id = equiment_id;
	}
	
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getEquiment_id() {
		return equiment_id;
	}
	public void setEquiment_id(int equiment_id) {
		this.equiment_id = equiment_id;
	}
	
	@Override
	public String toString() {
		return "LogVO [logId=" + logId + ", category=" + category + ", contents=" + contents + ", timestamp="
				+ timestamp + ", equiment_id=" + equiment_id + "]";
	}
}
