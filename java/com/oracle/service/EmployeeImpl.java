package com.oracle.service;

import com.oracle.entity.Employee;
import com.oracle.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@Service
@Component("employeeService")
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployeeALL() {
        return employeeMapper.getEmployeeAll();
    }
}
