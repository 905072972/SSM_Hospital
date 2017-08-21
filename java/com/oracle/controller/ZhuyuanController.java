package com.oracle.controller;

import com.oracle.entity.Charge;
import com.oracle.entity.Zhuyuan;
import com.oracle.mapper.ZhuyuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
@Controller
@RequestMapping(value = "/zhuyuan")
public class ZhuyuanController {

    @Autowired
    private ZhuyuanMapper zhuyuanMapper;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(Zhuyuan zhuyuan,Model model) {
        model.addAttribute("list", zhuyuanMapper.getPatients(zhuyuan));
        return "zhuyuan/getAll";
    }

        @RequestMapping(value = "/load/{patient_id}")
        public String load(@PathVariable int patient_id, Model model) {
        model.addAttribute("list", zhuyuanMapper.loadZhuyuan(patient_id));
        return "zhuyuan/zhuyuanload";
    }
    @RequestMapping(value = "/add")
    public String add(Model model) {
        return "zhuyuan/addzhuyuan";
    }
    @RequestMapping(value = "/save")
    public String save(Zhuyuan zhuyuan) {
        int result = zhuyuanMapper.addZhuyuan(zhuyuan);
        return "redirect:/zhuyuan/list";

    }
    @RequestMapping(value = "/load/update")
    public String update(Zhuyuan zhuyuan) {
        zhuyuanMapper.updateZhuyuan(zhuyuan);
        return "redirect:/zhuyuan/list";
    }

    @RequestMapping(value = "/delete/{patient_id}")
    public String del(@PathVariable int patient_id) {
        zhuyuanMapper.delZhuyuan(patient_id);
        zhuyuanMapper.delCharge(patient_id);
        return "redirect:/zhuyuan/list";
    }
    @RequestMapping(value = "/delete2/{patient_id}")
    public String del2(@PathVariable int patient_id) {
        zhuyuanMapper.delCharge(patient_id);
        return "redirect:/zhuyuan/list2";
    }
    @RequestMapping(value = "/list2", method = {RequestMethod.GET, RequestMethod.POST})
    public String list2(Charge charge, Model model) {
        model.addAttribute("list", zhuyuanMapper.getCharge(charge));
        return "zhuyuan/chargeList";
    }

    @RequestMapping(value = "/load2/{patient_id}")
    public String load2(@PathVariable int patient_id, Model model) {
        model.addAttribute("list", zhuyuanMapper.loadCharge(patient_id));
        return "zhuyuan/chargeload";
    }
    @RequestMapping(value = "/addcharge")
    public String add2(Model model) {
        return "zhuyuan/addCharge";
    }
    @RequestMapping(value = "/save2")
    public String save2(Charge charge) {
        int result = zhuyuanMapper.addCharge(charge);
        return "redirect:/zhuyuan/list2";

    }
    @RequestMapping(value = "/load2/update2")
    public String update2(Charge charge) {
        zhuyuanMapper.updateCharge(charge);
        return "redirect:/zhuyuan/list2";
    }

}
