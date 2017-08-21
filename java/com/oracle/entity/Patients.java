package com.oracle.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class Patients {
    private String guahao_id;
    private int hospital_id;
    private int guahao_type;
    private String name;
    private String sex;
    private  int age;
    private Date guahao_date;
    private int patient_id;
    private List<Patients> patients;
    private GuahaoType guahaoType;

    public GuahaoType getGuahaoType() {
        return guahaoType;
    }

    public void setGuahaoType(GuahaoType guahaoType) {
        this.guahaoType = guahaoType;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "guahao_id='" + guahao_id + '\'' +
                ", hospital_id=" + hospital_id +
                ", guahao_type=" + guahao_type +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", guahao_date=" + guahao_date +
                ", patient_id=" + patient_id +
                ", patients=" + patients +
                '}';
    }

    public List<Patients> getPatients() {
        return patients;
    }

    public void setPatients(List<Patients> patients) {
        this.patients = patients;
    }

    public String getGuahao_id() {
        return guahao_id;
    }

    public void setGuahao_id(String guahao_id) {
        this.guahao_id = guahao_id;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public int getGuahao_type() {
        return guahao_type;
    }

    public void setGuahao_type(int guahao_type) {
        this.guahao_type = guahao_type;
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

    public Date getGuahao_date() {
        return guahao_date;
    }

    public void setGuahao_date(Date guahao_date) {
        this.guahao_date = guahao_date;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
}
