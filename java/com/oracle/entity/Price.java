package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Price {
    private int priceid;
    private Integer drugsid;
    private Integer companyid;
    private Double price;
    private Double date;

    public int getPriceid() {
        return priceid;
    }

    public void setPriceid(int priceid) {
        this.priceid = priceid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDate() {
        return date;
    }

    public void setDate(Double date) {
        this.date = date;
    }
}
