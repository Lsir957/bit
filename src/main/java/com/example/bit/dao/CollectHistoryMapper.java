package com.example.bit.dao;

import com.itcast.bean.CollectHistory;
import com.itcast.bean.CollectHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectHistoryMapper {
    long countByExample(CollectHistoryExample example);

    int deleteByExample(CollectHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CollectHistory record);

    int insertSelective(CollectHistory record);

    List<CollectHistory> selectByExample(CollectHistoryExample example);

    CollectHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CollectHistory record, @Param("example") CollectHistoryExample example);

    int updateByExample(@Param("record") CollectHistory record, @Param("example") CollectHistoryExample example);

    int updateByPrimaryKeySelective(CollectHistory record);

    int updateByPrimaryKey(CollectHistory record);
}