package com.example.bit.dao;

import com.itcast.bean.MiniOrders;
import com.itcast.bean.MiniOrdersExample;
import com.itcast.bean.MiniOrdersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniOrdersMapper {
    long countByExample(MiniOrdersExample example);

    int deleteByExample(MiniOrdersExample example);

    int deleteByPrimaryKey(MiniOrdersKey key);

    int insert(MiniOrders record);

    int insertSelective(MiniOrders record);

    List<MiniOrders> selectByExampleWithBLOBs(MiniOrdersExample example);

    List<MiniOrders> selectByExample(MiniOrdersExample example);

    MiniOrders selectByPrimaryKey(MiniOrdersKey key);

    int updateByExampleSelective(@Param("record") MiniOrders record, @Param("example") MiniOrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniOrders record, @Param("example") MiniOrdersExample example);

    int updateByExample(@Param("record") MiniOrders record, @Param("example") MiniOrdersExample example);

    int updateByPrimaryKeySelective(MiniOrders record);

    int updateByPrimaryKeyWithBLOBs(MiniOrders record);

    int updateByPrimaryKey(MiniOrders record);
}