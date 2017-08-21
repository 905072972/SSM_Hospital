package com.oracle.mapper;

import com.oracle.entity.Kaiyao;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14 0014.
 */
@MapperScan
@Component
public interface KaiyaoMapper {
    @Select("select * from kaiyao")
    List<Kaiyao> getKaiyaoAll();

}
