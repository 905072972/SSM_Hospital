package com.oracle.entity;


import java.sql.Date;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Drugsloss {
    private int lossid;
    private Integer hospitalid;
    private Integer drugsid;
    private Integer lossnumber;
    private Integer companyid;
    private String lossreason;
    private Date lossdate;
    private String applicanter;
    private String enter;
    private Date enterdate;

    public int getLossid() {
        return lossid;
    }

    public void setLossid(int lossid) {
        this.lossid = lossid;
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

    public Integer getLossnumber() {
        return lossnumber;
    }

    public void setLossnumber(Integer lossnumber) {
        this.lossnumber = lossnumber;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getLossreason() {
        return lossreason;
    }

    public void setLossreason(String lossreason) {
        this.lossreason = lossreason;
    }

    public Date getLossdate() {
        return lossdate;
    }

    public void setLossdate(Date lossdate) {
        this.lossdate = lossdate;
    }

    public String getApplicanter() {
        return applicanter;
    }

    public void setApplicanter(String applicanter) {
        this.applicanter = applicanter;
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }
}
