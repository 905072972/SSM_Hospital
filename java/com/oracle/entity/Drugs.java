package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Drugs {
    private int drugsid;
    private Integer typeid;
    private String drugsname;
    private Integer pricecompanyid;
    private String size;

    @Override
    public String toString() {
        return "Drugs{" +
                "drugsid=" + drugsid +
                ", typeid=" + typeid +
                ", drugsname='" + drugsname + '\'' +
                ", pricecompanyid=" + pricecompanyid +
                ", size='" + size + '\'' +
                '}';
    }

    public int getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(int drugsid) {
        this.drugsid = drugsid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getDrugsname() {
        return drugsname;
    }

    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname;
    }

    public Integer getPricecompanyid() {
        return pricecompanyid;
    }

    public void setPricecompanyid(Integer pricecompanyid) {
        this.pricecompanyid = pricecompanyid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
