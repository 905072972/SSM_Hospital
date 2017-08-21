package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class Dept {
    private int deptid;         //         int not null auto_increment,
    private String name;     //           varchar(20),

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
