package com.example.bit.dao;

import com.itcast.bean.WalletToken;
import com.itcast.bean.WalletTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletTokenMapper {
    long countByExample(WalletTokenExample example);

    int deleteByExample(WalletTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WalletToken record);

    int insertSelective(WalletToken record);

    List<WalletToken> selectByExample(WalletTokenExample example);

    WalletToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WalletToken record, @Param("example") WalletTokenExample example);

    int updateByExample(@Param("record") WalletToken record, @Param("example") WalletTokenExample example);

    int updateByPrimaryKeySelective(WalletToken record);

    int updateByPrimaryKey(WalletToken record);
}