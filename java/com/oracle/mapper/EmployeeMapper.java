package com.oracle.mapper;

import com.oracle.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@MapperScan
@Component("employeeMapper")
public interface EmployeeMapper {
    @Select("select * from emp")
    List<Employee> getEmployeeAll();

    @Insert("insert into emp(employee_id,hospital_id,deptid,pid,name,sex,age,birthday,address,phone) " +
            "values(#{employee_id}, #{hospital_id}, #{deptid},#{pid},#{name}, #{sex}, #{age},#{birthday},#{address},#{phone})")
    int saveEmployee(Employee e);

    @Select("select * from emp where employee_id=#{employee_id}")
    Employee loadEmployee(int eid);

    @Update("update emp set name=#{name} where employee_id=#{employee_id}")
    int updateEmployee(Employee e);


    @Delete("delete from emp  where employee_id=#{employee_id} ")
    int  delEmployee(int eid);

}
