package com.example.bit.dao;

import com.itcast.bean.TrxAddress;
import com.itcast.bean.TrxAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrxAddressMapper {
    long countByExample(TrxAddressExample example);

    int deleteByExample(TrxAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrxAddress record);

    int insertSelective(TrxAddress record);

    List<TrxAddress> selectByExample(TrxAddressExample example);

    TrxAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrxAddress record, @Param("example") TrxAddressExample example);

    int updateByExample(@Param("record") TrxAddress record, @Param("example") TrxAddressExample example);

    int updateByPrimaryKeySelective(TrxAddress record);

    int updateByPrimaryKey(TrxAddress record);
}