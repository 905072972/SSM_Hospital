package com.oracle.controller;

import com.oracle.entity.Dept;
import com.oracle.entity.Employee;
import com.oracle.entity.Position;
import com.oracle.mapper.DeptMapper;
import com.oracle.mapper.EmployeeMapper;
import com.oracle.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yanliwei on 2017/8/9.
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {


    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private PositionMapper positionMapper;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(Model model) {
        model.addAttribute("emplist", employeeMapper.getEmployeeAll());
        return "employee/employeelist";
    }

    @RequestMapping(value = "/load/{employee_id}")
    public String load(@PathVariable int employee_id, Model model) {
        model.addAttribute("employee", employeeMapper.loadEmployee(employee_id));
        List<Dept> deptList = deptMapper.getDeptAll();
        List<Position> positions = positionMapper.getPosAll();
        model.addAttribute("deptList", deptList);
        model.addAttribute("positions", positions);
        return "employee/employeeload";
    }

    @RequestMapping(value = "/add")
    public String add(Model model) {
        List<Dept> deptList = deptMapper.getDeptAll();
        List<Position> positions = positionMapper.getPosAll();
        model.addAttribute("deptList", deptList);
        model.addAttribute("positions", positions);
        return "employee/employeeadd";
    }

    @RequestMapping(value = "/save")
    public String save(Employee employee) {
        int result = employeeMapper.saveEmployee(employee);
        if (result > 0) {
            return "redirect:/employee/list";
        } else {
            return "redirect:error1";
        }
    }

    @RequestMapping(value = "/load/update1")
    public String update(Employee employee) {
        employeeMapper.updateEmployee(employee);
        return "redirect:/employee/list";
    }

    @RequestMapping(value = "/delete/{employee_id}")
    public String del(@PathVariable int employee_id) {
        employeeMapper.delEmployee(employee_id);
       // model.addAttribute("employee", );
        return "redirect:/employee/list";
    }
}
