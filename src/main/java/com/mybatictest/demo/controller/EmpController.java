package com.mybatictest.demo.controller;


import com.mybatictest.demo.entity.Emp;
import com.mybatictest.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/list")
    public String get(@RequestParam(value = "id",required=false) Integer id, Model model){
        List<Emp> list=empService.get(id);
        for (Emp temp:list ) {
            System.out.println(temp.getLastName());
            System.out.println(temp.getDept().getDeptName());
        }
        model.addAttribute("emplist",list);
        return "list";
    }
}
