package com.oracle.mapper;

import com.oracle.entity.Myfriend;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@MapperScan
@Component
public interface MyfriendMapper {
    /**
     * 查询所有用户数据
     * @return
     */
    List<Myfriend> selectUserList();
    /**
     * 查询用户记录总数
     * @return
     */
    int selectCount();
    /**
     * 分页操作，调用findByPage limit分页方法
     * @param map
     * @return
     */
    List<Myfriend> findByPage(HashMap<String,Object> map);
}
