package com.example.bit.controller;

import com.example.bit.common.Result;
import com.example.bit.common.StatusCode;
import com.example.bit.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping("/list")
    @ResponseBody
    public Result getBillData(){
        return new Result(true, StatusCode.OK,"查询成功",billService.getAll());
    }
}

