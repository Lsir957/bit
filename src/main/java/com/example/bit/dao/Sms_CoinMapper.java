package com.example.bit.dao;

import com.itcast.bean.Sms_Coin;
import com.itcast.bean.Sms_CoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sms_CoinMapper {
    long countByExample(Sms_CoinExample example);

    int deleteByExample(Sms_CoinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sms_Coin record);

    int insertSelective(Sms_Coin record);

    List<Sms_Coin> selectByExample(Sms_CoinExample example);

    Sms_Coin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sms_Coin record, @Param("example") Sms_CoinExample example);

    int updateByExample(@Param("record") Sms_Coin record, @Param("example") Sms_CoinExample example);

    int updateByPrimaryKeySelective(Sms_Coin record);

    int updateByPrimaryKey(Sms_Coin record);
}