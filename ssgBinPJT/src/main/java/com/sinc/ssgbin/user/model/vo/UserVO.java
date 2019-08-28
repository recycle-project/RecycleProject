package com.sinc.ssgbin.user.model.vo;
/*
CREATE TABLE SPRING_MEM_TBL (
		EMPLOYEE_ID NUMBER PRIMARY KEY,
		EMPLOYEE_NAME VARCHAR2(20),
		PWD VARCHAR2(20),
		POSITION VARCHAR2(10) CHECK POSITION IN ('DM', 'PARTNER'),
		STORE_ID VARCHAR2(50)
	);
*/
public class UserVO {
	private int employee_id;
	private String employee_name, pwd, position;
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(int employee_id, String employee_name, String pwd, String position) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.pwd = pwd;
		this.position = position;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "UserVO [employee_id=" + employee_id + ", employee_name=" + employee_name + ", pwd=" + pwd
				+ ", position=" + position + "]";
	}
}
