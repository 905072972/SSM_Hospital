package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Wardinformation {
    private Integer hospitalid;
    private Integer wardnumber;
    private int departmentnumber;
    private Integer wardbeds;
    private Integer remainingbeds;
    private Double price;

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public Integer getWardnumber() {
        return wardnumber;
    }

    public void setWardnumber(Integer wardnumber) {
        this.wardnumber = wardnumber;
    }

    public int getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(int departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public Integer getWardbeds() {
        return wardbeds;
    }

    public void setWardbeds(Integer wardbeds) {
        this.wardbeds = wardbeds;
    }

    public Integer getRemainingbeds() {
        return remainingbeds;
    }

    public void setRemainingbeds(Integer remainingbeds) {
        this.remainingbeds = remainingbeds;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
