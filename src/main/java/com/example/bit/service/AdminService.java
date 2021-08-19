package com.example.bit.service;


import com.example.bit.bean.MiniUsers;
import com.example.bit.dao.AdmTheLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdmTheLogMapper admTheLogMapper;

    //修改某一用户的密码

    public List<MiniUsers> selectByUsers() {

        return null;
    }
}
