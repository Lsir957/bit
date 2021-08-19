package com.example.bit.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AdmTheLog {
    private Integer id;

    private String admin;

    private String ip;

    private String content;

    private String savevalue;

    private String value;

    private Integer uid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT-8")
    private Date date;


}