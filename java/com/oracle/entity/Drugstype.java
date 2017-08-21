package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Drugstype {
    private int drugsid;
    private String typename;

    @Override
    public String toString() {
        return "Drugstype{" +
                "drugsid=" + drugsid +
                ", typename='" + typename + '\'' +
                '}';
    }

    public int getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(int drugsid) {
        this.drugsid = drugsid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
