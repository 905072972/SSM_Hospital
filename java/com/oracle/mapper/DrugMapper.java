package com.oracle.mapper;

import com.oracle.entity.Drugs;
import com.oracle.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
@MapperScan
@Component
public interface DrugMapper {
   // @Select("select * from drugs where 1=1 and drugsname like #{drugsname} and")
    List<Drugs> getDrugsList(Drugs drugs);

    @Insert("insert into drugs(drugsid,typeid,drugsname,pricecompanyid,size) " +
            "values(#{drugsid}, #{typeid}, #{drugsname},#{pricecompanyid},#{size})")
     int insert(Drugs e);
    @Update("update drugs set typeid=#{typeid},drugsname=#{drugsname},pricecompanyid=" +
            "#{pricecompanyid},size=#{size} where drugsid=#{drugsid}")
    int updateDrugs(Drugs e);


    @Delete("delete from drugs  where drugsid=#{drugsid}")
    int  delDrugs(int drugsid);
    @Select("select * from drugs where drugsid=#{drugsid}")
    Drugs loadDrugs(int eid);

    @Select("select * from drugs")
    List<Drugs> getAlldrugs();

}
