package com.oracle.controller;

import com.oracle.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@Controller
public class MyfriendController {
    @Autowired
    private PatientsService myfriendService;
//
//    @RequestMapping(value = "/allfriend",method = {RequestMethod.POST,RequestMethod.GET})
//    public  String list(Model model) {
//        int totalRecord;
//        List<Myfriend> list= myfriendMapper.selectAll();
//        model.addAttribute("list",list);
//        Page page=new Page();
//        totalRecord=list.size() ;
//        page.setTotalRecord(totalRecord);
////        System.out.println(list.toString());
//        return "allfriend";
//    }

    @RequestMapping("/allfriend")
    public String  main(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage, Model model){
        model.addAttribute("pagemsg", myfriendService.findByPage(currentPage));//回显分页数据
        return "allfriend";
    }
}
