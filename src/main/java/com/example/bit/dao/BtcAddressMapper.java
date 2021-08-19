package com.example.bit.dao;

import com.itcast.bean.BtcAddress;
import com.itcast.bean.BtcAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcAddressMapper {
    long countByExample(BtcAddressExample example);

    int deleteByExample(BtcAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BtcAddress record);

    int insertSelective(BtcAddress record);

    List<BtcAddress> selectByExample(BtcAddressExample example);

    BtcAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BtcAddress record, @Param("example") BtcAddressExample example);

    int updateByExample(@Param("record") BtcAddress record, @Param("example") BtcAddressExample example);

    int updateByPrimaryKeySelective(BtcAddress record);

    int updateByPrimaryKey(BtcAddress record);
}