package com.oracle.mapper;

import com.oracle.entity.Charge;
import com.oracle.entity.Employee;
import com.oracle.entity.Zhuyuan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
@MapperScan
@Component
public interface ZhuyuanMapper {
    @Select("select * from zhuyuan")
    List<Zhuyuan> getZhuyuanAll();

    @Insert("insert into zhuyuan(hospital_id,patient_id,bed_id,doctor_id,nurse_id,name,sex,age," +
            "ruyuandate,chuyuandate,address,phone,bondsman,result,yajin) values(#{hospital_id}, " +
            "#{patient_id}, #{bed_id},#{doctor_id},#{nurse_id},#{name}, #{sex}, #{age},#{ruyuandate}" +
            ",#{chuyuandate},#{address},#{phone},#{bondsman},#{result},#{yajin})")
    int addZhuyuan(Zhuyuan e);

    @Select("select * from zhuyuan where patient_id=#{patient_id}")
    Zhuyuan loadZhuyuan(int eid);

    @Select("select * from charge where patient_id=#{patient_id}")
    Charge loadCharge(int eid);


    @Update("update zhuyuan set hospital_id=#{hospital_id},bed_id=#{bed_id},doctor_id=#{doctor_id}," +
            "nurse_id=#{nurse_id},name=#{name},sex=#{sex},age=#{age},ruyuandate=#{ruyuandate}," +
            "chuyuandate=#{chuyuandate},address=#{address},phone=#{phone},bondsman=#{bondsman},result=#{result}," +
            "yajin=#{yajin} where patient_id=#{patient_id}")
    int updateZhuyuan(Zhuyuan e);


    @Delete("delete from zhuyuan  where patient_id=#{patient_id} ")
    int delZhuyuan(int eid);

    List<Zhuyuan> getPatients(Zhuyuan patients);

    @Insert("insert into Charge(patient_id,id,name, date,money) values(#{patient_id}, #{id},#{name},#{date},#{money})")
    int addCharge(Charge e);

    List<Charge> getCharge(Charge Charge);

    @Delete("delete from Charge  where patient_id=#{patient_id} ")
    int delCharge(int eid);

    @Update("update Charge set id=#{id},name=#{name},date=#{date},money=#{money}" +
            " where patient_id=#{patient_id}")
    int updateCharge(Charge e);
}
