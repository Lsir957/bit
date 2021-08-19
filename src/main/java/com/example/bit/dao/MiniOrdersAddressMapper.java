package com.example.bit.dao;

import com.itcast.bean.MiniOrdersAddress;
import com.itcast.bean.MiniOrdersAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniOrdersAddressMapper {
    long countByExample(MiniOrdersAddressExample example);

    int deleteByExample(MiniOrdersAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniOrdersAddress record);

    int insertSelective(MiniOrdersAddress record);

    List<MiniOrdersAddress> selectByExampleWithBLOBs(MiniOrdersAddressExample example);

    List<MiniOrdersAddress> selectByExample(MiniOrdersAddressExample example);

    MiniOrdersAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniOrdersAddress record, @Param("example") MiniOrdersAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniOrdersAddress record, @Param("example") MiniOrdersAddressExample example);

    int updateByExample(@Param("record") MiniOrdersAddress record, @Param("example") MiniOrdersAddressExample example);

    int updateByPrimaryKeySelective(MiniOrdersAddress record);

    int updateByPrimaryKeyWithBLOBs(MiniOrdersAddress record);

    int updateByPrimaryKey(MiniOrdersAddress record);
}