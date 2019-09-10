package com.sinc.ssgbin;

import java.io.Serializable;

public class UserVO implements Serializable {
    String employee_name;
    String pwd;
    int store_id;

    public UserVO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public UserVO(String employee_name, String pwd, int store_id) {
        super();
        this.employee_name = employee_name;
        this.pwd = pwd;
        this.store_id = store_id;
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
    public int getStore_id() {
        return store_id;
    }
    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }
    @Override
    public String toString() {
        return "UserVO [employee_name=" + employee_name + ", pwd=" + pwd + ", store_id=" + store_id + "]";
    }
}
