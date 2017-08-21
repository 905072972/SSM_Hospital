package com.oracle.controller;

import com.oracle.entity.Drugs;
import com.oracle.mapper.DrugMapper;
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
 * Created by Administrator on 2017/8/10 0010.
 */
@Controller
@RequestMapping(value = "/DurgStorage")
public class DrugsController {
    @Autowired
    private DrugMapper drugMapper;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(Drugs drugs,Model model) {
        model.addAttribute("list", drugMapper.getDrugsList(drugs));
//        System.out.println(drugMapper.getDrugsList().toString());
        return "DurgStorage/drugsList";
    }
    @RequestMapping(value = "/add")
    public String add1( ) {

        return "DurgStorage/drugsadd";

    }
    @RequestMapping(value = "/add1")
    public String add( Drugs drugs,Model model) {
            drugMapper.insert(drugs);
            return "redirect:/DurgStorage/list";
    }

    @RequestMapping(value = "/delete/{drugsid}")
    public String del(@PathVariable int drugsid) {
        drugMapper.delDrugs(drugsid);
        return "redirect:/DurgStorage/list";
    }
    @RequestMapping(value = "/load/{drugsid}")
    public String load(@PathVariable int drugsid, Model model) {
        model.addAttribute("drugs", drugMapper.loadDrugs(drugsid));
        return "DurgStorage/drugsUpdate";
    }
    @RequestMapping(value = "/load/update")
    public String update(Drugs drugs) {
        drugs.toString();
        drugMapper.updateDrugs(drugs);
        return "redirect:/DurgStorage/list";
    }
}
