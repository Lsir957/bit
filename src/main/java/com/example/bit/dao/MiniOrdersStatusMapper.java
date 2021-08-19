package com.example.bit.dao;

import com.itcast.bean.MiniOrdersStatus;
import com.itcast.bean.MiniOrdersStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniOrdersStatusMapper {
    long countByExample(MiniOrdersStatusExample example);

    int deleteByExample(MiniOrdersStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniOrdersStatus record);

    int insertSelective(MiniOrdersStatus record);

    List<MiniOrdersStatus> selectByExample(MiniOrdersStatusExample example);

    MiniOrdersStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniOrdersStatus record, @Param("example") MiniOrdersStatusExample example);

    int updateByExample(@Param("record") MiniOrdersStatus record, @Param("example") MiniOrdersStatusExample example);

    int updateByPrimaryKeySelective(MiniOrdersStatus record);

    int updateByPrimaryKey(MiniOrdersStatus record);
}