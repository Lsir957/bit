package com.example.bit.dao;

import com.itcast.bean.MiniCode;
import com.itcast.bean.MiniCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniCodeMapper {
    long countByExample(MiniCodeExample example);

    int deleteByExample(MiniCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniCode record);

    int insertSelective(MiniCode record);

    List<MiniCode> selectByExample(MiniCodeExample example);

    MiniCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniCode record, @Param("example") MiniCodeExample example);

    int updateByExample(@Param("record") MiniCode record, @Param("example") MiniCodeExample example);

    int updateByPrimaryKeySelective(MiniCode record);

    int updateByPrimaryKey(MiniCode record);
}