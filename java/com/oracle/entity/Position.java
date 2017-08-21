package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class Position {
    private int pid;                  //int not null auto_increment,
    private String pname;               // varchar(20),
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


}
