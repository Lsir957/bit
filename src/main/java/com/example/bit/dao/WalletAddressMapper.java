package com.example.bit.dao;

import com.itcast.bean.WalletAddress;
import com.itcast.bean.WalletAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletAddressMapper {
    long countByExample(WalletAddressExample example);

    int deleteByExample(WalletAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WalletAddress record);

    int insertSelective(WalletAddress record);

    List<WalletAddress> selectByExample(WalletAddressExample example);

    WalletAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WalletAddress record, @Param("example") WalletAddressExample example);

    int updateByExample(@Param("record") WalletAddress record, @Param("example") WalletAddressExample example);

    int updateByPrimaryKeySelective(WalletAddress record);

    int updateByPrimaryKey(WalletAddress record);
}