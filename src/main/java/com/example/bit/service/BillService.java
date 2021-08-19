package com.example.bit.service;

import com.example.bit.bean.Bill;
import com.example.bit.dao.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillMapper billMapper;

    public List<Bill> getAll() {
        return billMapper.selectByExampleWithJson();
    }
}
