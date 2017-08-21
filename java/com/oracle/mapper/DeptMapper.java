package com.oracle.mapper;

import com.oracle.entity.Dept;
import com.oracle.entity.Drugs;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@MapperScan
@Component("deptMapper")
public interface DeptMapper {
    @Select("select * from dept")
    public List<Dept> getDeptAll();
}
