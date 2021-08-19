package com.example.bit.dao;

import com.itcast.bean.WalletHistory;
import com.itcast.bean.WalletHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletHistoryMapper {
    long countByExample(WalletHistoryExample example);

    int deleteByExample(WalletHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WalletHistory record);

    int insertSelective(WalletHistory record);

    List<WalletHistory> selectByExample(WalletHistoryExample example);

    WalletHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WalletHistory record, @Param("example") WalletHistoryExample example);

    int updateByExample(@Param("record") WalletHistory record, @Param("example") WalletHistoryExample example);

    int updateByPrimaryKeySelective(WalletHistory record);

    int updateByPrimaryKey(WalletHistory record);
}