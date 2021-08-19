package com.example.bit.dao;

import com.itcast.bean.WalletCopy;
import com.itcast.bean.WalletCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletCopyMapper {
    long countByExample(WalletCopyExample example);

    int deleteByExample(WalletCopyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WalletCopy record);

    int insertSelective(WalletCopy record);

    List<WalletCopy> selectByExample(WalletCopyExample example);

    WalletCopy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WalletCopy record, @Param("example") WalletCopyExample example);

    int updateByExample(@Param("record") WalletCopy record, @Param("example") WalletCopyExample example);

    int updateByPrimaryKeySelective(WalletCopy record);

    int updateByPrimaryKey(WalletCopy record);
}