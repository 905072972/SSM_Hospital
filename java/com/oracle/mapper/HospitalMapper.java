package com.oracle.mapper;

import com.oracle.entity.GuahaoType;
import com.oracle.entity.Login;
import com.oracle.entity.Myfriend;
import com.oracle.entity.Patients;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
@MapperScan
@Component
public interface HospitalMapper {
    Login loginByNameAndPassword(Login record);

    int updatePassword(Login record);

    Login getAll(Login record);

    /**
     * 查询所有用户数据
     *
     * @return
     */
    List<Patients> getAllPatients(Patients patients);

    /**
     * 查询用户记录总数
     *
     * @return
     */
    int selectCount(Patients patients);

    /**
     * 分页操作，调用findByPage limit分页方法
     *
     * @param map
     * @return
     */
    List<Patients> findByPage(HashMap<String, Object> map);

    int addguahao(Patients patients);

    int delguahao(Patients patients);

    @Select("select * from guahao_type where guahao_type=#{guahao_type}")
    GuahaoType load(int eid);
}
