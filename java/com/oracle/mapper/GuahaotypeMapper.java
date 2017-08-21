package com.oracle.mapper;

import com.oracle.entity.Dept;
import com.oracle.entity.GuahaoType;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@MapperScan
@Component
public interface GuahaotypeMapper {
    @Select("select * from guahao_type")
     List<GuahaoType> getGuahaotype( );
}
