package com.oracle.service;

import com.oracle.entity.Myfriend;
import com.oracle.entity.Page;
import com.oracle.entity.Patients;
import com.oracle.mapper.HospitalMapper;
import com.oracle.mapper.MyfriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
@Service
public class PatientServicelmpl implements PatientsService {
    @Autowired
    private HospitalMapper hospitalMapper;


    @Override
    public List<Patients> getAllPatients() {
        return null;
    }

    @Override
    public int selectCount(Patients guahaoid) {
        return hospitalMapper.selectCount(guahaoid);
    }



    @Override
    public Page<Patients> findByPage(int currentPage) {
//        Patients patients=new Patients();
//        patients.setGuahao_id(guahao_id);
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        Page<Patients> pageBean = new Page<Patients>();
//
//        //封装当前页数
//        pageBean.setCurrPage(currentPage);
//
//        //每页显示的数据
//        int pageSize = 10;
//        pageBean.setPageSize(pageSize);
//
//        //封装总记录数
//        int totalCount = hospitalMapper.selectCount(patients);
//        pageBean.setTotalCount(totalCount);
//
//        //封装总页数
//        double tc = totalCount;
//        Double num = Math.ceil(tc / pageSize);//向上取整
//        pageBean.setTotalPage(num.intValue());
//
//        map.put("start", (currentPage - 1) * pageSize);
//        map.put("size", pageBean.getPageSize());
//        //封装每页显示的数据
//        List<Patients> lists = hospitalMapper.findByPage(map);
//        pageBean.setLists(lists);

        return null;
    }
}
