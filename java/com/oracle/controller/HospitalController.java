package com.oracle.controller;

import com.oracle.entity.*;
import com.oracle.mapper.GuahaotypeMapper;
import com.oracle.mapper.HospitalMapper;
import com.oracle.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
@Controller
public class HospitalController {
    @Autowired
    private HospitalMapper hospitalMapper;
    @Autowired
    private PatientsService patientsService;
    @Autowired
    private GuahaotypeMapper guahaotypeMapper;


    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(@RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "userid", required = false) Integer userid,
                        @RequestParam(value = "employeeid", required = false) Integer employeeid,
                        @RequestParam(value = "password", required = false) String password,
                        Model model, HttpServletRequest request, HttpServletResponse response) {
        Login login = new Login();
        login.setUserid(userid);
        login.setEmployeeid(employeeid);
        login.setUsername(username);
        login.setPassword(password);
        Cookie[] cs = request.getCookies();
        Cookie cuname = new Cookie("username", username);
        Cookie cuserid = new Cookie("userid", "");
        Cookie cemployeeid = new Cookie("employeeid", "");
        Cookie pwd = new Cookie("pwd", password);
        for (Cookie c : cs) {
            cuname = new Cookie("username", username);
            cuserid = new Cookie("userid", userid.toString());
            cemployeeid = new Cookie("employeeid", employeeid.toString());
            pwd = new Cookie("pwd", password);
            cuname.setMaxAge(60 * 60 * 24);
            cuserid.setMaxAge(60 * 60 * 24);
            cemployeeid.setMaxAge(60 * 60 * 24);
            pwd.setMaxAge(60 * 24 * 60);
        }
        response.addCookie(cuname);
        response.addCookie(cuserid);
        response.addCookie(cemployeeid);
        response.addCookie(pwd);
        Login userresult = hospitalMapper.loginByNameAndPassword(login);
        if (userresult != null) {
            //login.setLimits(userresult.getLimits());
//                   登录成功
            //  List<Login> lists = (List<Login>) hospitalMapper.loginByNameAndPassword(login);
            // model.addAttribute("lists", lists);//回显用户信息
            model.addAttribute("currentUser", userresult);
            return "main";
        }
        return "error";
    }

    @RequestMapping(value = "/login1")
    public String exit() {
        return "login";
    }

    @RequestMapping(value = "/main")
    public String main1() {
        return "main";
    }

    @RequestMapping(value = "/alertpwd")
    public String alertPassword() {
        return "alertpwd";
    }

    @RequestMapping(value = "/alertpwd.do", method = {RequestMethod.GET, RequestMethod.POST})
    public String alertPassword(@RequestParam(value = "username", required = false) String username,
                                @RequestParam(value = "password", required = false) String password,
                                @RequestParam(value = "newpwd", required = false) String newpwd,
                                @RequestParam(value = "newpwd2", required = false) String newpwd2,
                                Model model) throws Exception {
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        Login userresult = hospitalMapper.getAll(login);
        if (userresult != null && newpwd.equals(newpwd2)) {
            login.setUsername(username);
            login.setPassword(newpwd.toString());
            int result = hospitalMapper.updatePassword(login);
            if (result > 0) {
                return "login";
            }
        }
        return "error";
    }

    @RequestMapping("/guahao")
    public String main() {
        return "guahao/guahao";
    }

    @RequestMapping(value = "/addguahao")
    public String load( Model model) {
        List<GuahaoType> guahaoList = guahaotypeMapper.getGuahaotype();
        model.addAttribute("guahaoList", guahaoList);
        return "guahao/addguahao";
    }

    @RequestMapping("/selectguahao")
    public String main(@RequestParam(value = "guahao_id", required = false) String guahao_id,
                       Model model) {
        Patients patients = new Patients();
        patients.setGuahao_id(guahao_id);
        List<Patients> list = hospitalMapper.getAllPatients(patients);
        model.addAttribute("pagemsg", list);//回显分页数据
        return "guahao/selectguahao";
    }


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping("/addguahao1")
    public String main1(Patients patients) {
        int result = hospitalMapper.addguahao(patients);
        if (result > 0) {
            return "guahao/guahao";
        }
        return "guahao/addguahao";
    }

    @RequestMapping("/delguahao")
    public String delguahao1(Patients patients) {
        int result = hospitalMapper.delguahao(patients);
        if (result > 0) {
            return "guahao/guahao";
        }
        return "guahao/delguahao";

    }


}
