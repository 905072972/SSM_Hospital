package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Kaiyao {
    private int patient_id;
    private  String  zhuyuan;
    private int drugsid;
    private int num;

    @Override
    public String toString() {
        return "Kaiyao{" +
                "patient_id=" + patient_id +
                ", zhuyuan='" + zhuyuan + '\'' +
                ", drugsid=" + drugsid +
                ", num=" + num +
                '}';
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getZhuyuan() {
        return zhuyuan;
    }

    public void setZhuyuan(String zhuyuan) {
        this.zhuyuan = zhuyuan;
    }

    public int getDrugsid() {
        return drugsid;
    }

    public void setDrugsid(int drugsid) {
        this.drugsid = drugsid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
