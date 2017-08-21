package com.oracle.controller;

import com.oracle.entity.Drugs;
import com.oracle.entity.Jiezhen;
import com.oracle.entity.Kaiyao;
import com.oracle.entity.Patients;
import com.oracle.mapper.DrugMapper;
import com.oracle.mapper.JiezhenMapper;
import com.oracle.mapper.KaiyaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
@RequestMapping(value = "/menzhen")
public class JiezhenController {
    @Autowired
    private JiezhenMapper jiezhenMapper;
    @Autowired
    private DrugMapper drugMapper;
    @Autowired
    private KaiyaoMapper kaiyaoMapper;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


    @RequestMapping(value = "list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(Patients patients, Model model) {
        model.addAttribute("list", jiezhenMapper.getAllPatients(patients));
        List<Kaiyao> list=kaiyaoMapper.getKaiyaoAll();
        List<Integer> pid = new ArrayList<Integer>();
        for(Kaiyao s:list){
            pid.add(s.getPatient_id());
        }
        List list2=new ArrayList();
        for(int i=pid.size()-1 ;i>=0 ;i--){
            Object o=pid.get(i);
            if(list2.indexOf(o)==-1){
                list2.add(0,o);
            }
        }

        System.out.println(list2);
        model.addAttribute("list2",list2);
        return "menzhen/jiezhen";
    }

    @RequestMapping(value = "/load/{patient_id}")
    public String load(@PathVariable int patient_id, Model model) {
        model.addAttribute("patient", jiezhenMapper.loadPatients(patient_id));

        return "menzhen/jiezhenload";
    }

    @RequestMapping(value = "/load/add")
    public String main1(Jiezhen jiezhen, Model model) {
        int list = jiezhenMapper.addjiezhen(jiezhen);
        List<Drugs> drugsList = drugMapper.getAlldrugs();
        model.addAttribute("drugslist", drugsList);
        return "menzhen/addchufan";
    }

    @RequestMapping("/load/adddrugs")
    public String adddrugs(
            @RequestParam(value = "patient_id", required = false) int patient_id,
            @RequestParam(value = "drugsid", required = false) int[] drugsid,
            @RequestParam(value = "zhuyuan", required = false) String zhuyuan,
            @RequestParam(value = "num", required = false) int[] num

    ) {
        Kaiyao kaiyao = new Kaiyao();
        for (int i = 0; i < drugsid.length; i++) {
            kaiyao.setPatient_id(patient_id);
            kaiyao.setZhuyuan(zhuyuan);
            kaiyao.setDrugsid(drugsid[i]);
            kaiyao.setNum(num[i]);
            jiezhenMapper.addkaiyao(kaiyao);
        }
        return "menzhen/success";
    }
}
