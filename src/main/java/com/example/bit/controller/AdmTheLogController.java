package com.example.bit.controller;


import com.example.bit.bean.MiniUsers;
import com.example.bit.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdmTheLogController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/hello")
    @ResponseBody
    public List<MiniUsers> sayHello(){


        return null;
    }



}
