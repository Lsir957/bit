package com.example.bit.dao;

import com.itcast.bean.BtcAddressCopy1;
import com.itcast.bean.BtcAddressCopy1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtcAddressCopy1Mapper {
    long countByExample(BtcAddressCopy1Example example);

    int deleteByExample(BtcAddressCopy1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(BtcAddressCopy1 record);

    int insertSelective(BtcAddressCopy1 record);

    List<BtcAddressCopy1> selectByExample(BtcAddressCopy1Example example);

    BtcAddressCopy1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BtcAddressCopy1 record, @Param("example") BtcAddressCopy1Example example);

    int updateByExample(@Param("record") BtcAddressCopy1 record, @Param("example") BtcAddressCopy1Example example);

    int updateByPrimaryKeySelective(BtcAddressCopy1 record);

    int updateByPrimaryKey(BtcAddressCopy1 record);
}