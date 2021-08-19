package com.example.bit.dao;

import com.itcast.bean.SmsData;
import com.itcast.bean.SmsDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsDataMapper {
    long countByExample(SmsDataExample example);

    int deleteByExample(SmsDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsData record);

    int insertSelective(SmsData record);

    List<SmsData> selectByExample(SmsDataExample example);

    SmsData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsData record, @Param("example") SmsDataExample example);

    int updateByExample(@Param("record") SmsData record, @Param("example") SmsDataExample example);

    int updateByPrimaryKeySelective(SmsData record);

    int updateByPrimaryKey(SmsData record);
}