package com.example.bit.service;

import com.example.bit.bean.MiniUsers;
import com.example.bit.dao.MiniUsersMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiniUsersService {

    @Autowired
    private MiniUsersMapper miniUsersMapper;

    /**
     * 查询所有员工
     * @return
     */
    public List<MiniUsers> getAll() {
        // TODO Auto-generated method stub
        return miniUsersMapper.selectByExample();
    }
}
