package com.example.bit.dao;

import com.itcast.bean.SmsCountry;
import com.itcast.bean.SmsCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCountryMapper {
    long countByExample(SmsCountryExample example);

    int deleteByExample(SmsCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCountry record);

    int insertSelective(SmsCountry record);

    List<SmsCountry> selectByExample(SmsCountryExample example);

    SmsCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCountry record, @Param("example") SmsCountryExample example);

    int updateByExample(@Param("record") SmsCountry record, @Param("example") SmsCountryExample example);

    int updateByPrimaryKeySelective(SmsCountry record);

    int updateByPrimaryKey(SmsCountry record);
}