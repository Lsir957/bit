package com.example.bit.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Bill {
    private Long id;

    private Integer uid;

    private Integer coinid;

    private Integer type;

    private String typestr;

    private String ctime;

    private BigDecimal num;

    private BigDecimal amount;

    private Integer tradeid;

    private Date time;

    private String hash;

    private BigDecimal poundage;

    private Boolean status;

    private MiniUsers miniUsers;


}