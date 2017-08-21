package com.oracle.service;

import com.oracle.entity.Myfriend;
import com.oracle.entity.Page;
import com.oracle.entity.Patients;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public interface PatientsService {

    List<Patients> getAllPatients();

    int selectCount( Patients guahaoid);

    Page<Patients> findByPage(int currentPage);
}
