package com.example.bit.dao;

import com.itcast.bean.CoinAddress;
import com.itcast.bean.CoinAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinAddressMapper {
    long countByExample(CoinAddressExample example);

    int deleteByExample(CoinAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinAddress record);

    int insertSelective(CoinAddress record);

    List<CoinAddress> selectByExample(CoinAddressExample example);

    CoinAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinAddress record, @Param("example") CoinAddressExample example);

    int updateByExample(@Param("record") CoinAddress record, @Param("example") CoinAddressExample example);

    int updateByPrimaryKeySelective(CoinAddress record);

    int updateByPrimaryKey(CoinAddress record);
}