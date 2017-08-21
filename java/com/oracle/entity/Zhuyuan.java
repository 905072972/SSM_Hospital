package com.oracle.entity;

import java.sql.Date;

/**
 * Created by Administrator on 2017/8/10 0010.
 */

public class Zhuyuan {
    private int hospital_id;
    private int patient_id;
    private int bed_id;
    private int doctor_id;
    private int nurse_id;
    private String name;
    private String sex;
    private int age;
    private Date ruyuandate;
    private Date chuyuandate;
    private String address;
    private String phone;
    private String bondsman;
    private String result;
    private int yajin;

    @Override
    public String toString() {
        return "Zhuyuan{" +
                "hospital_id=" + hospital_id +
                ", patient_id=" + patient_id +
                ", bed_id=" + bed_id +
                ", doctor_Id=" + doctor_id +
                ", nurse_id=" + nurse_id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", ruyuandate=" + ruyuandate +
                ", chuyuandate=" + chuyuandate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", bondsman='" + bondsman + '\'' +
                ", result='" + result + '\'' +
                ", yajin=" + yajin +
                '}';
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getBed_id() {
        return bed_id;
    }

    public void setBed_id(int bed_id) {
        this.bed_id = bed_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_Id) {
        this.doctor_id = doctor_Id;
    }

    public int getNurse_id() {
        return nurse_id;
    }

    public void setNurse_id(int nurse_id) {
        this.nurse_id = nurse_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRuyuandate() {
        return ruyuandate;
    }

    public void setRuyuandate(Date ruyuandate) {
        this.ruyuandate = ruyuandate;
    }

    public Date getChuyuandate() {
        return chuyuandate;
    }

    public void setChuyuandate(Date chuyuandate) {
        this.chuyuandate = chuyuandate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBondsman() {
        return bondsman;
    }

    public void setBondsman(String bondsman) {
        this.bondsman = bondsman;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getYajin() {
        return yajin;
    }

    public void setYajin(int yajin) {
        this.yajin = yajin;
    }
}
