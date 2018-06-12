package com.zhenqi.controller;

import com.zhenqi.entity.Dept;
import com.zhenqi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wuming on 2017/9/8.
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/find")
    public String find(ModelMap model, HttpServletRequest request){
        List<Dept> deptList=deptService.findall();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+deptList);
        model.addAttribute("depts", deptList);
        return "dept";
    }
}
