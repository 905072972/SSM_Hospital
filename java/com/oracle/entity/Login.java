package com.oracle.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
public class Login {
    private  Integer userid;
    private Integer employeeid;
    private String username;
    private Integer limits;
    private String password;

    private List<Login>lists;

    @Override
    public String toString() {
        return "Login{" +
                "userid=" + userid +
                ", employeeid=" + employeeid +
                ", username='" + username + '\'' +
                ", limits=" + limits +
                ", password='" + password + '\'' +
                ", lists=" + lists +
                '}';
    }

    public List<Login> getLists() {
        return lists;
    }

    public void setLists(List<Login> lists) {
        this.lists = lists;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLimits() {
        return limits;
    }

    public void setLimits(Integer limits) {
        this.limits = limits;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
