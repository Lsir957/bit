package com.example.bit.dao;

import com.itcast.bean.Sum;
import com.itcast.bean.SumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SumMapper {
    long countByExample(SumExample example);

    int deleteByExample(SumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sum record);

    int insertSelective(Sum record);

    List<Sum> selectByExample(SumExample example);

    Sum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sum record, @Param("example") SumExample example);

    int updateByExample(@Param("record") Sum record, @Param("example") SumExample example);

    int updateByPrimaryKeySelective(Sum record);

    int updateByPrimaryKey(Sum record);
}