package com.oracle.mapper;

import com.oracle.entity.Jiezhen;
import com.oracle.entity.Kaiyao;
import com.oracle.entity.Patients;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11 0011.
 */

@MapperScan
@Component
public interface JiezhenMapper {
    List<Patients> getAllPatients(Patients patients);
    @Select("select * from patients where patient_id=#{patient_id}")
    Patients loadPatients(int eid);
//    @Insert("insert into zhenduan(guahao_id,name,sex,age,guahao_date,guahao_date,patient_id,zhenduan)" +
//            "values(#{guahao_id},#{name},#{sex},#{age},#{guahao_date},#{patient_id},#{zhenduan})")

    @Update("update zhenduan set guahao_id=#{guahao_id},name=#{name},sex=#{sex},age=#{age}," +
            "guahao_date=#{guahao_date},guahao_date=#{guahao_date},zhenduan=#{zhenduan} where patient_id=#{patient_id}")
    int  addjiezhen(Jiezhen e);

    @Insert("insert into kaiyao (patient_id,drugsid,num,zhuyuan)values" +
            "(#{patient_id},#{drugsid},#{num},#{zhuyuan})")
    int addkaiyao(Kaiyao e);



}
