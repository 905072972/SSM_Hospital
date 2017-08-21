package com.oracle.entity;

import java.sql.Date;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Rpurchase {
    private int rpurchase;
    private Integer hospitalid;
    private Integer drugsid;
    private Double rpurchaseprice;
    private Integer rpurchasenumber;
    private String reason;
    private Date rpurchasedate;

    public int getRpurchase() {
        return rpurchase;
    }

    public void setRpurchase(int rpurchase) {
        this.rpurchase = rpurchase;
    }

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Double getRpurchaseprice() {
        return rpurchaseprice;
    }

    public void setRpurchaseprice(Double rpurchaseprice) {
        this.rpurchaseprice = rpurchaseprice;
    }

    public Integer getRpurchasenumber() {
        return rpurchasenumber;
    }

    public void setRpurchasenumber(Integer rpurchasenumber) {
        this.rpurchasenumber = rpurchasenumber;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getRpurchasedate() {
        return rpurchasedate;
    }

    public void setRpurchasedate(Date rpurchasedate) {
        this.rpurchasedate = rpurchasedate;
    }
}
