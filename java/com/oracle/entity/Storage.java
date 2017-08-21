package com.oracle.entity;

import java.sql.Date;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Storage {
    private int storageid;
    private Integer drugsid;
    private Date storagedate;
    private Double purchaseprice;
    private Integer purchasenumber;
    private Integer companyid;
    private Integer empid;
    private Integer supplierid;
    private Date date;
    private Date term;

    public int getStorageid() {
        return storageid;
    }

    public void setStorageid(int storageid) {
        this.storageid = storageid;
    }

    public Integer getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public Double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getPurchasenumber() {
        return purchasenumber;
    }

    public void setPurchasenumber(Integer purchasenumber) {
        this.purchasenumber = purchasenumber;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }
}
