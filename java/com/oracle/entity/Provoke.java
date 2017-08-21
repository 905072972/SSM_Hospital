package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Provoke {
    private int id;
    private Integer hospitalid;
    private Integer sroomid;
    private Integer oroom;
    private Integer drugsid;
    private Double pdate;
    private Integer number;
    private String unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public Integer getSroomid() {
        return sroomid;
    }

    public void setSroomid(Integer sroomid) {
        this.sroomid = sroomid;
    }

    public Integer getOroom() {
        return oroom;
    }

    public void setOroom(Integer oroom) {
        this.oroom = oroom;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Double getPdate() {
        return pdate;
    }

    public void setPdate(Double pdate) {
        this.pdate = pdate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
