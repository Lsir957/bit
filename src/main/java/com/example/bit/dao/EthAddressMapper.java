package com.example.bit.dao;

import com.itcast.bean.EthAddress;
import com.itcast.bean.EthAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EthAddressMapper {
    long countByExample(EthAddressExample example);

    int deleteByExample(EthAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EthAddress record);

    int insertSelective(EthAddress record);

    List<EthAddress> selectByExample(EthAddressExample example);

    EthAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EthAddress record, @Param("example") EthAddressExample example);

    int updateByExample(@Param("record") EthAddress record, @Param("example") EthAddressExample example);

    int updateByPrimaryKeySelective(EthAddress record);

    int updateByPrimaryKey(EthAddress record);
}