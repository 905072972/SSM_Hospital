package com.oracle.mapper;

import com.oracle.entity.Position;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@MapperScan
@Component("positionMapper")
public interface PositionMapper {
    @Select("select * from position")
    public List<Position> getPosAll();
}
